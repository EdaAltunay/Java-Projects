package proje08_market;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class C02_benimCozumum {
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
    static int secim;
    static int urunKodu;
    static boolean ekUrun = true;
    static int kgmiktar;
    static String urunAdi;
    static int urunFiyati;
    static int toplam = 0;
    static String sepet="";
    static int adet;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        marketGirisEkrani();
    }

    private static void marketGirisEkrani() {
        System.out.println("***** ALTUNAY MARKET'e HOSGELDINIZ  *****");
        System.out.println("***************  MENU  ******************");
        System.out.println("1-Sarkuteri \n2-Manav \n3-Market \n4-Fis yazdir \n5-Cıkıs");
        System.out.print("Lutfen alısveris yapmak istediginiz reyonu seciniz:");
        secim = scan.nextInt();
        if (!(secim >= 1 && secim <= 5)) {
            System.out.println("Hatali tuslama yaptiniz");
            marketGirisEkrani();
        } else {
            switch (secim) {
                case 1:
                    sarkuterii();
                    break;
                case 2:
                    manavv();
                    break;
                case 3:
                    markett();
                    break;
                case 4:
                    fisYazdirr();
                    break;
                case 5:
                    cikiss();
                    break;
                default:


            }

        }

    }

    private static void manavv() {

        System.out.println("1- Domates:10TL(kg) \n2-Patates:15TL(kg) \n3-Sogan:15TL(kg) \n4-Biber:20TL(kg) \n5-Kabak:15TL(kg)");
        System.out.println("Lutfen almak istediginiz urun kodunu giriniz: ");

        while (ekUrun) {

            urunKodu = scan.nextInt();
            if ((urunKodu >= 1 && urunKodu <= 5)) {
                System.out.println("Kac kg istersiniz?");
                kgmiktar = scan.nextInt();
                switch (urunKodu) {
                    case 1:
                        urunAdi = "Domates";
                        urunFiyati = 10;
                        System.out.println(kgmiktar + " kg " + urunAdi + " fiyati: " + 10 * kgmiktar + " TL' dir.");
                        break;
                    case 2:
                        urunAdi = "Patates";
                        urunFiyati = 15;
                        System.out.println(kgmiktar + " kg " + urunAdi + " fiyati: " + 15 * kgmiktar + " TL' dir.");
                        break;
                    case 3:
                        urunAdi = "Sogan";
                        urunFiyati = 15;
                        System.out.println(kgmiktar + " kg " + urunAdi + " fiyati: " + 15 * kgmiktar + " TL' dir.");
                        break;
                    case 4:
                        urunAdi = "Biber";
                        urunFiyati = 20;
                        System.out.println(kgmiktar + " kg " + urunAdi + " fiyati: " + 20 * kgmiktar + " TL' dir.");
                        break;
                    case 5:
                        urunAdi = "Kabak";
                        urunFiyati = 15;
                        System.out.println(kgmiktar + " kg " + urunAdi + " fiyati: " + 15 * kgmiktar + " TL' dir.");
                        break;
                    default:
                }
                toplam += urunFiyati * kgmiktar;
                System.out.println("Olusan sepet tutari: " + toplam);
                sepet += kgmiktar + " kg " + urunAdi + " : " + urunFiyati * kgmiktar +"\n";
                System.out.println("Baska urun almak isterseniz urun kodunu giriniz: ");
                System.out.println("Ana menuye dönmek icin 0 'a basiniz.");
                ekUrun = true;
            } else if (urunKodu == 0) {
                marketGirisEkrani();
                ekUrun = false;

            } else if (!(urunKodu >= 1 && urunKodu <= 5)) {
                System.out.println("Hatali tuslama yaptiniz.Lutfen tekrar deneyiniz");
                manavv();


            }
        }

    }

    private static void sarkuterii() {

        System.out.println("1- Peynir:100TL(kg) \n2-Zeytin:55TL(kg) \n3-Helva:50TL(kg) \n4-Salca:130TL(kg) \n5-Recel:75TL(kg)");
        System.out.println("Lutfen almak istediginiz urun kodunu giriniz: ");

        while (ekUrun) {

            urunKodu = scan.nextInt();
            if ((urunKodu >= 1 && urunKodu <= 5)) {
                System.out.println("Kac adet istersiniz?");
                adet = scan.nextInt();
                switch (urunKodu) {
                    case 1:
                        urunAdi = "Peynir";
                        urunFiyati = 100;
                        System.out.println(adet + " adet " + urunAdi + " fiyati: " + 100 * adet + " TL' dir.");
                        break;
                    case 2:
                        urunAdi = "Zeytin";
                        urunFiyati = 55;
                        System.out.println(adet + " adet " + urunAdi + " fiyati: " + 55 * adet + " TL' dir.");
                        break;
                    case 3:
                        urunAdi = "Helva";
                        urunFiyati = 50;
                        System.out.println(adet + " adet " + urunAdi + " fiyati: " + 50 * adet + " TL' dir.");
                        break;
                    case 4:
                        urunAdi = "Salca";
                        urunFiyati = 130;
                        System.out.println(adet + " adet " + urunAdi + " fiyati: " + 130 * adet + " TL' dir.");
                        break;
                    case 5:
                        urunAdi = "Recel";
                        urunFiyati = 75;
                        System.out.println(adet + " adet " + urunAdi + " fiyati: " + 75 * adet + " TL' dir.");
                        break;
                    default:
                }
                toplam += urunFiyati * adet;
                System.out.println("Olusan sepet tutari: " + toplam);
                sepet += adet + " adet " + urunAdi + " : " + urunFiyati * adet+"\n";

                System.out.println("Baska urun almak isterseniz urun kodunu giriniz: ");
                System.out.println("Ana menuye dönmek icin 0 'a basiniz.");
                ekUrun = true;
            } else if (urunKodu == 0) {
                marketGirisEkrani();
                ekUrun = false;

            } else if (!(urunKodu >= 1 && urunKodu <= 5)) {
                System.out.println("Hatali tuslama yaptiniz.Lutfen tekrar deneyiniz");
                sarkuterii();
            }
        }
    }



    private static void markett() {

        System.out.println("1-Camasır deterjanı :100TL(kg) \n2-Pecete :55TL(kg) \n3-Sıvı sabun :50TL(kg) \n4-Sampuan :60TL(kg) \n5-Havlu kagıt :75TL(kg)");
        System.out.println("Lutfen almak istediginiz urun kodunu giriniz: ");

        while (ekUrun) {

            urunKodu = scan.nextInt();

            if ((urunKodu >= 1 && urunKodu <= 5)) {
                System.out.println("Kac adet istersiniz?");
                adet = scan.nextInt();
                switch (urunKodu) {
                    case 1:
                        urunAdi = "Camasır deterjanı";
                        urunFiyati = 100;
                        System.out.println(adet + " adet " + urunAdi + " fiyati: " + 100 * adet + " TL' dir.");
                        break;
                    case 2:
                        urunAdi = "Pecete";
                        urunFiyati = 55;
                        System.out.println(adet + " adet " + urunAdi + " fiyati: " + 55 * adet + " TL' dir.");
                        break;
                    case 3:
                        urunAdi = "Sıvı sabun";
                        urunFiyati = 50;
                        System.out.println(adet + " adet " + urunAdi + " fiyati: " + 50 * adet + " TL' dir.");
                        break;
                    case 4:
                        urunAdi = "Sampuan";
                        urunFiyati = 60;
                        System.out.println(adet + " adet " + urunAdi + " fiyati: " + 60 * adet + " TL' dir.");
                        break;
                    case 5:
                        urunAdi = "Havlu kagıt";
                        urunFiyati = 75;
                        System.out.println(adet + " adet " + urunAdi + " fiyati: " + 75 * adet + " TL' dir.");
                        break;
                    default:
                }
                toplam += urunFiyati * adet;
                System.out.println("Olusan sepet tutari: " + toplam);
                sepet += adet + " adet " + urunAdi + " : " + urunFiyati * adet+"\n";

                System.out.println("Baska urun almak isterseniz urun kodunu giriniz: ");
                System.out.println("Ana menuye dönmek icin 0 'a basiniz.");
                ekUrun = true;
            } else if (urunKodu == 0) {
                marketGirisEkrani();
                ekUrun = false;

            } else if (!(urunKodu >= 1 && urunKodu <= 5)) {
                System.out.println("Hatali tuslama yaptiniz.Lutfen tekrar deneyiniz");
                markett();
            }
        }
    }

    private static void fisYazdirr() {
        System.out.println();
        System.out.println("***** ALTUNAY MARKET *****");
        System.out.println("********** FİŞ ***********");
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);
        LocalTime saat=LocalTime.now();
        System.out.println(saat.getHour()+" : "+saat.getMinute());
        System.out.println(sepet);
        System.out.println("TOPLAM TUTAR: "+toplam);



    }
    private static void cikiss() {
        System.out.println("******************** CIKIS ****************************");
        System.out.println("ALTUNAY MARKETİ TERCİH ETTİGİNİZ İCİN TESEKKUR EDERİZ..");
        System.out.println("İYİ GUNLER DİLERİZ..");
        System.out.println("*******************************************************");
    }



}