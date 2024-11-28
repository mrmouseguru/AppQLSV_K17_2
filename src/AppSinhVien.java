import java.io.PrintWriter;
import java.util.Scanner;

import control.ThemMoiSVControl;
import database.ArrayListMockDatabase;
import database.ThemMoiSVDAO;
import ui.MenuCUI;//phụ thuộc
import ui.ThongBaoThemSVCUI;
import ui.ThongTinSVCUI;

public class AppSinhVien {

	public static void main(String[] args) {
		//KHỞI TẠO CƠ SỞ DỮ LIỆU
		ArrayListMockDatabase.initDatabase();
		
		//sử dụng Class MenuCUI
		PrintWriter pWriterRemote = new PrintWriter(System.out, true);
		Scanner scannerRemote = new Scanner(System.in);
		
		ThemMoiSVDAO themMoiSVDAORemote = new ThemMoiSVDAO();
		
		ThongBaoThemSVCUI tbThemSVCUIRemote = 
				new ThongBaoThemSVCUI(pWriterRemote);
		
		ThemMoiSVControl themMoiSVControlRemote = new 
				ThemMoiSVControl(themMoiSVDAORemote);
		themMoiSVControlRemote.setTbThemSVCUI(tbThemSVCUIRemote);
		
		
		ThongTinSVCUI ttSVCUIRemote = new 
				ThongTinSVCUI(pWriterRemote, scannerRemote, 
						themMoiSVControlRemote);
		
		MenuCUI menuCUIRemote = new MenuCUI(pWriterRemote, 
				scannerRemote, ttSVCUIRemote);
		
		//gửi thông điệp
		menuCUIRemote.controlLoop();

	}

}
