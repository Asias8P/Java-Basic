package MapsLambdaAndStreamApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MoreExercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input= in.nextLine();
        Map<String,String> map= new LinkedHashMap<>();
        String contest = "";
        String pass = "";

        while (!input.equals("end of contests")){
            String [] conttestInfo = input.split(":");

         //  "{contest}:{password for contest}"
            contest = conttestInfo[0];
            pass = conttestInfo[1];
            if(!map.containsKey(contest)){
                map.put(contest,pass);
            }


            input= in.nextLine();

        }

        input= in.nextLine();
        //"{contest}=>{password}=>{username}=>{points}"
        Map<String,Integer>userNamePoints=new TreeMap<>();
        Map<String,Integer>UsernameContest=new TreeMap<>();
        while (!input.equals("end of submissions")){

            String []submissions = input.split("=>");
            String cont= submissions[0];
            String password= submissions[1];
            String userName= submissions[2];
            int points=Integer.parseInt(submissions[3]);

            if(cont.equals(map.containsKey(cont)) && password.equals(map.get(cont))){
                userNamePoints.put(userName,points);
            }
            in.nextLine();
        }

    }
}
