package CoursePaper.lesson5;

public class Employee {
    int Department;
    String FIO;
    float Salary;
    private static int Counter;
    private int Id;
    public int getId() {
        return this.Id;
    }
    public String getFIO() {
        return this.FIO;
    }
    public int getDepartment() {
        return this.Department;
    }
    public float getSalary() {
        return this.Salary;
    }
    public void SetFIO(String fio) {
        this.FIO = fio;
    }
    public void SetDepartment(int dept) {
        this.Department = dept;
    }
    public void SetSalary(float sal) {
        this.Salary = sal;
    }
}
