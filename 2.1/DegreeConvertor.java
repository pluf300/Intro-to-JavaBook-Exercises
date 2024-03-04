import java.util.Scanner;

public class DegreeConvertor { 
   public static void main (String[] args) {
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter degree in Celsius: ");
   double Celsius = input.nextDouble();
   
   double Fahrenheit = (9.0 / 5.0) * Celsius + 32;
   
   System.out.println(Celsius + " Celsius is " + Fahrenheit + " Fahrenheit");
   }
}
   