package textProcessing.MoreExercise;

import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String title = in.nextLine();
        String content = in.nextLine();
        StringBuilder resultComments = new StringBuilder();
        String comments = in.nextLine();
        while (!comments.equals("end of comments")) {

            String result = String.format("<div>%n   %s%n</div>%n", comments);
            resultComments.append(result);
            comments = in.nextLine();
        }
        System.out.printf("<h1>%n   %s%n</h1>%n", title);
        System.out.printf("<article>%n   %s%n</article>%n", content);
        System.out.println(resultComments);
    }
}
