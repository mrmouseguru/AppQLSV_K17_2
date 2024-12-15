package database;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import entity.SinhVien;

public class ThemMoiSVDAOFile {
	//fields
		private File fileData = null;
		private List<SinhVien> tempData = null;
		
		//methods
		public ThemMoiSVDAOFile(String fileName) {
			fileData = new File(fileName);
		}
		
		public void addSinhVien(SinhVien sv) {
			FileOutputStream fileStream = null;
			ObjectOutputStream os = null;
			
			try {
				readDataToListFromFile();
				//mở kênh đến file cần ghi đối tượng
				fileStream = new FileOutputStream(fileData);
				//dùng công cụ để ghi xuống file thông qua
				//kênh fileStream
				os = new ObjectOutputStream(fileStream);
				this.tempData.add(sv);
				os.writeObject(tempData);
				os.close();
				fileStream.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		private void readDataToListFromFile() {
			FileInputStream fileStream = null;
			ObjectInputStream oIS = null;
			
			try {
				fileStream = new FileInputStream(fileData);
				oIS = new ObjectInputStream(fileStream);
				
				this.tempData = (List<SinhVien>) oIS.readObject();
				
				oIS.close();
				fileStream.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (EOFException eofException) {
				eofException.printStackTrace();
				if(tempData == null) {
					tempData = new ArrayList<SinhVien>();
				}
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
