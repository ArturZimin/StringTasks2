package by.zimin.task6;

public class Report {




    public static String generateReport(Employee[] arr) {
        StringBuilder sb=new StringBuilder();
        for (Employee emp:arr) {
            System.out.printf("Name : %10s , salary : % 9.2f \n",emp.getFullName(),emp.getSalary());
        }
        return sb.toString();
    }



}
