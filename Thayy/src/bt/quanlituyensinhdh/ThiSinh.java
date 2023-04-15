/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.quanlituyensinhdh;

/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ThiSinh extends Nguoi{
private String SBD;
public float diemUuTien;
private ArrayList<NguyenVong> nv;
NguyenVong nguyenvonga;
public ThiSinh() {
super();
}
public ThiSinh(String SBD, float diemUuTien, ArrayList<NguyenVong>
nv, String hoTen, String queQuan, int namSinh, int gioiTinh) {
super(hoTen, queQuan, namSinh, gioiTinh);
this.SBD = SBD;
this.diemUuTien = diemUuTien;
this.nv = nv;
}
public String getSBD() {
return SBD;
}
public void setSBD(String SBD) {



this.SBD = SBD;
}
public float getDiemUuTien() {
return diemUuTien;
}
public void setDiemUuTien(float xx) {
diemUuTien = xx;
}
public ArrayList<NguyenVong> getNv() {
return nv;
}
public void setNv(ArrayList<NguyenVong> nv) {
this.nv = nv;
}
public NguyenVong getNguyenvonga() {
return nguyenvonga;
}
public void setNguyenvonga(NguyenVong nguyenvonga) {
this.nguyenvonga = nguyenvonga;
}
@Override
public void nhap()
{
Scanner sc= new Scanner(System.in);
super.nhap();
System.out.print("SBD: ");
SBD = sc.nextLine();
System.out.print("Điểm ưu tiên: ");
diemUuTien= sc.nextFloat();
setDiemUuTien(diemUuTien);
nhapDSNguyenVong();
}
public void nhapDSNguyenVong()



{
Scanner sc= new Scanner(System.in);
System.out.print("Nhập số nguyện vọng cần thêm: ");
int n = sc.nextInt();
nv = new ArrayList<>();
for(int i=0; i<n; i++)
{
nguyenvonga= new NguyenVong();
nguyenvonga.nhapNguyenVong();
nv.add(nguyenvonga);
}
}
public void hienDSNguyenVong()
{
for(NguyenVong x: nv)
{
x.hienNguyenVong();
}
}
@Override
public void hien()
{
super.hien();
System.out.println("{SBD: "+ getSBD()+ ", diemUuTien: "+
getDiemUuTien());
hienDSNguyenVong();
}
public void hienThongtinTS()
{
super.hien();
System.out.println("{SBD: "+ getSBD()+ ", diemUuTien: "+
getDiemUuTien());
}
}
