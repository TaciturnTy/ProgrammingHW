COMMENT @

Tyler Paulley
10/24/2017
Chapter 6, Exercise 8
MessageEncryption.asm

Description:
	This program demonstrates simple symmetric encryption using 
	the XOR instruction. As an improvement on the encryption 
	found in book, this program accepts multi-character encryption 
	keys in addition to single character keys.
@

.386
.model flat, stdcall
.stack 4096
ExitProcess proto, dwExitCode:dword
INCLUDE Irvine32.inc

.data	
KEY BYTE "ABXmv#7", 0    			;encryption string
BUFMAX = 128     					;maximum buffer size

msgPrompt  BYTE "Enter the plain text: ", 0
msgEncrypt BYTE "Cipher text: ", 0
msgDecrypt BYTE "Decrypted: ", 0
buffer     BYTE BUFMAX + 1 DUP(0)
bufferSize DWORD  ?

.code
main PROC
	call InputTheString				;input the plain text
	call TranslateBuffer			;encrypt the buffer
	mov	 edx, OFFSET msgEncrypt		;display encrypted message
	call DisplayMessage				
	call TranslateBuffer  			;decrypt the buffer
	mov	 edx, OFFSET msgDecrypt		;display decrypted message
	call DisplayMessage
	call WaitMsg					;hold terminal open
	invoke ExitProcess, 0		
main ENDP


;Prompts user for a plaintext string. Saves the string and its length. 
InputTheString PROC
	pushad
	mov	 edx, OFFSET msgPrompt		;display a prompt
	call WriteString
	mov	 ecx, BUFMAX				;maximum character count
	mov	 edx, OFFSET buffer			;point to the buffer
	call ReadString         		;input the string
	mov	 bufferSize, eax        	;save the length
	call Crlf
	popad
	ret
InputTheString ENDP


;Displays the encrypted or decrypted message.
DisplayMessage PROC
	pushad
	call WriteString
	mov	 edx, OFFSET buffer			;display the buffer
	call WriteString
	call Crlf
	call Crlf
	popad
	ret
DisplayMessage ENDP


;Translates the string by exclusive-ORing each byte with the encryption key.
TranslateBuffer PROC
	pushad
	mov	ecx, bufferSize				;loop counter
	mov ebx, OFFSET KEY				;point to key's first byte
	mov	esi, 0						;index 0 in buffer

	L1:
		mov  al, [ebx]
		xor	 buffer[esi], al		;translate a byte
		inc  ebx					;point to next char in key
		inc	 esi					;point to next byte
		cmp  al, 0
		jne  L2
		mov ebx, OFFSET KEY			;point to key's first byte
	L2:
		loop L1

	popad
	ret
TranslateBuffer ENDP

end main
