package kodbloklari;

public class MetotOverloading {
    static void topla(int a, int b) {
        System.out.println("2 Sayının Toplamı = " + (a + b));
    }
    static void topla(int a, int b, int c) {
        System.out.println("3 Sayının Toplamı = " + (a + b + c));
    }
    static void topla(int a, int b, int c, int d) {
        System.out.println("4 Sayının Toplamı = " + (a + b + c + d));
    }
    public static void main(String[] args) {
        topla(5,7);
        topla(7,3,6);
        topla(2,8,12);
    }
    /*
    topla() isminde 3 tane metot oluşturduk. Bu 3 metodun farklılıkları aldığı parametre sayısıdır.

Kullanıcı topla() metodunun içine 2 adet sayı yazdığı zaman ilgili metot,
 3 adet sayı girdiği zaman 3 tane parametre alan metot çağrılıyor.
     */
}
