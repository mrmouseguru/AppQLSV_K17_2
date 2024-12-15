package ui;

import java.io.PrintWriter;
import java.util.ArrayList;

import entity.SinhVien;

public class InDSSVCUI {
	
	private PrintWriter screenOutput = null;
	
	public InDSSVCUI(PrintWriter _screenOutput) {
		screenOutput = _screenOutput;
	}

	public void inDSSV(ArrayList<SinhVien> dssv) {
		// TODO Auto-generated method stub
		for (SinhVien sinhVien : dssv) {
			
			screenOutput.println(sinhVien.getHoTen());
			screenOutput.printf("Diem TB: %f\n", sinhVien.tinhDiemTB());
			screenOutput.println(sinhVien.getHoLuc());

		}
		
	}

}
