package kodbloklari;

import java.util.Random;

public class RastgeleSayıÜretme {
    /*
    Bu örnekte Java dilinde rastgele sayının nasıl üretildiğini inceleyeceğiz.

Java dilinde rastgele sayı üretmek için Random sınıfını kullanmamız gerekir.
Random sınıfını kullanabilmemiz için programımıza “java.util.Random” sınıfını dahil etmemiz gerekir.
package kodbloklari.com;

import java.util.Random;

“java.util.Random” sınıfını programa dahil ettikten sonra, bu sınıftan bir tane nesne oluşturmamız gerekiyor.
Random rastgele = new Random();

Burada da “rastgele” adında bir tane nesne oluşturdum. Buradaki nesne ismini istediğiniz gibi verebilirsiniz.
Şimdi bu oluşturduğumuz nesneden rastgele sayı üretme işlemini yapabiliriz.

int sayi = rastgele.nextInt(30);

“rastgele.nextInt()” metodu, 0’dan parantezin içerisine girilen sayıya kadar rastgele sayı üretimi yapar.

Yani 0 ile 30 arasında rastgele bir değer üretmiş olur.

Eğer 10 ile 35 arasında rastgele bir sayı üretmek istiyorsak da:
int sayi = 10 + rastgele.nextInt(25);
İşlemini yapabiliriz. “rastgele.nextInt(25)” ifadesi 0 ile 25 arasında bir değer üretir.
Bu değere 10 eklediğimiz zaman üretilen sayi 10 ile 35 arasında bir değer olur.

     */


    public static void main(String[] args) {

        Random rastgele = new Random();

        int sayi = rastgele.nextInt(30);

        System.out.println("Rastgele atanan sayi = " + sayi);
    }
}
