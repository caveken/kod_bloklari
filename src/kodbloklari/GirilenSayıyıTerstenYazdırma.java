package kodbloklari;

import java.util.Scanner;

public class GirilenSayıyıTerstenYazdırma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
        while(sayi > 0) {

            System.out.print(sayi % 10);
            sayi /= 10;
        }
    }
    /*
    Kullanıcıdan sayı aldıktan sonra sayının sayının birler basamağını elde edip yazdırıyoruz.
     Daha sonra sayıyı 10’a bölüp tekrar aynı işlemleri yapıyoruz.

Örneğin kullanıcı 1926 sayısı girdiği zaman olacak işlemler şöyledir:
(1926 % 10 = 6) tersi = 6, (1926 / 10 = 192) sayi = 192
(192 % 10 = 2) tersi = 2, (192 / 10 = 19) sayi = 19
(19 % 10 = 9) tersi = 9, (19 / 10 = 1) sayi = 1
(1 % 10 = 1) tersi = 1, (1 / 10 = 0.1) sayi = 0.1

döngü sonlanır. Kullanıcının girdiği sayının tersten yazılımı da bu şekilde gerçekleşir.
     */
}
