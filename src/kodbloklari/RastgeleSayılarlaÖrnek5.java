package kodbloklari;

import java.util.Random;

public class RastgeleSayılarlaÖrnek5 {
    /*
    Bu örnekte 100-200 üretilen 5 adet rastgele sayının
    her birinin rakamlarının toplamının hesaplayıp ekrana yazdıracağız.
     */


    public static void main(String[] args) {

        Random rastgele = new Random();

        int sayi,toplam;

        for(int i = 0; i < 5; i++)
        {
            toplam = 0;
            sayi = 100 + rastgele.nextInt(100);
            System.out.print(sayi);
            while(sayi > 0) {
                toplam += sayi % 10;
                sayi = sayi / 10;
            }
            System.out.println(" Rakamları toplamı = " + toplam);
        }
    }
    /*
    100 ile 200 arasında değerler üretmek istediğimiz için 0 – 100 arası üretilen değerlere 100 ekledik.
     */
}
