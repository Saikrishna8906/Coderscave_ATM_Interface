import java.util.*;
public class MainClass {
    public static void main(String... x) {
        Scanner sc = new Scanner(System.in);
        int  pinnumber = 1234;
        String atmnumber="0123456789";


        System.out.print("Enter Card Number : ");
        String atm = sc.next();
        System.out.print("Enter PIN Number : ");
        int pin = sc.nextInt();


            if (atmnumber.equals(atm) && pinnumber==pin) {
                AtmOperations op = new AtmOperations();
                System.out.println("1.View Account Balance\n2.Withdraw Amount\n3.Deposite Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter Your Choice");
                while (true) {
                    int ch = sc.nextInt();
                    switch (ch) {
                        case 1: {
                            op.viewBalance();
                            break;
                        }
                        case 2: {
                            System.out.print("Enter amount to Withdraw : ");
                            double amount = sc.nextDouble();
                            op.withdraw(amount);
                            break;
                        }
                        case 3: {
                            System.out.print("Enter amount to Deposite : ");
                            double amount = sc.nextDouble();
                            op.deposite(amount);
                            break;
                        }
                        case 4: {
                            op.miniStatement();
                            break;
                        }
                        case 5: {
                            System.exit(0);
                            break;
                        }
                        default:
                            System.exit(0);
                    }
                }

            } else {
                System.out.println("Incorrect ATM and PIN number");
                System.exit(0);
            }


    }
}

