package associativeArrays.Exercise;

import java.util.*;

public class StudentsAcademy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        Map<String, List<Double>> mapStudents = new LinkedHashMap<>();
        Map<String,Double> resultMapStudents = new LinkedHashMap<>();
        int counter = 0;


        for (int i = 0; i <n ; i++) {
            String studentName = in.nextLine();
            double grade = Double.parseDouble(in.nextLine());

            if(!mapStudents.containsKey(studentName)){
                mapStudents.put(studentName,new ArrayList<>());
            }

            mapStudents.get(studentName).add(grade);


        }


        for (Map.Entry<String, List<Double>> entry : mapStudents.entrySet()) {
            List<Double> total = new ArrayList<>();
            total.addAll(entry.getValue());
            double avg=0;
            for (int i = 0; i < total.size(); i++) {
                avg+=total.get(i);
            }
            avg=avg/total.size();
            if(avg>=4.50){
                System.out.printf("%s -> %.2f%n",entry.getKey(),avg);
            }
        }


    }
}
