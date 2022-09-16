package kodbloklari;

import java.util.Scanner;

public class GirilenSayıyaKadarOlanToplamınıBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        for(int i = 1; i < sayi; i++)
        {
            toplam = toplam + i; // toplam += i;
        }
        System.out.println(sayi + " sayisina kadar olan sayiların toplamı = " + toplam);
    }
//sayı dahil olsun istiyorsak ( i <= sayi) yapmalıyız.
    /*
    Kullanıcıdan sayı aldıktan sonra for döngüsü yardımıyla
     1’den o sayıya (kullanıcının girdiği sayı) kadar tüm sayılara erişiyoruz.

17.satırdaki işlemle de eriştiğimiz tüm sayıları “toplam” adındaki değişkene ekliyoruz.
     */
}
