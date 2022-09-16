package kodbloklari;

public class Birden100eKadarOlanSayılarınToplamı {


    public static void main(String[] args) {

        int toplam = 0;

        for(int i = 1; i < 100; i++)
        {
            toplam += i; // toplam = toplam + i;
        }
        System.out.println("Toplam = " + toplam);
    }
    /*
    “toplam” adında bir değişken oluşturduktan sonra
     1’den 100’e kadar dönen bir for döngüsü oluşturuyoruz.

Bu for döngüsü sayesinde 1-100 arasındaki tüm tam sayılara erişiyoruz
 ve her sayıyı “toplam” değişkenine ekliyoruz.
     */
}
