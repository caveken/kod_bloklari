package kodbloklari;

import java.util.Scanner;

public class GirilenSayıyaKadarFaktöriyelHesaplama {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int faktoriyel = 1;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        for(int i = 1; i <= sayi; i++)
        {
            faktoriyel = faktoriyel * i;
            System.out.println(i + "!= " + faktoriyel);
        }
    }
    /*
    Kullanıcıdan sayı aldıktan sonra 1’den o sayıya (kullanıcının girdiği)
     kadar tüm sayılara erişiyoruz. Bu sayıları da çarpıp faktöriyel değişkenine atıyoruz.

Bu şekilde kullanıcının girdiği sayıya kadar olan
tüm sayıların faktöriyelini hesaplamış oluyoruz.
     */
}
