
package QLKho2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        QLKho a = new QLKho();
        dienThoai b;
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
}
case 3 -> {   
a.hienDSSamSung();
break;
}
case 4 -> {

a.hienDSApple();
}
case 5 -> {
a.SuaDoi();
}

default ->      {
                }
}
}
while(n!=0);
}
}



