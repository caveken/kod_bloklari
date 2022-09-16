package kodbloklari;

import java.util.Random;

public class RastgeleSayılarlaÖrnek7 {
    /*
    Bu örnekte 1-50 arası üretilen 20 adet rastgele sayıyı
    tek,çift ve asal sayı olarak gruplandırıp, ekrana yazdıracağız.

Örneğe başlamadan önce Java Rastgele Sayı Üretme sayfasını ziyaret edebilirsiniz.

Bu örneği yaparken metotları da kullanacağız.
     */


    static boolean asalMi(int sayi) {
        int sayac = 0;
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {

        Random rastgele = new Random();
        int sayi;

        for(int i = 0; i < 20; i++)
        {
            sayi = 1 + rastgele.nextInt(99);

            if(sayi % 2 == 0) {
                System.out.println("Çift sayi = " + sayi);
            }
            else if(asalMi(sayi)) {
                System.out.println("Asal sayi = " + sayi);
            }
            else {
                System.out.println("Tek sayilar = " + sayi);
            }
        }
    }
    /*
    İlk olarak 20 adet sayı üretmek için 20 kez dönen bir for döngüsü oluşturuyoruz.

Daha sonra da 31.satırda sayının çift sayı olup olmadığını kontrol ediyoruz.

Eğer sayı çift sayı değilse 34.satırdaki işlemle sayının
asal sayı olup olmadığını asalMi() metoduyla kontrol ediyoruz.

Eğer sayı asal sayı da değilse tek sayı olmuş oluyor.
     */
}
