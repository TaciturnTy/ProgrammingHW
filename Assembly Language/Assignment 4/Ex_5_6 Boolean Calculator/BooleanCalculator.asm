COMMENT @

Tyler Paulley
10/24/2017
Chapter 6, Exercises 5 & 6
BooleanCalculator.asm

Description:
	A simple boolean calculator for 32-bit integers. The program will
	continue prompting the user until ExitProgram is called. This program 
	is the completed boolean calculator from Exercises 5 & 6.

	Possible operations are:
	1) x AND y
	2) x OR y
	3) NOT x
	4) x XOR y
	5) Exit Program
@

.386
.model flat, stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword
INCLUDE Irvine32.inc

.data
msgTitle BYTE "__________BOOLEAN_CALCULATOR__________", 0dh, 0ah
		 BYTE "Boolean Operations for HEXADECIMAL Integers"
		 BYTE 0dh, 0ah, 0

msgMenu	BYTE "The Available Operations Are:", 0dh, 0ah
		BYTE "1) x AND y", 0dh, 0ah
		BYTE "2) x OR y", 0dh, 0ah
		BYTE "3) NOT x", 0dh, 0ah
		BYTE "4) x XOR y", 0dh, 0ah
		BYTE "5) Exit Program", 0dh, 0ah
		BYTE 0dh, 0ah
		BYTE "Please Enter An Operation Integer >> ", 0

msgOperand1	BYTE "Please Enter Hexadecimal Value For X >> ", 0
msgOperand2	BYTE "Please Enter Hexadecimal Value For Y >> ", 0
msgResult   BYTE "The Value of X After the Operation is >> ", 0

msgAND BYTE "__AND_OPERATION__", 0dh, 0ah, 0
msgOR  BYTE "__OR_OPERATION__", 0dh, 0ah, 0
msgNOT BYTE "__NOT_OPERATION__", 0dh, 0ah, 0
msgXOR BYTE "__XOR_OPERATION__", 0dh, 0ah, 0
msgExitProgram BYTE "Exiting Program...", 0dh, 0ah, 0

;stores proc addresses and integer values
caseTable BYTE '1'				
		  DWORD AND_op
entrySize = ($ - caseTable)			;set to size of one entry of the table
		  BYTE '2'
		  DWORD OR_op
		  BYTE '3'
		  DWORD NOT_op		  
		  BYTE '4'
		  DWORD XOR_op
		  BYTE '5'
		  DWORD ExitProgram

numberOfEntries = ($ - caseTable) / entrySize		


.code
main PROC
	call Clrscr
	mov  edx, OFFSET msgTitle		;print title
	call WriteString
	call Crlf

	Menu:
		mov edx, OFFSET msgMenu		;print operations menu
		call WriteString

	Input:							;checks if user input is valid, if invalid then label loops
		call ReadChar
		cmp  al, '5'
		ja   Input					;unsigned, jump to Input if above ascii '5'
		cmp  al, '1'
		jb   Input					;unsigned, jump to Input if below ascii '1'
		call ChooseProcedure
		jc   Quit						;jump if carry is set, carry is set if ExitProgram is called
		call Crlf
		jmp  Menu

	Quit:
		invoke ExitProcess, 0
main ENDP


;compares operation integers to the user's input
;increments a pointer to the CaseTable until the proper operation is found
ChooseProcedure PROC USES ebx ecx eax
	mov ebx, OFFSET CaseTable		
	mov ecx, NumberOfEntries		
	
	L1:								
		cmp  al, [ebx]				;compare input to CaseTable integer
		jne  L2						;increment pointer to CaseTable if mismatch
		call near ptr [ebx + 1]		;call matching operation in CaseTable
		jmp  L3						

	L2:								;increments pointer to CaseTable
		add  ebx, EntrySize
		Loop L1

	L3:
		ret
ChooseProcedure ENDP


AND_op PROC	USES edx ebx eax	
	call Crlf
	call Crlf
	mov  edx, OFFSET msgAND			
	call WriteString				;print operation title

	mov  edx, OFFSET msgOperand1		;get x, y inputs
	call WriteString
	call ReadHex
	mov  ebx, eax
	mov  edx, OFFSET msgOperand2
	call WriteString
	call ReadHex

	and eax, ebx					;x and y
	
	mov  edx, OFFSET msgResult		;print result
	call WriteString
	call WriteHex					;write result stored in eax
	call Crlf
	ret
AND_op ENDP


OR_op PROC USES edx ebx eax
	call Crlf
	call Crlf
	mov  edx, OFFSET msgOR			
	call WriteString				;print operation title

	mov  edx, OFFSET msgOperand1		;get x, y inputs
	call WriteString
	call ReadHex
	mov  ebx, eax
	mov  edx, OFFSET msgOperand2
	call WriteString
	call ReadHex

	or   eax, ebx						;x or y
	
	mov  edx, OFFSET msgResult		;print result
	call WriteString
	call WriteHex					;write result stored in eax
	call Crlf
	ret
OR_op ENDP


NOT_op PROC USES edx eax	
	call Crlf
	call Crlf
	mov  edx, OFFSET msgNOT			
	call WriteString				;print operation title

	mov  edx, OFFSET msgOperand1		;get x input
	call WriteString
	call ReadHex

	not  eax							;not x
	
	mov  edx, OFFSET msgResult		;print result
	call WriteString
	call WriteHex					;write result stored in eax
	call Crlf
	ret
NOT_op ENDP


XOR_op PROC USES edx ebx eax	
	call Crlf
	call Crlf
	mov  edx, OFFSET msgXOR			
	call WriteString				;print operation title

	mov  edx, OFFSET msgOperand1		;get x, y inputs
	call WriteString
	call ReadHex
	mov  ebx, eax
	mov  edx, OFFSET msgOperand2
	call WriteString
	call ReadHex

	xor  eax, ebx					;x xor y
	
	mov  edx, OFFSET msgResult		;print result
	call WriteString
	call WriteHex					;write result stored in eax
	call Crlf
	ret
XOR_op ENDP


ExitProgram PROC USES edx  	
	call Crlf
	call Crlf
	mov  edx, OFFSET msgExitProgram
	call WriteString				;print operation title
	stc								;set carry flag to 1, main will jump to Quit label
	ret
ExitProgram ENDP

end main

