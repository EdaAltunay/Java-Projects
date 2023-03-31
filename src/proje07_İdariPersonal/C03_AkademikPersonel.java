package proje07_İdariPersonal;

public class C03_AkademikPersonel extends C01_calisan {
    static protected String bolum;
    static protected String akademilUnvan;

    public static String getBolum() {
        return bolum;
    }

    public static void setBolum(String bolum) {
        C03_AkademikPersonel.bolum = bolum;
    }

    public static String getAkademilUnvan() {
        return akademilUnvan;
    }

    public static void setAkademilUnvan(String akademilUnvan) {
        C03_AkademikPersonel.akademilUnvan = akademilUnvan;
    }
}
