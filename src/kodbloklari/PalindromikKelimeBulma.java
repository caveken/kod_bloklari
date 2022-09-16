package kodbloklari;

import java.util.Scanner;

public class PalindromikKelimeBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        System.out.print("Kelime giriniz: ");
        String kelime = scan.nextLine();
        String yenikelime = "";

        for(int i = (kelime.length()-1); i >= 0; i--)
        {
            yenikelime += kelime.charAt(i);
        }
        if(yenikelime.equals(kelime)) {
            System.out.println("Girilen kelime Palindrom bir kelimedir.");
        }
        else {
            System.out.println("Girdiginiz kelime Palindrom bir kelime degildir.");
        }
    }
    /*
    Kullanıcıdan herhangi bir kelime aldıktan sonra kelimenin son harfinden
     başlayarak ilk harfine kadar dönen bir for döngüsü oluşturuyoruz.

“String” veri tiplerinde karakterler dizi mantığıyla tutulur.

Özetle “kelime.charAt(0)” metodu bize girilen cümledeki ilk harfi,
“kelime.charAt(1)” metodu da ikinci harfi verir.

“kelime.length()-1”metodu kelimenin son harfini verir.

Kelimenin son harfinden başlayarak ilk harfine “kelime.char.At(0)” gidene kadar
 tüm harfleri “yenikelime” değişkenine attık.

Böylece bu kelime “kelime” değişkeninin tersten yazılışı haline geldi.

19.satırda da kelimenin tersten yazılısıyla kendisini karşılaştırdık.
Eğer kelimeler aynı ise girilen kelime “palindromik” bir kelimedir.
     */
}
