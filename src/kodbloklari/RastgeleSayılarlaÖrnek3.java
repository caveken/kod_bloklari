package kodbloklari;

import java.util.Random;

public class RastgeleSayılarlaÖrnek3 {
    /*
    Bu örnekte 5-150 arası üretilen rastgele sayılardan çift sayıların toplamını hesaplayıp ekrana yazdıracağız.
     */


    public static void main(String[] args) {

        Random rastgele = new Random();

        int sayi,toplam = 0;

        for(int i = 0; i < 10; i++)
        {
            sayi = 5 + rastgele.nextInt(145);
            if(sayi % 2 == 0) {
                System.out.println("Çift sayı " + sayi);
                toplam += sayi;
            }
            else {
                System.out.println(sayi);
            }
        }
        System.out.println("Çift sayıların toplamı = " + toplam);
    }
    /*
    5 ile 150 arasında değerler üretmek istediğimiz için 0 – 145 arası üretilen değerlere 5 ekledik.


     */
}
