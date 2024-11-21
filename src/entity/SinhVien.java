package entity;

import java.util.Date;

public abstract class SinhVien {
	
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
	
	protected String getHoLuc() {
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
	
	protected abstract double tinhDiemTB();

}
