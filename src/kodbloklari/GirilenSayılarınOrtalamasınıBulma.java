package kodbloklari;

import java.util.Scanner;

public class GirilenSayılarınOrtalamasınıBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayi, toplam = 0;

        System.out.print("Girmek istediğiniz sayı adedini giriniz: ");
        int adet = scan.nextInt();

        for(int i = 0; i < adet; i++)
        {
            System.out.print((i + 1) + ". sayiyi giriniz: ");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println("Sayıların ortalaması = " + ((float)toplam / adet));
    }
    /*
    Kullanıcıdan girmek istediği sayı adedini alıyoruz.
    Sonrasında kullanıcının girmek istediği sayı adedi
    kadar dönen bir for döngüsü oluşturuyoruz.

Böylece kullanıcıdan girdiği adet sayısı kadar sayı almış
ve bu sayıları “toplam” değişkenine ekleyerek toplamış oluyoruz.

En son olarak da tüm sayıların toplamını kullanıcının
 girdiği adet sayısına bölerek, sayıların aritmetik ortalamasını bulmuş oluyoruz.
     */
}
