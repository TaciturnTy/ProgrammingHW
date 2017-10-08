COMMENT @

Tyler Paulley
10/6/2017
Chapter 5, Exercise 4
SimpleAddition.asm

@

.386
.model flat,stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword

INCLUDE Irvine32.inc

.data
Int1 DWORD ?
Int2 DWORD ?
Rows BYTE ?
Cols BYTE ?
Divisor BYTE 4d
String1 BYTE "Please enter your first integer: ", 0
String2 BYTE "Please enter your second integer: ", 0
String3 BYTE "The sum of the integers is: ", 0
String4 BYTE "Loops Remaining: ", 0

.code
main proc
	mov ecx, 3d					;repeat 3 times

	AddLoop:
	CALL ResetScreen
	mov edx, OFFSET String1		;read int1
	CALL WriteString
	CALL ReadInt
	mov Int1, eax

	mov dl, Cols				;read int2
	mov dh, Rows
	inc dh
	CALL GoToXY
	mov edx, OFFSET String2		
	CALL WriteString
	CALL ReadInt
	mov Int2, eax
	CALL GoToXY	
	
	CALL print					;print sum and loops remaining
	loop AddLoop

	invoke ExitProcess,0
main endp

ResetScreen proc USES eax edx
	CALL ClrScr
	CALL GetMaxXY				;stores pixel rows in al, cols in dl
	mov Rows, al
	mov Cols, dl

	movzx ax, Rows					
	div Divisor					;divides ax by Divisor, puts quotient in al
	mov Rows, al				

	movzx ax, Cols					
	div Divisor					;divides ax by Divisor, puts quotient in al
	mov Cols, al

	mov dl, Cols
	mov dh, Rows
	CALL GoToXY					;move cursor to middle of window, reads cols from dl, rows for dh
	ret
ResetScreen endp

Print proc
	mov dl, Cols				;print sum
	mov dh, Rows
	inc dh
	inc dh
	CALL GoToXY	
	mov eax, Int1				
	add eax, Int2
	mov edx, OFFSET String3	
	CALL WriteString
	CALL WriteInt

	mov dl, Cols				;print loop count
	mov dh, Rows
	inc dh
	inc dh
	inc dh
	CALL GoToXY
	mov edx, OFFSET String4
	CALL WriteString
	mov eax, ecx
	dec eax
	CALL WriteDec

	mov dl, Cols
	mov dh, Rows
	add dh, 4d
	CALL GoToXY
	CALL WaitMsg
	ret
Print endp

end main