package kodbloklari;

import java.util.Random;

public class RastgeleSayılarlaÖrnek6 {
    /*
    Bu örnekte 1-100 arası üretilen 30 adet rastgele sayıyı çift ve asal sayı olarak gruplandıracağız.
     */


    public static void main(String[] args) {

        Random rastgele = new Random();
        int sayi, sayac;

        for(int i = 0; i < 30; i++)
        {
            sayi = 1 + rastgele.nextInt(100);
            sayac = 0;
            for(int j = 2; j < sayi; j++)
            {
                if(sayi % j == 0) {
                    sayac++;
                }
            }
            if(sayac == 0) {
                System.out.println("Asal sayi = " + sayi);
            }
            if(sayi % 2 == 0) {
                System.out.println("Çift sayılar = " + sayi);
            }
        }
    }
    /*
    İlk olarak 30 adet sayı üretmek için 30 kez dönen bir for döngüsü oluşturuyoruz.

1 ile 100 arasında değerler üretmek istediğimiz için 0 – 100 arası üretilen değerlere 1 ekledik.

Sonrasında da üretilen sayının asal sayı olup olmadığını kontrol ediyoruz.

En son olarak da sayının çift sayı olup olmadığını kontrol ediyoruz.
     */
}
