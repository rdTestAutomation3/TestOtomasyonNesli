package com.rd.Lesson11;


import java.time.LocalDate;

// 5. Ana sınıf
public class IKUygulamasi {
    public static void main(String[] args) {
        // Takım lideri ve personel nesnelerini oluşturma
        Personel takimLideri = new Erkek("Ahmet", "Yılmaz", LocalDate.of(1980, 5, 15));
        Departman departman = new Departman("Yazılım Geliştirme", takimLideri);

        // Kadın ve erkek personel ekleme
        Personel kadinPersonel = new Kadin("Ayşe", "Demir", LocalDate.of(1992, 8, 24));
        Personel erkekPersonel = new Erkek("Mehmet", "Çelik", LocalDate.of(1985, 3, 10));

        departman.personelEkle(kadinPersonel);
        departman.personelEkle(erkekPersonel);

        // Görev ekleme ve tamamlama
        departman.gorevEkle("Yeni Proje Planlama");
        departman.gorevTamamla("Yeni Proje Planlama");

        // Emeklilik hesaplaması
        takimLideri.emeklilikYiliHesapla();
        kadinPersonel.emeklilikYiliHesapla();
        erkekPersonel.emeklilikYiliHesapla();
    }
}