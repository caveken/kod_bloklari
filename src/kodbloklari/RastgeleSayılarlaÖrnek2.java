package kodbloklari;

import java.util.Random;

public class RastgeleSayılarlaÖrnek2 {
    /*
    Bu örnekte 50-100 arası rastgele üretilen sayıların ortalamasını hesaplayıp ekrana yazdıracağız.
     */


    public static void main(String[] args) {

        Random rastgele = new Random();

        int sayi;
        float toplam = 0;

        for(int i = 0; i < 10; i++)
        {
            sayi = 50 + rastgele.nextInt(50);
            System.out.println(sayi);
            toplam += sayi;
        }
        System.out.println("Sayıların ortalaması = " +(toplam / 10));
    }
    /*
    50 ile 100 arasında değerler üretmek istediğimiz için 0 – 50 arası üretilen değerlere 50 ekledik.


     */
}
