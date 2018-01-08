COMMENT @

Tyler Paulley
11/27/2017
Chapter 8, Exercise 9
CountNearMatches.asm

Description:
	This program counts the number of similar elements in 
	two arrays of the same length.  Similar elements have 
	a maximum allowed difference (diff).
@

.386
.model flat, stdcall
.stack 4096
INCLUDE Irvine32.inc

ExitProcess PROTO, dwExitCode:dword
CountNearMatches PROTO, arr1Address:dword,	;points to first array
						arr2Address:dword,	;points to second array
						arrLength:dword,	;size of both arrays
						diff:dword			;maximum allowed difference

.data	
array1 SDWORD 112, 20, 5, -4, -10, 3, 2, 0, -33
array2 SDWORD 111,  20, 2, -2, -16, 2, 8, 4, -8
arrSize = LENGTHOF array1
maxDiff = 4
str1 BYTE "Array 1: 112, 20, 5, -4, -10, 3, 2, 0, -33", 0ah, 0dh, 0
str2 BYTE "Array 2: 111, 20, 2, -2, -16, 2, 8, 4, -8", 0ah, 0dh, 0
str3 BYTE "The Maximum Allowed Difference is: ", 0
str4 BYTE "The Number of Near Elements is: ", 0

.code
main PROC
	mov edx, OFFSET str1		;print array1
	CALL WriteString

	mov edx, OFFSET str2		;print array2
	CALL WriteString

	mov edx, OFFSET str3		;print max diff
	CALL WriteString
	mov eax, maxDiff
	CALL WriteDec
	CALL CRLF

	mov edx, OFFSET str4		
	CALL WriteString

	INVOKE CountNearMatches, OFFSET array1, ADDR array2, arrSize, maxDiff
	CALL WriteDec
	CALL CRLF
	CALL WaitMsg				;hold terminal open
	INVOKE ExitProcess, 0		
main ENDP

;output: eax -> number of near elements
CountNearMatches PROC, 
	arr1Address:dword,			;points to first array
	arr2Address:dword,			;points to second array
	arrLength:dword,			;size of both arrays	
	diff:dword					;maximum allowed difference

	push ebx
	push edx
	push ecx
	push esi
	push edi

	mov esi, arr1Address
	mov edi, arr2Address
	mov ecx, arrLength
	xor eax, eax
L1:
	mov ebx, [esi]
	mov edx, [edi]
	sub ebx, edx				;see if difference between ebx and edx is 
	cmp ebx, diff				;less than diff when both postive and negative
	jge NotNear					;if so it is near
	neg ebx
	cmp ebx, diff
	jge NotNear
	inc eax						;if near, increment count
NotNear:
	add esi, TYPE arr1Address	;go to next elements
	add edi, TYPE arr2Address
	Loop L1

	pop edi
	pop esi
	pop ecx
	pop edx
	pop ebx
	ret
CountNearMatches ENDP

END main
