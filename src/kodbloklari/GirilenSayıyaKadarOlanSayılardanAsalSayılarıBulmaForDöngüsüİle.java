package kodbloklari;

import java.util.Scanner;

public class GirilenSayıyaKadarOlanSayılardanAsalSayılarıBulmaForDöngüsüİle {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayac;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        for(int i = 2; i <= sayi ; i++)
        {
            sayac = 0;
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0) {
                    sayac++;
                }
            }
            if(sayac == 0) {
                System.out.println(i + " asal bir sayidir.");
            }
        }
    }
    /*
    Kullanıcıdan sayı aldıktan sonra 15.satırdaki for döngüsüyle
     o sayıya (kullanıcının girdiği) kadar olan tüm sayılara erişiyoruz.

Sonrasında da sayıların asal sayı olup olmadığını bulup, eğer sayı asal sayıysa ekrana yazdırıyoruz.
     */
}
