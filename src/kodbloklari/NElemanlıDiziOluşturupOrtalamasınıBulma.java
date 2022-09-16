package kodbloklari;

import java.util.Scanner;

public class NElemanlıDiziOluşturupOrtalamasınıBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Dizinin boyutunu giriniz: ");
        int boyut = scan.nextInt();

        int [] dizi = new int[boyut];

        for(int i = 0; i < boyut; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
            toplam += dizi[i];
        }
        System.out.println("Dizinin ortalaması = " + (toplam / boyut));
        //System.out.println("Dizinin ortalaması = " + (toplam / dizi.length));
    }
    /*
    “boyut” değişkeniyle kullanıcıdan dizinin eleman sayısı aldıktan sonra
     “boyut” sayısı kadar dönen for döngüsü oluşturuyoruz.

Bu for döngüsü yardımıyla dizinin elemanlarını kullanıcıdan aldık ve “toplam” değişkenine ekledik.

En son olarak da 23.satırda toplam sayısının dizinin eleman
sayısına bölerek dizinin ortalamasını bulduk. “boyut” değişkeni yerine “dizi.length” özelliğini de kullanabiliriz.
     */
}
