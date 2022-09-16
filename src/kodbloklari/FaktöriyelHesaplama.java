package kodbloklari;

import java.util.Scanner;

public class FaktöriyelHesaplama {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int faktoriyel = 1;

        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        for(int i = 1; i <= sayi; i++)
        {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi + "!= " + faktoriyel);
    }
    /*
    Burada önce kullanıcıdan bir sayı alıyoruz.
    Daha sonra for döngüsü yardımıyla 1’den kullanıcının girdiği sayıya
    kadar olan tüm sayıları çarpıp “faktoriyel” değişkenine atıyoruz.
    Bu şekilde kullanıcın girdiği sayının faktöriyelini hesaplamış oluyoruz.
     */
}
