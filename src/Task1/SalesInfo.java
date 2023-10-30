package Task1;

public class SalesInfo {
    static String productName;
    static double price;
    static String UNIT = "kg";
    static double countOfSalesPerDay;
    static String CURRENCE = "EUR";

    public static void main(String[] args) {

        productName = "Orange";
        price = 2.59;
        countOfSalesPerDay = 59.329;

        double totalCount = price * countOfSalesPerDay;

        System.out.printf("Product: %s, sold %.3f %s, total cost is %s %.2f"
                                ,productName,countOfSalesPerDay,UNIT,CURRENCE,totalCount);

    }

}
