import java.util.Scanner;

public class AreaAndAPerimeter {
   public static void main(String[] args) {
      final double PI = 3.14159;
   
      Scanner input = new Scanner(System.in);
   
      System.out.print(" Enter radius: ");
      double radius = input.nextDouble();
   
      double perimeter = 2 * radius * PI;
      double area = radius * radius * PI;
   
      System.out.print(" The perimeter of a circle is " + perimeter);
      System.out.println(" The area of a circle is " + area);
   }
}
   
   
   