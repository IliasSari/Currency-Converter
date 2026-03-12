import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Currency usd = new Currency("USA Dollar", "$", 1.09);
        Currency gbp = new Currency("British Pound", "£", 0.85);
        Currency jpy = new Currency("Japanese Yen", "¥", 162.50);
        Currency aud = new Currency("Australian Dollar", "AUD $", 1.62);
        Currency inr = new Currency("Indian Rupee", "₹", 106.51);
        Currency cad = new Currency("Canadian Dollar", "CAD $", 1.57);

        System.out.print("Enter the amount of euro (€): ");
        double amount = input.nextDouble();

        System.out.println("\n--- conversion result ---");
        
        usd.convertAndPrint(amount);
        gbp.convertAndPrint(amount);
        jpy.convertAndPrint(amount);
        aud.convertAndPrint(amount);
        inr.convertAndPrint(amount);
        cad.convertAndPrint(amount);
        input.close();
    }
}