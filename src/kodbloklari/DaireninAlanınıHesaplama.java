package kodbloklari;

import java.util.Scanner;

public class DaireninAlanınıHesaplama {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        int yarıcap = scan.nextInt();

        System.out.println("Dairenin alanı = " + (Math.PI * yarıcap * yarıcap));
    }
    /*
    Önce kullanıcıdan yarıçapı aldık. Daha sonrada yukarıdaki
    formüle göre dairenin alanını hesapladık. Pi sayısını alırken Java’nın Math sınıfını kullandık.
     */
}
