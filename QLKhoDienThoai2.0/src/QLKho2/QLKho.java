package QLKho2;

import java.util.ArrayList;
import java.util.Scanner;

public class QLKho {
    ArrayList<dienThoai>dsdienthoai;
    ArrayList <Phieu> phieu;
   public QLKho(){
       dsdienthoai = new ArrayList<>();
       phieu = new ArrayList<>();
   }
public void themDSdienthoai(dienThoai dt){
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap so luong can them: ");
int n = sc.nextInt();
for (int i = 0; i < n; i++) {
System.out.println("Lan nhap thu " + (i + 1) + ": ");
if (dt instanceof samSung) {
dt = new samSung();
dt.nhap();
} else if (dt instanceof apple) {
dt = new apple();
dt.nhap();
}
dsdienthoai.add(dt);
   }
   }

public void menuSuaDoi() {
System.out.println("------------- Moi ban lua chon -----------");
System.out.println("1. Sua thong tin dien thoai samsung");
System.out.println("2. Xoa dien thoai samsung");
System.out.println("3. Sua thong tin dien thoai iphone");
System.out.println("4. Xoa dien thoai iphone");
System.out.println("----------- Chon so 0 de thoat ----------");
}

public void SuaDoi() {
Scanner sc = new Scanner(System.in);
int n;
do {
menuSuaDoi();
System.out.print("Chon: ");
n = sc.nextInt();
switch (n) {
case 1: {
String maSS;
System.out.print("Nhap maSS cua dien thoai can sua: ");
sc.nextLine();
maSS = sc.nextLine();
suaSamSung(maSS);
break;
}
case 2: {
String maSS;
System.out.print("Nhap maSS cua dien thoai can xoa: ");
sc.nextLine();
maSS = sc.nextLine();
xoaSamSung(maSS);
break;
}
case 3: {
String maIP;
System.out.print("Nhap maIP cua dien thoai can sua: ");
sc.nextLine();
maIP = sc.nextLine();
suaApple(maIP);
break;
}
case 4: {
String maIP;
System.out.print("Nhap maIP cua dien thoai can xoa: ");
sc.nextLine();
maIP = sc.nextLine();
xoaApple(maIP);
break;
}
default:
break;
}
} while (n != 0);
}

public void suaSamSung(String maSS) {
for (dienThoai x : dsdienthoai) {
if (x instanceof samSung) {
if (((samSung) x).getMaSS().compareTo(maSS) == 0) {
x.nhap();
}
}
}
}

public void xoaSamSung(String maSS) {
for (dienThoai x : dsdienthoai) {
if (x instanceof samSung) {
if (((samSung) x).getMaSS().compareTo(maSS) == 0) {
dsdienthoai.remove(x);
}
}
}
}

public void suaApple(String maIP) {
for (dienThoai x : dsdienthoai) {
if (x instanceof apple) {
if (((apple) x).getMaIP().compareTo(maIP) == 0) {
x.nhap();
}
}
}
}

public void xoaApple(String maIP) {
for (dienThoai x : dsdienthoai) {
if (x instanceof apple) {
if (((apple) x).getMaIP().compareTo(maIP) == 0) {
dsdienthoai.remove(x);
}
}
}
}

public void hienDSApple() {
System.out.println("----------------------------------------------");
for (dienThoai x : dsdienthoai) {
if (x instanceof apple) {
x.hien();
}
}
}

public void hienDS() {
System.out.println("----------------------------------------------");
for (dienThoai x : dsdienthoai) {
x.hien();
}
}

public void hienDSSamSung() {
System.out.println("----------------------------------------------");
for (dienThoai x : dsdienthoai) {
if (x instanceof samSung) {
((samSung) x).hien();
}
}
}
public void themDSPhieu(Phieu a)
    {
        Scanner ds = new Scanner(System.in);
        System.out.print("\nNhap So Luong Can Them: "); int n = ds.nextInt();
        for (int i=0; i<n; i++)
        {
            System.out.println("\nLan them thu " + (i+1) + ": ");
            if (a instanceof PhieuNhapKho)
            {
                a = new PhieuNhapKho();
                a.nhapThongTin();
            }
            else if (a instanceof PhieuXuatKho)
            {
                a = new PhieuXuatKho();
                a.nhapThongTin();
            }
            phieu.add(a);
        }
    }
public void hienDSPhieu(Phieu a)
    {
        System.out.println();
        for (Phieu y: phieu)
        {
            y.xuatThongTin();
        }
    }

