package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Choose the question to be run : ");
        Scanner scanner = new Scanner(System.in);
        int question = scanner.nextInt();

        switch (question) {
            case 1 : {
                ArrayList<Integer> numbers = InputArray.run();
                System.out.println("The average is : " + AverageNumber.run(numbers));
            }
            case 2 : {
                String filePath = "C:\\Users\\inggi\\Documents\\Personal\\DTI Purwadhika\\Exercises\\Day7Exercise\\src\\resources\\product_sales_data.csv";
                CSVReader reader = new CSVReader();

                //Extract csv content
                Object[] data = reader.parseContent(filePath, 15);
                String[] productName = (String[]) data[0];
                int[] totalSold = (int[]) data[1];
                double[] itemPrice = (double[]) data[2];

                System.out.println(Arrays.toString(productName));
                System.out.println(Arrays.toString(totalSold));
                System.out.println(Arrays.toString(itemPrice));

                //Calculate total sales
                double totalSales = reader.calculateTotalSales(totalSold, itemPrice);
                System.out.println("The total sales is : " + totalSales);

                //Calculate total product
                int totalProduct = reader.totalProductSold(totalSold);
                System.out.println("Total product sold is : " + totalProduct);

                //Find most bought item
                String mostBoughtItem = reader.findMostBought(totalSold, productName);
                System.out.println("The most bought item is : " + mostBoughtItem);

                //Find least bought item
                String leastBoughtItem = reader.findleastBoughtItem(totalSold, productName);
                System.out.println("The least bought item is : " + leastBoughtItem);
            }
        }
    }
}