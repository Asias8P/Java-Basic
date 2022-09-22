import java.util.Scanner;

public class MergingAndSquashingStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        String[]arr = new String[num];
        String[] merge = new String [num-1];
        String[] squash = new  String[num-1];


        for (int i = 0; i<arr.length;i++) {
            arr[i] = in.nextLine();
        }

        for (int j=0;j<arr.length-1;j++){
            String[]curr = arr[j].split("");
            String[]next = arr[j+1].split("");

            String a=curr[0];
            String b=curr[1];
            String c= next[0];
            String d= next[1];



            int sumBC = Integer.parseInt(b)+Integer.parseInt(c);
            if(sumBC>=10){
                sumBC= sumBC % 10;
            }
            merge[j]=b+c;
            squash[j]=a+sumBC+b;
        }
        System.out.println(String.join(" ",merge));
        System.out.println(String.join(" ",squash));
    }
}
