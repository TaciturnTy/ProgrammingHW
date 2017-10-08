COMMENT @

Tyler Paulley
10/6/2017
Chapter 5, Exercise 10
FibonacciGenerator.asm

@

.386
.model flat,stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword

INCLUDE Irvine32.inc

.data
fibArray DWORD 200 DUP(0)

.code
main proc
	mov ecx, 47
	mov esi, OFFSET fibArray
	call fib
	call WriteDec
	call CRLF
	call WaitMsg
	invoke ExitProcess,0
main endp

;takes number of fib numbers to generate in ecx
;takes pointer to DWORD array in esi
;returns value in eax
fib proc
	mov	ebx, 0				;previous fib value
	mov eax, 1				;next fib value
	mov edx, 0				;temp storage
	
fibLoop:	
	mov edx, eax			;save eax to edx
	mov [esi], eax
	add eax, ebx			;put eax + ebx into eax
	mov ebx, edx			;mov old eax to ebx
	add esi, TYPE fibArray
	loop fibLoop
	mov eax, [esi] - TYPE fibArray
	ret
fib endp 

end main