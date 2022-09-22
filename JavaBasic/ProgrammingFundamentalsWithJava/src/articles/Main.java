package articles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Articles>listArticles=new ArrayList<>();

        String input = in.nextLine();

        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];

        Articles article = new Articles(title,content,author);

        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <=n ; i++) {
            String command= in.nextLine();

            String command1 = command.split("\\: ")[0];
            String newItem = command.split("\\: ")[1];

            if(command1.equals("Edit")){
              article.edit(newItem);
            }
            else if(command1.equals("ChangeAuthor")){
                article.changeAuthor(newItem);
            }
            else if(command1.equals("Rename")){
                article.renameTitle(newItem);
            }


            listArticles.add(article);


        }


            System.out.println(article.toString());

    }
}
