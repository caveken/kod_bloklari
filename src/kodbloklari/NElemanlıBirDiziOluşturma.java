package kodbloklari;

import java.util.Scanner;

public class NElemanlıBirDiziOluşturma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        int boyut = scan.nextInt();

        int [] dizi = new int[boyut];

        for(int i = 0; i < boyut; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
        }
    }
    /*
    “boyut” değişkeniyle kullanıcıdan dizinin eleman sayısı
     aldıktan sonra “boyut” sayısı kadar dönen for döngüsü oluşturuyoruz.

Bu for döngüsü yardımıyla dizinin elemanlarını kullanıcıdan aldık.
     */
}
