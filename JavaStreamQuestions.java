
import java.util.*;
import java.util.stream.Collectors;

class Employee{

    private String name;

    private String department;

    private int salary;

    public Employee() {
    }

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class JavaStreamQuestions {

    public static void main(String[] strs){

        System.out.println("Java Stream API Pratice");

        CollectorsRelatedQuePra collectorsRelatedQuePra = new CollectorsRelatedQuePra();

        collectorsRelatedQuePra.getAvgSalaryOfEmpByDep();
    }
}



 class CollectorsRelatedQuePra{

    public void getAvgSalaryOfEmpByDep(){

        List<Employee> employees = Arrays.asList(
                new Employee("Raj", "IT", 5000),
                new Employee("Ravi", "HR", 6000),
                new Employee("Rani", "IT", 7000),
                new Employee("Rahul", "HR", 4000)
        );

// Group by department and calculate average salary
        Map<String, Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.averagingInt(employee -> employee.getSalary())));

        System.out.println(avgSalary); // {IT=6000. ,HR=5000.0}
    }
 }