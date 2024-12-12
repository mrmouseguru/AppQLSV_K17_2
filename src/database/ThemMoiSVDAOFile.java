package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entity.SinhVien;

public class ThemMoiSVDAOFile {
	//fields
	private File file;
	//functions
	public ThemMoiSVDAOFile(String fileName) {
		file = new File(fileName);
	}
	
	public void addSinhVien(SinhVien sv ) {
		//Kết nối CSDL
		//Them SV vào CSDL
		//mở kênh đến file SinhVien.db
		FileOutputStream fOS = null;
		//công cụ ghi đối tượng sinh vien 
		//vào file
		ObjectOutputStream oOS = null;
		
		//khởi tạo 
		try {
			fOS  = new FileOutputStream(file);
			oOS = new ObjectOutputStream(fOS);
			oOS.writeObject(sv);
			oOS.close();
			fOS.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
