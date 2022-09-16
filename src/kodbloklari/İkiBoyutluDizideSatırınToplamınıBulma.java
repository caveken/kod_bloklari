package kodbloklari;

import java.util.Scanner;

public class İkiBoyutluDizideSatırınToplamınıBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] dizi = new int[5][3];
        int toplam;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("Bir sayi giriniz: ");
                dizi[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < 5; i++)
        {
            toplam = 0;
            for(int j = 0; j < 3; j++)
            {
                toplam += dizi[i][j];
                System.out.print(dizi[i][j] + "\t");
            }
            System.out.println(toplam + "\n");
        }
    }
    /*
    İki boyutlu dizileri ekrana yazdırırken ya da değerlerini kullanıcıdan
     alırken iç içe for döngülerini kullanırız. Dışarıdaki for döngüsü satır sayısını,
      içerideki for döngüsü de sütun sayısını verir.

Konunun detaylı anlatımı için Java Dili Çok Boyutlu Diziler sayfasını inceleyebilirsiniz.

Bu şekilde de içerideki for döngüsünde, satırdaki sütunlara değerleri
 yazarken tüm sayıları toplayıp döngünün sonunda (29.satırda) toplamı ekrana
 yazdırıp “toplam” değişkeninin değerini sıfırlayıp alt satıra geçiyoruz.

Bu şekilde dizinin satırlarının toplamını bulmuş oluyoruz.
     */
}
