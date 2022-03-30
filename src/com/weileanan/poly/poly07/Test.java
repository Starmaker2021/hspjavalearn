package com.weileanan.poly.poly07;

public class Test {
    public static void main(String[] args) {
        Staff zhang = new Manager("zhang", 100, 10);
        Staff shi = new Employee("shi", 100);
        showAnnual(zhang);
        showAnnual(shi);
        testWork(zhang);
        testWork(shi);
    }

    public static void showAnnual(Staff staff) {
        int annual = staff.getAnnual();
        System.out.println(annual);
    }
    public static void testWork(Staff staff){
        if(staff instanceof Manager){
            ((Manager)staff).manage();
        }
        else if(staff instanceof Employee){
            ((Employee)staff).work();
        }
    }
}
