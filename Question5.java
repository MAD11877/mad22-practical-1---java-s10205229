import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    /**prompting input & setting variable**/
    System.out.println("Please enter an integer:");
    int num = in.nextInt();
    int[] b = new int[num];
    int i = 0;

    System.out.println("Please enter a set of integer:");

    /**while loop is used to cpature all the inputs**/
    while (i < num){

      int tempnum = in.nextInt();

      b[i] = tempnum;

      i += 1;
    }

    int maxint = 0;
    int maxoccurrence = 0;
    
    /**looking for integer with the max. occurrence**/
    for (int k = 0; k < b.length; k++){

      int tempnum = b[k];
      int tempoccurrence = 0;

      /**doing comparesion**/
      for (int l = 0; l < b.length; l++){
        
        if (tempnum == b[l]){
  
          tempoccurrence += 1;
          
        }
      }

       /**doing overwritting**/
      if (maxoccurrence < tempoccurrence){

        maxoccurrence = tempoccurrence;
        maxint = b[k];
        
      }
    }

    /**displaying**/
    System.out.println("Integer: " + Integer.toString(maxint));
    
  }
}
