package com.rd.Lesson5.Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

// Çalışanlar oluşturuluyor
        employeeList.add(new Employee("Neslihan Aydın", "Manager"));
        employeeList.add(new Employee("Zekiye Arkun", "HR Specialist"));
        employeeList.add(new Employee("Dilay Gül", "Recruiter"));


            System.out.println(employeeList);

    }
}


