package QLKho2;

import java.util.ArrayList;
import java.util.Scanner;

public class QLKho {
    ArrayList<dienThoai>dsdienthoai;
   public QLKho(){
       dsdienthoai = new ArrayList<>();
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

public void menuChinh() {
System.out.println("------CHUONG TRINH QUAN LY KHO DIEN THOAI CAO CAP------");
System.out.println("1. Nhap danh sach dien thoai samsung");
System.out.println("2. Nhap danh sach dien thoai apple");
System.out.println("3. Hien thi danh sach samsung");
System.out.println("4. Hien thi danh sach apple");
System.out.println("5. Hien thi danh sach dien thoai");
System.out.println("6. Menu sua doi");
System.out.println("-----Nhan phim 0 de thoat khoi chuong trinh, xin cam on!-----");
}
}