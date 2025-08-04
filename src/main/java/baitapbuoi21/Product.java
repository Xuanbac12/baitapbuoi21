package baitapbuoi21;

public class Product {
   private String tenSanPham;
   private int soLuong;
   private double giaBan;
   
   public Product() {
	   
   }
   
   public Product(String tenSanPham, int soLuong, double giaBan) {
	   this.tenSanPham = tenSanPham;
	   this.soLuong = soLuong;
	   this.giaBan = giaBan;
   }

public String getTenSanPham() {
	return tenSanPham;
}

public void setTenSanPham(String tenSanPham) {
	this.tenSanPham = tenSanPham;
}

public int getSoLuong() {
	return soLuong;
}

public void setSoLuong(int soLuong) {
	this.soLuong = soLuong;
}

public double getGiaBan() {
	return giaBan;
}

public void setGiaBan(double giaBan) {
	this.giaBan = giaBan;
}
   
   
}
