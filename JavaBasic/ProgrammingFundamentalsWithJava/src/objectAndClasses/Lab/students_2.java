package objectAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class students_2 {

    static class Student{
        String firstName;
        String lastName;
        String age;
        String homeTown;

        Student(String firstName,String lastName,String age,String homeTown){
            this.firstName=firstName;
            this.lastName=lastName;
            this.age=age;
            this.homeTown=homeTown;
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

        public String getInfo(){
            return String.format("%s %s is %s years old",this.firstName,this.lastName,this.age);
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        List<Student> students = new ArrayList<>();


        while (!input.equals("end")){

            String [] command = input.split(" ");
            String first = command[0];
            String last = command[1];
            String years = command[2];
            String city = command[3];

          Student stu = new Student(first,last,years,city);

            //int index = indexOfStudent(students,currentFirstName,currentLastName);
//           if(index!=-1){
//              students.set(index,stu);
//           }
//           else {
//            students.add(stu);}

            Student exist = findStudent(students,first,last);
            if(exist!=null){
                exist.setAge(years);
                exist.setHomeTown(city);

            }
            else {
                students.add(stu);
            }


            input = in.nextLine();
        }

        String city = in.nextLine();

        for (Student st:students) {
            if(st.getHomeTown().equals(city)){
                System.out.println(st.getInfo());
            }
        }

    }

    public static Student findStudent(List<Student>students,String firstName,String lastName){
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.getFirstName().equals(firstName) && s.lastName.equals(lastName)){
                return s;
            }

        }
        return null;
    }

    public static int indexOfStudent (List<Student>students,String firstName,String lastName){
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)){
                return i;
            }

        }
        return -1;
    }
}
