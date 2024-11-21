import java.io.PrintWriter;
import java.util.Scanner;

import ui.MenuCUI;//phụ thuộc
import ui.ThongTinSVCUI;

public class AppSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sử dụng Class MenuCUI
		PrintWriter pWriterRemote = new PrintWriter(System.out, true);
		Scanner scannerRemote = new Scanner(System.in);
		
		ThongTinSVCUI ttSVCUIRemote = new 
				ThongTinSVCUI(pWriterRemote, scannerRemote);
		
		MenuCUI menuCUIRemote = new MenuCUI(pWriterRemote, 
				scannerRemote, ttSVCUIRemote);
		
		//gửi thông điệp
		menuCUIRemote.controlLoop();

	}

}
