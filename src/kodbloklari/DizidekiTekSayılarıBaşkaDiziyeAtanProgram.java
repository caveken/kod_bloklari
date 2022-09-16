package kodbloklari;

import java.util.Scanner;

public class DizidekiTekSayılarıBaşkaDiziyeAtanProgram {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        int [] dizi = new int[10];
        int [] dizi_tek = new int[10];

        for(int i = 0; i < 10; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
            if(dizi[i] % 2 == 1) {
                dizi_tek[sayac] = dizi[i];
                sayac++;
            }
        }
        System.out.println("Tek sayılar\n");
        for(int i = 0; i < sayac; i++)
        {
            System.out.println("Tek sayilar = " + dizi_tek[i]);
        }
    }
    /*
    İlk olarak for döngüsü yardımıyla kullanıcıdan dizi elemanlarının değerlerini alıyoruz.

18.satırdaki işlemle girilen sayının tek sayı olup olmadığının kontrol ediyoruz.

Eğer sayı tek sayı ise sayıyı “dizi_tek” dizisine atıyoruz. Böylece tek sayıları başka bir diziye atmış oluyoruz.
     */
}
