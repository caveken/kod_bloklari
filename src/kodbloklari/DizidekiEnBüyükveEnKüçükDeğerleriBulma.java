package kodbloklari;

import java.util.Scanner;

public class DizidekiEnBüyükveEnKüçükDeğerleriBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int enbuyuk = 0,enkucuk = 0;

        int [] dizi = new int[10];

        for(int i = 0; i < 10; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
            if(i == 0) {
                enbuyuk = dizi[i];
                enkucuk = dizi[i];
            }
            if(dizi[i] > enbuyuk) {
                enbuyuk = dizi[i];
            }
            if(dizi[i] < enkucuk) {
                enkucuk = dizi[i];
            }
        }
        System.out.println("Dizinin en büyük elemanı = " + enbuyuk);
        System.out.println("Dizinin en kucuk elemanı = " + enkucuk);
        System.out.println("Fark = " + (enbuyuk - enkucuk));
    }
    /*
    İlk olarak for döngüsü yardımıyla kullanıcıdan dizi elemanlarının değerlerini alıyoruz.

Tüm sayıları birbirleriyle karşılaştırmak yerine, “enbuyuk” ve “enkucuk” adında değişkenler
 oluşturup karşılaştırma işlemini daha basit ve kısa bir yöntemle yapabiliriz.

“enbuyuk” ve “enkucuk” değişkenlerine dizinin ilk elemanını atıyoruz.
Bu şekilde dizinin tüm elemanlarına erişip dizinin en büyük ve en küçük elemanını bulmuş oluyoruz.
     */
}
