import java.util.Scanner;

class Assignment2C{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Bisonica!");
    System.out.print("How many US Dollars do you have? ");
    String x = scan.nextLine();
    System.out.println(x + " US Dollar(s) is " + (Float.parseFloat(x)*.73) + "British Pound(s),");
    System.out.println(" which is " + (Float.parseFloat(x)*.73)/5 + " Bison Dollar(s)!");
  }
}