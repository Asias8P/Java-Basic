package objectAndClasses.MoreExercise.CompanyRoster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double avgSalary = 0;
        List<Employee>listOfEmpl = new ArrayList<>();
        int lines = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= lines; i++) {
            //name, salary, position, department, email, and age.
            String [] employees=in.nextLine().split(" ");
            String name = employees[0];
            int salary =Integer.parseInt(employees[1]);
          String position = employees[2];
          String department = employees[3];
            String email = employees[4];
            String age = employees[5];

            Employee employee= new Employee(name,salary,position,department,email,age);
            listOfEmpl.add(employee);
            if(employee.getDepartment().equals(department)){
                avgSalary+= employee.getSalary();
            }
            
        }

    }
}
