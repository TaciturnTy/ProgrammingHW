COMMENT @

Tyler Paulley
11/27/2017
Chapter 8, Exercise 8
CountMatches.asm

Description:
	This program counts the number of matching elements
	in two arrays of equal length.
@

.386
.model flat, stdcall
.stack 4096
INCLUDE Irvine32.inc

ExitProcess PROTO, dwExitCode:dword
CountMatches PROTO, arr1Address:dword,	;points to first array
					arr2Address:dword,	;points to second array
					arrLength:dword		;size of both arrays

.data	
array1 SDWORD 12, 20, 5, -4, -10, 3, 2, 0, -33
array2 SDWORD 1,  20, 0, -4, -12, 2, 8, 0, -8
arrSize = LENGTHOF array1
str1 BYTE "Array 1: 12, 20, 5, -4, -10, 3, 2, 0, -33", 0ah, 0dh, 0
str2 BYTE "Array 2: 1,  20, 0, -4, -12, 2, 8, 0, -8", 0ah, 0dh, 0
str3 BYTE "The Number of Matching Elements is: ", 0

.code
main PROC
	mov edx, OFFSET str1		;print array1
	CALL WriteString

	mov edx, OFFSET str2		;print array2
	CALL WriteString

	mov edx, OFFSET str3		
	CALL WriteString

	INVOKE CountMatches, OFFSET array1, ADDR array2, arrSize
	CALL WriteDec
	CALL CRLF
	CALL WaitMsg				;hold terminal open
	INVOKE ExitProcess, 0		
main ENDP

;output: eax -> number of matching elements
CountMatches PROC, 
	arr1Address:dword,			;points to first array
	arr2Address:dword,			;points to second array
	arrLength:dword				;size of both arrays	

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
	cmp ebx, edx				;see if array elements are equal
	jne NoMatch
	inc eax						;if equal, increment count
NoMatch:
	add esi, TYPE arr1Address	;go to next elements
	add edi, TYPE arr2Address
	Loop L1

	pop edi
	pop esi
	pop ecx
	pop edx
	pop ebx
	ret
CountMatches ENDP

END main
