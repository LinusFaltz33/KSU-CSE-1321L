import java.util.Scanner;

class Lab3A {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Amount owed: $");
    String amntOwed = scan.nextLine();
    System.out.print("APR: ");
    String APR = scan.nextLine();
        System.out.println("Monthly percentage rate: " + (Float.parseFloat(APR) / 12)) ;
    System.out.println("Minimum Payment: $" + (Integer.parseInt(amntOwed) * (Float.parseFloat(APR)/100) / 12)) ;
  }
}