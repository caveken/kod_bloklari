package kodbloklari;

import java.util.Scanner;

public class GirilenCümledekiKelimeSayısınıBulma {
    public static void main(String[] args) {
        /*
        Bu örnekte kullanıcıdan alınan cümlede kaç tane kelime olduğunu bulup ekrana yazdıracağız.
         */
        Scanner scan = new Scanner(System.in);
        int sayac = 1;

        System.out.print("Cumle giriniz: ");
        String cumle = scan.nextLine();

        for(int i = 0; i < cumle.length(); i++)
        {
            if(cumle.charAt(i) == ' ') {
                sayac++;
            }
        }
        System.out.println("Girilen cumlede " + sayac + " tane kelime vardir.");
        /*
        13.satırda kullanıcıdan “cumle” değişkeniyle bir cümle aldıktan sonra cümlenin tüm karakterlerine erişmek için bir tane for döngüsü oluşturuyoruz.

“String” veri tiplerinde karakterler, dizi mantığıyla tutulur. Detaylı anlatım için Java Dili Veri Tipleri ve Değişkenler sayfasını ziyaret edebilirsiniz.

Özetle “cumle.charAt(0)” metodu bize girilen cümledeki ilk harfi,
“cumle.charAt(1)” metodu da ikinci harfi verir.

Böylece tüm karakterlere erişmek için 0’dan başlayarak cümlenin uzunluğu kadar dönen bir for döngüsü oluşturduk.

cumle.length() metodu cümlenin karakter sayısını döndürür.

En son olarak da 17.satırda her karakterin tek tek ‘ ’ (boşluk) karakteri olup olmadığını kontrol ettik. “sayac” değişkeniyle de kaç adet olduğunu bulmuş olduk.

Özetle cümledeki kelime sayısını, cümledeki boşluk sayısı + 1 formülü ile bulmuş oluyoruz
         */
    }
}
