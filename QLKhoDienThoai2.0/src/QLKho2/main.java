
package QLKho2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        QLKho a = new QLKho();
        dienThoai b;
        Phieu c;
        int n;
        Scanner sc = new Scanner(System.in);

    do{
   a.menuChinh();
System.out.print("Lua chon: ");

n= sc.nextInt();
switch(n)
{
case 1 -> {
b= new samSung();
a.themDSdienthoai(b);
break;
}

case 2 -> {
b= new apple();
a.themDSdienthoai(b);
break;
}

case 3 -> {   
a.hienDSSamSung();
break;
}

case 4 -> {
a.hienDSApple();
break;
}

case 5 -> {
a.hienDS();
break;
}

case 6 -> {
a.SuaDoi();
break;
}
case 7 -> {
c = new PhieuNhapKho();
a.themDSPhieu(c);
break;
}
case 8 -> {
c = new PhieuXuatKho();
a.themDSPhieu(c);
break;
}
case 9 -> {
a.hienDanhSachPhieuNhapKho();
break;
}
case 10 -> {
a.hienDanhSachPhieuXuatKho();
break;
}
case 11 -> {
a.SuaDoiPhieu();
break;
}
default->{}
}
}
while(n!=0);
}
}



