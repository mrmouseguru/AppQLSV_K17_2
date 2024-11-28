package control;

import java.util.ArrayList;

import database.InDSSVDAO;
import entity.SinhVien;
import ui.InDSSVCUI;

public class InDanhSachSVControl {
	// fields
	private InDSSVDAO inDSSV = null;
	private InDSSVCUI inDSSVCUI = null;

	// functions
	public InDanhSachSVControl() {

	}

	public InDanhSachSVControl(InDSSVDAO _inDSSV, InDSSVCUI _inDSSVCUI) {
		inDSSV = _inDSSV;
		inDSSVCUI = _inDSSVCUI;
	}
	
	public void getDSSV() {
		ArrayList<SinhVien> dssv =   inDSSV.getAllSV();
		inDSSVCUI.inDSSV(dssv);
	}
}
