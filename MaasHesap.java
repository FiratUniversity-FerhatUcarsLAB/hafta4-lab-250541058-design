/*
 * Ad Soyad: [Burçin AYYILDIZ]
 * Ogrenci No: [250541058]
 * Tarih: [05.11.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ad soyad bilgilerini alıp maaş bodrosunu 
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Scanner ;

public class MaasHesap {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in) ;

        System.out.println("=====================") ;
        System.out.println("MAAŞ HESAPLAMA") ;
        System.out.println("=====================") ;


        System.out.print("Çalışan adı soyadı : ") ;
        String CalisanAdSoyad = input.nextLine() ;

        System.out.println("GELİRLER") ;

        double BrutMaas = 15000.0 ;
        System.out.printf("Brüt maaş : %.2f " , BrutMaas) ;
        System.out.println(" ") ;

        int MesaiSaati = 10 ;

        double MesaiUcreti = (BrutMaas/160) * MesaiSaati * 1.5;
        System.out.printf("Mesai ücreti = %.2f" , MesaiUcreti) ;
        System.out.println(" ") ;

        System.out.println("-------------");

        double ToplamGelir = BrutMaas + MesaiUcreti ;
        System.out.println("TOPLAM GELİR : " + ToplamGelir ) ;



        System.out.println("KESİNTİLER") ;

        final double SGK_Orani = 0.14 ;
        System.out.printf("SGK Kesintisi : %.2f  " , ToplamGelir * 0.14) ;
        System.out.println(" ") ;

        final double Gelir_Vergisi_Orani = 0.15 ;
        System.out.printf("Gelir Vergisi : %.2f " , ToplamGelir * 0.15 ) ;
        System.out.println(" ") ;

        final double Damga_Vergisi_Orani = 0.00759 ;
        System.out.printf("Damga vergisi : %.2f " , ToplamGelir * 0.00759 ) ;
        System.out.println(" ") ;

        System.out.println("-------------");

        double ToplamKesinti = (ToplamGelir*SGK_Orani)+(ToplamGelir*Gelir_Vergisi_Orani)+(ToplamGelir*Damga_Vergisi_Orani) ;
        System.out.printf("TOPLAM KESİNTİ : %.2f " , ToplamKesinti) ;
        System.out.println(" ") ;

        double NetMaas = ToplamGelir - ToplamKesinti ;
        System.out.printf("Net Maaş : %.2f " , NetMaas) ;
        System.out.println(" ") ;
        System.out.println("=====================") ;

      input.close()
        

    }

}

//scanner ile çalışan isim ve soyisim alınır. bu programda vergi oranları sabit olduğu için double yerine final double kullanıldı. yazı verileri için 
//string tam sayılar için int kullanıldı.
