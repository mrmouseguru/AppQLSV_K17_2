package database;

import java.util.ArrayList;

import entity.SinhVien;
import entity.SinhVienKT;
import entity.SinhVienKTPM;

public class ArrayListMockDatabase {
	
	//fields static
	private static ArrayList<SinhVien> database = null;
	
	//static functions
	
	public static void initDatabase() {
		database = new ArrayList<SinhVien>();
		insertSinhVien(new SinhVienKTPM("Teo", "TPHCM", null, 5, 5, 5));
		insertSinhVien(new SinhVienKT("tY", "HN", null, 2, 2));
	}
	
	public static void insertSinhVien(SinhVien sv) {
		database.add(sv);
	}

	public static ArrayList<SinhVien> getAllSV() {
		// TODO Auto-generated method stub
		return database;
	}
	
	

}
