import java.util.Scanner;

public class Rectangle { 
   public static void main(String[] args) {
   
   Scanner input= new Scanner(System.in);
   
   System.out.print(" Enter width: ");
   double width = input.nextDouble();
   
   System.out.print(" Enter height: ");
   double height = input.nextDouble();
   
   double area = width * height;
   double perimeter = ( 2 * width ) + ( 2 * height );
   
   System.out.print(" Area of a rectangle is " + (int)(area*100/100.0) + " and perimeter of a rectangle is " + perimeter );
   }
}
// Do I need int? If not anwser is different