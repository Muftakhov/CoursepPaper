package CoursePaper.lessons8;

import CoursePaper.lessons8.Employee;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        System.out.println("pointA: ");
        Employee[] employees = new Employee[10];
    employees[0]=new Employee("F-1 I-1 O-1",1,25500f);
    employees[1]=new Employee("F-2 I-2 O-2",2,31450f);
    employees[2]=new Employee("F-3 I-3 O-3",3,40200f);
    employees[3]=new Employee("F-4 I-4 O-4",4,40200f);
    employees[4]=new Employee("F-5 I-5 O-5",5,40200f);
    employees[5]=new Employee("F-6 I-6 O-6",6,40200f);
    employees[6]=new Employee("F-7 I-7 O-7",7,40200f);
    employees[7]=new Employee("F-8 I-8 O-8",8,40200f);
    employees[8]=new Employee("F-9 I-9 O-9",9,80000f);
    employees[9]=new Employee("F-10 I-10 O-10",10,40200f);
    for(Employee e:employees)
        System.out.println(e);
    pointB(employees);
    pointC(employees);
    pointD(employees);
    pointE(employees);
    pointF(employees);
    }

    private static void pointB (Employee[] employees) {
        System.out.println("Пункт b: ");
       float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        System.out.println("Сумма зарплат = " + sum);
    }
    public static double pointC(Employee[] employees) {
        System.out.println("Пункт c: ");
        double min = Double.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = Double.min(min, employees[i].getSalary());
            }
        }
        System.out.println("Сумма зарплат = " + min);
        return min;
    }
    public static double pointD(Employee[] employees) {
        System.out.println("Пункт d: ");
        double max = Double.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = Double.max(max, employees[i].getSalary());
            }
        }
        System.out.println("Сумма зарплат = " + max);
        return max;
    }
    public static double pointE(Employee[] employees) {
        System.out.println("Пункт e: ");
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        sum = sum/employees.length;
        System.out.println("Среднее значение зарплат = " + sum);
        return sum;
    }
    public static void pointF (Employee[] employees){
        System.out.println("Пункт f: ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

}

