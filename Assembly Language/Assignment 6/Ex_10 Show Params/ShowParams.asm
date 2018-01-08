COMMENT @

Tyler Paulley
11/27/2017
Chapter 8, Exercise 10
ShowParams.asm

Description:
	This program displays the address and hexadecimal value
	for the parameters of the procedure that called this program.
@

.386
.model flat, stdcall
.stack 4096
INCLUDE Irvine32.inc

ExitProcess PROTO, dwExitCode:dword
SampleProc  PROTO, 
	first:dword,			   
	second:dword,
	third:dword
ShowParams  PROTO, 
	count:dword				;number of params in calling PROC

.data	
str1 BYTE "Address ", 0
str2 BYTE " = ", 0
myData DWORD 0AAAADDDDh, 0BBBBDDDDh, 0CCCCDDDDh

.code
main PROC

	mov esi, OFFSET myData
	INVOKE SampleProc, [esi], [esi + TYPE myData], [esi + TYPE myData + TYPE myData]

	CALL WaitMsg			;hold terminal open
	INVOKE ExitProcess, 0		
main ENDP

;demo procedure that would call ShowParams
SampleProc PROC, 
	first:dword,
	second:dword,
	third:dword

	paramCount = 3
	INVOKE ShowParams, paramCount
	ret
SampleProc ENDP


ShowParams PROC, 
	count:dword				;number of params in calling PROC
	push eax
	push ebx
	push ecx
	push edx

	mov ecx, paramCount
L1:							;print each address and value of parameters
	mov edx, OFFSET str1
	CALL WriteString
	mov eax, esi
	CALL WriteHex
	mov edx, OFFSET str2
	CALL WriteString
	mov eax, [esi]
	CALL WriteHex
	CALL CRLF
	add esi, TYPE myData
	Loop L1

	pop edx
	pop ecx
	pop ebx
	pop eax
	ret
ShowParams ENDP

END main
