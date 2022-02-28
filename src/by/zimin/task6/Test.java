package by.zimin.task6;

public class Test {

    public static void main(String[] args) {
        Employee e1 = new Employee("Sergey", 5000);
        Employee e2 = new Employee("Andrey", 4000);
        Employee e3 = new Employee("Dmitriy", 4500);

        Employee[] arr = new Employee[3];
        arr[0] = e1;
        arr[1] = e2;
        arr[2] = e3;

        Report.generateReport(arr);

    }
}
