COMMENT @

Tyler Paulley
9/14/2017
Chapter 3, Exercise 1
IntExpression.asm

Calculates the expression A = (A + B) - (C + D)

For this example: A = 4, B = 3, C = 2, D = 1
Therefore, A = (4 + 3) - (2 + 1) should end with A = 4

@

.386
.model flat,stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword

.code
main proc
	mov	eax, 4	
	mov ebx, 3
	mov ecx, 2
	mov edx, 1

	add	eax, ebx
	add ecx, edx
	sub eax, ecx

	invoke ExitProcess,0
main endp
end main