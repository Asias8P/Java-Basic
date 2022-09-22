package Lists.MoreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        List<Integer> listOfNum1= Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> listOfNum2= Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer>mixedList=new ArrayList<>();

        int size1= listOfNum1.size();
        int size2= listOfNum2.size();

        int smallerSize=Math.min(size1,size2);
        int biggerSize=Math.max(size1,size2);


        for (int i = 0; i < smallerSize; i++) {
            mixedList.add(listOfNum1.get(i));
            mixedList.add(listOfNum2.get(listOfNum2.size()-1-i));

        }
        List<Integer>resultList=new ArrayList<>();
        int startRange=0;
        int endRange=0;

if(listOfNum1.size()==biggerSize){
    int lastElement1=listOfNum1.get(listOfNum1.size()-1);
    int preLastElement1=listOfNum1.get(listOfNum1.size()-2);
    int smallerEl=Math.min(lastElement1,preLastElement1);
    int biggerEl=Math.max(lastElement1,preLastElement1);
    startRange=smallerEl;
    endRange=biggerEl;
}
else {{
        int lastElement2=listOfNum2.get(0);
        int preLastElement2=listOfNum2.get(1);
        int smallerEl=Math.min(lastElement2,preLastElement2);
        int biggerEl=Math.max(lastElement2,preLastElement2);
        startRange=smallerEl;
        endRange=biggerEl;
    }
}
        for (int i = 0; i < mixedList.size() ; i++) {
            if(mixedList.get(i)>startRange && mixedList.get(i)<endRange){
                resultList.add(mixedList.get(i));
            }



        }

        Collections.sort(resultList);

        for (int k = 0; k < resultList.size(); k++) {

            System.out.print(resultList.get(k) +" ");
        }

    }
}
