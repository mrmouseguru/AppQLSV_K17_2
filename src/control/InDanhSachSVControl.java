package control;

import java.util.ArrayList;

import database.InDSSVDAO;
import database.InDSSVDAOFile;
import entity.SinhVien;
import ui.InDSSVCUI;

public class InDanhSachSVControl {
	// fields
	private InDSSVDAO inDSSV = null;
	private InDSSVCUI inDSSVCUI = null;
	private InDSSVDAOFile inDSSVDAOFile = null;

	// functions
	public InDanhSachSVControl() {

	}

	public InDanhSachSVControl(InDSSVDAO _inDSSV, InDSSVCUI _inDSSVCUI) {
		inDSSV = _inDSSV;
		inDSSVCUI = _inDSSVCUI;
	}
	
	public void setInDSSVDAOFile(InDSSVDAOFile inDSSVDAOFile) {
		this.inDSSVDAOFile = inDSSVDAOFile;
	}
	
	public void inDSSV() {
		ArrayList<SinhVien> dssv =   inDSSVDAOFile.getAllSV();
		inDSSVCUI.inDSSV(dssv);
	}
}
