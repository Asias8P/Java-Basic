import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strArr = in.nextLine().split(",");
        int[] numArr = new int[strArr.length];
           StringBuilder newArr = new StringBuilder();

        String  missing ="";
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);


        }
//        Arrays.sort(numArr);
//        for (int i = 0; i <=numArr.length-1; i++) {}
//
//            System.out.print(Arrays.toString(numArr));
//
//
//        System.out.println();
//        for (int i = 0; i <=numArr.length-1; i++) {
//            if (numArr[i]!=i+1){
//                newArr=newArr.append(i+1);
//                newArr=newArr.append(",");
//            }
//        }
//
//        System.out.println(newArr.substring(0,newArr.length()-1));

                     for (int currenti=1; currenti<=numArr.length;currenti++){
                         boolean isFound=false;


        for (int element:numArr) {

            if(currenti==element){
                isFound=true;}}


        if (!isFound){
            if(missing.length()>0){
             missing+= ",";
            }

            missing+=currenti;
        }
           }

        System.out.print(missing);
        //System.out.println(newArr.substring(0,newArr.length()-1));
        }}


