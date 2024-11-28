package database;

import java.util.ArrayList;

import entity.SinhVien;

public class InDSSVDAO {
	
	public InDSSVDAO() {
		
	}
	
	public ArrayList<SinhVien> getAllSV(){
		
		return ArrayListMockDatabase.getAllSV();
	}

}
