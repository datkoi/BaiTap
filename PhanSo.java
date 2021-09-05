
//Bai tap tinh tong, hieu, tich, thuong cua hai phan so.
package PhanSo;

import java.util.Scanner;

public class PhanSo {

    //Khai bao tu so va mau so cua hai phan so.
    int tuso1;
    int mauso1;
    int tuso2;
    int mauso2;

    //Ham tao doi tuong Scanner de nhap du lieu tu ban phim.
    public static Scanner scanner = new Scanner(System.in);

    //Ham nhap hai phan so tu ban phim.
    public void inputPhanSo(){
        System.out.println("Nhap phan so thu nhat:");
        System.out.print("Nhap tu so: ");
        tuso1 = scanner.nextInt();
        do{
            System.out.print("Nhap mau so: ");
            mauso1 = scanner.nextInt();
            if (mauso1 == 0) {
                System.out.println("Vui long nhap mau so khac 0!");
            }
        }while(mauso1 == 0);
        System.out.println("Nhap phan so thu hai:");
        System.out.print("Nhap tu so: ");
        tuso2 = scanner.nextInt();
        do {
            System.out.print("Nhap mau so: ");
            mauso2 = scanner.nextInt();
            if (mauso2 == 0) {
                System.out.println("Vui long nhap mau so khac 0!");
            }
        } while (mauso2 == 0);
    }

    //Ham tinh tong hai phan so.
    public void tong(){
        int tu = tuso1*mauso2 + tuso2*mauso1;
        int mau = mauso1*mauso2;
        System.out.printf("Tong cua hai phan so %d/%d va %d/%d = %d/%d",tuso1,mauso1,tuso2,mauso2,tu,mau);
        System.out.println();
    }

    //Ham tinh hieu cua hai phan so.
    public void hieu(){
        int tu = tuso1*mauso2 - tuso2*mauso1;
        int mau = mauso1*mauso2;
        System.out.printf("Hieu cua hai phan so %d/%d va %d/%d = %d/%d",tuso1,mauso1,tuso2,mauso2,tu,mau);
        System.out.println();
    }

    //Ham tinh tich cua hai phan so.
    public void tich(){
        int tu = tuso1*tuso2;
        int mau = mauso1*mauso2;
        System.out.printf("Tich cua hai phan so %d/%d va %d/%d = %d/%d",tuso1,mauso1,tuso2,mauso2,tu,mau);
        System.out.println();
    }

    //Ham tinh thuong cua hai phan so.
    public void thuong(){
        int tu = tuso1*mauso2;
        int mau = mauso1*tuso2;
        System.out.printf("Thuong cua hai phan so %d/%d va %d/%d = %d/%d",tuso1,mauso1,tuso2,mauso2,tu,mau);
        System.out.println();
    }
    public static void main(String[] args) {
        //Khai bao doi tuong phanso tu lop PhanSo.
        PhanSo phanso = new PhanSo();

        //Goi ham nhap phan so.
        phanso.inputPhanSo();

        //Goi ham tinh tong.
        phanso.tong();

        //Goi ham tinh hieu hai phan so.
        phanso.hieu();

        //Goi ham tinh tich hai phan so.
        phanso.tich();

        //Goi ham tinh thuong cua hai phan so.
        phanso.thuong();
    }
}
