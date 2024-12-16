package database;

import java.util.ArrayList;

import control.InDAO;
import entity.SinhVien;

public class InDSSVDAO implements InDAO {
	
	public InDSSVDAO() {
		
	}
	
	public ArrayList<SinhVien> getAllSV(){
		
		return ArrayListMockDatabase.getAllSV();
	}

}
