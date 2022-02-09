import java.util.Scanner;

class Assignment2B{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the hit box top-left X coordinate: ");
    String x = scan.nextLine();
    System.out.print("Enter the hit box top-left Y coordinate: ");    
    String y = scan.nextLine();
    System.out.print("Enter the width of the hit box: ");
    String width = scan.nextLine();
    System.out.print("Enter the height of the hit box: ");
    String height = scan.nextLine();
    System.out.println("[Hit Box Coordinates]");
    System.out.println("Top-Left: 0, " + y);
    System.out.println("Bottom-Left: 0, 0");
    System.out.println("Top-Right: " + width + ", " + y);
    System.out.println("Bottom-Right: " + width + ", 0");

   

  }
}