package day7;

import java.util.ArrayList;

public class AverageNumber {
    public static int run(ArrayList<Integer> numbers) {
        int summation = 0;
        int result = 0;

        try {
            for (int num : numbers) {
                summation += numbers.get(num-1);
            }
            result = summation / numbers.size();
        } catch(ArithmeticException e) {
            System.out.println("Array is empty");
        }

        return result;
    }
}
