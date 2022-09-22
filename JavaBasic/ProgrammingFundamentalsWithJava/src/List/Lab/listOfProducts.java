package List.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class listOfProducts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
//        List<String> products = Arrays.stream(in.nextLine().split(" "))
//                .collect(Collectors.toList());
        List<String> products = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            String items = in.nextLine();
            products.add(items);
        }

        Collections.sort(products);

        for (int i = 0; i <=products.size()-1; i++) {
            System.out.println(i+1 + "." + products.get(i));

        }

    }
}
