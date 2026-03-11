import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Currency usd = new Currency("USA Dollar", "$", 1.09);
        Currency gbp = new Currency("British Pound", "£", 0.85);
        Currency jpy = new Currency("Japanese Yen", "¥", 162.50);

        System.out.print("Enter the amount of euro (€): ");
        double amount = input.nextDouble();

        System.out.println("\n--- conversion result ---");
        
        usd.convertAndPrint(amount);
        gbp.convertAndPrint(amount);
        jpy.convertAndPrint(amount);
        input.close();
    }
}