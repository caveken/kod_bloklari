package kodbloklari;

import java.util.Scanner;

public class GirilenSayının3ünKatıOlupOlmadığınıBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz:");
        int sayi = scan.nextInt();

        if(sayi % 3 == 0) {
            System.out.println("Girilen sayı 3 ün katıdır");
        }
        else {
            System.out.println("Girilen sayi 3 un katı degildir.");
        }
    }
    /*
    Kullanıcıdan “sayi” adında bir değişken
     aldıktan sonra mod alma işlemini yaparak bu sayının
     3’ün katı olup olmadığını buluyoruz.

“%” ifadesi bölümünden kalanı verir. Yani girilen sayının
3’e bölümünden kalan 0 ise o sayı 3’e tam bölünür ve 3’ün tam katıdır.
     */
}
