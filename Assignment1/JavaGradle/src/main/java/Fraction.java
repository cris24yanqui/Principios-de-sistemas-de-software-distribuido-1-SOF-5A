import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Gradle build file (modified to accept 0, 1, or 2 arguments).
 *
 * Ser321 Foundations of Distributed Applications
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 * @version January 2020 / Modified for Tarea 1 UIDE
 */
public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator = denominator = 0;
   }

   public void print() {
      System.out.print(numerator + "/" + denominator);
   }

   public void setNumerator (int n){
      numerator = n;
   }

   public void setDenominator (int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
      try {
         // create a new instance
         Fraction frac = new Fraction();

         // set default values
         int num = 1;
         int denom = 3;

         if (args.length == 2) {
            try {
               num = Integer.parseInt(args[0]);
               denom = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
               System.out.println("Arguments: " + args[0] + ", " + args[1] + " must be integers.");
               System.exit(1);
            }
         } else if (args.length == 1) {
            try {
               num = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
               System.out.println("Argument: " + args[0] + " must be an integer.");
               System.exit(1);
            }
         }

         frac.setNumerator(num);
         frac.setDenominator(denom);

         // print it
         System.out.print("The fraction is: ");
         frac.print();
         System.out.println("");

      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}
