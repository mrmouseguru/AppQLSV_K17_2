package ui;

import java.io.PrintWriter;
import java.util.Scanner;

import control.InDanhSachSVControl;


public class MenuCUI {
	
	//fields
	private PrintWriter screenOutput = null;
	private Scanner keyBoardInput = null;
	private String prompt;
	private String command;
	private ThongTinSVCUI ttSVCUI = null;
	private InDanhSachSVControl inDSSVControl = null;
	//functions - methods
	
	//constructor
	public MenuCUI() {
		//
		screenOutput = new PrintWriter(System.out);
	}
	
	public void setInDSSVControl(InDanhSachSVControl _inDSSVControl) {
		inDSSVControl = _inDSSVControl;
	}
	
	public MenuCUI(PrintWriter _screenOutput, Scanner _keyBoardInput) {
		screenOutput = _screenOutput;
		keyBoardInput = _keyBoardInput;
		prompt = "->";
		command = " ";
	}
	
	public MenuCUI(PrintWriter _screenOutput, Scanner _keyBoardInput,
			ThongTinSVCUI _ttSVCUI) {
		this(_screenOutput, _keyBoardInput);//gọi lại constructor MenuCUI 2 tham số
		ttSVCUI = _ttSVCUI;
	}
	
	
	
	
	public void controlLoop() {
		// vẽ lên menu
		// vẽ lời nhắc/ hướng dẫn cho người dùng
		screenOutput.println("go lenh \"help\" de duoc ho tro!");
		screenOutput.flush();
		
		
		//vẽ liên tục lên màn hình
		//phải dùng vòng lặp
		// for
		//while
		//do ... while
		while(true) {
			screenOutput.print(prompt);screenOutput.flush();
			command = keyBoardInput.nextLine();//"help"
			command = command.trim();
			
			if("help".equalsIgnoreCase(command)) {
				help();//gọi đến hàm help
				continue;
			}
			
			if("them".equalsIgnoreCase(command)) {
				themSinhVien();
				continue;
			}
			
			if("in".equalsIgnoreCase(command)) {
				inDSSV();
				continue;
			}
			
		}

	}
	
	private void inDSSV() {
		
		inDSSVControl.getDSSV();
	}

	private void themSinhVien() {
		// TODO Auto-generated method stub
		//đối tượng MenuCUI gửi thông điệp cho 
		//đối tượng ????UI để người dùng nhập
		//thông tin của sinh viên
		ttSVCUI.nhapThongTinSV();
		
	}

	private void help() {
		screenOutput.println("~~~~~~~~~~Console Help Menu~~~~~~~~~");
		screenOutput.println("[HELP] - Ho tro su dung phan mem");
		screenOutput.println("[THEM] - Them moi sinh vien");
		screenOutput.println("[IN] - In danh sach sinh vien");

		screenOutput.println("~~~~~~~~~~Console Help Menu~~~~~~~~~");
	}
	
	
	

}
