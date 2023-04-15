/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.quanlituyensinhdh;

/**
 *
 * @author admin
 */
import java.util.Comparator;
public class SapXepTheoDiemThi implements Comparator<NguyenVong>
{
@Override
public int compare(NguyenVong a1, NguyenVong a2) {
float sub= a1.getDiemXetTuyen()- a2.getDiemXetTuyen();
if(sub< 0)
return -1;
else if(sub ==0)
return 0;
else
return 1;
}
}
