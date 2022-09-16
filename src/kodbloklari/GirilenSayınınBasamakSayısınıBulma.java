package kodbloklari;

import java.util.Scanner;

public class GirilenSayınınBasamakSayısınıBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayac = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        while(sayi > 0) {
            sayi /= 10; // sayi = sayi / 10;
            sayac++;
        }
        System.out.println("Girdiginiz sayinin basamak sayisi = " + sayac);
    }
    /*
    Kullanıcıdan bir sayı alıyoruz. Daha sonra bu sayı 0’dan büyük oluncaya
     kadar çalışan bir while döngüsü oluşturuyoruz.

Bu döngü her döndüğünde “sayac” adındaki değişkeni 1 arttırıp sayıyı 10’a bölüyor.

Örneğin kullanıcı 1923 sayısını girdiği zaman program şu şekilde çalışıyor:
1923 / 10 = 192 (sayi = 192), basamak = 1
192 / 10 = 19 (sayi = 19), basamak = 2
19 / 10 = 1 (sayi = 1), basamak = 3
1 / 10 = 0.1 (sayi = 0.1) , basamak = 4

Burada sayı 0.1 olunca int değer olarak sayı 0 olduğu için
döngü çalışmasını durdurur. Bu şekilde basamak sayısını bulur.
     */
}
