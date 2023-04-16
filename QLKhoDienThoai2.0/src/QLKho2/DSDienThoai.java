
package QLKho2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class DSDienThoai {
ArrayList<dienThoai> dsdienthoai;
public DSDienThoai() {
dsdienthoai = new ArrayList<>();
}
public void themDT(dienThoai dt) {
Scanner sc = new Scanner(System.in);
System.out.print("Nhập số lượng cần thêm: ");
int n = sc.nextInt();
for (int i = 0; i < n; i++) {
System.out.println("Lần nhập thứ " + (i + 1) + ": ");
dt.nhap();
dsdienthoai.add(dt);
}
}
public void menuSuaDoi() {
System.out.println("-------------Mời bạn lựa chọn -----------");
System.out.println("1. Sua thong tin dien thoai samsung");
System.out.println("2. Xoa Samsung");
System.out.println("3. Sua thong tin apple");
System.out.println("4. Xoa apple");
System.out.println("----------- Chọn số 0 để thoát ----------");
}
public void SuaDoi() {
Scanner sc = new Scanner(System.in);
int n;
do {
menuSuaDoi();
System.out.print("Chọn: ");
n = sc.nextInt();
switch (n) {
case 1: {
String sbd;
System.out.print("Nhập SBD của thí sinh cần sửa: ");
sc.nextLine();
sbd = sc.nextLine();
suaSamSung(sbd);
break;
}
case 2: {
String sbd;
System.out.print("Nhập SBD của thí sinh cần sửa: ");
sc.nextLine();
sbd = sc.nextLine();
xoaSamSung(sbd);
break;
}
case 3: {
String maGT;
System.out.print("Nhập mã giám thị cần sửa thông tin: ");
sc.nextLine();
maGT = sc.nextLine();
suaApple(maGT);
break;
}
case 4: {
String maGT;
System.out.print("Nhập mã giám thị cần sửa thông tin: ");
sc.nextLine();
maGT = sc.nextLine();
xoaApple(maGT);
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
}}
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
public void hienDSSamSung(dienThoai dt) {
System.out.println("----------------------------------------------");
for (dienThoai x : dsdienthoai) {
if (x instanceof samSung) {
x.hien();
}
}
}
public void hienDS(dienThoai a) {
System.out.println("----------------------------------------------");
for (dienThoai x : dsdienthoai) {
x.hien();
}


}
public void hienDSApple(dienThoai a) {
System.out.println("----------------------------------------------");
for (dienThoai x : dsdienthoai) {
if (x instanceof apple) {
x.hien();
}
}
}


}




