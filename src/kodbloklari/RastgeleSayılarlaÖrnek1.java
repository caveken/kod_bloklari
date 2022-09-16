package kodbloklari;

import java.util.Random;

public class RastgeleSayılarlaÖrnek1 {
    /*
    Bu örnekte 200-1000 arası 10 adet rastgele sayı üreteceğiz.
     */


    public static void main(String[] args) {

        Random rastgele = new Random();
        int sayi;

        for(int i = 0; i < 10; i++)
        {
            sayi = 200 + rastgele.nextInt(800);
            System.out.println(sayi);
        }
    }
    /*
    200 ile 1000 arasında değerler üretmek istediğimiz için 0 – 800 arası üretilen değere 200 ekledik.


     */
}
