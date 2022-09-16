package kodbloklari;

import java.util.Scanner;

public class BasitHesapMakinesiSwitchCase {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        System.out.println("****İSLEMİNİZİ SEÇİNİZ***");
        System.out.println("1. TOPLAMA");
        System.out.println("2. ÇIKARMA");
        System.out.println("3. ÇARPMA");
        System.out.println("4. BÖLME");

        System.out.print("Secimininizi giriniz: ");
        int secim = scan.nextInt();

        switch (secim) {
            case 1 -> System.out.println("Toplama isleminin sonucu = " + (sayi1 + sayi2));
            case 2 -> System.out.println("Çıkarma isleminin sonucu = " + (sayi1 - sayi2));
            case 3 -> System.out.println("Carpma isleminin sonucu = " + (sayi1 * sayi2));
            case 4 -> System.out.println("Bölme isleminin sonucu = " + (float) sayi1 / sayi2);
        }
    }
    /*
    Kullanıcıdan 2 adet sayı aldıktan sonra kullanıcıya yapmak istediği işlemi soruyoruz.

“secim” değişkeniyle, kullanıcıdan seçimini alıyoruz ve seçimine göre programın yapacağı işlemi belirliyoruz.

Örneğin kullanıcı “3” sayısını seçerse program 32 ve 33.satırı çalıştırıp yapıyı sonlandırır.
     */
}
