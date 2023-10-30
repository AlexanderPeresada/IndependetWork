package Task3;

import java.util.Locale;
import java.util.Scanner;

public class ProductPrice {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        inp.useLocale(Locale.ENGLISH);

        System.out.print("Input product name: ");
        String productName = inp.nextLine();

        System.out.print("Input product quantity, pcs.:");
        int quantity = inp.nextInt();

        System.out.print("Input product price, USD:");
        double price = inp.nextDouble();

        double totalCos = price * quantity;

        System.out.printf("Cost of %s is USD %.2f",
                productName, totalCos);
    }
}
