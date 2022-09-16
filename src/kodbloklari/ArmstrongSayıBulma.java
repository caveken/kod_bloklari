package kodbloklari;

import java.util.Scanner;

public class ArmstrongSayıBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int basamak_sayisi = 0, rakam;
        int toplam = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int gecici = sayi;
        int gecici2 = sayi;

        while(gecici > 0) {
            gecici /= 10;
            basamak_sayisi++;
        }
        while(sayi > 0) {
            rakam = sayi % 10;
            toplam += Math.pow(rakam, basamak_sayisi);
            sayi /= 10;
        }
        if(toplam == gecici2) {
            System.out.println(gecici2 + " sayisi armstrong bir sayidir.");
        }
        else {
            System.out.println(gecici2 + " sayisi armstrong bir sayi degildir.");
        }
        /*
        Kullanıcın bir sayı aldıktan sonra sayı ile bazı işlemler yapmak için
        “gecici” ve “gecici2” adındaki değişkene atadık yani kopyaladık.

Önce kullanıcının girdiği sayının basamak sayısını bulduk (18-21 satırlar arası).
Basamak sayısı nasıl bulunur detaylı bir şekilde incelemek için Java Girilen
 Sayının Basamak Sayısı Bulma sayfasını ziyaret edebilirsiniz.

Daha sonra da girilen sayının tüm basamaklarına tek tek erişip
basamak sayıyı kadar kuvvetini alıp “toplam” değişkenine ekledik.
Bu kısmın detaylı anlatımı için de Java Girilen Sayının Rakamlarını
Toplama sayfasındaki ilgili örnekte, rakamlara tek tek nasıl eriştiğimizi inceleyebilirsiniz.

En son olarak da girilen sayının “toplam” değişkenine eşit olup
olmadığını kontrol ediyoruz. Eğer eşitse girilen sayı Armstrong bir sayıdır.
         */
    }
}
