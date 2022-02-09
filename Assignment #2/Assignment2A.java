import java.util.Scanner;

class Assignment2A{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("How much time has passed (in seconds)?: ");
    
    String time = scan.nextLine();
    System.out.println("Now converting...");
    System.out.print(Integer.parseInt(time) + " seconds is " + Integer.parseInt(time)/60/60 + " hour(s), " + Integer.parseInt(time)/60%60 + " minute(s), and " + Integer.parseInt(time)%60 + " second(s).");

  }
}