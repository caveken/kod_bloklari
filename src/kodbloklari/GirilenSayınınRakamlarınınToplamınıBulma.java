package kodbloklari;

import java.util.Scanner;

public class GirilenSayınınRakamlarınınToplamınıBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        while(sayi > 0) {
            toplam += sayi % 10;
            sayi /= 10;  // sayi = sayi / 10;
        }
        System.out.println("Girilen sayinin rakamlarının toplamı = " + toplam);
    }
    /*
    Girilen sayının rakamlarını tek tek elde etmek için while döngüsü kullanıyoruz.
     Sayının 10’a bölümünden kalanını alıp birler basamağını
      elde ettikten sonra bu sayıyı toplam değişkenine ekliyoruz.

“%” operatörü bölümünden kalanı bulmamızı sağlar.
 “sayi % 10” yaptığımız zaman da sayının 10’a bölümünden kalanını verir.
  Sayının 10’a bölümünden kalanıda birler basamağıdır. Konunun detaylı anlatımı
  için Java Dili Operatörler sayfasından Aritmetik Operatörleri ziyaret edebilirsiniz.

Daha sonra sayıyı 10’a bölüp bu şekilde sayının
tüm rakamlarına erişip toplam değişkenine ekliyoruz.

Örneğin kullanıcı 1923 sayısını girdiği zaman olacak işlemler şöyledir:
(1923 % 10 = 3) , 1923 / 10 = 192 (sayi = 192)
(192 % 10 = 2), 192 / 10 = 19 (sayi = 19)
(19 % 10 = 9) , 19 / 10 = 1 (sayi = 1)
(1 % 10 = 1) , 1 / 10 = 0.1 (sayi = 0.1)

döngü sonlanır. Bu şekilde sayının tüm rakamlarını elde edip
toplam değişkenine ekliyoruz. Böylece kullanıcının girdiği sayının rakamlarının toplamını buluyoruz.
     */
}
