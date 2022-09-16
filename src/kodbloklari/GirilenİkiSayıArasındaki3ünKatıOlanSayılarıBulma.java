package kodbloklari;

import java.util.Scanner;

public class GirilenİkiSayıArasındaki3ünKatıOlanSayılarıBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        for(int i = sayi1; i < sayi2; i++)
        {
            if(i % 3 == 0) {
                System.out.println(i + " sayısı üçün katıdır.");
            }
        }
    }
    /*
    Kullanıcıdan 2 adet sayı aldıktan sonra for döngüsü
    yardımıyla bu 2 sayı arasındaki tüm sayılara erişiyoruz.

“%” ifadesi bölümünden kalanı verir. Yani girilen sayının
 3’e bölümünden kalan 0 ise o sayı 3’e tam bölünür ve 3’ün tam katıdır.
Konunun detaylı anlatımı için Java Dili Operatörler sayfasını inceleyebilirsiniz.

Böylece girilen 2 sayı arasındaki 3’ün katı olan sayıları bulup ekrana yazdırmış oluyoruz.
     */
}
