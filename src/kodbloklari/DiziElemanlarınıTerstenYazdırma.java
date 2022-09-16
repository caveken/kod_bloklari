package kodbloklari;

import java.util.Scanner;

public class DiziElemanlarınıTerstenYazdırma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] dizi = new int[10];

        for(int i = 0; i < dizi.length; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
        }
        System.out.println("Dizinin tersten yazılmıs hali\n");

        for(int i = dizi.length-1; i >= 0; i--)
        {
            System.out.println("Dizinin " + (dizi.length-i) + ". elemanı = " + (dizi[i]));
        }
    }
    /*
    İlk olarak for döngüsü yardımıyla kullanıcıdan dizi elemanlarının değerlerini alıyoruz.

Dizilerin indeksi 0’dan başladığı için dizinin son elemanına (eleman sayısı-1) indeksi ile erişebiliriz.

Bunun için diziyi tersten yazdırırken de dizinin son elemanından başlayıp ilk elemanına (0. indekse)
 kadar tüm elemanlarını ekrana yazdırıyoruz. Bu şekilde dizi elemanlarına tersten yazdırmış oluyoruz.
     */
}
