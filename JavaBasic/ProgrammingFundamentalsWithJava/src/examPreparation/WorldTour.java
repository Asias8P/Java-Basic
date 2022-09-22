package examPreparation;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stops = in.nextLine();
        StringBuilder stopsBuilder = new StringBuilder(stops);
        String commands = in.nextLine();

        while (!commands.equals("Travel")){
            //"Add Stop:{index}:{string}":
            if(commands.contains("Add Stop")){
            int index =Integer.parseInt(commands.split(":")[1]);
            String newStop = commands.split(":")[2];
            if(isIndexValid(index,stopsBuilder)){
                stopsBuilder.insert(index,newStop);
            }}

            //"Remove Stop:{start_index}:{end_index}":
            else if(commands.contains("Remove Stop")){
                int startIndex =Integer.parseInt(commands.split(":")[1]);
                int endIndex =Integer.parseInt(commands.split(":")[2]);
                if(isIndexValid(startIndex,stopsBuilder) && isIndexValid(endIndex,stopsBuilder)){
                   stopsBuilder.delete(startIndex,endIndex+1);
                }
            }
            //"Switch:{old_string}:{new_string}":
            else if(commands.contains("Switch")){
                String oldString = commands.split(":")[1];
                String newString = commands.split(":")[2];
                String newStopBuilder=stopsBuilder.toString();
                if(stops.contains(oldString)){
                   newStopBuilder=newStopBuilder.replace(oldString,newString);
                   stopsBuilder= new StringBuilder(newStopBuilder);
                }

            }


            System.out.println(stopsBuilder);


            commands= in.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",stopsBuilder.toString());
    }
   public static boolean isIndexValid(int index, StringBuilder builder){
        return index>=0 && index<builder.length();
   }

}
