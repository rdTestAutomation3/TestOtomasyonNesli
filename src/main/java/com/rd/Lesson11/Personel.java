package com.rd.Lesson11;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

abstract class Personel {
    String ad;
    String soyad;
    LocalDate dogumTarihi;

    public Personel(String ad, String soyad, LocalDate dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }

    // Emeklilik yılı hesaplama yöntemi (abstract, her alt sınıf kendine göre tanımlar)
    abstract void emeklilikYiliHesapla();
}

// 2. Kadın sınıfı tanımı
class Kadin extends Personel {
    public Kadin(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    void emeklilikYiliHesapla() {
        int emeklilikYasi = 60;
        int yas = Period.between(dogumTarihi, LocalDate.now()).getYears();
        int kalanYil = emeklilikYasi - yas;
        System.out.println(ad + " " + soyad + " adlı kadının emekliliğe kalan yıl: " + kalanYil);
    }
}

// 3. Erkek sınıfı tanımı
class Erkek extends Personel {
    public Erkek(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    void emeklilikYiliHesapla() {
        int emeklilikYasi = 65;
        int yas = Period.between(dogumTarihi, LocalDate.now()).getYears();
        int kalanYil = emeklilikYasi - yas;
        System.out.println(ad + " " + soyad + " adlı erkeğin emekliliğe kalan yıl: " + kalanYil);
    }
}

// 4. Departman sınıfı tanımı
class Departman {
    String ad;
    Personel takimLideri;
    List<Personel> personelListesi;
    List<String> gorevListesi;

    public Departman(String ad, Personel takimLideri) {
        this.ad = ad;
        this.takimLideri = takimLideri;
        this.personelListesi = new ArrayList<>();
        this.gorevListesi = new ArrayList<>();
    }

    // Takım lideri değiştirme
    public void takimLideriDegistir(Personel yeniLider) {
        this.takimLideri = yeniLider;
        System.out.println("Yeni takım lideri: " + yeniLider.ad + " " + yeniLider.soyad);
    }

    // Personel ekleme
    public void personelEkle(Personel personel) {
        personelListesi.add(personel);
        System.out.println(personel.ad + " " + personel.soyad + " departmana eklendi.");
    }

    // Personel çıkarma
    public void personelCikar(Personel personel) {
        personelListesi.remove(personel);
        System.out.println(personel.ad + " " + personel.soyad + " departmandan çıkarıldı.");
    }

    // Görev ekleme
    public void gorevEkle(String gorev) {
        gorevListesi.add(gorev);
        System.out.println("Görev eklendi: " + gorev);
    }

    // Görev tamamla
    public void gorevTamamla(String gorev) {
        if (gorevListesi.contains(gorev)) {
            gorevListesi.remove(gorev);
            System.out.println("Görev tamamlandı: " + gorev);
        } else {
            System.out.println("Görev bulunamadı: " + gorev);
        }
    }
}

