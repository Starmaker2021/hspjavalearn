package com.weileanan.poly.ploy03;

public class Test {
    public static void main(String[] args) {
        Employee anan = new Worker("anan", 20);
        Employee tantan = new Manager("tantan", 25, 10);
        Test test = new Test();
        System.out.println(test.showEmpAnnual(anan));
        test.testWork(anan);
        System.out.println(test.showEmpAnnual(tantan));
        test.testWork(tantan);
    }
    public String showEmpAnnual( Employee e){
        String res = e.getName()+"\t"+e.getAnnual();
        return res;
    }

    public void testWork( Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        }
        else{
            ((Manager)e).manage();
        }
    }
}

