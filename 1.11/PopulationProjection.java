
public class PopulationProjection { 
   public static void main(String[] args) {
   
   double birthPerYear = (int)(365 * 24 * 60 * 60 / 7.0);
   
   double deathPerYear = (int)(365 * 24 * 60 * 60 / 13.0);
   
   double newImmPerYear = (int)(365 * 24 * 60 * 60 / 45.0);
   
   double everyonePerYear = (birthPerYear + deathPerYear + newImmPerYear);
   
   double yearOne = 312032486 + everyonePerYear;
   
   double yearTwo = yearOne + everyonePerYear;
   
   double yearThree = yearTwo + everyonePerYear;
   
   double yearFour = yearThree + everyonePerYear;
   
   double yearFive = yearFour + everyonePerYear;
   
   
   System.out.println("Year one: " + yearOne);
   System.out.println("Year two: " + yearTwo);
   System.out.println("Year three: " + yearThree);
   System.out.println("Year four: " + yearFour);
   System.out.println("Year five: " + yearFive);
   }
}

   

   