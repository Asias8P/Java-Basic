package examPreparation;

import java.util.Scanner;

public class ActivationKey2 {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);

                String activationKey = in.nextLine();
                String command = in.nextLine();
                StringBuilder key = new StringBuilder(activationKey);

                while (!command.equals("Generate")) {

                    if (command.contains("Contains")) {
                        //"Contains>>>{substring}"
                        String substring = command.split(">>>")[1];
                        if (key.toString().contains(substring)) {
                            System.out.printf("%s contains %s%n", key, substring);
                        } else {
                            System.out.println("Substring not found!");
                        }
                    }
                    //"Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
                    else if (command.contains("Flip")) {
                        String upperLower = command.split(">>>")[1];
                        int startIndex = Integer.parseInt(command.split(">>>")[2]);
                        int endIndex = Integer.parseInt(command.split(">>>")[3]);

                            if (upperLower.equals("Lower")) {
                                String toLower = key.substring(startIndex, endIndex).toLowerCase();
                                key.replace(startIndex, endIndex, toLower);

                            } else if (upperLower.equals("Upper")) {
                                String toUpper = key.substring(startIndex, endIndex).toUpperCase();
                                key.replace(startIndex, endIndex, toUpper);

                            }
                        System.out.println(key);
                    }
                        //"Slice>>>{startIndex}>>>{endIndex}":
                    else if (command.contains("Slice")) {
                        int startIndex = Integer.parseInt(command.split(">>>")[1]);
                        int endIndex = Integer.parseInt(command.split(">>>")[2]);
                            key.delete(startIndex, endIndex);
                            System.out.println(key);


                    }

                    command = in.nextLine();
                }
                System.out.printf("Your activation key is: %s%n",key);
            }

        }


