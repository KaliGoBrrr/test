
package QLKho2;

import java.util.Scanner;

public class apple extends dienThoai{
    private int loaiIP;
    private String maIP;
   public apple(){
       super();
   }
   public apple(String tenDT,int namSX, int moDel, int soLuong, int loaiIP, String maIP){
       super(tenDT, namSX, moDel, soLuong);
       this.loaiIP=loaiIP;
       this.maIP=maIP;
   }

    public String getLoaiIP() {
         if(loaiIP ==1)
            return "iphone lock";
        else if(loaiIP==0)
            return "iphone quoc te";
        else return null;
    }

    public void setLoaiIP(int loaiIP) {
        this.loaiIP = loaiIP;
    }

    public String getMaIP() {
        return maIP;
    }

    public void setMaIP(String maIP) {
        this.maIP = maIP;
    }
    
    @Override 
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Loai Iphone(iphone lock: 1/iphone thuong: 0)");
        loaiIP = sc.nextInt();
    }

    @Override
    public void hien() {
        super.hien();
        System.out.println("{apple" + "loaiIP=" + getLoaiIP() + ", maIP=" + getMaIP() + "}");
    }

    

   
}
