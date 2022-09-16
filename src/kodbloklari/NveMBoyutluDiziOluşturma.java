package kodbloklari;

import java.util.Scanner;

public class NveMBoyutluDiziOluşturma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Dizinin satır sayisini giriniz: ");
        int satir = scan.nextInt();
        System.out.print("Dizinin sütun sayisini giriniz: ");
        int sutun = scan.nextInt();
        int [][] dizi = new int[satir][sutun];

        for(int i = 0; i < satir; i++)
        {
            for(int j = 0; j < sutun; j++)
            {
                System.out.print("Bir sayi giriniz: ");
                dizi[i][j] = scan.nextInt();
            }
        }
        System.out.println("Girilen dizi \n");
        for(int i = 0; i < satir; i++)
        {
            for(int j = 0; j < sutun; j++)
            {
                System.out.print(dizi[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    /*
    İki boyutlu dizileri ekrana yazdırırken ya da değerlerini
    kullanıcıdan alırken iç içe for döngülerini kullanırız.
    Dışarıdaki for döngüsü satır sayısını, içerideki for döngüsü de sütun sayısını verir.

Konunun detaylı anlatımı için Java Dili Çok Boyutlu Diziler sayfasını inceleyebilirsiniz.

Bu for döngüleri sayesinde dizi elemanlarını kullanıcıdan almış oluyoruz.
Daha sonra da bu dizinin elemanlarını ekrana yazdırmış oluyoruz.
     */
}
