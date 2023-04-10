package proje03_manav;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_story_kod {

        /*
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
          			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
          			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         */

    static List<String> urunler = new ArrayList<>();
    static List<Integer> fiyatlar = new ArrayList<>();
    static int tutar;

    public static void main(String[] args) {
        urunsec();

    }

    private static void urunsec() {

        urunler.add("1. Elma :10 TL");
        urunler.add("2. Ayva :15 TL");
        urunler.add("3. Portakal : 20TL");
        urunler.add("4. Muz : 15 TL");
        urunler.add("5. Nar : 25 TL");

        fiyatlar.add(10);
        fiyatlar.add(15);
        fiyatlar.add(20);
        fiyatlar.add(15);
        fiyatlar.add(25);


        Scanner scan = new Scanner(System.in);
        System.out.println("*** MANAVIMIZA HOSGELDINIZ ***");
        for (String each : urunler) {
            System.out.println(each);
        }

        System.out.print("Lutfen secmek istediginiz urunun numarasini giriniz :");
        int urunNo = scan.nextInt();
        System.out.print("LUtfen kac kg almak istediginizi giriniz: ");
        int miktar = scan.nextInt();
        tutar = fiyatlar.get(urunNo - 1) * miktar;
        System.out.println("Alısverise devam etmek istiyor musunuz?  (E/H) ");
        char devamMi = scan.next().toUpperCase().charAt(0);

        if (devamMi == 'H') {
            System.out.println("Aldıgınız urunlerın toplam tutarı: " + tutar);
            System.exit(0);
        } else {
            urunsec();
        }
    }
}


