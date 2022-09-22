import java.util.Scanner;

public class specialLanguage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[]strArr = in.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for( int i=0; i< strArr.length;i++){
            strArr[i]= in.nextLine();
            if ((strArr[i].startsWith("a"))||(strArr[i].startsWith("i"))||(strArr[i].startsWith("o"))
                    ||(strArr[i].startsWith("u"))||(strArr[i].startsWith("A"))||(strArr[i].startsWith("E"))
                    ||(strArr[i].startsWith("I"))||(strArr[i].startsWith("O"))||(strArr[i].startsWith("U"))){
                sb=sb.append()
            }
        }
    }
}
