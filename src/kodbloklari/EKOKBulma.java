package kodbloklari;

import java.util.Scanner;

public class EKOKBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int ekok = 0;
        int max;

        System.out.print("1. Sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayiyi giriniz: ");
        int sayi2 = scan.nextInt();
        max = sayi1 * sayi2;
        /* 2 sayı eger aralarında asal ise ekoku
        çarpımlarıdır. Yanı 2 sayının ekoku maximum çarpımlarıdır.*/

        for(int i = max; i > 0; i--)
        {
            if(i % sayi1 == 0 && i % sayi2 == 0) {
                ekok = i;
            }
        }
        System.out.println("Ekok = " + ekok);
    }
    /*
    Kullanıcıdan 2 tane sayı aldıktan sonra, bu sayıların çarpımından
     0’a kadar olan tüm sayılara erişen bir for döngüsü oluşturuyoruz.
Bunun sebebi yukarıda belirttiğim gibi 2 sayının EKOK’unun en büyük çarpımları olabilmesidir.

23.satırdaki işlemle de girilen 2 sayının ortak katlarını bulmuş oluyoruz ve “ekok” değişkenine eşitliyoruz.

Böylece en son “ekok” değişkenine eşitlenen sayı, girilen 2 sayının en küçük ortak katı yani EKOK’u olmuş oluyor.
     */
}
