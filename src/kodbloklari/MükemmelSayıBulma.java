package kodbloklari;

import java.util.Scanner;

public class MükemmelSayıBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        if(sayi == toplam) {
            System.out.println(sayi + " Mükemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " Mükemmel bir sayi degildir.");
        }
    }
    /*
    Kullanıcıdan bir sayı aldıktan sonra girilen sayıya kadar
    olan tüm sayılara for döngüsü yardımıyla erişiyoruz. Bu sayılardan,
     “sayi” değişkeninin böleni olan sayıları toplam değişkenini ekliyoruz.
     Böylece girilen sayının pozitif tam bölenlerini bulup toplamış oluyoruz.

Daha sonra da “toplam” değerinin girilen sayıya eşit olup olmadığını kontrol ediyoruz.
 Eğer eşitse girilen sayı mükemmel bir sayıdır.
     */
}
