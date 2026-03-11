import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("-- Currency Converter --");
        System.out.print("Enter the amount in Euros (€): ");

        System.out.println("\nWhat currency do you want the conversion to be made to? ");
        System.out.println("1. Dollars ($)");
        System.out.println("2. Pounds(£)");
        System.out.println("Choice (1 or 2)");

        double euro = input.nextDouble();
        double dollars = convertToUSD(euro);
        double pounds = convertToGBP(euro);

        int choice = input.nextInt();
        switch (choice) {
            case 1:
                double usd = euro * 1.09;
                System.out.printf("%2f€ = %2f$\n", euro, usd);
                break;
            
            case 2:
                double gbp = euro * 0.85;
                System.out.printf("%2f€ = %2f£\n", euro, gbp);
                break;
            default:
                System.out.println("Wrong Choise! Please choose 1 or 2.");
        }

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