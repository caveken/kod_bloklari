package kodbloklari;

import java.util.Scanner;

public class GirilenİkiSayınınDeğerleriniDeğiştirme {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sayi1,sayi2;
        int gecici;

        System.out.print("1. Sayiyi giriniz: ");
        sayi1 = scan.nextInt();
        System.out.print("2. Sayiyi giriniz: ");
        sayi2 = scan.nextInt();

        System.out.println("Degerler degistiriliyor...");

        gecici = sayi1;
        sayi1 = sayi2;
        sayi2 = gecici;

        System.out.println("1. Sayi = " + sayi1);
        System.out.println("2. Sayi = " + sayi2);
    }
    /*
    Kullanıcıdan 2 adet sayı alıyoruz. Bu sayıları birbirine atarken
    sayıları kaybetmemek için “gecici” adında bir değişken tanımlıyoruz.

“sayi1” değişkeni kaybetmemek için “sayi1” değişkenini “gecici”
değişkenini atıyoruz. Sonrasında “sayi2” değişkenini “sayi1” değişkenine atıyoruz.
En son olarak da “sayi2” değerine “sayi1” değerini yani “gecici” değerini atıyoruz.
     */
}
