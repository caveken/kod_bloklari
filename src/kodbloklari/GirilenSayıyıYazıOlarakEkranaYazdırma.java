package kodbloklari;

import java.util.Scanner;

public class GirilenSayıyıYazıOlarakEkranaYazdırma {
    /*
    Bu örnekte kullanıcının girdiği 2 basamaklı sayıyı yazı olarak ekrana yazdıracağız.
     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("2 Basamaklı bir sayi giriniz: ");
        int sayi = scan.nextInt();
        /* switch-case yapısını uzatarak
         ıstedigimiz basamaklı sayıyı yazdırabiliriz.*/

        int birler = sayi % 10;
        int onlar = sayi / 10;

        switch (onlar) {
            case 1 -> System.out.print("On");
            case 2 -> System.out.print("Yirmi");
            case 3 -> System.out.print("Otuz");
            case 4 -> System.out.print("Kırk");
            case 5 -> System.out.print("Elli");
            case 6 -> System.out.print("Altmıs");
            case 7 -> System.out.print("Yetmis");
            case 8 -> System.out.print("Seksen");
            case 9 -> System.out.print("Doksan");
        }
        switch (birler) {
            case 1 -> System.out.print(" bir");
            case 2 -> System.out.print(" iki");
            case 3 -> System.out.print(" üç");
            case 4 -> System.out.print(" dört");
            case 5 -> System.out.print(" beş");
            case 6 -> System.out.print(" altı");
            case 7 -> System.out.print(" yedi");
            case 8 -> System.out.print(" sekiz");
            case 9 -> System.out.print(" dokuz");
        }
    }
    /*
    Kullanıcıdan sayı aldıktan sonra 16 ve 17. satırda sayının birler ve onlar basamağını buluyoruz.

16. satırda “%” operatörü ile mod alıyoruz.
(sayi % 10) işlemi sayının 10’a bölümünden kalanını alarak sayının birler basamağını bulmuş olur.

17.satırda ise sayıyı 10’a bölerek sayının onlar basamağını almış oluyoruz.
En son olarak da switch-case yapısını kullanarak sayıyı yazı olarak ekrana yazdırmış oluyoruz.


     */
}
