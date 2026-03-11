import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("-- Currency Converter --");
        System.out.print("Enter the amount in Euros (€): ");

        double euro = input.nextDouble();
        double dollars = convertToUSD(euro);
        double pounds = convertToGBP(euro);

        System.out.println(euro + "€ is equal to: ");
        System.out.printf("%.2f ($\n)", dollars);
        System.out.printf("%.2f Λίρες (£)\n", pounds);
        
        input.close();
    }

    public static double convertToUSD(double amount){
        return amount * 1.09;
    }

    public static double convertToGBP(double amount){
        return amount * 0.85;
    }
}