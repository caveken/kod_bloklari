package kodbloklari;

import java.util.Scanner;

public class KDVliFiyatHesaplama {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ürünün KDV'siz fiyatını giriniz: ");
        int fiyat = scan.nextInt();

        double yeni_fiyat = fiyat + (fiyat * 0.18);

        System.out.println("KDV'li fiyat = " + yeni_fiyat);
    }
    /*
    Ürünün KDV’siz fiyatını kullanıcıdan aldık.

Daha sonra “yeni_fiyat” adlı değişkeni tanımladık.
“double” olarak tanımlamamın sebebi, fiyat ondalıklı sayı olarak çıkabilir.
En son olarak da ürüne %18 KDV tutarını ekledik ve yeni fiyatını ekrana yazdırdık.
     */
}
