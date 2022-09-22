package objectAndClasses.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class randomizeWords {
    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    List <String> text = Arrays.stream(in.nextLine().split(" "))
            .collect(Collectors.toList());
    Random rnd=new Random();
    int size = text.size();


    for(int i = 0; i< size;i++){
        int randomWord = rnd.nextInt(text.size());
        System.out.println(text.get(randomWord));
        text.remove(randomWord);

    }


}
}