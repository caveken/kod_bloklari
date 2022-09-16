package kodbloklari;

import java.util.Scanner;

public class DikdörtgeninAlanınıveÇevresiniHesaplama {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int kenar1,kenar2;

        System.out.print("1. Kenarı giriniz: ");
        kenar1 = scan.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        kenar2 = scan.nextInt();

        System.out.println("Dikdörtgenin alanı = " + (kenar1 * kenar2));
        System.out.println("Dikdörtgenin çevresi = " + (2 * (kenar1 + kenar2)));
    }
    /*
    Kullanıcıdan dikdörtgenin kenarlarını aldıktan sonra çevresini ve alanını hesapladık.


     */
}
