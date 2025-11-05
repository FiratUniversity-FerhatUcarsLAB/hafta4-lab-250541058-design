/*
 * Ad Soyad: [Burçin AYYILDIZ]
 * Ogrenci No: [250541058]
 * Tarih: [05.11.2025]
 * Aciklama: Gorev 2 - Geometrik Hesap
 * Bu program dairenin ve kürenin alanını, çevresini ve hacmini hesaplar.
 */


import java.util.Scanner ;

public class GeometrikHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===GEOMETRİK HESAPLAYICI===\n");

        final double pi = 3.14159;

        System.out.print("Dairenin yarıçapını giriniz :  ");
        int r = input.nextInt();   //r = yarıçap

        double DaireAlani = pi * r * r;
        System.out.printf("Daire alanı: %.2f", DaireAlani);
        System.out.println(" ");

        double DaireCevresi = 2 * pi * r;
        System.out.printf("Daire çevresi: %.2f", DaireCevresi);
        System.out.println(" ");

        int DaireCapi = 2 * r;
        System.out.print("Daire çapı = " + DaireCapi);
        System.out.println("   ");

        double KureHacmi = 4.0 / 3 * pi * r * r * r;
        System.out.printf("Kürenin hacmi: %.2f", KureHacmi);
        System.out.println("   ");

        double KureYuzeyAlanı = 4 * pi * r;
        System.out.printf("Kürenin yüzey alanı: %.2f", KureYuzeyAlanı);
        System.out.println("   ");

        input.close();
    }
}

//scanner kullanarak kullanıcıdan yarıçap için giriş bilgisini aldım. pi değerini tanımlarken final kullandım. şekillerin alan ve çevrelerini hesaplarken
//int ve double veri tiplerini dikkate aldım. 


