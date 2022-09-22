import java.util.Scanner;

public class Genetics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[]strArr1 = in.nextLine().split("");
        String[]strArr2 = in.nextLine().split("");


        int [] parent1 = new int[strArr1.length];
        int []parent2= new int[strArr2.length];
        for(int i=0;i<strArr1.length;i++){
            parent1[i]=Integer.parseInt(strArr1[i]);}
        for(int k=0;k<strArr2.length;k++){
            parent2[k]=Integer.parseInt(strArr2[k]);
        }
        int splitPoing=Integer.parseInt(in.nextLine());
        int temp1[]=new int[parent1.length];
        int temp2[]=new int[parent2.length];
        temp1=parent1.clone();
        temp2=parent2.clone();


        for (int j=0;j<=splitPoing-1;j++){
          parent1[j]=parent2[j];

        }

        for (int e=0;e<=splitPoing-1;e++){
            temp2[e]=temp1[e];
        }

        for(int p = 0; p<parent1.length;p++){
            System.out.print(parent1[p]);

        }
        System.out.println();

        for(int p = 0; p<parent1.length;p++){
        System.out.print(parent2[p]);
    }
}}
