package kodbloklari;

import java.util.Scanner;

public class FaktöriyelHesaplamaMetotİle {


    static void Faktoriyel(int sayi) {
        int sonuc = 1;
        for(int i = 1; i <= sayi; i++)
        {
            sonuc = sonuc * i;
        }
        System.out.println(sayi + "!= " + sonuc);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        Faktoriyel(sayi);

    }
    /*
    Ana programda kullanıcıdan sayı aldıktan sonra bu sayıyı “Faktoriyel()” adlı metoda gönderiyoruz.

Faktoriyel() metodu da kendisine gönderilen sayının faktöriyelini hesaplayıp sonucunu ekrana yazdırıyor.
     */
}
