package CoursePaper.Lesson4;

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
}
