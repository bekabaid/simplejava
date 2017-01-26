
import java.util.Scanner;

public class CokeMachine {

    public void run() {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int coin = 0;
        int choice;
        while (true) {
            System.out.print("Enter coin: ");
            coin = input.nextInt();
            if (validate(coin)) {
                total += coin;
                System.out.println("Amount entered: " + total);
            } else {
                System.out.println("Rejecting "+coin+" cent coin");
                System.out.println("Amount entered: " + total);
            }
            if (total >= 100) {
                System.out.println("Please make selection");
                System.out.println("1- Coke");
                System.out.println("2- Coke Zero");
                System.out.println("3- Caffeine Free Diet Coke");
                System.out.println("4- Exit");
                System.out.print("Your choice: ");
                choice = input.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println("Dispensing Coke");
                        System.out.println("Returning dime");
                        total -= 100;
                        break;
                    }
                    case 2: {
                        System.out.println("Dispensing Coke Zero");
                        System.out.println("Returning dime");
                        total -= 100;
                        break;
                    }
                    case 3: {
                        System.out.println("DCaffeine Free Diet Coke");
                        System.out.println("Returning dime");
                        total -= 100;
                        break;
                    }
                    case 4:{
                        System.exit(0);
                    }
                    default: {
                        System.out.println("Wrong choice. Try again...");
                    }
                }
            }
        }
    }

    public boolean validate(int coin) {
        if (coin == 5 || coin == 10 || coin == 25) {
            return true;
        } else {
            return false;
        }
    }
}
