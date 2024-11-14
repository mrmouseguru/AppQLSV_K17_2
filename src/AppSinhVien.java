import java.io.PrintWriter;
import java.util.Scanner;

import ui.MenuCUI;//phụ thuộc

public class AppSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sử dụng Class MenuCUI
		PrintWriter pWriterRemote = new PrintWriter(System.out);
		Scanner scannerRemote = new Scanner(System.in);
		
		MenuCUI menuCUIRemote = new MenuCUI(pWriterRemote, 
				scannerRemote);
		
		//gửi thông điệp
		menuCUIRemote.controlLoop();

	}

}
