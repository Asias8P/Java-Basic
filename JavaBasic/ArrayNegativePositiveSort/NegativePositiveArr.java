import java.util.Scanner;

public class NegativePositiveArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      String[]arr = input.nextLine().split(" ");
        String [] arrFinal = new String[arr.length];
        int j = 0;

        for (int i=0;i<arr.length;i++) {
            int num = Integer.parseInt(arr[i]);


            if (num < 0){
                arrFinal[j]=arr[i];
                j++;
            }

            }

        for (int k= 0;k<arr.length;k++){
            int num = Integer.parseInt(arr[k]);

            if(num > 0){
                arrFinal[j]= arr[k];
                j++;
            }

        }

        String join = String.join(" ",arrFinal);
        System.out.println(join);

    }
}
