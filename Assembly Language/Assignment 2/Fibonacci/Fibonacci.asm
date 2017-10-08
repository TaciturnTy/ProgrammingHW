COMMENT @

Tyler Paulley
9/19/2017
Chapter 4, Exercise 5
Fibonacci.asm

@

.386
.model flat,stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword

.data

.code
main proc
	mov	ebx, 0				;previous fib value
	mov eax, 1				;next fib value
	mov edx, 0				;temp storage
	mov	ecx, 5				;number of fib elements to find -2 since we start with 0 and 1
	
FibLoop:	
	mov edx, eax			;save eax to edx
	add eax, ebx			;put eax + ebx into eax
	mov ebx, edx			;mov old eax to ebx
	loop FibLoop

	invoke ExitProcess,0
main endp
end main