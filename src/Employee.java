public class Employee {
    //
    public static long[] printEmployee;
    private String fio;
    private int department;
    private float salary;
    private static int counter;
    private int id;

    //
    public Employee(String fio, int department, float salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    //
    public String getFIO() {
        return this.fio;
    }

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.salary;
    }

    public int getID() {
        return this.id;
    }

    //
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    //
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Employee employee1 = (Employee) other;
        return fio.equals(employee1.fio) && department == employee1.department && salary == employee1.salary || id == employee1.id;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(fio) & java.util.Objects.hash(department) & java.util.Objects.hash(salary) & java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Ф.И.О.: " + fio + ". Отдел: " + department + ". Зарплата: " + salary + ". Идентификатор: " + id + ".";
    }
}