package day7;

import java.util.ArrayList;
import java.util.Scanner;

public class InputArray {
    public static ArrayList<Integer> run() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean start = true;
        String number = "";

        while (start) {
            try {
                System.out.println("Input number for array, press 'q to finish : ");
                number = scanner.next();
                if (number.charAt(0) == 'q') {
                    start = false;
                } else {
                    numbers.add(Integer.parseInt(number));
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a valid number");
            } finally {
                System.out.println("The array is : " + numbers);
            }
        }
        return numbers;
    }
}
