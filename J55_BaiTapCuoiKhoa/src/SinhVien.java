
public class SinhVien {
	private String ma, hodem, ten, ngaySinh, gioiTinh;
	
	

	public SinhVien(String ma, String hodem,
			String ten,
			String ngaySinh, String gioiTinh) {
		this.ma = ma;
		this.hodem = hodem;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getHodem() {
		return hodem;
	}

	public void setHodem(String hodem) {
		this.hodem = hodem;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return hodem+ " "+ten;
	}
	
	
}
