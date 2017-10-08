COMMENT @

Tyler Paulley
9/19/2017
Chapter 4, Exercise 7
ReverseString.asm

@

.386
.model flat,stdcall
.stack 4096
ExitProcess proto,dwExitCode:DWORD

.data
source BYTE "This is the source string", 0
target BYTE SIZEOF source DUP('#')

intArray BYTE 01h, 05h, 02h, 13h

.code
main proc
	mov esi, OFFSET source + SIZEOF source - TYPE source	;store location of last source element
	mov edi, OFFSET target									;store first location of target
	mov ebx, OFFSET source - TYPE source					;get location of first character in source - 1

CopyLoop:				
	cmp ebx, esi											;if address of ebx greater than or equal to esi then all characters have been copied
	jge DoneCopying											

	mov al, [esi]											
	mov [edi], al

	sub esi, TYPE source
	add edi, TYPE source
	loop CopyLoop

DoneCopying:

	invoke ExitProcess,0
main endp
end main