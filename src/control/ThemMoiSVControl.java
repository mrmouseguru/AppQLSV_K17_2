package control;

import java.util.Date;

import database.ThemMoiSVDAO;
import entity.SinhVienKT;
import entity.SinhVienKTPM;


public class ThemMoiSVControl {
	
	//Fields
	
	private ThemMoiSVDAO themSVDAO = null;
	//private ThongBaoThemMoiSVUI tbThemUI = null;
	
	public ThemMoiSVControl() {
		
	}
	
	public ThemMoiSVControl(ThemMoiSVDAO _themSVDAO) {
		themSVDAO = _themSVDAO;
	}

	public void taoSinhVien(String hoTen, String diaChi, Date ngaySinh,
			double diemJava, double diemCss, double diemHtml) {
		// TODO Auto-generated method stub
		//tạo đối tượng SinhVienKTPM
		//đối tượng sinh viên phần mềm
		SinhVienKTPM svpm = new SinhVienKTPM(hoTen, diaChi, ngaySinh, 
				diemJava, diemCss, diemHtml);
		
		themSVDAO.addSinhVien(svpm);
		
	}
	
	
	public void taoSinhVien(String hoTen, String diaChi, Date ngaySinh,
			double diemMarketing, double diemSales) {
		//đối tượng sinh viên kinh tế
		SinhVienKT svkt = new SinhVienKT(hoTen, diaChi, ngaySinh, 
				diemMarketing, diemSales);
		
		themSVDAO.addSinhVien(svkt);
	}

}
