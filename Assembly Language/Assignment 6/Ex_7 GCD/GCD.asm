COMMENT @

Tyler Paulley
11/27/2017
Chapter 8, Exercise 7
GCD.asm

Description:
	This program uses a recursive Euclid algorithm 
	for finding the GCD of two integers.
@

.386
.model flat, stdcall
.stack 1000h
ExitProcess proto, dwExitCode:dword
INCLUDE Irvine32.inc

.data	
pair1_1 DWORD 5
pair1_2 DWORD 20
pair2_1 DWORD 24
pair2_2 DWORD 18
pair3_1 DWORD 11
pair3_2 DWORD 7
pair4_1 DWORD 432
pair4_2 DWORD 226
pair5_1 DWORD 26
pair5_2 DWORD 13

str1 BYTE "GCD of 5 and 20 is: ", 0
str2 BYTE "GCD of 24 and 18 is: ", 0
str3 BYTE "GCD of 11 and 7 is: ", 0
str4 BYTE "GCD of 432 and 226 is: ", 0
str5 BYTE "GCD of 26 and 13 is: ", 0

.code
main PROC
	push pair1_1				;test 1
	push pair1_2
	mov	 edx, OFFSET str1		
	call WriteString
	call EuclidGCD
	call WriteDec
	call CRLF

	push pair2_1				;test 2
	push pair2_2
	mov	 edx, OFFSET str2		
	call WriteString
	call EuclidGCD
	call WriteDec
	call CRLF

	push pair3_1				;test 3
	push pair3_2
	mov	 edx, OFFSET str3		
	call WriteString
	call EuclidGCD
	call WriteDec
	call CRLF

	push pair4_1				;test 4
	push pair4_2
	mov	 edx, OFFSET str4		
	call WriteString
	call EuclidGCD
	call WriteDec
	call CRLF

	push pair5_1				;test 5
	push pair5_2
	mov	 edx, OFFSET str5		
	call WriteString
	call EuclidGCD
	call WriteDec
	call CRLF

	call WaitMsg				;hold terminal open
	invoke ExitProcess, 0		
main ENDP

;inputs: int1 -> eax, int2 -> ebx 
;output: places gcd into eax
EuclidGCD PROC
	push ebp
	mov  ebp, esp
	mov  eax, [ebp + 12]
	mov  ebx, [ebp + 8]
	xor  edx, edx
	div  ebx					;divide eax by ebx, quotient -> eax, remainder -> edx
	cmp  edx, 0					;if edx = 0, gcd is in ebx
	je   Done					;jump to end case
	mov  eax, ebx
	mov  ebx, edx
	push eax
	push ebx
	CALL EuclidGCD
Done:								
	mov eax, ebx
	pop  ebp
	ret  8
EuclidGCD ENDP

END main