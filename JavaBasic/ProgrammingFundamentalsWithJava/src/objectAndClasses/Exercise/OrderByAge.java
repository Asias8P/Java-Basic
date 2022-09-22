package objectAndClasses.Exercise;

import java.util.*;

public class OrderByAge {
     static class Person{
    private String name;
    private String id;
    private int age;


    public Person(String name,String id,int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }

         public String getName() {
             return name;
         }

         public String getId() {
             return id;
         }

         public int getAge() {
             return age;
         }
     }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        List<Person>listOfPersons=new ArrayList<>();

        while (!input.equals("End")){

            String name = input.split(" ")[0];
            String id = input.split(" ")[1];
            int age =Integer.parseInt(input.split(" ")[2]);
            Person person = new Person(name,id,age);
            listOfPersons.add(person);
            input= in.nextLine();
        }
        listOfPersons.sort(Comparator.comparing(Person::getAge));
        //Stephan with ID: 524244 is 10 years old.

        for (Person p:listOfPersons) {
            System.out.println(p.getName()+" with ID: "+p.getId()+" is "+p.getAge()+" years old.");
        }

    }
}
