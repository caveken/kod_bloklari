package kodbloklari;

import java.util.Scanner;

public class GirilenCümleİçindeHarfBulmaMetotlarİle {
    static void harfBul(String cumle,char harf) {
        int sayac = 0;
        for(int i = 0; i < cumle.length(); i++)
        {
            if(cumle.charAt(i) == harf) {
                sayac++;
            }
        }
        System.out.println("Girdiginiz cumle veya kelımede " + sayac + " tane '" + harf + "' vardır");
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cumle veya kelime giriniz: ");
        String cumle = scan.nextLine();
        System.out.print("Bir harf giriniz: ");
        char harf = scan.next().charAt(0);

        harfBul(cumle,harf);
    }
    /*
    Ana programda kullanıcıdan cümle ve harf aldıktan sonra bu harf ve cümleyi harfBul() metoduna gönderiyoruz.

harfBul() metodu da gönderilen cümlede, gönderilen harften kaç adet olduğunu bulup sonucu ekrana yazdırıyor.

Cümlenin içinde harf bulmanın detaylı anlatımı için Java Girilen Cümlede Harf Bulma sayfasını ziyaret edebilirsiniz.
     */
}
