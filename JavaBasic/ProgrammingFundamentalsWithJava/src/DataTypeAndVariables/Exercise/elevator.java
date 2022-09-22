package DataTypeAndVariables.Exercise;

import java.util.Scanner;

public class elevator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(in.nextLine());//n
        int capacity = Integer.parseInt(in.nextLine());//p
        int courses = numOfPeople / capacity;
        int remain = numOfPeople % capacity;
        if (numOfPeople <= capacity) {
           // System.out.println("All the persons fit inside in the elevator.Only one course is needed.");
            System.out.println("1");
        } else {
            if (remain > 0 && remain <= capacity) {
                ;
               // System.out.printf("%d courses * %d people%n + 1 course * %d persons", courses, capacity, remain);
                System.out.println(courses+1);
            } else {
                System.out.println(courses);
                //System.out.printf("%d courses * %d people%n", courses, capacity);
            }
        }


    }
}
