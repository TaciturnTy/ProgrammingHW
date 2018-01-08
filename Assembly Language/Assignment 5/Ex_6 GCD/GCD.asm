COMMENT @

Tyler Paulley
11/13/2017
Chapter 7, Exercise 6
GCD.asm

Description:
	This program finds the Greatest Common Divisor of several sample 
	integers and prints it to the screen.
@

.386
.model flat, stdcall
.stack 4096
ExitProcess proto, dwExitCode:dword
INCLUDE Irvine32.inc

.data	
prompt1 BYTE "Please enter your first integer: ", 0
prompt2 BYTE "Please enter your second integer: ", 0
msgGCD   BYTE "The GCD of the integers is: ", 0
intX DWORD ?
intY DWORD ?

.code
main proc
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

L1:
	mov eax, intX
	mov ebx, intY
	xor edx, edx
	div ebx						;eax is quotient, edx is remainder
	mov intX, ebx				;move intY into intX   
	mov intY, edx				;move remainder into intY
	cmp intY, 0
	jg L1

	
	mov edx, OFFSET msgGCD		
	CALL WriteString			;print GCD
	mov eax, intX
	CALL WriteDec
	CALL CRLF
	CALL WaitMsg				;hold terminal open
	invoke ExitProcess, 0		
main endp

end main
