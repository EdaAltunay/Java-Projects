package proje02_Bakkal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class
        C02_kod {
    public static void main(String[] args) {

        List<String> gunler = new ArrayList<>(Arrays.asList("1. pazartesi", "2. Sali", "3. Carsamba", "4. Persembe", "5. Cuma", "6.Cumartesi", "7.Pazar"));

        List<Double> gunlukKazanclar = new ArrayList<>();   // static degil ama
        Scanner scan = new Scanner(System.in);
        double kazanc = 0;
        System.out.println("1. pazartesi " + "2. Sali " + "3. Carsamba " + "4. Persembe " + "5. Cuma " + "6.Cumartesi " + "7.Pazar ");
        for (int i = 0; i < 7; i++) {
            System.out.print((i + 1) + ". gun icin gunluk kazancinizi girin: ");
            kazanc = scan.nextDouble();
            gunlukKazanclar.add(kazanc);
        }

        System.out.println("ortalama kazanc: "+ortalamaKazanc(gunlukKazanclar));
        ortalamaninUstundeKazancGunleri(ortalamaKazanc(gunlukKazanclar), gunlukKazanclar);
        ortalamaninAltindaKazancGünleri(ortalamaKazanc(gunlukKazanclar), gunlukKazanclar);


    }

    public static double ortalamaKazanc(List<Double> gunlukKazanclar) {

        double toplamKazanc = 0;
        double ortalama = 0;
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            toplamKazanc += gunlukKazanclar.get(i);
        }
        ortalama = toplamKazanc / gunlukKazanclar.size();

        return ortalama;
    }


    public static List<String> ortalamaninUstundeKazancGunleri(double ortalama, List<Double> kazanclar) {

        List<String> ortalamaUstuKazancGunleri = new ArrayList<>();
        for (int i = 0; i < kazanclar.size(); i++) {
            if (kazanclar.get(i) > ortalama) {
                ortalamaUstuKazancGunleri.add((i + 1) + ". gun");
            }
        }
        System.out.print("ortalama Ustu kazanc gunleri : " + ortalamaUstuKazancGunleri);
        System.out.println();
        return ortalamaUstuKazancGunleri;
    }

    public static List<String> ortalamaninAltindaKazancGünleri(double ortalama, List<Double> kazanclar){
        List<String> ortalamaAltındaKazancGunleri = new ArrayList<>();
        for (int i = 0; i < kazanclar.size(); i++) {
            if (kazanclar.get(i) < ortalama) {
                ortalamaAltındaKazancGunleri.add((i + 1) + ". gun");
            }
        }
        System.out.print("ortalama altı kazanc gunleri : " + ortalamaAltındaKazancGunleri);
        return ortalamaAltındaKazancGunleri;







    }


}

