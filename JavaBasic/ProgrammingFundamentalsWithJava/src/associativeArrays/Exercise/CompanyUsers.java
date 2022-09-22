package associativeArrays.Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Map<String, List<String>>mapCompanyEmpl = new LinkedHashMap<>();

        while (!input.equals("End")){
            String company= input.split(" -> ")[0];
            String employee= input.split(" -> ")[1];


            if(!mapCompanyEmpl.containsKey(company)){
                mapCompanyEmpl.put(company,new ArrayList<>());
                mapCompanyEmpl.get(company).add(employee);
            }

            else {
                boolean isExist=false;
                for (Map.Entry<String, List<String>> entry : mapCompanyEmpl.entrySet()) {
                   List<String>idEmpl = entry.getValue();
                    for (String id:idEmpl) {
                        if(id.equals(employee)){
                            isExist=true;
                            break;
                        }
                    }
                    if(isExist){
                        break;
                    }
                }

               if(!isExist){
                   mapCompanyEmpl.get(company).add(employee);
               }
            }

input=in.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : mapCompanyEmpl.entrySet()) {
            System.out.printf("%s%n",entry.getKey());
            entry.getValue().forEach(item-> System.out.printf("-- %s%n",item));
        }

    }


}
