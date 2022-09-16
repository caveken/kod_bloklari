package kodbloklari;

import java.util.Scanner;

public class AsalSayıBulmaMetotİle {


    static boolean asalMi(int sayi) {
        int sayac = 0;
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        if(asalMi(sayi)) { // asalMi(sayi) == true
            System.out.println("Girilen sayi asal bir sayidir.");
        }
        else {
            System.out.println("Girilen sayi asal bir sayi degildir.");
        }
    }
    /*
    Ana programda kullanıcıdan sayı aldıktan sonra bu sayının
    asal sayı olup olmadığını öğrenmek için sayıyı “asalMi()” metoduna gönderiyoruz.

asalMi() metodu, gönderilen sayı asal sayı ise “true” değilse de “false” değerini döndürüyor.
En son olarak ana programda asalMi() metodunun döndürdüğü
 değeri kontrol ediyoruz. Değer “true” ise girilen sayı asal bir sayıdır.
     */
}
