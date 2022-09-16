package kodbloklari;

import java.util.Scanner;

public class Girilen3SayıdanEnBüyüğünüBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.print("3. Sayıyı giriniz: ");
        int sayi3 = scan.nextInt();

        int enbuyuk = sayi1;

        if(sayi2 > enbuyuk) {
            enbuyuk = sayi2;
        }
        if(sayi3 > enbuyuk) {
            enbuyuk = sayi3;
        }

        System.out.println("Girilen sayılardan en büyüğü = " + enbuyuk);
    }
    /*Kullanıcıdan 3 adet sayı aldıktan sonra “enbuyuk” adında
    bir tane değişken oluşturup herhangi bir sayıyı “enbuyuk” değişkenine eşitliyoruz.

Daha sonra diğer 2 sayıyı “enbuyuk” değişkeniyle karşılaştırıyoruz.
Böylece girilen 3 adet sayıdan en büyüğünü bulmuş oluyoruz.

     */
}
