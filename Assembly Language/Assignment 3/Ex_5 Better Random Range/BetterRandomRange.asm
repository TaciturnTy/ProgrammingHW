COMMENT @

Tyler Paulley
10/6/2017
Chapter 5, Exercise 5
BetterRandomRange.asm

@

.386
.model flat,stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword

INCLUDE Irvine32.inc

.data
Min DWORD ?
Max DWORD ?
Range DWORD ?
StringInc BYTE "NOTE: Min and Max values are Inclusive", 0
StringMin BYTE "Please enter the MINIMUM random value: ", 0
StringMax BYTE "Please enter the MAXIMUM random value: ", 0

.code
main proc
	mov edx, OFFSET StringInc		
	CALL WriteString
	CALL Crlf
	mov edx, OFFSET StringMin		;read min and max
	CALL WriteString
	CALL ReadInt
	mov Min, eax
	mov edx, OFFSET StringMax
	CALL WriteString
	CALL ReadInt
	mov Max, eax

	mov ecx, 50
	CALL BetterRandomRange			;writes ecx random numbers between range
	CALL WaitMsg
	invoke ExitProcess,0
main endp

BetterRandomRange proc
	mov eax, Max
	sub eax, Min
	inc eax
	mov Range, eax
	CALL Randomize

	RandLoop:
		mov eax, Range
		CALL RandomRange
		add eax, Min
		CALL WriteInt
		CALL Crlf
	loop RandLoop
	ret
BetterRandomRange endp 

end main