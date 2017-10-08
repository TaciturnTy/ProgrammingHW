COMMENT @

Tyler Paulley
9/19/2017
Chapter 4, Exercise 8
ShiftArray.asm

@

.386
.model flat,stdcall
.stack 4096
ExitProcess proto,dwExitCode:DWORD

.data
intArray BYTE 10d, 20d, 30d, 40d
firstLocation DWORD OFFSET intArray
lastLocation DWORD SIZEOF intArray - TYPE intArray + OFFSET intArray

.code
main proc
	mov eax, 0								;clear regs we will use
	mov ebx, 0
	mov esi, OFFSET intArray				;store location of first array element
	mov al, [esi]							;store first array item's value
	
ShiftLoop:				
	cmp esi, lastLocation					;go until current position is last position
	je LastShift								

	add esi, TYPE intArray					;increment position up by one array element
	mov bl, [esi]							;save next value
	mov [esi], al 							;store current value at position of next
	xchg al, bl								;next value becomes current value
	loop ShiftLoop

LastShift:
	mov esi, firstLocation					;move to starting location of array
	mov [esi], al							;move last array element to start		
	invoke ExitProcess,0
main endp
end main