package proje09_bankamatik;

import java.util.Scanner;

public class C02_benimCozumum {
    static String kartNo = "123456";
    static String sifre = "1234";
    static String yeniSifre;

    static int bakiye = 50000;
    static Scanner scan = new Scanner(System.in);
    static String girilenKartNo = "";
    static String girilenSifre;
    static int islemNo;
    static int yatirilanMiktar;

    static int gonderilenMiktar = 0;
    static int cekilenMiktar;

    static String iban = "";
    static boolean deneme = false;
    static boolean deneme3 = false;
    static boolean deneme2 = false;


    public static void main(String[] args) {

        System.out.println("**************** JAVA BANKA HOSHELDINIZ ************* ");
        System.out.print("Lutfen 6 haneli kart numaranizi giriniz:");
        while (!deneme) {
            girilenKartNo = scan.nextLine();
            girilenKartNo = girilenKartNo.replace(" ", "");
            if (!girilenKartNo.equals(kartNo)) {
                System.out.println("Kart numaranizi yanlis girdiniz.\nLutfen tekrar deneyiniz.");
                deneme = false;
            } else {
                System.out.println("Lutfen sifrenizi giriniz");
                while (!deneme2) {
                    girilenSifre = scan.next();
                    if (!girilenSifre.equals(sifre)) {
                        System.out.println("sifrenizi yanlis girdiniz.\nLutfen tekrar deneyiniz.");
                        deneme2 = false;
                    } else {
                        System.out.println("kart numaraniiz ve sifrenizi dogru girdiniz");
                        deneme2 = true;
                        menu();
                    }
                }

            }
        }
    }

    public static void menu() {
        System.out.println("Lutfen yapmak istediginiz islemin kod numarasini giriniz" +
                "\n1- Bakiye sorgula \n2- Para yatirma  \n3- Para çekme \n4- Para gönderme \n5- Sifre değiştirme \n6- Cikis");
        islemNo = scan.nextInt();
        switch (islemNo) {
            case 1:
                bakiyeSorgulama();
                menu();
                break;
            case 2:
                paraYatirma();
                menu();
                break;
            case 3:
                paraCekme();
                menu();
                break;
            case 4:
                paraGonderme();
                menu();
                break;
            case 5:
                sifreDegistirme();
                menu();
                break;
            case 6:
                cikiis();
            default:
                System.out.println("HATALI GİRİŞ YAPTINIZ...");
                menu();
        }
    }

    private static void cikiis() {
        System.out.println("****** İYİ GÜNLER DİLERİZ ******");
        System.exit(0);
    }

    private static void bakiyeSorgulama() {
        System.out.println("Bakiyeniz : " + bakiye + " Euro dur");
    }

    private static void sifreDegistirme() {
        System.out.print("Sifrenizi degistirebilmek icin öncelikle lutfen ESKİ SİFRENİZİ giriniz: ");
        girilenSifre = scan.next();
        if (!girilenSifre.equals(sifre) ) {
            System.out.println("hatali sifre girisi");
            sifreDegistirme();
        } else {
            System.out.println("Lutfen 4 haneli yeni sifrenizi giriniz");

            while (!deneme) {
                yeniSifre = scan.next();
                if (yeniSifre.length()==4 &&
                        yeniSifre.charAt(0)>=48 &&yeniSifre.charAt(0)<=57 &&
                        yeniSifre.charAt(1)>=48 &&yeniSifre.charAt(1)<=57 &&
                        yeniSifre.charAt(2)>=48 &&yeniSifre.charAt(2)<=57 &&
                        yeniSifre.charAt(3)>=48 &&yeniSifre.charAt(3)<=57 )
                {
                    sifre = yeniSifre;
                    System.out.println("Sifreniz basarili sekilde degistirlmistir" + "\nYeni sifreniz :" + sifre + " dir");
                    deneme = true;




                } else  {
                    System.out.println("Hatalı deneme.Lutfen sifrenizi 4 haneli giriniz");
                    deneme = false;

                }
            }
        }

    }

    private static void paraGonderme() {

        System.out.println("Lutfen para gondermek istediginzi 26 haneli iban numarasini giriniz");
        iban = scan.next();
        if (iban.length() == 26 && iban.startsWith("TR")) {
            System.out.print("Gonderilecek miktari giriniz: ");

            while (!deneme3) {
                gonderilenMiktar = scan.nextInt();
                if (gonderilenMiktar > bakiye) {

                    System.out.println("Bakiyeniz yetersiz.\nLutfen tekrar deneyiniz.");
                    deneme3 = false;

                } else {
                    System.out.println(iban + " nolu iban 'a " + gonderilenMiktar + " Euro gönderildi.");
                    bakiye -= gonderilenMiktar;
                    deneme3 = true;
                    System.out.println("Guncel bakiyeniz : " + bakiye);
                }

            }

        } else {
            System.out.println("Hatali iban girisi");
            paraGonderme();
        }
    }

    private static void paraCekme() {
        System.out.println("lutfen cekmek istediginiz miktari giriniz");
        cekilenMiktar = scan.nextInt();
           if (cekilenMiktar > bakiye) {
               System.out.println("Bakiyeniz yetersiz.");
               paraCekme();

           } else {
               bakiye -= cekilenMiktar;
               System.out.println("Guncel bakiyeniz : " + bakiye);
           }
       }




    private static void paraYatirma() {
        System.out.println("Lutfen yatirmak istedigniz miktari giriniz");
        yatirilanMiktar = scan.nextInt();
        bakiye += yatirilanMiktar;

        System.out.println("Guncel bakiyeniz : " + bakiye);


    }
    /*
    private static void sifreDegistirme() {
    System.out.print("Sifrenizi degistirebilmek icin öncelikle lutfen ESKİ SİFRENİZİ giriniz: ");
    girilenSifre = scan.next();
    if (!girilenSifre.equals(sifre) ) {
        System.out.println("hatali sifre girisi");
        sifreDegistirme();
    } else {
        System.out.println("Lutfen 4 haneli yeni sifrenizi giriniz");
        while (!deneme) {
            yeniSifre = scan.next();
            if (yeniSifre.length()==4){
            for (int i = 0; i < yeniSifre.length(); i++) {
                if (yeniSifre.charAt(i) >= 48 && yeniSifre.charAt(i) <= 57) {
                    sifre= yeniSifre;
                    deneme = true;
                }else{
                    System.out.println("Hatalı deneme.Lutfen sifrenizi 4 haneli giriniz");
                    deneme = false;
                    sifreDegistirme();
            }
            } System.out.println("Sifreniz basarili sekilde degistirlmistir" + "\nYeni sifreniz :" + sifre + " dir");
            } else{
                System.out.println("Hatalı deneme.Lutfen sifrenizi 4 haneli giriniz");
                deneme = false;
            }
        }
    }

}
     */
}