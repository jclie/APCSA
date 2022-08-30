import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Whose your favorite music artist?");
    String favArtist = input.nextLine();
    System.out.println("What is you favorite letter?");
    char favLetter = input.next().charAt(0);
    System.out.println("How old are you?");
    int age = input.nextInt();
    System.out.println("What is your gpa?");
    double gpa = input.nextDouble();

    System.out.println("Favorite Artist: " + favArtist);
    if ((favArtist == "the neighbourhood")) {
      System.out.println("That's an awesome arist, they're my favorite too!");
    } else {
      System.out.println("That's a good one, my favorite is The Neighbourhood");
    }
    System.out.println("Favorite Letter: " + favLetter);
    System.out.println("Age: " + age);
    System.out.println("Gpa: " + gpa);
  }
}