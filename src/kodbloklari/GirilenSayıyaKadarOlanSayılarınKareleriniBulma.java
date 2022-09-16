package kodbloklari;

import java.util.Scanner;

public class GirilenSayıyaKadarOlanSayılarınKareleriniBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int kare;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        for(int i = 1; i <= sayi; i++)
        {
            kare = i * i;
            System.out.println(i + " sayısının karesi = " + kare);
        }
    }
    /*
    Kullanıcıdan sayı aldıktan sonra, o sayıya kadar
     olan tüm sayılara erişebilmek için bir tane for döngüsü oluşturuyoruz.

Sonrasında da her sayının karesini alıp ekrana yazdırıyoruz.
     */
}
