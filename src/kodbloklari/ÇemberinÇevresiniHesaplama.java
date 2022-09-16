package kodbloklari;

import java.util.Scanner;

public class ÇemberinÇevresiniHesaplama {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Çemberin yarı çapını giriniz: ");
        int yarıcap = scan.nextInt();

        System.out.println("Çemberin çevresi = " + (2 * Math.PI * yarıcap));
    }
    /*
    Kullanıcıdan yarı çapı aldıktan sonra yukarıdaki formülü uygulayarak çemberin çevresini hesaplamış olduk.

Pi sayısı için “Math” sınıfına ait sabit değişken olan “Math.PI” sabitini kullandık.
     */
}
