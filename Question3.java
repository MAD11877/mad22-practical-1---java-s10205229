import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);

    System.out.println("Please enter an integer:");
    int i = in.nextInt();
    
    i = i * i;
      
    System.out.println("The answer is: " + Integer.toString(i));
    
  }
}
