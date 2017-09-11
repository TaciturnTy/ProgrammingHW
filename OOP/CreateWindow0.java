//CreateWindow.java
/**
*	Written by Muzaffar Ali
*	Date: September 22, 2012
*	
*/

//package myutil;

import javax.swing.*;

public class CreateWindow0{

	public static void main(String[] args){

		int width, height;	// in pixels

		width =Integer.parseInt(JOptionPane.showInputDialog
			("Please Enter the Width of the Window in Pixels:"));

		height =Integer.parseInt(JOptionPane.showInputDialog
			("Please Enter the height of the Window in Pixels:"));
	
		JFrame myWindow = new JFrame();

		myWindow.setSize(width, height);
		myWindow.setTitle("Here Goes the Title of the Window on Title Bar");
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setVisible(true);

		for(int i=0; i<1000000; i++)
			myWindow.setVisible(false);
		myWindow.setVisible(true);
		
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}
}
