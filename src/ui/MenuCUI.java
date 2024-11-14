package ui;

import java.io.PrintWriter;
import java.util.Scanner;


public class MenuCUI {
	
	//fields
	private PrintWriter screenOutput = null;
	private Scanner keyBoardInput = null;
	//functions - methods
	
	//constructor
	public MenuCUI() {
		//
		screenOutput = new PrintWriter(System.out);
	}
	
	public MenuCUI(PrintWriter _screenOutput, Scanner _keyBoardInput) {
		screenOutput = _screenOutput;
		keyBoardInput = _keyBoardInput;
	}
	
	
	public void controlLoop() {
		// vẽ lên menu
		// vẽ lời nhắc/ hướng dẫn cho người dùng
		screenOutput.println("go lenh \"help\" de duoc ho tro!");
		screenOutput.flush();

	}
	
	
	

}