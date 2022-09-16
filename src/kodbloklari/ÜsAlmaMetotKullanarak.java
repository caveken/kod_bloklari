package kodbloklari;

import java.util.Scanner;

public class ÜsAlmaMetotKullanarak {
    static int usalma(int sayi1, int sayi2) {
        int sonuc =(int) Math.pow(sayi1, sayi2);
        return sonuc;

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayiyi giriniz: ");
        int sayi2 = scan.nextInt();

        int sonuc = usalma(sayi1,sayi2);
        System.out.println(sayi1 + "^" + sayi2 + " = " + sonuc);
    }
    /*
    Ana programda kullanıcıdan alınan 2 sayıyı “usalma()” adlı metoda gönderiyoruz.

Bu metot da gönderilen 1.sayının 2.sayıya göre üssünü alıp sonucunu döndürüyor.

Ana programda da bu sonucu yazdırıyoruz. (22.satırda)
     */
}
