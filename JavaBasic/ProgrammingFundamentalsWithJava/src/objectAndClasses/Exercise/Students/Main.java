package objectAndClasses.Exercise.Students;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
//first name (string), last name (string), and grade (a floating-point number).
        List<Students> students = new ArrayList<>();
        List<Double> gr = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            String studentInfo = in.nextLine();
            String name = studentInfo.split(" ")[0];
            String lastName = studentInfo.split(" ")[1];
            double grade = Double.parseDouble(studentInfo.split(" ")[2]);


            Students newStudent = new Students(name, lastName, grade);
            students.add(newStudent);


        }

        students.sort(Comparator.comparing(Students::getGrade));
        Collections.reverse(students);

        for (Students st:students) {
            System.out.println(st.toString());
        }

    }
}
