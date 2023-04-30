package CoursePaper.lessons8;
import java.util.Objects;
public class Employee {
    private int Department;
    private String FIO;
    private float Salary;
    private static int Counter;
    private int Id;
    public int getId() {
        return Id;
    }
    public Employee getFIO() {
        return getFIO();
    }
    public int getDepartment() {
        return Department;
    }
    public float getSalary() {
        return Salary;
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
    public Employee(String fio, int dept, float salary) {
        FIO = fio;
        Department = dept;
        Salary = salary;
        Id = ++Counter;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getDepartment() == employee.getDepartment() && Float.compare(employee.getSalary(), getSalary()) == 0 && getId() == employee.getId() && Objects.equals(getFIO(), employee.getFIO());
    }


    @Override
    public String toString() {
        return "Employee { " +
                "Отдел= " + Department +
                ", Ф.И.О=' " + FIO + '\'' +
                ", Зарплата= " + Salary +
                ", Id=" + Id +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(getDepartment(), getFIO(), getSalary(), getId());
    }

}