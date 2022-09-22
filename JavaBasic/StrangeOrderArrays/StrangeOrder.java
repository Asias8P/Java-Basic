import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class StrangeOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strArr = in.nextLine().split(",");

        String negatives="";
        String zero = "";
        String positives="";

        for (int i =0; i< strArr.length;i++){

            if (strArr[i].startsWith("-")){

                negatives=strArr[i];
             System.out.print(negatives+",");

            }

            }
        for(int j = 0;j<strArr.length;j++){
            if(strArr[j].equals("0")){
                zero=strArr[j];
                System.out.print(zero+",");
        }


    }

         StringBuilder pos = new StringBuilder();
       for(int k = 0;k<strArr.length;k++){
            if(strArr[k].startsWith("1") || strArr[k].startsWith("2") || strArr[k].startsWith("3")|| strArr[k].startsWith("4")||
                    strArr[k].startsWith("5")|| strArr[k].startsWith("6")|| strArr[k].startsWith("7")||
                    strArr[k].startsWith("8")|| strArr[k].startsWith("9")) {
                pos = pos.append(strArr[k]);
                pos = pos.append(",");





            }


}
        System.out.print(pos.substring(0,pos.length()-1));
    }

}
