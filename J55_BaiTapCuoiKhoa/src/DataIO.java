import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class DataIO {
	public static ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
	public static ArrayList<Diem> dsDiem = new ArrayList<Diem>();
	public static ArrayList<MonHoc> dsMonHoc = new ArrayList<MonHoc>();
	
	public static String dataRoot = "";
	
	public static String fileSinhVien = "sinhvien.txt";
	public static String fileDiem = "diem.txt";
	public static String fileMonHoc = "monhoc.txt";
	
	public static void loadData() {
		// load ds sv
		loadSinhVien();
		
		// load ds mh
		
		// load ds diem
		
	}
	
	
	public static MonHoc getMonHoc(String maMh) {
		for (int i = 0; i < dsMonHoc.size(); i++) {
			if(dsMonHoc.get(i).getMa().equals(maMh)) {
				return dsMonHoc.get(i);
			}
		}
		return null;
	}
	
	
	public static SinhVien getSinhVien(String ma) {
		for (int i = 0; i < dsSinhVien.size(); i++) {
			if(dsSinhVien.get(i).getMa().equals(ma)) {
				return dsSinhVien.get(i);
			}
		}
		return null;
	}
	
	public static Diem getDiem(String maSV, String maMH) {
		for (int i = 0; i < dsDiem.size(); i++) {
			if(dsDiem.get(i).getMaSV().equals(maSV) 
					&& dsDiem.get(i).getMaMh().equals(maMH)) {
				return dsDiem.get(i);
			}
		}
		return null;
	}
	
	public static ArrayList<Diem> getDiems(String maSV, ArrayList<MonHoc> dsMon) {
		ArrayList<Diem> list = new ArrayList<Diem>();
		for (int i = 0; i < dsMon.size(); i++) {
			String maMH = dsMon.get(i).getMa();
			for (int j = 0; j < dsDiem.size(); j++) {
				Diem d = dsDiem.get(j);
				if(d.getMaSV().equals(maSV) && d.getMaMh().equals(maMH)) {
					list.add(d);
				}
			}
		}
		return list;
	}
	
	
	private static void loadSinhVien() {
		FileReader freader = null;
		BufferedReader buffer = null;
		File file = new File(dataRoot+"/"+fileSinhVien);
		
		try {
			freader = new FileReader(file);
			buffer = new BufferedReader(freader);
			String line;
			while((line = buffer.readLine()) != null) {
				if(line.startsWith("#")) continue;
				String parts[] = line.split(";");
				String ma = parts[0];
				String hoDem = parts[1];
				String ten = parts[2];
				String ns = parts[3];
				String gt = parts[4];
				SinhVien s = new SinhVien(ma, hoDem, ten, ns, gt);
				dsSinhVien.add(s);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(buffer != null) buffer.close();
				if(freader != null) freader.close();
			}catch(Exception e) {}
		}
	}
}
