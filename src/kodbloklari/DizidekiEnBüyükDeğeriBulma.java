package kodbloklari;

import java.util.Scanner;

public class DizidekiEnBüyükDeğeriBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int enbuyuk = 0;
        /* en buyuk elemanını bulabilmek icin
        "enbuyuk" degıskenıne en kucuk degeri veriyoruz*/
        int [] dizi = new int[10];

        for(int i = 0; i < 10; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
            if(dizi[i] > enbuyuk) {
                enbuyuk = dizi[i];
            }
        }
        System.out.println("Dizinin en buyuk elemanı = " + enbuyuk);
    }
    /*
    En büyük sayıyı bulmaya çalıştığımız için “enbuyuk” değişkenine en küçük sayıyı (0) veriyoruz.

Sonrasında da for döngüsü yardımıyla dizinin değerlerini kullanıcıdan alıyoruz.
 Değerleri alırken her değer için “enbuyuk” sayısından büyük olup olmadığını kontrol ediyoruz.

Eğer büyükse “enbuyuk” değişkenine atıyoruz. Böylece dizinin en büyük değerini bulmuş oluyoruz.
     */
}
