package kodbloklari;

import java.util.Scanner;

public class İkiBoyutluDiziDeğerleriniKullanıcıdanAlma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] dizi = new int[5][2];

        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print("Bir sayi giriniz: ");
                dizi[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(dizi[i][j] + "  ");
            }
            System.out.println("\n");
        }
    }
    /*
    İki boyutlu dizileri ekrana yazdırırken ya da değerlerini
    kullanıcıdan alırken iç içe for döngülerini kullanırız.

Yukarıdaki kod kısmında iki boyutlu dizinin değerlerini
 kullanıcıdan aldıktan sonra aynı şekilde iç içe for döngülerini kullanarak ekrana yazdırdık.
     */
}
