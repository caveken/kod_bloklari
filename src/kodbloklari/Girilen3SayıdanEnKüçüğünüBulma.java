package kodbloklari;

import java.util.Scanner;

public class Girilen3SayıdanEnKüçüğünüBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.print("3. Sayıyı giriniz: ");
        int sayi3 = scan.nextInt();

        int enkucuk = sayi1;

        if(sayi2 < enkucuk) {
            enkucuk = sayi2;
        }
        if(sayi3 < enkucuk) {
            enkucuk = sayi3;
        }

        System.out.println("Girilen sayılardan en enkucugu = " + enkucuk);
    }
    /*
    Kullanıcıdan 3 adet sayı aldıktan sonra
    “enkucuk” adında bir tane değişken oluşturup
     herhangi bir sayıyı “enkucuk” değişkenine eşitliyoruz.

Daha sonra diğer 2 sayıyı “enkucuk” değişkeniyle karşılaştırıyoruz.
 Böylece girilen 3 adet sayıdan en küçüğünü bulmuş oluyoruz.
     */
}
