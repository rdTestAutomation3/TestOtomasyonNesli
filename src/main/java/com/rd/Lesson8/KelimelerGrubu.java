package com.rd.Lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class KelimelerGrubu {
    public static void main(String[] args) {

        String[] kelimeDizisi = {"neslihan", "dilay", "ödev", "çalışma"};
        int a=0;


        ArrayList<String> tekrarliKelimeler = new ArrayList<>();

        for (String kelime : kelimeDizisi) {
            if (tekrarliHarfVarMi(kelime)) {
                tekrarliKelimeler.add(kelime);
            }
            if (tekrarliKelimeler.size() == 2) {
                break; // İki kelime bulunduğunda aramayı durdur
            }
        }


        if (tekrarliKelimeler.size() == 2) {
            String kelime1 = tekrarliKelimeler.get(0);
            String kelime2 = tekrarliKelimeler.get(1);
            String yeniMetin = rastgeleMetinOlustur(kelime1, kelime2);
            System.out.println("Tekrarlı harf içeren iki kelime: " + kelime1 + ", " + kelime2);
            System.out.println("Oluşturulan metin: " + yeniMetin);
        } else {
            System.out.println("İki tekrarlı harfe sahip kelime bulunamadı.");
        }
    }


    public static boolean tekrarliHarfVarMi(String kelime) {
        HashSet<Character> karakterSeti = new HashSet<>();
        for (char c : kelime.toCharArray()) {
            if (!karakterSeti.add(c)) { // Eğer set'e eklenemiyorsa tekrarlı demektir
                return true;
            }
        }
        return false;
    }


    public static String rastgeleMetinOlustur(String kelime1, String kelime2) {
        ArrayList<Character> harfler = new ArrayList<>();
        for (char c : kelime1.toCharArray()) {
            harfler.add(c);
        }
        for (char c : kelime2.toCharArray()) {
            harfler.add(c);
        }

        Collections.shuffle(harfler);
        StringBuilder yeniMetin = new StringBuilder();
        for (char c : harfler) {
            yeniMetin.append(c);
        }
        return yeniMetin.toString();
    }
}

