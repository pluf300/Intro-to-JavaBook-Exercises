import java.util.Scanner;

public class AverageSpeed {
   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   System.out.print("Enter kilometers: ");
   double kilometers = input.nextDouble();
   
   System.out.print("Enter minutes: ");
   double minutes = input.nextDouble();
   
   System.out.print("Enter seconds: ");
   double seconds = input.nextDouble();
   
   double KilometersPerHour = (int)(((( kilometers / (( minutes * 60.0 ) + seconds ) * 60.0 ) * 60.0) * 100 ) / 100.0 );
   double MilesPerHour = KilometersPerHour / 1.6;
   System.out.println("Average speed in miles per hour is " + MilesPerHour);
   }
}