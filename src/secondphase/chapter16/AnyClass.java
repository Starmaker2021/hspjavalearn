package secondphase.chapter16;

import java.util.ArrayList;

public class AnyClass {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("zhang", "lll", new MyDate(1999,1,9)));
        employees.add(new Employee("zhang", "lll", new MyDate(1999,1,9)));
        employees.add(new Employee("zhang", "lll", new MyDate(1999,1,9)));
        for (Employee o :employees) {
            System.out.println(o.toString());
        }
    }


}

class Employee{
    private String name;
    private String sal;
    private MyDate birthday;

    public Employee(String name, String sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal='" + sal + '\'' +
                ", birthday=" + birthday.getYear()+birthday.getMonth() +birthday.getDay()+
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }


}

class MyDate {
    private int year;
    private int Month;
    private int day;


    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate(int year, int month, int day) {
        Month = month;
        this.day = day;
        this.year = year;
    }
}