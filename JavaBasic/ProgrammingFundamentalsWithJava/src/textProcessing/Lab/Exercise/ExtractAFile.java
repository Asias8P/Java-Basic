package textProcessing.Lab.Exercise;

import java.util.Scanner;

public class ExtractAFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String [] input = in.nextLine().split("[\\\\ .]+");
//
//       String fileName = input[input.length-2];
//       String fileExtenssion = input[input.length-1];
//        System.out.printf("File name: %s%n",fileName);
//        System.out.printf("File extension: %s",fileExtenssion);

        String input = in.nextLine();
        int newIn = input.lastIndexOf("\\");
        String nameExt=input.substring(newIn+1);
        String [] arrNameExt=nameExt.split("\\.");
        String name = arrNameExt[0];
        String ext = arrNameExt[1];

        System.out.printf("File name: %s%n",name);
       System.out.printf("File extension: %s",ext);
    }
}
