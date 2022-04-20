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

    /**inputting data & setting variable**/
    System.out.println("Please enter an integer:");
    long integer = in.nextInt();
    int i = 1;

    /**to run the first 5 multiplication**/
    while(i <= 5){
      integer = integer*integer;
      i += 1;
      
      /**to display integer**/
      System.out.println(integer);
    }
  }
}
