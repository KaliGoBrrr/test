package bt.quanlituyensinhdh;
import java.io.Serializable;
import java.util.Scanner;
public class Nguoi implements Serializable{
private String hoTen, queQuan;
private int namSinh, gioiTinh;
public Nguoi()
{
}
public Nguoi(String hoTen, String queQuan, int namSinh, int gioiTinh)
{
this.gioiTinh= gioiTinh;
this.hoTen= hoTen;
this.namSinh= namSinh;
this.queQuan= queQuan;
}
public String getHoTen() {
return hoTen;
}
public void setHoTen(String hoTen) {
this.hoTen = hoTen;
}
public String getQueQuan() {


return queQuan;
}
public void setQueQuan(String queQuan) {
this.queQuan = queQuan;
}
public int getNamSinh() {
return namSinh;
}
public void setNamSinh(int namSinh) {
this.namSinh = namSinh;
}
public String getGioiTinh() {
if(gioiTinh ==1)
return "Nam";
else if(gioiTinh==0)
return "Nữ";
else return null;
}
public void setGioiTinh(int gioiTinh) {
this.gioiTinh = gioiTinh;
}
public void nhap()
{
Scanner sc= new Scanner(System.in);
System.out.print("Họ tên: ");
hoTen= sc.nextLine();
System.out.print("Quê quán: ");
queQuan= sc.nextLine();
System.out.print("Năm sinh: ");
namSinh= sc.nextInt();
do
{
System.out.print("Giới tính(nam: 1/ nữ: 0) ");
gioiTinh= sc.nextInt();


}
while(gioiTinh!=1 && gioiTinh!=0);
}
public void hien()
{
System.out.print("{hoTen: "+ getHoTen() + ", gioiTinh: "+
getGioiTinh() +", namSinh: "+ getNamSinh()+ ", queQuan: "+
getQueQuan() + "}");
}
}