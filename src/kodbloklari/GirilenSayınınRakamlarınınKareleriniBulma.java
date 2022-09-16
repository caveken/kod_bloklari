package kodbloklari;

import java.util.Scanner;

public class GirilenSayınınRakamlarınınKareleriniBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam = 0, rakam;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        while(sayi > 0) {

            rakam = sayi % 10;
            System.out.println(rakam + "' ın karesi = " + (rakam * rakam));
            toplam += (rakam * rakam);
            sayi /= 10;
        }
        System.out.println("Girilen sayinin karelerinin toplamı = " + toplam);
    }
    /*
    Kullanıcıdan sayı aldıktan sonra while döngüsü ile sayının her bir rakamına tek tek erişiyoruz.

“%” operatörü bölümünden kalanı bulmamızı sağlar. “sayi % 10” yaptığımız
 zaman da sayının 10’a bölümünden kalanını verir. Sayının 10’a bölümünden
 kalanıda birler basamağıdır. Konunun detaylı anlatımı için Java Dili Operatörler
  sayfasından Aritmetik Operatörleri ziyaret edebilirsiniz.

Örneğin 1672 sayısını girdiğimiz zaman 10’a bölümünden kalanı alarak ‘2’ sayısına
 erişip karesini ekrana yazdırıyoruz.
Sonra sayıyı 10’a bölerek 167 sayısı elde etmiş oluyoruz.
 Bir sonraki döngüde de 7 sayısını elde ediyoruz.

Böylece her basamağına tek tek erişmiş oluyoruz.
     */
}
