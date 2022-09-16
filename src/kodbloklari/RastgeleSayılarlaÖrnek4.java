package kodbloklari;

import java.util.Random;

public class RastgeleSayılarlaÖrnek4 {
    /*
    Bu örnekte 1-100 arası rastgele üretilen sayılardan tek sayıların ortalamasını hesaplayıp ekrana yazdıracağız.
     */


    public static void main(String[] args) {

        Random rastgele = new Random();

        int sayi,toplam = 0;
        int sayac = 0;

        for(int i = 0; i < 10; i++)
        {
            sayi = 1 + rastgele.nextInt(99);
            if(sayi % 2 == 1) {
                System.out.println("Tek sayilar = " + sayi);
                toplam += sayi;
                sayac++;
            }
            else {
                System.out.println("Çift sayilar = " + sayi);
            }
        }
        System.out.println("Tek sayiların ortalaması = " + (toplam / sayac));
    }
    /*
    1 ile 100 arasında değerler üretmek istediğimiz için 0 – 100 arası üretilen değerlere 1 ekledik.

21.satırdaki işlemle sayının tek sayı olup olmadığını kontrol ettik.
 Eğer sayı tek sayı ise sayıyı “toplam” değişkenine ekleyip, “sayac” değişkenini arttırıyoruz.

Son olarak da “toplam/sayac” işlemiyle tek sayıların ortalamasını hesaplamış oluyoruz.
     */
}
