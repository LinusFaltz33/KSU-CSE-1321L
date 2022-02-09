import java.util.Scanner;

class Lab3B{
  public static void main(String[] args) {
    float total = 0.0f;
    float hours = 0.0f;
    float points = 0.0f;

      Scanner scan = new Scanner(System.in);
      System.out.print("Course 1 hours: ");
      String courseHours = scan.nextLine();
      System.out.print("Grade for course 1: ");
      String grade = scan.nextLine();
      hours += Integer.parseInt(courseHours);
      points += Integer.parseInt(grade) * Float.parseFloat(courseHours);
      total += (Float.parseFloat(grade) / Float.parseFloat(courseHours));

      System.out.print("Course 2 hours: ");
      courseHours = scan.nextLine();
      System.out.print("Grade for course 2: ");
      grade = scan.nextLine();
      hours += Integer.parseInt(courseHours);
      points += Integer.parseInt(grade) * Float.parseFloat(courseHours);
      total += (Float.parseFloat(grade) / Float.parseFloat(courseHours));

      System.out.print("Course 3 hours: ");
      courseHours = scan.nextLine();
      System.out.print("Grade for course 3: ");
      grade = scan.nextLine();
      hours += Integer.parseInt(courseHours);
      points += Integer.parseInt(grade) * Float.parseFloat(courseHours);
      total += (Float.parseFloat(grade) / Float.parseFloat(courseHours));

      System.out.print("Course 4 hours: ");
      courseHours = scan.nextLine();
      System.out.print("Grade for course 4: ");
      grade = scan.nextLine();
      hours += Integer.parseInt(courseHours);
      points += Integer.parseInt(grade) * Float.parseFloat(courseHours);
      total += (Float.parseFloat(grade) / Float.parseFloat(courseHours));

  System.out.println("Total hours is: " + hours);
  System.out.println("Total quality points is: " + points);
  System.out.println("Your GPA for this semester is " + (points/hours));
  }
}

