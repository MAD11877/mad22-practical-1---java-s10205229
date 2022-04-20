import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    
    /**scanner is a class in java. util package used for obtaining the input of 
    the primitive types like int, double, etc. and strings.*/
    Scanner in = new Scanner(System.in);
    
    /**prompting input & setting variable**/
    System.out.println("Please enter your height(m): ");
    double height = in.nextDouble();

    System.out.println("Please enter your weight(kg): ");
    double weight = in.nextDouble();
    
    /**calculation**/
    double bmi = weight/(height*height);
    
    /**displaying BMI**/
    System.out.println(bmi);
    
  }
}
