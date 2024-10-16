package com.rd.Lesson6;

public class PersonSalaryMain {
    public static void main(String[] args) {
        // Personel nesnesi oluşturma

        PersonSalary personSalary = new PersonSalary("Ali", 500,27);
        PersonSalary.infoPrint("Ali",500,27);
        PersonSalary personSalary2 = new PersonSalary("Veli", 1500,10);
        personSalary2.infoPrint("Veli",1200,10);

    }
}
