/*
 * Ad Soyad: [Burçin AYYILDIZ]
 * Ogrenci No: [250541058]
 * Tarih: [05.11.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in) ;
        // Ad Soyad = Burçin AYYILDIZ
        // Öğrenci no = 250541058 
        // YAş = 19
        // GPA = 3.50
        
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        System.out.print("Öğrenci adı soyadı : ");
        String AdSoyad = input.nextLine();
        
        
        System.out.print("Öğrenci numarası : ");
        int OgrenciNumarasi = input.nextInt();

    
        System.out.print("Öğrenci yaşı : ");
        int OgrenciYasi = input.nextInt();


        System.out.print("Öğrenci GPA: ");
        double gpa = input.nextDouble();
        
        input.close();
        
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");

      

    }
}
        
        // scanner kullanarak kullanıcıdan bilgileri alarak öğrenci bilgi sistemi oluşturdum. gpa değerini alırken double kullandım. yaş ve öğrenci no bilgilerini 
        //alırken int veri tipini kullandım. ad ve soyad yazı verisi olduğu için string veri tipini kullandım. 

        
        
        
        
        
        

        
        
        // Scanner'i kapatin (önemli pratik)
        
   
