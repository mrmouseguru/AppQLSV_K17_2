package control;

import java.util.ArrayList;

import database.InDSSVDAO;
import database.InDSSVDAOFile;
import entity.SinhVien;
import ui.InDSSVCUI;

public class InDanhSachSVControl {
	// fields
	//private InDSSVDAO inDSSV = null;
	private InDSSVCUI inDSSVCUI = null;
	//private InDSSVDAOFile inDSSVDAOFile = null;
	private InDAO inDAO = null;

	// functions
	public InDanhSachSVControl() {

	}

	public InDanhSachSVControl(InDAO inDAO, InDSSVCUI _inDSSVCUI) {
		this.inDAO = inDAO;
		inDSSVCUI = _inDSSVCUI;
	}
	
	public void setInDSSVDAO(InDAO inDAO) {
		this.inDAO = inDAO;
	}
	
	public void inDSSV() {
		ArrayList<SinhVien> dssv =   inDAO.getAllSV();
		inDSSVCUI.inDSSV(dssv);
	}
}
