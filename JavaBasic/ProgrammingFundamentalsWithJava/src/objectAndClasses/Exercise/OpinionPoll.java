package objectAndClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    static class People {
        private String name;
        private int age;


        public People(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
List<People> listOfPeople=new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            String input = in.nextLine();
            String name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);
            if (age > 30) {
                People people = new People(name, age);
                listOfPeople.add(people);
            }
        }

        for (People people:listOfPeople) {
            System.out.println(people.getName()+" "+"-"+" "+people.getAge());
        }
    }}
