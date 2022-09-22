package associativeArrays.Exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, List<String>> mapCourse = new LinkedHashMap<>();

        String input = in.nextLine();
       // "{courseName} : {studentName}"

        while (!input.equals("end")){
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if(!mapCourse.containsKey(courseName)){
                mapCourse.put(courseName,new ArrayList<>());
                mapCourse.get(courseName).add(studentName);
            }
            else {

                List<String>students=mapCourse.get(courseName);
                if(!isStudentExist(students,studentName)){
                    mapCourse.get(courseName).add(studentName);
                }

            }
            input= in.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : mapCourse.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());
            for (int i = 0; i <entry.getValue().size() ; i++) {
                System.out.printf("-- %s%n",entry.getValue().get(i));

            }

        }


    }

    public static boolean isStudentExist(List<String>students,String studentName){
        for (int i = 0; i < students.size(); i++) {
            if(studentName.equals(students.get(i))){
                return true;
            }
           else {
               return false;
            }
        }
        return false;
    }
}
