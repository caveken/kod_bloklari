package kodbloklari;

import java.util.Scanner;

public class GirilenCümleİçindeHarfTopluluğuBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayac = 0;

        System.out.print("Cumle veya kelime giriniz: ");
        String cumle = scan.nextLine();

        // son harfi denetlemeye gerek olmadıgı için almadık.

        for(int i = 0; i < cumle.length()-1; i++)
        {
            if(cumle.charAt(i) == 'a' || cumle.charAt(i) == 'A') {
                if(cumle.charAt(i+1) == 'b' || cumle.charAt(i+1) == 'B') {
                    sayac++;
                }
            }
        }
        System.out.println("Cumle veya kelimede " + sayac + " tane 'ab' harf topluluğu vardır.");
    }
    /*
    13.satırda kullanıcıdan “cumle” değişkeniyle bir cümle aldıktan
     sonra cümlenin tüm karakterlerine erişmek için bir tane for döngüsü oluşturuyoruz.

“String” veri tiplerinde karakterler dizi mantığıyla tutulur.

Özetle “cumle.charAt(0)” metodu bize girilen cümledeki ilk harfi,
“cumle.charAt(1)” metodu da ikinci harfi verir.

Böylece tüm karakterlere erişmek için 0’dan başlayarak cümlenin uzunluğu kadar dönen bir for döngüsü oluşturduk.

cumle.length() metodu cümlenin karakter sayısını döndürür.

Son olarak da girilen cümlede ‘a‘ harfinden sonraki harfin ‘b‘ harfi
olup olmadığını kontrol ettik.  “sayac” değişkeniyle de kaç adet olduğunu bulmuş olduk.
     */
}
