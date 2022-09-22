package objectAndClasses.Exercise;

import java.util.*;

public class advertisementMessage {

    static class Message {
        String phrase;
        String event;
        String author;
        String city;

        public Message(String phrase,String event,String author,String city){
            this.phrase=phrase;
            this.event=event;
            this.author=author;
            this.city=city;
        }

        public String toString(){
            return String.format(this.phrase +" "+ this.event +" "+ this.author +" "+"-"+" " +this.city);
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numMessages = Integer.parseInt(in.nextLine());


        List<String> phrases=new ArrayList<>(Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."));
        List<String> events=new ArrayList<>(Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"));
        List<String> authors=new ArrayList<>(Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"));
        List<String> cities=new ArrayList<>(Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));

        Random ph = new Random();
        Random ev = new Random();
        Random au = new Random();
        Random ci = new Random();


        for (int i = 0; i <numMessages ; i++) {
            String phraseElement = phrases.get(ph.nextInt(6));
            String eventElement = events.get(ev.nextInt(6));
            String authorElement = authors.get(au.nextInt(8));
            String ciElement = cities.get(ci.nextInt(5));

            Message message= new Message(phraseElement,eventElement,authorElement,ciElement);

            System.out.println(message.toString());

            
        }



    }

}
