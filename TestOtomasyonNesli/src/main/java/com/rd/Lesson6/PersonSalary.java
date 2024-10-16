package com.rd.Lesson6;

public class PersonSalary {
    private   String name;
    private  double salary;
    private  int day;

    public PersonSalary(String name, double salary,int day) {
        this.name = name;
        this.salary = salary;
        this.day=day;

    }
    //Maaş hesaplama metodu
    public static double calculateSalary( double salary,int day) {
        double totalSalary = salary * day;
        double prim = (day > 25) ? (day - 25) * 1000 : 0; // Üçlü operatör kullanımı
        return totalSalary + prim;
    }
    // Personel bilgilerini ve maaşı yazdırma metodu
    public static void infoPrint(String name, double salary,int day) {
        System.out.println("Personel: " + name);
        System.out.println("Toplam maaş: " + calculateSalary( salary, day) + " TL");
        System.out.println("Çalışılan gün: " + day);

    }

}
