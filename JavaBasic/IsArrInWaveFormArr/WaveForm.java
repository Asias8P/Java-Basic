import java.util.Scanner;

public class WaveForm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] strArr = in.nextLine().split(" ");
      int[] numArr = new int[strArr.length];
        boolean isSym=true;

        for (int i = 0; i < numArr.length-1; i++) {
         int evenElement= Integer.parseInt(strArr[i]);
       //numArr[i]=evenElement;
           int notEvenElement= Integer.parseInt(strArr[i+1]);
//           numArr[i+1]=notEvenElement;
//           numArr[i] = Integer.parseInt(strArr[i]);
//         numArr[i+1]=Integer.parseInt(strArr[i]);
             if (i % 2 ==0){
            if(evenElement<notEvenElement){
                isSym=false;
                break;
            }}
           else
             {if (evenElement>notEvenElement){
               isSym=true ;
               break;
            }}
        }

         if (isSym){
        System.out.println("yess");}
         else
         {
             System.out.println("NO");
         }


//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        String [] arrayNum = input.split(" ");
//        boolean isWave = true;
//
//        for (int i = 0;i < arrayNum.length -1; i++){
//            int current = Integer.parseInt(arrayNum[i]);
//            int next = Integer.parseInt(arrayNum[i +1]);
//            if (i % 2 == 0 ){
//                if (next > current){
//                    isWave = false;
//                    break;
//                }
//            }else {
//                if (current > next){
//                    isWave = true;
//                    break;
//                }
//            }
//        }
//        if (isWave){
//            System.out.println("Yes");
//
//        }else {
//            System.out.println("No");
//        }
//
//



    }}




