import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean keepRunning = true;
        System.out.println("-- Currency Converter --");
        while (keepRunning) {
            try{
                System.out.print("\nEnter the amount in Euros (€) or 0 for output:");
                double euro = input.nextDouble();

                if (euro == 0){
                    keepRunning = false;
                    System.out.println("Thank you for using our services!!");
                    break;
                }
                System.out.println("\nWhat currency do you want the conversion to be made to? 1. for dollars or 2. for pounds! ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.printf("%.2f€ = %.2f$\n", euro, (euro * 1.09));
                        break;
            
                    case 2:
                        System.out.printf("%.2f€ = %.2f£\n", euro, (euro * 0.85));
                        break;
                    default:
                        System.out.println("Wrong Choise! Please choose 1 or 2.");
                }
            } catch (InputMismatchException e){
                System.out.println("Error: Please enter numbers only!");
                input.nextLine();
            }
        }
        input.close();
    }
}