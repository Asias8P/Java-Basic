package associativeArrays.Exercise;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        Map<String, Integer> results = new LinkedHashMap<>();
        Map<String, Integer> submissions = new LinkedHashMap<>();
        String input = in.nextLine();
        while (!input.equals("exam finished")) {



            String[] data = input.split("\\-");
            if(data.length==2){
                String userName=input.split("-")[0];
                String ban=input.split("-")[1];
                results.remove(userName,results.get(userName));
            }
            else if(data.length==3){
            String userName = data[0];
            String language = data[1];
            int points = Integer.parseInt(data[2]);

                if (!results.containsKey(userName)) {
                    results.put(userName, points);
                }
                else {
                    int currentPoints= results.get(userName);
                    if(points>currentPoints){
                        results.put(userName,points);
                    }
                }
                if (!submissions.containsKey(language)) {
                    submissions.put(language, 1);
                } else {
                    int currentCounter = submissions.get(language);
                    submissions.put(language, currentCounter + 1);
                }}



            input = in.nextLine();

        }
        System.out.println("Results:");
        results.entrySet().forEach(entry -> System.out.printf("%s | %d%n", entry.getKey(), entry.getValue()));
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : submissions.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());

        }

    }
}
