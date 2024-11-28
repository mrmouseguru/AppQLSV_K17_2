package database;

import entity.SinhVien;

public class ThemMoiSVDAO {
	
	
	public ThemMoiSVDAO() {
		
	}
	
	public void addSinhVien(SinhVien sv ) {
		//Kết nối CSDL
		//Them SV vào CSDL

		ArrayListMockDatabase.insertSinhVien(sv);
	}

}
