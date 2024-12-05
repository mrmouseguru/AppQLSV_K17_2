package entity;

import java.util.Date;

public class SinhVienKT extends SinhVien{
	private double diemMarketing;
	private double diemSales;
	
public SinhVienKT() {
		
	}
	
	public SinhVienKT(String _hoTen, String _diaChi, Date _ngaySinh,
			double _diemMarketing, double _diemSales) {
		
		super(_hoTen, "KT", _diaChi, _ngaySinh);
		
		diemMarketing = _diemMarketing;
		diemSales = _diemSales;
	}
	
	@Override
	public double tinhDiemTB() {
		// TODO Auto-generated method stub
		return (2 * diemMarketing + diemSales) / 3;
	}

}
