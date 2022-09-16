package kodbloklari;

import java.util.Scanner;

public class GirilenSayıyaKadarOlanSayılardanAsalSayılarıBulmaWhileDöngüsüİle {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayac;

        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        while(sayi > 2) {

            sayac = 0;
            for(int i = 2; i < sayi; i++)
            {
                if(sayi % i == 0) {
                    sayac++;
                }
            }
            if(sayac == 0) {
                System.out.println(sayi + " asal bir sayidir.");
            }
            sayi--;
        }
    }
    /*
    Kullanıcıdan sayı aldıktan sonra 15.satırdaki while döngüsüyle
     o sayıya (kullanıcının girdiği) kadar olan tüm sayılara erişiyoruz.

Sonrasında da sayıların asal sayı olup olmadığını bulup, eğer sayı asal sayıysa ekrana yazdırıyoruz.
     */
}
