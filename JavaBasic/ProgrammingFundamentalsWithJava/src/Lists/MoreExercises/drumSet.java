package Lists.MoreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class drumSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double savings = Double.parseDouble(in.nextLine());
        List<Integer>drumSet = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> drumsCopy = new ArrayList<>(drumSet);

        int currentEl=0;

        String command = in.nextLine();
out:
        while (!command.equals("Hit it again, Gabsy!")){
            int hitPower = Integer.parseInt(command);

            for (int i = 0; i < drumSet.size(); i++) {
                currentEl=drumSet.get(i)-hitPower;
                drumSet.set(i,currentEl);
                if(currentEl<=0){
                    if(savings>=drumsCopy.get(i)*3){
                        drumSet.set(i,drumsCopy.get(i));
                        savings=savings-drumsCopy.get(i)*3;
                    }
                    else {
                        drumSet.remove(i);
                        drumsCopy.remove(i);
                        if(i!=drumSet.size()-1){
                        i--;}
                        if(drumSet.size()==0){
                            break out;
                        }
                    }
                }
            }



            command=in.nextLine();
        }

 if(drumSet.isEmpty()){
     System.out.print("0");
 }

        System.out.println(drumSet.toString().replaceAll("[\\[\\],]",""));
        System.out.printf("Gabsy has %.2flv.",savings);
    }
}
