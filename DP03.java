import java.util.Scanner;

class DP03 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter number of pennies");
    double pennies = input.nextDouble();
    pennies*=.01;
    System.out.println(pennies);
    System.out.println("Enter number of nickels");
    double nickels = input.nextDouble();
    nickels*=.05;
    System.out.println(nickels);
    System.out.println("Enter number of dimes");
    double dimes = input.nextDouble();
    dimes*=.10;
    System.out.println(dimes);
    System.out.println("Enter number of quarters");
    double quarters = input.nextDouble();
    quarters*=.25;
    System.out.println(quarters);

    double totalCost = pennies+nickels+dimes+quarters;
    System.out.printf("Your total is $%0,1.2f", totalCost);
    
  }
}