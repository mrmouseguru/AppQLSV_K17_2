package ui;

import java.io.PrintWriter;

public class ThongBaoThemSVCUI {
	private PrintWriter screenOutput = null;
	
	//functions
	//constructor
	public ThongBaoThemSVCUI() {
		
	}
	
	public ThongBaoThemSVCUI(PrintWriter _screenOutput) {
		screenOutput = _screenOutput;
		
	}
	
	public void inThongBao(String noiDung) {
		screenOutput.println(noiDung);
	}

}
