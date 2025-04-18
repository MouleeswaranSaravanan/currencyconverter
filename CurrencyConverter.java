import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Map<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.0);
        rates.put("EUR", 0.92);
        rates.put("INR", 83.18);
        rates.put("GBP", 0.79);
        rates.put("JPY", 154.71);
        rates.put("AUD", 1.52);

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Currency Converter ===");

        System.out.print("Enter source currency (e.g., USD): ");
        String from = scanner.next().toUpperCase();

        System.out.print("Enter target currency (e.g., EUR): ");
        String to = scanner.next().toUpperCase();

        if (!rates.containsKey(from) || !rates.containsKey(to)) {
            System.out.println("Invalid currency code.");
            return;
        }

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        double fromRate = rates.get(from);
        double toRate = rates.get(to);
        double convertedAmount = (amount / fromRate) * toRate;

        System.out.printf("%.2f %s = %.2f %s%n", amount, from, convertedAmount, to);
    }
}

