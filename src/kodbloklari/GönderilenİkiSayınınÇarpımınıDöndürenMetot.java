package kodbloklari;

public class GönderilenİkiSayınınÇarpımınıDöndürenMetot {


    static int carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }
    public static void main(String[] args) {

        int sonuc = carp(15,5);
        System.out.println("Sonuc =  " +sonuc);
    }
    /*
    Ana programdaki “sonuc” değişkenine carp() metodunun döndürdüğü sayıyı eşitledik ve ekrana yazdırdık.


     */
}
