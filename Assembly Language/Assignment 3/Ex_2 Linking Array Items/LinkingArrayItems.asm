COMMENT @

Tyler Paulley
10/6/2017
Chapter 5, Exercise 2
LinkingArrayItems.asm

@

.386
.model flat,stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword

INCLUDE Irvine32.inc

.data
CharArray BYTE 'H', 'A', 'C', 'E', 'B', 'D', 'F', 'G'
LinkArray DWORD 0d, 4d, 5d, 6d, 2d, 3d, 7d, 0d			;set to DWORD size as exercise requested
Index DWORD 1d
OutputArray	BYTE TYPE CharArray * SIZEOF CharArray DUP('#')	

.code
main proc
	mov edx, OFFSET OutputArray
	mov ecx, SIZEOF CharArray

	TransferChar:
		push ecx
		mov eax, OFFSET CharArray
		mov ebx, OFFSET LinkArray

		mov ecx, Index

		IterateIndex:
			cmp Index, 0					;if no iteration needs to be done, get out of loop
			je ZeroIndex
			add eax, TYPE CharArray			;after loop, points to next char to push	
			add ebx, TYPE LinkArray			;after loop, points to next index
		loop IterateIndex

		ZeroIndex:
		mov ecx, [ebx]
		mov Index, ecx	
		mov ecx, [eax]
		mov [edx], cl

		push eax							
		mov al, [edx]
		CALL WriteChar						;write output char to console
		CALL CRLF
		pop eax
		
		add edx, TYPE CharArray				;increment position in OutputArray up one
		pop ecx
	loop TransferChar

	call WaitMsg
	invoke ExitProcess,0
main endp
end main