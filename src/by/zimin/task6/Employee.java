package by.zimin.task6;

import java.util.Objects;

public class Employee {

    private String FullName;
    private double salary;

    public Employee(String fullName, double salary) {
        FullName = fullName;
        this.salary = salary;
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(String fullName) {
        FullName = fullName;
    }

    public Employee() {
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(FullName, employee.FullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FullName, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FullName='" + FullName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
