package kodbloklari;

import java.util.Scanner;

public class EBOBBulma {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int ebob = 0;

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        for(int i = 1; i < sayi1; i++)
        {
            if(sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("Ebob = " + ebob);
    }
    /*
    1.girdiğimiz sayının 2.sayıdan küçük olmasına dikkat edelim.

Kullanıcıdan 2 tane sayı aldıktan sonra küçük olan
sayıya kadar dönen bir for döngüsü oluşturuyoruz.

19.satırdaki işlemle 2 sayıyı da bölen sayıları bulmuş oluyoruz
ve bu sayıyı “ebob” değişkenine eşitlemiş oluyoruz.

Böylece en son olarak “ebob” değişkenine eşitlenen sayı,
girilen 2 sayının en büyük ortak böleni yani EBOB’u olmuş oluyor.
     */
}
