package proje05_TcNo;

import java.util.Random;

public class C01_benim_Cozumum {

    //TC kimlik numarasının
    // 1 - son rakamı çift olmak zorundadır.
    // 2 - 0 rakamı ile başlayamaz.
    // 3 - 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6
    //     ve 8. rakamın toplamının 9 katının toplamının birler basamağı 10. rakamı;
    // 4-  ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
    // 5 - 1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.

    static Random rnd = new Random();

    public static void main(String[] args) {

        tcUret();

    }

    private static void tcUret() {
        int[] tcNo = new int[11];


        boolean kontrol=false;

        while (!kontrol ) {
            int ilkOnRakamToplami = 0, teklerToplami = 0, ciftlerToplami = 0;

            tcNo[0] = rnd.nextInt(1,10);   //  1. rakamı olusturduk.

            for (int i = 1; i < 9; i++) {            // 2,3,4,5,6,7,8,9. rakamlari olusturduk.
                tcNo[i] = rnd.nextInt(10);
            }


            for (int i = 0; i <= 8; i += 2) {

                teklerToplami += tcNo[i];
            }
            for (int i = 1; i <= 7; i += 2) {
                ciftlerToplami += tcNo[i];
            }

            tcNo[9] = ((teklerToplami * 7) + (ciftlerToplami * 9)) % 10;   // 10. rakamı olusturduk


            for (int i = 0; i < 9; i++) {
                ilkOnRakamToplami += tcNo[i];
            }



            if ((ilkOnRakamToplami % 10) == (teklerToplami * 8) % 10 && (ilkOnRakamToplami % 10)%2== 0 && tcNo[0]!=0) {
                tcNo[10] = ilkOnRakamToplami % 10;
                kontrol=true;

            }else {
                kontrol=false;
            }
        }


        for (int each : tcNo) {
            System.out.print(each);
        }


    }
}