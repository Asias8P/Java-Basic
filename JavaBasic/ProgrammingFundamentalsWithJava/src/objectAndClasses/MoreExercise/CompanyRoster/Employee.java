package objectAndClasses.MoreExercise.CompanyRoster;

public class Employee {
    //name, salary, position, department, email, and age.
    private String name;
    private int salary;
    private String position;
    private String department;
    private String email;
    private String age;

    public Employee(String name, int salary, String position, String department, String email, String age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public String getPosition() {
        return position;
    }


}
