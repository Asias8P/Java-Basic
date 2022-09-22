//package Methods.Exercise;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class arrayManipulator {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int[] numberArr = Arrays
//                .stream(in.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//        int[] newArr = new int[numberArr.length];
//        String[] command = in.nextLine().split(" ");
//        String firstEl = command[0];
//        String secondEl = command[1];
//        String thirdEl = command[2];
//        int maxOddIndex = Integer.MIN_VALUE;
//        int maxEvenIndex = Integer.MIN_VALUE;
//        int maxEvenI = 0;
//        int maxOddI = 0;
//
//        int minOddIndex = Integer.MAX_VALUE;
//        int minEvenIndex = Integer.MAX_VALUE;
//        int minEvenI = 0;
//        int minOddI = 0;
//
//        while (!firstEl.equals("end")) {
//
//exchangeIndex(String[]command,)
//
//            if (firstEl.equals("max") && secondEl.equals("even")) {
//                maxEvenIn(int [] numberArr);
//            }
//
//
//
//            if (firstEl.equals("max") && secondEl.equals("odd")) {
//                boolean isAnyOddEl = false;
//                for (int i = 0; i < numberArr.length; i++) {
//                    if (numberArr[i] % 2 != 0) {
//                        isAnyOddEl = true;
//                        if (numberArr[i] >= maxOddIndex) {
//                            maxOddIndex = numberArr[i];
//                            maxOddI = i;
//                        }
//
//                    }
//                }
//                if (isAnyOddEl) {
//                    System.out.println(maxOddI);
//                } else {
//                    System.out.println("No matches");
//                }
//            }
//
//            if (firstEl.equals("min") && secondEl.equals("even")) {
//                boolean isAnyEvenEl = false;
//                for (int i = 0; i < numberArr.length; i++) {
//                    if (numberArr[i] % 2 == 0) {
//                        isAnyEvenEl = true;
//                        if (numberArr[i] <= minEvenIndex) {
//                            minEvenIndex = numberArr[i];
//                            minEvenI = i;
//                        }
//
//                    }
//                }
//                if (isAnyEvenEl) {
//                    System.out.println(minEvenI);
//                } else {
//                    System.out.println("No matches");
//                }
//            }
//
//
//            if (firstEl.equals("min") && secondEl.equals("odd")) {
//                boolean isAnyOddEl = false;
//                for (int i = 0; i < numberArr.length; i++) {
//                    if (numberArr[i] % 2 != 0) {
//                        isAnyOddEl = true;
//                        if (numberArr[i] <= minOddIndex) {
//                            minOddIndex = numberArr[i];
//                            minEvenI = i;
//                        }
//
//                    }
//                }
//                if (isAnyOddEl) {
//                    System.out.println(minOddI);
//                } else {
//                    System.out.println("No matches");
//                }
//            }
//
//            if (firstEl.equals("first") && thirdEl.equals("even")) {
//                int counterFirstEven = 0;
//                if (Integer.parseInt(secondEl) > numberArr.length) {
//                    System.out.println("Invalid count");
//                } else {
//                    int[] firstEven = new int[Integer.parseInt(secondEl)];
//                    boolean isAnyFirstEven = false;
//                    for (int i = 0; i < numberArr.length; i++) {
//                        if (numberArr[i] % 2 == 0) {
//                            isAnyFirstEven = true;
//                            firstEven[counterFirstEven] = numberArr[i];
//                            counterFirstEven++;
//                            if (counterFirstEven == Integer.parseInt(secondEl)) {
//                                break;
//                            }
//
//
//                        }
//
//                    }
//                    if (isAnyFirstEven) {
//                        System.out.println(Arrays.toString(firstEven));
//                    } else {
//                        firstEven = new int[0];
//                        System.out.println(Arrays.toString(firstEven));
//                    }
//
//                }
//            }
//
//
//            if (firstEl.equals("first") && thirdEl.equals("odd")) {
//                if (Integer.parseInt(secondEl) > numberArr.length) {
//                    System.out.println("Invalid count");
//                } else {
//                    int counterFirstOdd = 0;
//                    int[] firstOdd = new int[Integer.parseInt(secondEl)];
//                    boolean isAnyFirstOdd = false;
//                    for (int i = 0; i < numberArr.length; i++) {
//                        if (numberArr[i] % 2 != 0) {
//                            isAnyFirstOdd = true;
//                            firstOdd[counterFirstOdd] = numberArr[i];
//                            counterFirstOdd++;
//                            if (counterFirstOdd == Integer.parseInt(secondEl)) {
//                                break;
//                            }
//
//
//                        }
//
//                    }
//                    if (isAnyFirstOdd) {
//                        System.out.println(Arrays.toString(firstOdd));
//                    } else {
//                        firstOdd = new int[0];
//                        System.out.println(Arrays.toString(firstOdd));
//                    }
//
//                }
//            }
//
//
//            if (firstEl.equals("last") && thirdEl.equals("even")) {
//                int counterLastEven = Integer.parseInt(secondEl);
//                if (Integer.parseInt(secondEl) > numberArr.length) {
//                    System.out.println("Invalid count");
//                } else {
//                    int[] lastEven = new int[Integer.parseInt(secondEl)];
//                    boolean isAnyLastEven = false;
//                    for (int i = numberArr.length - 1; i >= 0; i--) {
//                        if (numberArr[i] % 2 == 0) {
//                            isAnyLastEven = true;
//                            lastEven[counterLastEven - 1] = numberArr[i];
//                            counterLastEven--;
//                            if (counterLastEven == 0) {
//                                break;
//                            }
//
//
//                        }
//
//                    }
//                    if (isAnyLastEven) {
//                        System.out.println(Arrays.toString(lastEven));
//                    } else {
//                        lastEven = new int[0];
//                        System.out.println(Arrays.toString(lastEven));
//                    }
//
//                }
//            }
//            if (firstEl.equals("last") && thirdEl.equals("odd")) {
//                int counterFirstOdd = Integer.parseInt(secondEl);
//                if (Integer.parseInt(secondEl) > numberArr.length) {
//                    System.out.println("Invalid count");
//                } else {
//                    int[] lastOdd = new int[Integer.parseInt(secondEl)];
//                    boolean isAnyOddEl = false;
//                    for (int i = numberArr.length - 1; i >= 0; i--) {
//                        if (numberArr[i] % 2 != 0) {
//                            isAnyOddEl = true;
//                            lastOdd[counterFirstOdd - 1] = numberArr[i];
//                            counterFirstOdd--;
//                            if (counterFirstOdd == 0) {
//                                break;
//                            }
//
//
//                        }
//
//                    }
//                    if (isAnyOddEl) {
//                        System.out.println(Arrays.toString(lastOdd));
//                    } else {
//                        lastOdd = new int[0];
//                        System.out.println(Arrays.toString(lastOdd));
//                    }
//
//                }
//            }
//            command= in.nextLine().split(" ");
//
//        }
//    }
//    public static String exchangeIndex(String[]command,int [] numberArr){
//        String firstEl = command[0];
//        String secondEl = command[1];
//        int []newArr=new int[numberArr.length];
//
//        if (firstEl.equals("exchange")) {
//            if (Integer.parseInt(secondEl) < 0 || Integer.parseInt(secondEl) >= numberArr.length) {
//                System.out.println("Invalid index");
//            }
//
//            for (int j = 0; j < Integer.parseInt(secondEl); j++) {
//                newArr[j] = numberArr[j + Integer.parseInt(secondEl) + 1];
//            }
//
//            for (int j = Integer.parseInt(secondEl); j < newArr.length; j++) {
//                newArr[j] = numberArr[j - Integer.parseInt(secondEl)];
//            }
//            for (int i = 0; i < newArr.length; i++) {
//                System.out.print(newArr[i] + " ");
//            }
//            numberArr=newArr;
//        }
//return Arrays.toString(numberArr);
//    }
//
//    public static int maxEvenIn(int [] numberArr){
//
//
//        boolean isAnyEvenEl = false;
//        for (int i = 0; i < numberArr.length; i++) {
//            if (numberArr[i] % 2 == 0) {
//                isAnyEvenEl = true;
//                if (numberArr[i] >= maxEvenIndex) {
//                    maxEvenIndex = numberArr[i];
//                    maxEvenI = i;
//                }
//
//            }
//        }
//        if (isAnyEvenEl) {
//            System.out.println(maxEvenI);
//        } else {
//            System.out.println("No matches");
//        }
//    }
//}
//
//
////}
