/*
DESCRIPTION::
    Program calculates the area and circumference of a circle,  
    from the radius,
    Programmer: Donna Clark 
    Last make:: DD/MM/YYYY: 04/02/2022
    
*/
import java.util.Scanner;
public class Circles {
    public static void main(String[] args)
     {
        String name;
            double radius;
             double area, circumference;

 //Declares:: PI as named constant 
        final double PI = 3.14159265359; 

//Creates:: Scanner object to read input
        Scanner keyboard = new Scanner (System.in);

//Collects:: User's name 
        System.out.print ("Enter User's Name") ;
              name = keyboard.nextLine();

//Displays:: Wlecome text && prints user's name        
    System.out.println("\nWelcome to Circles Program," 
     + name + '!' );

//Collects:: Radius for circle 
    System.out.print("\n What is the radius of your circle? ") ;
        radius = keyboard.nextDouble() ;

//Calcuates:: Circumference of circle
        circumference = 2 * PI * radius; 

//Calculates:: area of circle 
    area = PI * radius * radius;

//Displays:: Circles Circumference and area 
    System.out.println("\nHere is your results, " + name + ':') ;
        System.out.println("\n Circumference of your circle: " + circumference );
            System.out.println("\n Area of your circle: " + area );
                System.out.println();
  
                keyboard.close();
            } // end main{}
} // end class Circles 
