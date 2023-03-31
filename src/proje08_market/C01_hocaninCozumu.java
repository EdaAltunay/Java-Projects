package proje08_market;

import java.util.Scanner;

public class C01_hocaninCozumu {
    static Scanner scan = new Scanner(System.in);

    static String uruAdi;
    static String sepet = "";
    static int urunKodu;
    static int urunFiyati;
    static int urunAdedi;
    static int toplam;
    static boolean ekUrun = false;


        /*
             ====================PROJEMIZ===================================
             ilk programa girildiginde bizi bir menu karsilasin bu secenekler
           1 ŞARKÜTERİ ÜRÜNLERİ
           2 MANAV ÜRÜNLERİ
           3 MARKET
             Secime Gore ,
           4-urunleri listele ve
           5-fiyatlari gelsin

         */

    public static void main(String[] args) {

        girisEkrani();
    }

    private static void girisEkrani() {
        System.out.println("========= WISE Market'e Hos Geldiniz =========");
        System.out.println("----- MENU -----");
        System.out.println("Lutfen Alisveris yapmak istediginiz reyonu seciniz");
        System.out.println("1- Manav\n2- Sarkuteri\n3- Market\n4- Fis Yazdir\n5- Cikis");

        int secim = scan.nextInt();
        if (!(secim >= 1 && secim <= 5)) {
            System.out.println("Hatali Tuslama Yaptiniz");
            girisEkrani();
        } else {
            switch (secim) {
                case 1:
                    manav();
                    break;

                case 2:
                    sarkuteri();
                    break;

                case 3:
                    market();
                    break;

                case 4:
                    fisYazdir();
                    break;

                case 5:
                    cikis();
                    break;

                default:
            }
        }
    }

    private static void manav() {
        System.out.println("Lutfen alacaginiz urun kodunu giriniz \n1- Patates(kg12) \n2- Sogan(kg15) " +
                "\n3- Elma(kg15) \n4- Portakal(kg20) \n5- Ananas(kg30)");
        while (!ekUrun) {
            urunKodu = scan.nextInt();

            if (urunKodu >= 1 && urunKodu <= 5) {
                System.out.println("Kac Kg Alirsiniz?");
                urunAdedi = scan.nextInt();

                switch (urunKodu) {
                    case 1:
                        uruAdi = "Patates";
                        urunFiyati = 12;
                        System.out.println(urunAdedi + " Kg " + uruAdi + " Fiyati : " + urunFiyati * urunAdedi + " TL'dir");
                        break;

                    case 2:
                        uruAdi = "Sogan";
                        urunFiyati = 15;
                        System.out.println(urunAdedi + " Kg " + uruAdi + " Fiyati : " + urunFiyati * urunAdedi + " TL'dir");
                        break;

                    case 3:
                        uruAdi = "Elma";
                        urunFiyati = 15;
                        System.out.println(urunAdedi + " Kg " + uruAdi + " Fiyati : " + urunFiyati * urunAdedi + " TL'dir");
                        break;

                    case 4:
                        uruAdi = "Portakal";
                        urunFiyati = 20;
                        System.out.println(urunAdedi + " Kg " + uruAdi + " Fiyati : " + urunFiyati * urunAdedi + " TL'dir");
                        break;

                    case 5:
                        uruAdi = "Ananas";
                        urunFiyati = 30;
                        System.out.println(urunAdedi + " Kg " + uruAdi + " Fiyati : " + urunFiyati * urunAdedi + " TL'dir");
                        break;

                    default:
                }
                urunFiyati = urunFiyati * urunAdedi; // buraya hafizaya kaydediyoruz
                toplam += urunFiyati;
                System.out.println("Sepet Turtari : " + toplam);
                sepet += uruAdi + ": " + urunFiyati + "TL'dir.";
                System.out.println("Baska urun alamak isterseniz urun kodunu giriniz...\nAna menuye donmek icin 0'a basiniz");
            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
    }

    private static void sarkuteri() {
        System.out.println("Lutfen alacaginiz urun kodunu giriniz \n1- Peynir(kg120) \n2- Zeytin(kg80) " +
                "\n3- Ceviz(kg150) \n4- Sucuk(kg300) \n5- Bal(kg300)");

        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if ((urunKodu >= 1 && urunKodu <= 5)) {
                System.out.println("Kac kg istersiniz?");
                urunAdedi = scan.nextInt();

            } else {
                switch (urunKodu) {
                    case 1:
                        uruAdi = "Peynir";
                        urunFiyati = 120;
                        System.out.println(urunAdedi + " Kg" + uruAdi + " Fiyati : " + urunAdedi * urunFiyati + " Tl'dir");
                        break;
                    case 2:
                        uruAdi = "Zeytin";
                        urunFiyati = 80;
                        System.out.println(urunAdedi + " Kg" + uruAdi + " Fiyati : " + urunAdedi * urunFiyati + " Tl'dir");
                        break;
                    case 3:
                        uruAdi = "Ceviz";
                        urunFiyati = 150;
                        System.out.println(urunAdedi + " Kg" + uruAdi + " Fiyati : " + urunAdedi * urunFiyati + " Tl'dir");
                        break;

                }
            }
        }
    }

    private static void market() {
    }

    private static void fisYazdir() {
    }

    private static void cikis() {
    }
}
