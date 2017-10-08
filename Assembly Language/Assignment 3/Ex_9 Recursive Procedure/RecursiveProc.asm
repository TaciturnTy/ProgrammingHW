COMMENT @

Tyler Paulley
10/6/2017
Chapter 5, Exercise 9
RecursiveProc.asm

Note: Couldn't figure out how to write a recursive proc by 
	  only using 'loop'. Instead 'je' was used.

@

.386
.model flat,stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword

INCLUDE Irvine32.inc

.data
CountStr BYTE "Please enter the number of recursive calls: ", 0

.code
main proc
	mov edx, OFFSET CountStr
	CALL WriteString
	CALL ReadDec
	mov ecx, eax
	xor eax, eax			;set eax to 0

	CALL Recursion
	CALL CRLF
	CALL WaitMsg
	invoke ExitProcess,0
main endp

Recursion proc
	inc eax
	CALL WriteDec
	CALL Crlf
	dec ecx
	cmp ecx, 0
	je StopRec
	CALL Recursion
	StopRec:
	ret
Recursion endp 

end main