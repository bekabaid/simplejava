
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Invoice> invoices = new ArrayList<Invoice>();
        invoices.add(new Invoice(1, "Pepsi", 4, 100));
        invoices.add(new Invoice(2, "Coke", 5, 250));
        invoices.add(new Invoice(3, "Lays", 8, 350));
        invoices.add(new Invoice(4, "Bread", 9, 700));

        System.out.println("Sorting by part description");
        Collections.sort(invoices, (Invoice o1, Invoice o2) -> o1.getPartDescrption().compareTo(o2.getPartDescrption()));
        print(invoices);
        System.out.println("----------------------------------------------");

        System.out.println("Sorting by part price");
        Collections.sort(invoices, (Invoice o1, Invoice o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        print(invoices);
        System.out.println("----------------------------------------------");

        System.out.println("Sorting by part quantity");
        Collections.sort(invoices, (Invoice o1, Invoice o2) -> Integer.compare(o1.getQuantity(), o2.getQuantity()));
        print(invoices);
        System.out.println("----------------------------------------------");

        System.out.println("Sorting by part quantity*price");
        Collections.sort(invoices, (Invoice o1, Invoice o2)
                -> Double.compare(o1.getQuantity() * o1.getPrice(), o2.getQuantity() * o2.getQuantity()));
        print(invoices);
        System.out.println("----------------------------------------------");

        System.out.println("Invoices in range of $200-$500");
        print(invoices, 200, 500);
        System.out.println("----------------------------------------------");

    }

    public static void print(ArrayList<Invoice> invoices, double r1, double r2) {
        for (int i = 0; i < invoices.size(); i++) {
            if (invoices.get(i).getPrice() >= r1 && invoices.get(i).getPrice() <= r2) {
                invoices.get(i).printInvoice();
                System.out.println();
            }
        }
    }

    public static void print(ArrayList<Invoice> invoices) {
        for (int i = 0; i < invoices.size(); i++) {
            invoices.get(i).printInvoice();
            System.out.println();
        }
    }
}
