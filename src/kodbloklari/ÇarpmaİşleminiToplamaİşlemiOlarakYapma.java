package kodbloklari;

import java.util.Scanner;

public class ÇarpmaİşleminiToplamaİşlemiOlarakYapma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("Bir sayi giriniz:");
        int sayi2 = scan.nextInt();

        for(int i = 0; i < sayi2; i++)
        {
            toplam += sayi1;
        }
        System.out.println(sayi1 + "X" + sayi2 + "= " + toplam);
    }
    /*
    Kullanıcıdan 2 adet sayı aldıktan sonra aralarından
    herhangi birini seçip 0’dan o sayıya (girilen sayılardan birisi) kadar
    dönen bir for döngüsü oluşturuyoruz. Burada “sayi2” seçtim.

Örneğin 5 ile 7 sayısını girdim ve “sayi2” sayısı 7 olmuş oldu.

For döngüsü 7 kez dönmüş olacak ve her döndüğünde “toplam” değişkenine 5 ekleyecek.

Böylece 7 kez 5’i toplayarak, çarpma işlemini toplama işlemi yaparak bulmuş olduk.
     */
}
