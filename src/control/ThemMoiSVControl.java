package control;

import java.util.Date;

import database.ThemMoiSVDAO;
import database.ThemMoiSVDAOFile;
import entity.SinhVien;
import entity.SinhVienKT;
import entity.SinhVienKTPM;
import ui.ThongBaoThemSVCUI;


public class ThemMoiSVControl {
	
	//Fields
	
	private ThemMoiSVDAO themSVDAO = null;
	private ThemMoiSVDAOFile themSVDAOFile = null;
	//private ThongBaoThemMoiSVUI tbThemUI = null;
	private ThongBaoThemSVCUI tbThemSVCUI = null;
	
	public ThemMoiSVControl() {
		
	}
	
	public void setTbThemSVCUI(ThongBaoThemSVCUI _tbThemSVCUI) {
		tbThemSVCUI = _tbThemSVCUI;
	}
	
	public ThemMoiSVControl(ThemMoiSVDAO _themSVDAO) {
		themSVDAO = _themSVDAO;
	}
	
	public void setThemSVDAOFile(ThemMoiSVDAOFile themSVDAOFile) {
		this.themSVDAOFile = themSVDAOFile;
	}

	public void taoSinhVien(String hoTen, String diaChi, Date ngaySinh,
			double diemJava, double diemCss, double diemHtml) {
		// TODO Auto-generated method stub
		//tạo đối tượng SinhVienKTPM
		//đối tượng sinh viên phần mềm
		SinhVienKTPM svpm = new SinhVienKTPM(hoTen, diaChi, ngaySinh, 
				diemJava, diemCss, diemHtml);
		
		doThemSinhVien(svpm);
	}
	
	
	public void taoSinhVien(String hoTen, String diaChi, Date ngaySinh,
			double diemMarketing, double diemSales) {
		//đối tượng sinh viên kinh tế
		SinhVienKT svkt = new SinhVienKT(hoTen, diaChi, ngaySinh, 
				diemMarketing, diemSales);
		
		doThemSinhVien(svkt);

	}
	
	private void doThemSinhVien(SinhVien sv ) {
		//themSVDAO.addSinhVien(sv);
		themSVDAOFile.addSinhVien(sv);
		tbThemSVCUI.inThongBao("Them Moi SV Thanh Cong!!!");
	}

}
