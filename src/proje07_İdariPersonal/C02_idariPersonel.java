package proje07_İdariPersonal;

public class C02_idariPersonel extends C01_calisan{
    static protected String departman;

    public static String getDepartman() {
        return departman;
    }

    public static void setDepartman(String departman) {
        C02_idariPersonel.departman = departman;
    }

    public static int getIzinGunSayisi() {
        return izinGunSayisi;
    }

    public static void setIzinGunSayisi(int izinGunSayisi) {
        C02_idariPersonel.izinGunSayisi = izinGunSayisi;
    }

    static protected int izinGunSayisi;
}
