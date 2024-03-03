import java.util.Scanner;

public class SpeesInKilometers {
   public static void main(String[] args) {
   
   Scanner input= new Scanner(System.in);
   
   System.out.print("Enter miles: ");
   double Miles = input.nextDouble();
   
   System.out.print("Enter hours: ");
   double Hours = input.nextDouble();
   
   System.out.print("Enter minutes: ");
   double Minutes = input.nextDouble();
   
   System.out.print("Enter seconds: ");
   double Seconds = input.nextDouble();   
   
   double MilesPerHour = (int)(((((Miles / ((Hours * 3600.0) + (Minutes * 60.0) + Seconds)) * 60.0) * 60.0) * 100) / 100.0);
   double KilometersPerHour = MilesPerHour * 1.6;
   
   System.out.println("Average speed in kilometers is " + KilometersPerHour);
   }
}