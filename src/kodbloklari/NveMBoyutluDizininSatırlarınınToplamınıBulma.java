package kodbloklari;

import java.util.Scanner;

public class NveMBoyutluDizininSatırlarınınToplamınıBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam;

        System.out.print("Dizinin satır sayisini giriniz: ");
        int satir = scan.nextInt();
        System.out.print("Dizinin sütun sayisini giriniz: ");
        int sutun = scan.nextInt();
        int [][] dizi = new int[satir][sutun];

        for(int i = 0; i < satir; i++)
        {
            for(int j = 0; j < sutun; j++)
            {
                System.out.print("Bir sayi giriniz: ");
                dizi[i][j] = scan.nextInt();
            }
        }
        System.out.println("Girilen dizi \n");
        for(int i = 0; i < satir; i++)
        {
            toplam = 0;
            for(int j = 0; j < sutun; j++)
            {
                toplam += dizi[i][j];
                System.out.print(dizi[i][j] + "\t");
            }
            System.out.println(toplam + "\n");
        }
    }
    /*
    Örneği incelemeden önce Java N ve M Boyutlu Dizi Oluşturma sayfasını ziyaret edebilirsiniz.

İki boyutlu dizileri ekrana yazdırırken ya da değerlerini kullanıcıdan
alırken iç içe for döngülerini kullanırız. Dışarıdaki for döngüsü satır sayısını,
 içerideki for döngüsü de sütun sayısını verir.

Konunun detaylı anlatımı için Java Dili Çok Boyutlu Diziler sayfasını inceleyebilirsiniz.

Bu şekilde de içerideki for döngüsünde, satırdaki sütunlara değerleri
yazarken tüm sayıları toplayıp döngünün sonunda (35.satırda) toplamı ekrana yazdırıp
 “toplam” değişkeninin değerini sıfırlayıp alt satıra geçiyoruz.

Bu şekilde dizinin satırlarının toplamını bulmuş oluyoruz.
     */
}
