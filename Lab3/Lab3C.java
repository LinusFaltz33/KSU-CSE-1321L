import java.util.Scanner;

class Lab3C {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the number of quarters: ");
      String quarters = scan.nextLine();
      System.out.print("Enter the number of dimes: ");
      String dimes = scan.nextLine();
      System.out.print("Enter the number of nickels: ");  
      String nickels = scan.nextLine();
      System.out.print("Enter the number of pennies: ");      
      String pennies = scan.nextLine();
    System.out.println();

      System.out.println("You entered " + quarters + " quarters.");
      System.out.println("You entered " + dimes + " dimes.");
      System.out.println("You entered " + nickels + " nickels.");
      System.out.println("You entered " + pennies + " pennies.");

      int coins = (Integer.parseInt(quarters) * 25) + (Integer.parseInt(dimes) * 10) + (Integer.parseInt(nickels) * 5) + (Integer.parseInt(pennies)); 

      System.out.println();
      System.out.print("Your total is " + coins/100 + " dollars and " + coins%100 + " cents.");
  }
}

