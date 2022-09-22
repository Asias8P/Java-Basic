package Methods.Exercise.arr;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class manipulator_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numberArr = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = in.nextLine();


        while (!input.equals("end")) {
            String[] command = input.split(" ");
            String firstEl = command[0];

            switch (firstEl) {

                case "exchange":
                    int secondEl=Integer.parseInt(command[1]);
                    if (!isOutsideThebouderies(secondEl, numberArr.length)) {
                        System.out.println("Invalid index");
                        break;

                    } else {
                        numberArr = exchangeIndex(numberArr, secondEl);
                    }
                    break;
                case "max":
                    String secondElement = command[1];
                    if (secondElement.equals("even")) {
                        int maxEven = Integer.MIN_VALUE;
                        maxEvenIndex(numberArr, maxEven);
                    } else if (secondElement.equals("odd")) {
                        int maxOdd = Integer.MIN_VALUE;
                        maxOddIndex(numberArr, maxOdd);
                    }
                    break;
                case "min":
                 secondElement = command[1];
                    if (secondElement.equals("even")) {
                        int minEven = Integer.MAX_VALUE;
                        minEvenIndex(numberArr, minEven);
                    } else if (secondElement.equals("odd")) {
                        int minOdd = Integer.MAX_VALUE;
                        minOddIndex(numberArr, minOdd);
                    }

                    break;
                case "first":
                    secondEl=Integer.parseInt(command[1]);
                   if (isCounterGreaterThanTheArrLength(numberArr.length,secondEl)){
                       System.out.println("Invalid count");
                       break;
                   }

                    String thirdEl = command[2];
                    if (thirdEl.equals("even")) {
                        firstCountEven(numberArr, secondEl);
                    }
                   else if(thirdEl.equals("odd")) {
                        firstCountOdd(numberArr, secondEl);
                    }

                    break;
                case "last":
                    secondEl=Integer.parseInt(command[1]);
                    if(isCounterGreaterThanTheArrLength(numberArr.length,secondEl)){
                        System.out.println("Invalid count");
                        break;
                    }
                    String thirdElLast= command[2];
                    if(thirdElLast.equals("even")){
                        lastCountEven(numberArr,secondEl);
                    }
                    else if(thirdElLast.equals("odd")){
                        lastCountOdd(numberArr,secondEl);
                    }
                    break;

            }
            input = in.nextLine();

        }
        System.out.println(Arrays.toString(numberArr));

    }

    private static boolean isCounterGreaterThanTheArrLength( int length, int secondEl) {
        return secondEl>length;
    }

    private static void reversedArr(int [] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }

    private static void lastCountOdd(int[] numberArr, int secondEl) {
        int count = secondEl;
        int[]lastOddArr= new int[count];
        int j = 0;
        for (int i = numberArr.length-1; i >=0 ; i--) {
            if(numberArr[i] % 2!=0){
                secondEl--;
                lastOddArr[j]=numberArr[i];
                j++;
            }
            if(secondEl==0){
                break;
            }

        }
        if (secondEl > 0 && secondEl < count) {
            int[] notEnoughEls = new int[count-secondEl];
            for (int i = 0; i < notEnoughEls.length; i++) {
                notEnoughEls[i] = lastOddArr[i];
            }
            reversedArr(notEnoughEls);
        }
        else if (secondEl == count) {
            lastOddArr = new int[0];
            System.out.println(Arrays.toString(lastOddArr));
        }
        else {
       reversedArr(lastOddArr);
        }

    }


    private static void lastCountEven(int[] numberArr, int secondEl) {

        int count = secondEl;
        int[] lastEvenArr = new int[count];
        int j = 0;
        for (int i = numberArr.length - 1; i >= 0; i--) {
            if (numberArr[i] % 2 == 0) {
                secondEl--;
                lastEvenArr[j] = numberArr[i];
                j++;
            }
            if (secondEl == 0) {
                break;
            }

        }
        if (secondEl > 0 && secondEl < count) {
            int[] notEnoughEls = new int[count-secondEl];
            for (int i = 0; i < notEnoughEls.length; i++) {
                notEnoughEls[i] = lastEvenArr[i];
            }
            reversedArr(notEnoughEls);
        }
        else if (secondEl == count) {
            lastEvenArr = new int[0];
            System.out.println(Arrays.toString(lastEvenArr));
        }
        else {
            reversedArr(lastEvenArr);
        }
    }


    private static void firstCountOdd(int[] numberArr, int secondEl) {
        int count = secondEl;
        int[]firstOdd= new int[count];

        int j=0;
        for (int i = 0; i < numberArr.length; i++) {
            if(numberArr[i] % 2!=0){
                secondEl--;
                firstOdd[j]=numberArr[i];
                j++;
            }
            if(secondEl==0){
                break;
            }

        }
        if(secondEl>0 && secondEl < count){
            int [] notEnoughEls=new int [count-secondEl];
            for (int i = 0; i < notEnoughEls.length; i++) {
               notEnoughEls[i]= firstOdd[i];
            }
            System.out.println(Arrays.toString(notEnoughEls));
        }
        else if(secondEl==count){
            firstOdd=new int[0];
            System.out.println(Arrays.toString(firstOdd));
        }
        else {
        System.out.println(Arrays.toString(firstOdd));}
    }

    private static void firstCountEven(int[] numberArr, int secondEl) {

        int count = secondEl;
        int[] firstEven = new int[count];
        int j = 0;
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] % 2 == 0) {
                secondEl--;
                firstEven[j] = numberArr[i];
                j++;
                if (secondEl == 0) {
                    break;
                }
            }

        }
        if (secondEl > 0 && secondEl < count) {
            int[] notEnoughEls = new int[count-secondEl];
            for (int i = 0; i < notEnoughEls.length; i++) {
                notEnoughEls[i] = firstEven[i];
            }
            System.out.println(Arrays.toString(notEnoughEls));

        } else if (secondEl == count) {
            firstEven = new int[0];
            System.out.println(Arrays.toString(firstEven));
        } else {
            System.out.println(Arrays.toString(firstEven));
        }
    }

    private static void minOddIndex(int[] numberArr, int minOdd) {
        int minOddIndex = -1;
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] % 2 != 0 && numberArr[i] <= minOdd) {
                minOdd = numberArr[i];
                minOddIndex = i;
            }}
            if (minOddIndex == -1) {
                System.out.println("No matches");
            } else {
                System.out.println(minOddIndex);
            }


    }

    private static void minEvenIndex(int[] numberArr, int minEven) {
        int mindEvenIndex = -1;
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] % 2 == 0 && numberArr[i] <= minEven) {
                minEven = numberArr[i];
                mindEvenIndex = i;
            }}
            if (mindEvenIndex == -1) {
                System.out.println("No matches");
            } else {
                System.out.println(mindEvenIndex);
            }


    }

    private static void maxOddIndex(int[] numberArr, int maxOdd) {
        int maxOddIndex = -1;
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] % 2 != 0 && numberArr[i] >= maxOdd) {
                maxOdd = numberArr[i];
                maxOddIndex = i;
            }}
            if (maxOddIndex == -1) {
                System.out.println("No matches");
            } else {
                System.out.println(maxOddIndex);
            }


    }


    private static void maxEvenIndex(int[] numberArr, int maxEven) {
        int maxEvenIndex = -1;
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] % 2 == 0 && numberArr[i] >= maxEven) {
                maxEven = numberArr[i];
                maxEvenIndex = i;
            }}
            if (maxEvenIndex == -1) {
                System.out.println("No matches");
            } else {
                System.out.println(maxEvenIndex);
            }


    }

    private static int[] exchangeIndex(int[] numberArr, int secondEl) {
        int[] arrToSecElement = new int[secondEl + 1];
        int[] arrAfterSecElement = new int[numberArr.length - arrToSecElement.length];
        int[] exchangedArr = new int[numberArr.length];

        for (int i = 0; i < arrToSecElement.length; i++) {
            arrToSecElement[i] = numberArr[i];
        }

        for (int i = 0; i < arrAfterSecElement.length; i++) {
            arrAfterSecElement[i] = numberArr[secondEl + 1 + i];
        }

        for (int i = 0; i < arrAfterSecElement.length; i++) {
            exchangedArr[i] = arrAfterSecElement[i];

        }

        for (int i = arrAfterSecElement.length; i < exchangedArr.length; i++) {
            exchangedArr[i] = arrToSecElement[i - arrAfterSecElement.length];
        }
        return exchangedArr;
    }

    private static boolean isOutsideThebouderies(int secondEl, int length) {
        return secondEl <= length;
    }
}
