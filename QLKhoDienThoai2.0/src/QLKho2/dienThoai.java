
package QLKho2;

import java.util.Scanner;
public class dienThoai {
    private String tenDT;
    private int namSX;
    private int moDel;
    private int soLuong;
  dienThoai(){}
  dienThoai(String tenDT,int namSX, int moDel, int soLuong){
       super();
       this.namSX=namSX;
       this.tenDT=tenDT;
       this.moDel=moDel;
       this.soLuong=soLuong;  
   }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public int getMoDel() {
        return moDel;
    }

    public void setModel(int moDel) {
        this.moDel = moDel;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten dien thoai: ");
        tenDT=sc.nextLine();
        System.out.println("Nhap nam san xuat: ");
        namSX=sc.nextInt();
        System.out.println("Nhap ma model: ");
        moDel=sc.nextInt();
        System.out.println("Nhap so luong dien thoai: ");
        soLuong=sc.nextInt();
    }
    public void hien() {
        System.out.print("{ten dien thoai: "+ getTenDT() + ", nam san xuat: "+
getNamSX() +", model: "+ getMoDel()+ ", so luong: "+ getSoLuong() + "}");
    }
}
