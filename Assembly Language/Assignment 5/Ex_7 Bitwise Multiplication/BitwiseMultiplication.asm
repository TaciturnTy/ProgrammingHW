COMMENT @

Tyler Paulley
11/13/2017
Chapter 7, Exercise 7
BitwiseMultiplication.asm

Description:
	This program multiplies two numbers by using bitwise
	multiplication rather than the mul or imul instructions.
@

.386
.model flat, stdcall
.stack 4096
ExitProcess proto, dwExitCode:dword
INCLUDE Irvine32.inc


.data	
heading BYTE "BITWISE MULTIPLICATION", 0ah, 0dh, 0
prompt1 BYTE "Please enter your first integer: ", 0
prompt2 BYTE "Please enter your second integer: ", 0
msgProd BYTE "The product is: ", 0
intX DWORD ?
intY DWORD ?
temp DWORD ?

.code
main proc
	mov edx, OFFSET heading		;write title
	CALL WriteString

	mov edx, OFFSET prompt1		;read and store intX
	CALL WriteString
	CALL ReadInt
	mov intX, eax

	mov edx, OFFSET prompt2		;read and store intY
	CALL WriteString
	CALL ReadInt
	mov intY, eax

	cmp intX, 0					;get abs value
	jge SkipNeg1
	neg intX
SkipNeg1:

	cmp intY, 0					;get abs value
	jge SkipNeg2
	neg intY
SkipNeg2:

	mov eax, intX
	mov ebx, intY
	call BitwiseMult
								;eax is now product
	mov edx, OFFSET msgProd		
	CALL WriteString			;print product
	;mov eax, intX
	CALL WriteDec
	CALL CRLF
	CALL WaitMsg				;hold terminal open
	invoke ExitProcess, 0		
main endp

;book specifies to pass the integer into the procedure by ebx 
;and to return the product by the eax register
BitwiseMult proc
	push ecx
	push edx
	;mov ecx, intX
	mov intY, 0					;zero out intY since it will hold product
	mov ecx, -1					;counter for number of shifts until carry is set
L1:
	inc ecx
	shr ebx, 1
	jnc L1
	mov edx, intX
	mov temp, edx
	shl intX, cl
	mov edx, intY
	add edx, intX
	mov intY, edx
	xor ecx, ecx				;set shift counter back to 0
	mov edx, temp
	mov intX, edx
	cmp ebx, 0					;see if all 1's have been shifted out of ebx
	jne L1
	
	mov eax, intY
	pop edx
	pop ecx
	ret
BitwiseMult endp 

end main
