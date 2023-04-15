/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.quanlituyensinhdh;

/**
 *
 * @author admin
 */
import java.io.Serializable;



import java.util.Scanner;
public class NguyenVong implements Serializable{
private String maNganh, maTruong, tenNganh, khoiXT;
private float diemThi;
private int maNv;
public NguyenVong() {
}
public NguyenVong(int maNv, String maNganh, String maTruong,
String tenNganh, String khoiXT, float diemThi) {
this.maNv = maNv;
this.maNganh = maNganh;
this.maTruong = maTruong;
this.tenNganh = tenNganh;
this.khoiXT = khoiXT;
this.diemThi = diemThi;
}
public int getMaNv() {
return maNv;
}
public void setMaNv(int maNv) {
this.maNv = maNv;
}
public String getMaNganh() {
return maNganh;
}
public void setMaNganh(String maNganh) {
this.maNganh = maNganh;
}
public String getMaTruong() {
return maTruong;



}
public void setMaTruong(String maTruong) {
this.maTruong = maTruong;
}
public String getTenNganh() {
return tenNganh;
}
public void setTenNganh(String tenNganh) {
this.tenNganh = tenNganh;
}
public String getKhoiXT() {
return khoiXT;
}
public void setKhoiXT(String khoiXT) {
this.khoiXT = khoiXT;
}
public float getDiemXetTuyen() {
return diemThi;
}
public void nhapNguyenVong() {
Scanner sc = new Scanner(System.in);
System.out.println("Mã nguyện vọng: từ 1 tăng dần: ");
System.out.print("Mã trường: ");
maTruong = sc.nextLine();
System.out.print("Mã ngành: ");
maNganh = sc.nextLine();
System.out.print("Tên ngành: ");
tenNganh = sc.nextLine();
System.out.print("Khối xét tuyển: ");
khoiXT = sc.nextLine();
System.out.print("Điểm thi: ");
diemThi = sc.nextFloat();


}
public void hienNguyenVong()
{
System.out.println("Mã trường: "+ getMaTruong()+ ", Mã ngành: "+
getMaNganh()+ ", tên ngành: "+ getTenNganh()+ "\n Khối xét tuyển: "+
getKhoiXT()+ ", điểm Xét tuyển: "+ getDiemXetTuyen());
}
}
