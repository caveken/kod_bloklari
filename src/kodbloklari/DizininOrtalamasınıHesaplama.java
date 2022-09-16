package kodbloklari;

import java.util.Scanner;

public class DizininOrtalamasınıHesaplama {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        int [] dizi = new int[10];

        for(int i = 0; i < 10; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
            toplam += dizi[i];
        }
        System.out.println("Dizinin ortalaması " + (toplam / dizi.length));
    }
    /*
    For döngüsü yardımıyla dizinin tüm elemanlarına erişip, kullanıcıdan dizi elemanlarının değerlerini aldık.

18.satırda dizinin elemanlarını topladık ve 20.satırda da toplamı
 dizinin eleman sayısına bölerek ortalamasını hesaplamış olduk.

“dizi.length” dizinin eleman sayısını döndürür.
     */
}
