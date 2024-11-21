package ui;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entity.SinhVienKT;
import entity.SinhVienKTPM;

public class ThongTinSVCUI {
	
	//fields
	private PrintWriter screenOutput = null;
	private Scanner keyBoardInput  = null;
	private String hoTenPrompt, nganhPrompt, ngaySinhPrompt, 
	diaChiPrompt, diemJavaPrompt, diemCssPrompt, diemHtmlPrompt,
	diemMarketingPrompt, diemSalesPrompt;
	private SimpleDateFormat simpleFormat = null;
	//functions - methods
	public ThongTinSVCUI() {
		
	}
	
	public ThongTinSVCUI(PrintWriter _screenOutput, 
			Scanner _keyBoardInput) {
		screenOutput = _screenOutput;
		keyBoardInput = _keyBoardInput;
		hoTenPrompt = "NHAP HO TEN SINH VIEN: ";
		nganhPrompt = "NHAP CHUYEN NGANH [\"KTPM\" / \"KT\"]: ";
		ngaySinhPrompt = "NHAP NGAY SINH CUA SINH VIEN (dd/MM/yyyy): ";
		diaChiPrompt = "NHAP DIA CHI NOI O CUA SINH VIEN: ";
		diemJavaPrompt = "NHAP DIEM CUA MON JAVA: ";
		diemCssPrompt = "NHAP DIEM CUA MON CSS: ";
		diemHtmlPrompt = "NHAP DIEM CUA MON HTML: ";
		diemMarketingPrompt = "NHAP DIEM MON MARKETING: ";
		diemSalesPrompt = "NHAP DIEM MON SAELS: ";
		simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
	}
	
	public void nhapThongTinSV() {
		screenOutput.print(hoTenPrompt);screenOutput.flush();
		String hoTen = keyBoardInput.nextLine();
		//sv code tiếp ...
		screenOutput.print(nganhPrompt);screenOutput.flush();
		String nganh = keyBoardInput.nextLine();
		screenOutput.print(diaChiPrompt);screenOutput.flush();
		String diaChi = keyBoardInput.nextLine();
		
		screenOutput.print(ngaySinhPrompt);screenOutput.flush();
		String ngaySinh = keyBoardInput.nextLine();//"dd/MM/yyyy"
		//chuyển String thành java.util.Date
		Date ngaySinhJava = null;
		try {
			ngaySinhJava =  simpleFormat.parse(ngaySinh);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//diem
		if("KTPM".equalsIgnoreCase(nganh)) {
			screenOutput.print(diemJavaPrompt);screenOutput.flush();
			double diemJava = keyBoardInput.nextDouble();
			screenOutput.print(diemCssPrompt);screenOutput.flush();
			double diemCss = keyBoardInput.nextDouble();
			screenOutput.print(diemHtmlPrompt);screenOutput.flush();
			double diemHtml = keyBoardInput.nextDouble();
			
			//đối tượng sinh viên phần mềm
			SinhVienKTPM svpm = new SinhVienKTPM(hoTen, diaChi, ngaySinhJava, 
					diemJava, diemCss, diemHtml);
		}
		
		if("KT".equalsIgnoreCase(nganh)) {
			screenOutput.print(diemMarketingPrompt);screenOutput.flush();
			double diemMarketing = keyBoardInput.nextDouble();
			screenOutput.print(diemSalesPrompt);screenOutput.flush();
			double diemSales = keyBoardInput.nextDouble();
			
			//đối tượng sinh viên kinh tế
			SinhVienKT svkt = new SinhVienKT(hoTen, diaChi, ngaySinhJava, 
					diemMarketing, diemSales);
		}
	}

}
