package ui;

import java.io.PrintWriter;
import java.util.Scanner;

public class ThongTinSVCUI {
	
	//fields
	private PrintWriter screenOutput = null;
	private Scanner keyBoardInput  = null;
	private String hoTenPrompt, nganhPrompt, ngaySinhPrompt, 
	diaChiPrompt, diemJavaPrompt, diemCssPrompt, diemHtmlPrompt,
	diemMarketingPrompt, diemSalesPrompt;
	//functions - methods
	public ThongTinSVCUI() {
		
	}
	
	public ThongTinSVCUI(PrintWriter _screenOutput, 
			Scanner _keyBoardInput) {
		screenOutput = _screenOutput;
		keyBoardInput = _keyBoardInput;
		hoTenPrompt = "NHAP HO TEN SINH VIEN: ";
		nganhPrompt = "NHAP CHUYEN NGANH: ";
		ngaySinhPrompt = "NHAP NGAY SINH CUA SINH VIEN: ";
		diaChiPrompt = "NHAP DIA CHI NOI O CUA SINH VIEN: ";
		diemJavaPrompt = "NHAP DIEM CUA MON JAVA: ";
		diemCssPrompt = "NHAP DIEM CUA MON CSS: ";
		diemHtmlPrompt = "NHAP DIEM CUA MON HTML: ";
		diemMarketingPrompt = "NHAP DIEM MON MARKETING: ";
		diemSalesPrompt = "NHAP DIEM MON SAELS: ";
	}
	
	public void nhapThongTinSV() {
		screenOutput.print(hoTenPrompt);screenOutput.flush();
		String hoTen = keyBoardInput.nextLine();
		//sv code tiếp ...
	}

}
