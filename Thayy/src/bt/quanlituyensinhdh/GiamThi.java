/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.quanlituyensinhdh;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class GiamThi extends Nguoi {
private String maGT, donviCT;
public GiamThi()
{
}
public GiamThi(String maGT, String donviCT, String hoTen, String
queQuan, int namSinh, int gioiTinh)
{
super(hoTen, queQuan, namSinh, gioiTinh);
this.donviCT= donviCT;
this.maGT= maGT;
}
public String getMaGT() {
return maGT;
}
public void setMaGT(String maGT) {
this.maGT = maGT;
}
public String getDonviCT() {
return donviCT;

}
public void setDonviCT(String donviCT) {
this.donviCT = donviCT;
}
@Override
public void nhap()
{
super.nhap();
Scanner sc= new Scanner(System.in);
System.out.print("Mã giám thị: ");
maGT= sc.nextLine();
System.out.print("Đơn vị công tác: ");
donviCT= sc.nextLine();
}
@Override
public void hien()
{
super.hien();
System.out.println("\n{maGT: "+ getMaGT()+ ", donviCongtac: "+
getDonviCT()+ "}");
}
}
