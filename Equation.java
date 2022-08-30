import java.util.Scanner;

class Equation {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Acceleration Calculator");
    System.out.println("What are you finding the acceleration of?");
    String str = input.nextLine();
    System.out.println("Enter final velocity:");
    double vf = input.nextDouble();
    System.out.println("Enter inital velocity:");
    double vi = input.nextDouble();
    System.out.println("Time taken in seconds:");
    double t = input.nextDouble();
    double eq = (vf - vi)/t;
    System.out.println("The acceleration of the" + str + " is: " + eq);
  }
}