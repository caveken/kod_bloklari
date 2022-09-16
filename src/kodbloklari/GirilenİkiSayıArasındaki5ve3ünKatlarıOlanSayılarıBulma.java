package kodbloklari;

import java.util.Scanner;

public class GirilenİkiSayıArasındaki5ve3ünKatlarıOlanSayılarıBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        for(int i = sayi1; i < sayi2; i++)
        {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " sayisi 3 ve 5 in katıdır");
            }
        }
    }
    /*
    Kullanıcıdan 2 adet sayı aldıktan sonra
     for döngüsü yardımıyla bu 2 sayının arasındaki değerlere erişiyoruz.
      Daha sonra da mod alma işlemi sayesinde sayının 5 ve 3’e tam bölünüp
       bölünmediğini kontrol ediyoruz. Eğer tam bölünüyorsa o sayı 5 ve 3’ün tam katı bir sayıdır.

“%” ifadesi bölümünden kalanı verir. Yani girilen sayının
3’e bölümünden kalan 0 ise o sayı 3’e tam bölünür ve 3’ün tam katıdır.
     */
}
