import java.util.Scanner;

public class MaxIncreasingSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[]strArr= in.nextLine().split(" ");
        int [] numArr = new int [strArr.length];
        int sequence=1;
        int maxSequence = 0;
       String result = " ";
       String currentResult=" ";
       StringBuilder sb = new StringBuilder();
        for (int i=0; i<numArr.length;i++){
            numArr[i]=Integer.parseInt(strArr[i]);
        }
        for (int i=0; i<numArr.length-1;i++){
            if (numArr[i]+1==(numArr[i+1])){
                currentResult += numArr[i];

                sequence++;

                if (i== numArr.length-2 && sequence>=maxSequence){
                    maxSequence=sequence;
                    result=currentResult+numArr[i+1];
                }}
                else {
                    if(sequence>=maxSequence){
                        maxSequence=sequence;
                        result=currentResult+numArr[i];
                    }
                      sequence=1;
                    currentResult=" ";
                }

            }

            System.out.println(result.trim());

    }
}
