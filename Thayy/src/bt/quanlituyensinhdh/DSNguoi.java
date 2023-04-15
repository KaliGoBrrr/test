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
public class DSNguoi {
ArrayList<Nguoi> person;

public DSNguoi() {
person = new ArrayList<>();
}

public void themDSNguoi(Nguoi a) {
Scanner sc = new Scanner(System.in);
System.out.print("Nhập số lượng cần thêm: ");
int n = sc.nextInt();
for (int i = 0; i < n; i++) {
System.out.println("Lần nhập thứ " + (i + 1) + ": ");
a.nhap();
person.add(a);
}
}

public void menuSuaDoi() {
System.out.println("-------------Mời bạn lựa chọn -----------");
System.out.println("1. Sửa thông tin thí sinh");
System.out.println("2. Xóa thí sinh");
System.out.println("3. Sửa thông tin giám thị");
System.out.println("4. Xóa giám thị");
System.out.println("5. Sửa nguyện vọng");
System.out.println("6. Thêm nguyện vọng");
System.out.println("7. Xóa nguyện vọng");
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
case 1 ->  {
String sbd;
System.out.print("Nhập SBD của thí sinh cần sửa: ");
sc.nextLine();
sbd = sc.nextLine();
suaThiSinh(sbd);
}
case 2 ->  {
String sbd;
System.out.print("Nhập SBD của thí sinh cần sửa: ");
sc.nextLine();
sbd = sc.nextLine();
xoaThiSinh(sbd);
}
case 3 ->  {
String maGT;
System.out.print("Nhập mã giám thị cần sửa thông tin: ");
sc.nextLine();
maGT = sc.nextLine();
suaGiamThi(maGT);
}
case 4 ->  {
String maGT;
System.out.print("Nhập mã giám thị cần sửa thông tin: ");
sc.nextLine();
maGT = sc.nextLine();
xoaGiamThi(maGT);
}



case 5 ->  {
System.out.println("Nhập SBD của thí sinh: ");
sc.nextLine();
String sbd = sc.nextLine();
System.out.println("Nhập mã nguyện vọng");
int maNv = sc.nextInt();
suaNguyenVong(maNv, sbd);
}
case 6 ->  {
System.out.println("Nhập SBD của thí sinh: ");
sc.nextLine();
String sbd = sc.nextLine();
themNguyenVong(sbd);
}
case 7 ->  {
System.out.println("Nhập SBD của thí sinh: ");
sc.nextLine();
String sbd = sc.nextLine();
System.out.println("Nhập mã nguyện vọng");
int maNv = sc.nextInt();
xoaNguyenVong(maNv, sbd);
}
default -> {
        }
}
} while (n != 0);
}

public void suaNguyenVong(int maNV, String sbd) {
for (Nguoi x : person) {
if (((ThiSinh) x).getSBD().compareTo(sbd) == 0) {
for (int i = 0; i < ((ThiSinh) x).getNv().size(); i++) {
if (((ThiSinh) x).getNv().get(i).getMaNv() == maNV) {
((ThiSinh) x).getNv().get(i).nhapNguyenVong();
}
}
}
}
}

public void xoaNguyenVong(int maNV, String sbd) {
for (Nguoi x : person) {
if (((ThiSinh) x).getSBD().compareTo(sbd) == 0) {
for (int i = 0; i < ((ThiSinh) x).getNv().size(); i++) {
if (((ThiSinh) x).getNv().get(i).getMaNv() == maNV) {
((ThiSinh) x).getNv().remove(i);
}
}
}
}
}

public void themNguyenVong(String sbd) {
for (Nguoi x : person) {
if (x instanceof ThiSinh) {
((ThiSinh) x).nhapDSNguyenVong();
}
}
}

public void suaThiSinh(String sbd) {
for (Nguoi x : person) {
if (x instanceof ThiSinh) {
if (((ThiSinh) x).getSBD().compareTo(sbd) == 0) {
x.nhap();
}
}
}
}

public void xoaThiSinh(String sbd) {
for (Nguoi x : person) {
if (x instanceof ThiSinh) {
if (((ThiSinh) x).getSBD().compareTo(sbd) == 0) {
person.remove(x);
}
}
}
}

public void suaGiamThi(String maGT) {
for (Nguoi x : person) {
if (x instanceof GiamThi) {
if (((GiamThi) x).getMaGT().compareTo(maGT) == 0) {
x.nhap();
}
}
}
}

public void xoaGiamThi(String maGT) {
for (Nguoi x : person) {
if (x instanceof GiamThi) {
if (((GiamThi) x).getMaGT().compareTo(maGT) == 0) {
person.remove(x);
}
}
}
}

public void hienDSGiamThi(Nguoi a) {
System.out.println("----------------------------------------------");
for (Nguoi x : person) {
if (x instanceof GiamThi) {
x.hien();
}
}
}

public void hienDS(Nguoi a) {
System.out.println("----------------------------------------------");
for (Nguoi x : person) {
x.hien();
}
}

public void hienDSThiSinh(Nguoi a) {
System.out.println("----------------------------------------------");
for (Nguoi x : person) {
if (x instanceof ThiSinh) {
x.hien();
}
}
}

public void menuChinh()
{
System.out.println("------CHƯƠNG TRÌNH QUẢN LÝ TUYỂN SINH ĐẠI HỌC 2021------");
System.out.println("1. Nhập danh sách thí sinh và nguyện vọng của thí sinh");
System.out.println("2. Nhập danh sách giám thị coi thi");
System.out.println("3. Hiển thị danh sách các hồ sơ dự thi");
System.out.println("4. Hiển thị danh sách các giám thị");
System.out.println("5. Chỉnh sửa thông tin (Thí Sinh, Nguyện Vọng, Giám Thị)");
System.out.println("6. Lưu file đã nhập");
System.out.println("7. Đọc dữ liệu từ file");
System.out.println("8. Hiện ra danh sách trúng tuyển( input: mà ngành, điểm chuẩn)");
System.out.println("9. Sắp xếp danh sách trúng tuyển theo điểm thi giảm dần");
System.out.println("10. Thống kê các giám thị công tác ở Hà Nội");
System.out.println("-----Nhấn phím 0 để thoát chương trình, xin cảm ơn!-----");
}
}