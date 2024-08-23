import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// doc du lieu
		DataIO.dataRoot = "C:\\Users\\Admin\\Desktop\\BaiTapCuoiKHhoa_JavaCore\\QuanLySinhVien\\data";
		DataIO.loadData(); // 
		int size = DataIO.dsSinhVien.size();
		System.out.println("size = "+size);
		
		Scanner sc = new Scanner(System.in);
		int chon;
		do {
			// in menu
			printMenu1();
			// nhap lua chon
			System.out.print("Nhap lua chon:");
			chon = sc.nextInt();
			switch (chon) {
			case 1:
				capNhatDs();
				break;
			case 2: 
				hienThiBangDiem();
				break;
			case 3:
				timKiem();
			default:
				break;
			}
		}while(chon!=0);
	}

	private static void timKiem() {
		// TODO Auto-generated method stub
		
	}

	private static void hienThiBangDiem() {
		ArrayList<Diem> dsDiem = new ArrayList<Diem>();
		dsDiem.add(new Diem("SV0001","001",8.0));
		dsDiem.add(new Diem("SV0001","002",6.0));
		dsDiem.add(new Diem("SV0001","003",7.0));
		dsDiem.add(new Diem("SV0001","003",7.0));
		
		ArrayList<MonHoc> dsMonHoc = new ArrayList<MonHoc>();
		dsMonHoc.add(new MonHoc("001", "Tin dai cuong", 1.0));
		dsMonHoc.add(new MonHoc("002", "Toan cao cap", 2.0));
		dsMonHoc.add(new MonHoc("003", "Tu tuong HCM", 1.0));
		dsMonHoc.add(new MonHoc("003", "Tu tuong HCM", 1.0));
		
		SinhVien sv = new SinhVien("SV0001",
					"Nguyen Hoang Phuong",
					"Anh",
					"15/09/2001", "Nu");
		
		inChiTietBangDiem(sv, dsDiem, dsMonHoc);
	}

	private static void capNhatDs() {
		// TODO Auto-generated method stub
		
	}

	private static void printMenu1() {
		System.out.println("┌─────────────────────────┐");
		System.out.println("│ 1. Cap nhat danh sach   │");
		System.out.println("│ 2. Hien thi bang diem   │");
		System.out.println("│ 3. Tim kiem             │");
		System.out.println("└─────────────────────────┘\n");
		
	}
	
	
	public static void inChiTietBangDiem(SinhVien sv,
			ArrayList<Diem> dsDiem, ArrayList<MonHoc> dsMonHoc) {
		double dtk = 8.95;
		
		System.out.println("┌─────────────────────────────────────┐");
		 System.out.format("│ %-7s  %26s │\n", sv.getMa(), sv.getName());
		 System.out.format("│ DTK: %30.2f │\n", dtk);
		System.out.println("├─────────────────────────────────────┤");
		for (int i = 0; i < dsDiem.size(); i++) {
			MonHoc mh = dsMonHoc.get(i);
			System.out.format("│ %-5s %23s %5.2f │\n", mh.getMa(), mh.getTen(),
								dsDiem.get(i).getDiem());
		}
		System.out.println("└─────────────────────────────────────┘\n");
	}
}
