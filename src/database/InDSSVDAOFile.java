package database;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import control.InDAO;
import entity.SinhVien;

public class InDSSVDAOFile implements InDAO {
private File fileData = null;
	
	public InDSSVDAOFile(String fileName) {
		this.fileData = new File(fileName);
	}
	
	public ArrayList<SinhVien> getAllSV() {
		FileInputStream fileStream = null;
		ObjectInputStream oIS = null;
		ArrayList<SinhVien> dsSV = null;
		
		try {
			fileStream = new FileInputStream(fileData);
			oIS = new ObjectInputStream(fileStream);
			
			dsSV = (ArrayList<SinhVien>) oIS.readObject();
			
			oIS.close();
			fileStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException eofException) {
			eofException.printStackTrace();
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dsSV;
	}

}