    public void suaPhieuNhapKho(String maPhieu)
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuNhapKho)
            {
                if (((PhieuNhapKho) y).getMaPhieu().compareTo(maPhieu) == 0)
                {
                    y.nhapThongTin();
                }
            }
        }
    }

    public void xoaPhieuNhapKho(String maPhieu)
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuNhapKho)
            {
                if (((PhieuNhapKho) y).getMaPhieu().compareTo(maPhieu) == 0)
                {
                    phieu.remove(y);
                }
            }
        }
    }

    public void suaPhieuXuatKho(String maPhieu)
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuXuatKho)
            {
                if (((PhieuXuatKho) y).getMaPhieu().compareTo(maPhieu) == 0)
                {
                    y.nhapThongTin();
                }
            }
        }
    }

    public void xoaPhieuXuatKho(String maPhieu)
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuXuatKho)
            {
                if (((PhieuXuatKho) y).getMaPhieu().compareTo(maPhieu) == 0)
                {
                    phieu.remove(y);
                }
            }
        }
    }

    public void hienDSPhieuNhapKho(Phieu a)
    {
        System.out.println();
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuNhapKho)
            {
                y.xuatThongTin();
            }
        }
    }

    public void hienDanhSachPhieuNhapKho()
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuNhapKho)
            {
                ((PhieuNhapKho) y).xuatThongTin();
            }
        }
    }

    public void hienDanhSachPhieuXuatKho()
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuXuatKho)
            {
                ((PhieuXuatKho) y).xuatThongTin();
            }
        }
        TongSoLuongConLai();
    }

    public void hienDSPhieuXuatKho(Phieu a)
    {
        System.out.println();
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuXuatKho)
            {
                y.xuatThongTin();
            }
        }
    }

    public void hienDanhSachPhieu()
    {
        for (Phieu y: phieu)
        {
            y.xuatThongTin();
        }
    }
public void TongSoLuongConLai()
    {
        int tongKM = 0;
        int tongPhieu = 0;
        for (dienThoai x: dsdienthoai)
        {
            tongKM += x.getSoLuong();
        }
        for (Phieu y: phieu)
        {
            tongPhieu += y.getSoLuong();
        }
        int conLai = tongKM - tongPhieu;
        System.out.println("Tong So luong dien thoai con Lai: " + conLai);
    }
    
public void menuChinh() {
System.out.println("------CHUONG TRINH QUAN LY KHO DIEN THOAI CAO CAP------");
System.out.println("1. Nhap danh sach dien thoai samsung");
System.out.println("2. Nhap danh sach dien thoai apple");
System.out.println("3. Hien thi danh sach samsung");
System.out.println("4. Hien thi danh sach apple");
System.out.println("5. Hien thi danh sach dien thoai");
System.out.println("6. Menu sua doi kho");
System.out.println("7. Nhap Phieu nhap kho");
System.out.println("8. Nhap Phieu xuat kho");
System.out.println("9. Hien DS Phieu nhap kho");
System.out.println("10. Hien DS Phieu xuat kho");
System.out.println("11. Menu sua doi phieu");
System.out.println("-----Nhan phim 0 de thoat khoi chuong trinh, xin cam on!-----");
}

public void menuSuaDoiPhieu() {
        System.out.println("|---------------------------------------------|");
        System.out.println("|        MENU THAY DOI THONG TIN PHIEU        |");
        System.out.println("|=============================================|");
        System.out.println("|1. Sua Thong Tin Phieu Nhap Kho              |");
        System.out.println("|2. Xoa Thong Tin Phieu Nhap Kho              |");
        System.out.println("|3. Sua Thong Tin Phieu Xuat Kho              |");
        System.out.println("|4. Xoa Thong Tin Phieu Xuat Kho              |");
        System.out.println("|=============================================|");
        System.out.println("|             Bam phim 0 de thoat             |");
        System.out.println("|---------------------------------------------|");
    }
    public void SuaDoiPhieu()
    {
        Scanner sd = new Scanner(System.in);
        int chon;
        menuSuaDoiPhieu();
        do
        {
            System.out.print("\nVui Long Lua Chon: "); chon = sd.nextInt();
            switch (chon)
            {
                case 1:
                {
                    String maPhieu;
                    System.out.print("\nNhap Ma Phieu Nhap Kho: ");
                    sd.nextLine();
                    maPhieu = sd.nextLine();
                    suaPhieuNhapKho(maPhieu);
                } break;
                case 2:
                {
                    String maPhieu;
                    System.out.print("\nNhap Ma Phieu Nhap Kho: ");
                    sd.nextLine();
                    maPhieu = sd.nextLine();
                    xoaPhieuNhapKho(maPhieu);
                } break;
                case 3:
                {
                    String maPhieu;
                    System.out.print("\nNhap Ma Phieu Xuat Kho: ");
                    sd.nextLine();
                    maPhieu = sd.nextLine();
                    suaPhieuXuatKho(maPhieu);
                } break;
                case 4:
                {
                    String maPhieu;
                    System.out.print("\nNhap Ma Phieu Xuat Kho: ");
                    sd.nextLine();
                    maPhieu = sd.nextLine();
                    xoaPhieuXuatKho(maPhieu);
                } break;
            }
        } while(chon != 0);
    }
}