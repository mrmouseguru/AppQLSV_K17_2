package database;

import control.ThemDAO;
import entity.SinhVien;

public class ThemMoiSVDAO extends ThemDAO {
	
	
	public ThemMoiSVDAO() {
		
	}
	
	public void addSinhVien(SinhVien sv ) {
		//Kết nối CSDL
		//Them SV vào CSDL

		ArrayListMockDatabase.insertSinhVien(sv);
	}

}
