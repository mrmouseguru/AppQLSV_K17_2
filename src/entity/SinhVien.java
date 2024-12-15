package entity;

import java.io.Serializable;
import java.util.Date;

public abstract class SinhVien implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2593189524794325047L;
	private String hoTen;
	private String nganh;
	private String diaChi;
	private Date ngaySinh;
	
	//functions
	public SinhVien() {
		
	}
	
	public SinhVien(String _hoTen, String _nganh,
			String _diaChi, Date _ngaySinh) {
		hoTen = _hoTen;
		nganh = _nganh;
		diaChi = _diaChi;
		ngaySinh = _ngaySinh;
	}
	
	public String getHoLuc() {
		double diemTB = tinhDiemTB();
        if (diemTB < 5) {
            return "Yếu";
        } else if (diemTB < 6.5) {
            return "Trung bình";
        } else if (diemTB < 7.5) {
            return "Khá";
        } else if (diemTB < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
	}
	
	public abstract double tinhDiemTB();
	public String getHoTen() {
		return hoTen;
	}

}
