package kodbloklari;

import java.util.Scanner;

public class AsalSayıBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;

        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        else {
            System.out.println(sayi + " Asal bir sayi degildir.");
        }
    }
    /*
    17.satırdaki işlemle sayının herhangi bir sayıya tam olarak bölünüp bölünmediğini kontrol ediyoruz.

Bu işlemi “%” operatörü ile yapıyoruz. “%” operatörü bölümünden kalanı verir.
Bölümünden kalanı 0’a eşit ise o sayıyı tam böler.
While döngüsünü kullanarak da girilen sayının asal
olup olmadığını kontrol edebiliriz. Yukarıdaki örnekle aynı mantıkla çalışır.
 2’den itibaren kendisine kadar olan sayılardan hiçbirine tam bölünmemiş ise asal sayıdır.
     */
}
