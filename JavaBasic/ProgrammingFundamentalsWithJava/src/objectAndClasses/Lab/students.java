package objectAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students {

    static class Student {
        String firstName;
        String lastName;
        String age;
        String homeTown;


        public Student(String firstName, String lastName, String age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;

        }


        public String getFirstName() {
            return firstName;
        }


        public String getLastName() {
            return lastName;
        }


        public String getAge() {
            return age;
        }


        public String getHomeTown() {
            return homeTown;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String command = in.nextLine();

        List<Student> students = new ArrayList<>();

        while (!command.equals("end")) {

            String first = command.split(" ")[0];
            String last = command.split(" ")[1];
            String years = command.split(" ")[2];
            String city = command.split(" ")[3];


            Student student = new Student(first, last, years, city);
            students.add(student);

            command = in.nextLine();

        }

        String cityName = in.nextLine();
        for (Student stu : students) {
            if (stu.getHomeTown().equals(cityName)) {
                System.out.printf("%s %s is %s years old%n", stu.getFirstName(), stu.getLastName(), stu.getAge());
            }
        }
    }
}
