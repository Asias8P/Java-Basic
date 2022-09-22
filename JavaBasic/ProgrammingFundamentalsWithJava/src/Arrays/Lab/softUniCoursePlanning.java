package Arrays.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class softUniCoursePlanning {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> listLessons = Arrays.stream(in.nextLine().split(", ")).collect(Collectors.toList());

        String command = in.nextLine();
        while (!command.equals("course start")) {
            String firstCommand = command.split(":")[0];
            String secondCommand = command.split(":")[1];

            switch (firstCommand) {
//int lesson1Index = schedule.indexOf(lessonTitle);
                case "Add":
                    if (!isLessonExist(listLessons, secondCommand)) {
                        listLessons.add(secondCommand);
                    }

                    break;

                case "Insert":
                    int thirdCommandInsert = Integer.parseInt(command.split(":")[2]);
                    if (!isLessonExist(listLessons, secondCommand)) {
                        listLessons.add(thirdCommandInsert, secondCommand);
                    }
                    break;

                case "Remove":
                    if (isLessonExist(listLessons, secondCommand)) {
                        listLessons.remove(secondCommand);}

                    String removeExercise = secondCommand+"-Exercise";

                        if(listLessons.get(indexOfLessenEl(listLessons,secondCommand)).equals(removeExercise)){
                            listLessons.remove(indexOfLessenEl(listLessons,secondCommand)+1);
                    }

                    break;

                case "Swap":
                    String thirdCommandSwap = command.split(":")[2];
                    int indexSecondCommand = 0;
                    int indexThirdCommand = 0;
                    String secondElement = "";
                    String thirdElement = "";
                    if (isLessonExist(listLessons, secondCommand) && isLessonExist(listLessons, thirdCommandSwap)) {

                        for (int i = 0; i < listLessons.size(); i++) {
                            if (listLessons.get(i).equals(secondCommand)) {
                                indexSecondCommand = i;
                                secondElement = listLessons.get(i);

                            }
                            if (listLessons.get(i).equals(thirdCommandSwap)) {
                                indexThirdCommand = i;
                                thirdElement = listLessons.get(i);
                            }
                        }
                        listLessons.set(indexSecondCommand, thirdElement);
                        int sec= indexSecondCommand;
                        listLessons.set(indexThirdCommand, secondElement);
                    }
                    String secondExercise=secondCommand+"-Exercise";
                    String thirdExercise=thirdCommandSwap+"-Exercise";
                    if(listLessons.contains(secondExercise)){
                    for (int i = 0; i < listLessons.size() ; i++) {
                        if (listLessons.get(i).equals(secondExercise)) {
                            listLessons.remove(i);
                            listLessons.add(indexOfLessenEl(listLessons,secondCommand) + 1, secondExercise);
                            break;
                        }
                    }}

                    if(listLessons.contains(thirdExercise)){
                        for (int i = 0; i < listLessons.size() ; i++) {
                            if (listLessons.get(i).equals(thirdExercise)) {
                                listLessons.remove(i);
                                listLessons.add(indexOfLessenEl(listLessons,thirdElement) + 1, thirdExercise);

                                break;
                            }
                        }}
                    break;

                case "Exercise":

                    if (isLessonExist(listLessons, secondCommand)) {

                         if(IsExerciseExist(listLessons,secondCommand+"-Exercise")){
                            break;
                        } else {
                            listLessons.add(indexOfLessenEl(listLessons,secondCommand)+ 1, secondCommand + "-Exercise");
                        }
                    } else {
                        listLessons.add(secondCommand);
                        listLessons.add(secondCommand + "-Exercise");

                    }
                    break;
            }


            command = in.nextLine();
        }
         int k=1;
        for (int i = 0; i < listLessons.size() ; i++) {
            System.out.println(k+"."+ listLessons.get(i));
            k++;

        }
    }

    public static boolean isLessonExist(List<String> lessons, String secCommand) {
        return lessons.contains(secCommand);
    }

    public static boolean IsExerciseExist(List<String> courseList, String exercise) {
            return courseList.contains(exercise);
    }

    public static int indexOfLessenEl(List<String>lessons,String element){
        int index=0;
        for (int i = 0; i <lessons.size() ; i++) {
            if(lessons.get(i).equals(element)){
                index=i;
            }

        }
        return index;
    }
}
