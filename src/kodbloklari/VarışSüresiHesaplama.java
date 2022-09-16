package kodbloklari;

import java.util.Scanner;

public class VarışSüresiHesaplama {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int yol,saat;

        System.out.print("Yol mesafini giriniz (km) : ");
        yol = scan.nextInt();
        System.out.print("Gitmek istediğiniz süreyi giriniz (saat) : ");
        saat = scan.nextInt();

        System.out.println("Gitmeniz gereken ortalama hız = " + (yol / saat) + "km/s dir.");
    }
    /*
    Kullanıcıdan mesafeyi ve gitmek istediği
     saati aldıktan sonra (yol/saat) yaparak gitmesi gereken ortalama hızı hesapladık.
     */
}
