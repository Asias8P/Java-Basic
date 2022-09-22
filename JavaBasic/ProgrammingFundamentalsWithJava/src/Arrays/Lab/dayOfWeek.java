package Arrays.Lab;

import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] arr = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if(n>=1 && n<=7){
            System.out.println(arr[n-1]);
        }
        else {
            System.out.println("Invalid day!");
        }
    }
}
