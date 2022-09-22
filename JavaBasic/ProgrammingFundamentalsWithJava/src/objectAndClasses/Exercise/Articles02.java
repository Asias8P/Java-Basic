package objectAndClasses.Exercise;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles02 {
    static class Article {
        private String title;
        private String content;
        private String author;


        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }

        public String toString() {

            //Science - planets: Bill
            return getTitle() + " " + "-"+ getContent() + ":"+ getAuthor();

        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        List<Article> art = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String input = in.nextLine();
            // ("{title}, {content}, {author}").
            String title = input.split(",")[0];
            String content = input.split(",")[1];
            String author = input.split(",")[2];

            Article article = new Article(title, content, author);
            art.add(article);

        }

        String someWord = in.nextLine();

//this.title+" "+"-"+" "+this.content+":"+" "+this.author;

        if(someWord.equals("title") || someWord.equals("content")||someWord.equals("author")){
        for (Article arti : art) {
            System.out.println(arti.toString());}

        }

    }
}
