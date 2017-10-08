COMMENT @

Tyler Paulley
9/14/2017
Chapter 3, Exercise 6
AddVariables_64.asm

A 64-bit adaptation of the AddVariables.asm program

@
										;navigated to Project > Project Properties > Platform and changed platform from Win32 to x64
;.386									;removed .386
;.model flat,stdcall					;removed '.model flat,stdcall'
;.stack 4096							;removed '.stack 4096'
ExitProcess proto						;used 'ExitProcess proto' instead of 'ExitProcess proto,dwExitCode:dword'

.data
firstval  qword 20002000h				;changed variables to quad words
secondval qword 11111111h
thirdval  qword 22222222h
sum qword 0

.code
main proc
	mov	rax, firstval					;used 64-bit rax register instead of 32-bit eax register
	add	rax, secondval		
	add rax, thirdval
	mov sum, rax

	call ExitProcess					;used 'call ExitProcess' instead of 'call ExitProcess, 0'
main endp
end										;used 'end' instead of 'end main'