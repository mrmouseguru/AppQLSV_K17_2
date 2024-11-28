import java.io.PrintWriter;
import java.util.Scanner;

import control.InDanhSachSVControl;
import control.ThemMoiSVControl;
import database.ArrayListMockDatabase;
import database.InDSSVDAO;
import database.ThemMoiSVDAO;
import ui.InDSSVCUI;
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
		
		//DAO
		ThemMoiSVDAO themMoiSVDAORemote = new ThemMoiSVDAO();
		InDSSVDAO inDSSVDAORemote = new InDSSVDAO();
		
		ThongBaoThemSVCUI tbThemSVCUIRemote = 
				new ThongBaoThemSVCUI(pWriterRemote);
		
		InDSSVCUI inDSSVCUIRemote = new InDSSVCUI(pWriterRemote);
		//Control
		ThemMoiSVControl themMoiSVControlRemote = new 
				ThemMoiSVControl(themMoiSVDAORemote);
		themMoiSVControlRemote.setTbThemSVCUI(tbThemSVCUIRemote);
		InDanhSachSVControl inDSControlRemote = new 
				InDanhSachSVControl(inDSSVDAORemote, inDSSVCUIRemote);
		
		
		//CUI
		ThongTinSVCUI ttSVCUIRemote = new 
				ThongTinSVCUI(pWriterRemote, scannerRemote, 
						themMoiSVControlRemote);
		
		MenuCUI menuCUIRemote = new MenuCUI(pWriterRemote, 
				scannerRemote, ttSVCUIRemote);
		
		menuCUIRemote.setInDSSVControl(inDSControlRemote);
		
		//gửi thông điệp
		menuCUIRemote.controlLoop();

	}

}
