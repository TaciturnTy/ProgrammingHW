COMMENT @

Tyler Paulley
11/13/2017
Chapter 7, Exercise 5
PrimeNumbers.asm

Description:
	This program generates and prints all prime values from 
	2-1000 using the Sieve of Eratosthenes method.
@

.386
.model flat, stdcall
.stack 4000h
ExitProcess proto, dwExitCode:dword
INCLUDE Irvine32.inc

.data	
numList DWORD 1000 DUP(1)			;set them to 1 if they are not a prime number
mySize = ($ - numList)
msgPrint BYTE "The Prime Numbers Between 1 and 1000 are:", 0ah, 0dh, 0

.code

main PROC
	mov	 edx, OFFSET msgPrint		
	call WriteString
	mov  ebx, 1						;set ebx to 1, ebx is incrementer for numbers 1-1000
	mov  eax, OFFSET numList
Init:
	mov  [eax], ebx
	inc  ebx
	add  eax, TYPE numList
	cmp  ebx, LENGTHOF numList
	jb   Init

	call Elim2						;remove multiples of 2
	call Elim3						;remove multiples of 3
	call Elim5						;remove multiples of 5
	call Elim7						;remove multiples of 7

	mov  edx, mySize
	mov  esi, 1
	add  edx, OFFSET numList
	mov  ebx, OFFSET numList
Write:
	add  ebx, TYPE numList
	cmp  [ebx], esi
	je   Next
	mov  eax, [ebx]
	call WriteDec
	call CRLF
Next:
	cmp  ebx, edx
	jb   Write

	call WaitMsg					;hold terminal open
	invoke ExitProcess, 0		
main ENDP

Elim2 proc
	pushad
	mov  ebx, TYPE numList
	add  ebx, TYPE numList			;size of 2 elements
	mov  eax, OFFSET numList
	add  eax, TYPE numList			;we are now looking at 2
Init:
	add  eax, ebx
	mov  edx, mySize
	add  edx, OFFSET numList
	cmp  edx, eax
	jb   Done
	mov  edx, 1
	mov  [eax], edx
	jmp  Init
Done:
	popad
	ret
Elim2 endp

Elim3 proc
	pushad
	mov  ebx, TYPE numList
	shl  ebx, 1
	add  ebx, TYPE numList			;size of 3 elements
	mov  eax, OFFSET numList
	mov  edx, ebx
	sub  edx, TYPE numList
	add  eax, edx					;we are now looking at element 3
Init:
	add  eax, ebx
	mov  edx, mySize
	add  edx, OFFSET numList
	cmp  edx, eax
	jb   Done
	mov  edx, 1
	mov  [eax], edx
	jmp  Init
Done:
	popad
	ret
Elim3 endp 

Elim5 proc
	pushad
	mov  ebx, TYPE numList
	shl  ebx, 1
	mov  edx, ebx
	add  ebx, edx
	add  ebx, TYPE numList			;size of 5 elements
	mov  eax, OFFSET numList
	mov  edx, ebx
	sub  edx, TYPE numList
	add  eax, edx					;we are now looking at element 5
Init:
	add  eax, ebx
	mov  edx, mySize
	add  edx, OFFSET numList
	cmp  edx, eax
	jb   Done
	mov  edx, 1
	mov  [eax], edx
	jmp  Init
Done:
	popad
	ret
Elim5 endp 

Elim7 proc
	pushad
	mov  ebx, TYPE numList
	mov  edx, ebx
	shl  ebx, 2
	shl  edx, 1
	add  ebx, edx
	add  ebx, TYPE numList			;size of 7 elements
	mov  eax, OFFSET numList
	mov  edx, ebx
	sub  edx, TYPE numList
	add  eax, edx					;we are now looking at element 7
Init:
	add  eax, ebx
	mov  edx, mySize
	add  edx, OFFSET numList
	cmp  edx, eax
	jb   Done
	mov  edx, 1
	mov  [eax], edx
	jmp  Init
Done:
	popad
	ret
Elim7 endp

end main


