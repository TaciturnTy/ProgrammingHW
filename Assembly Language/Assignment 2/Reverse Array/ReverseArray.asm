COMMENT @

Tyler Paulley
9/19/2017
Chapter 4, Exercise 6
ReverseArray.asm

Note: Had a bug until al and ah were used over EAX and EBX

@

.386
.model flat,stdcall
.stack 4096
ExitProcess proto,dwExitCode:DWORD

.data
intArray BYTE 01h, 05h, 02h, 13h

.code
main proc
	mov esi, OFFSET intArray						;store location of first array element
	mov edi, SIZEOF intArray - TYPE intArray		;store size of array into edi, subtract size of 1	
	add edi, esi									;now edi has address of last element

SwapLoop:				
	cmp edi, esi			
	jle DoneSwapping								;if address of end is less than or equal to address of start then jump

	mov al, [esi]
	mov ah, [edi]
	xchg al, ah										;if not, swap items at start and end
	mov [esi], al

	mov [edi], ah
	add esi, TYPE intArray
	sub edi, TYPE intArray
	loop SwapLoop

DoneSwapping:

	invoke ExitProcess,0
main endp
end main