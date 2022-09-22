package Lists.MoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class take_skipRope {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> text = Arrays.stream(in.nextLine().split("")).collect(Collectors.toList());

        String textNumbers = "";

        for (int i = 0; i < text.size(); i++) {
            if (text.get(i).matches("[0-9]")) {
                textNumbers += text.get(i);
                text.remove(i);
                i--;
            }
        }

        List<Integer> numberList = Arrays.stream(textNumbers.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        for (int i = 0; i < numberList.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(numberList.get(i));
            } else {
                skipList.add(numberList.get(i));
            }
        }
        List<String> resultTake = new ArrayList<>();
        List<String> resultSkip = new ArrayList<>();
        int k = 0;
        int i = 0;
        int sumIK = 0;

        for (int j = 0; j < takeList.size(); j++) {
            int takeListIndex = takeList.get(j);
            if (takeList.get(j) + sumIK > text.size() - 1) {
                takeListIndex = text.size() - sumIK;
            }
            int skipListIndex = skipList.get(j);
            if (skipList.get(j) + sumIK > text.size() - 1) {
                skipListIndex = text.size() - sumIK;
            }

            for (i = 0; i < takeListIndex; i++) {
                resultTake.add(text.get(sumIK + i));
            }
            sumIK += i;
            for (k = 0; k < skipListIndex; k++) {
                resultSkip.add(text.get(sumIK + k));
            }
            sumIK += k;
        }
        for (i = 0; i < resultTake.size(); i++) {
            System.out.print(resultTake.get(i));

        }

    }
}
