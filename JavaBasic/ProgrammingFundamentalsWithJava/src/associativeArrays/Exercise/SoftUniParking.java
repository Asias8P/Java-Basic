package associativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= Integer.parseInt(in.nextLine());

        Map<String,String>mapRegister=new LinkedHashMap<>();

        Map<String,String>mapUnregister=new LinkedHashMap<>();

        for (int i = 0; i <n ; i++) {
            String input= in.nextLine();
            String command = input.split(" ")[0];
            String name = input.split(" ")[1];


            if(command.equals("register")){
                String licensePlateNum = input.split(" ")[2];
                if(!mapRegister.containsKey(name)){
                    mapRegister.put(name,licensePlateNum);
                    System.out.printf("%s registered %s successfully%n",name,licensePlateNum);
                }
                else {
                    System.out.printf("ERROR: already registered with plate number %s%n",mapRegister.get(name));
                }
            }

            else if(command.equals("unregister")){

                if(!mapRegister.containsKey(name)){
                    System.out.printf("ERROR: user %s not found%n",name);
                }
                else {
                    System.out.printf("%s unregistered successfully%n",name);
                    mapRegister.remove(name,mapRegister.get(name));
                }

            }

        }

        mapRegister.entrySet().forEach(entry-> System.out.printf("%s => %s%n",entry.getKey(),entry.getValue()));
    }
}
