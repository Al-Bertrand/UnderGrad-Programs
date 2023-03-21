/* Alexis Bertrand
CS250
ohloops
2/13/2023
*/

//oh mag is number of loops, as the size of the n magnitude increases
//rewrite these other two versions to understand the loops

public class ohLoops_CORRECTED
{
   public static void main(String[] args)
   {
      for(int a = 1; a <+ 5; a++)
      {
         System.out.println("Just one loop. Linear.");
      }
      
      int mag2 [] = new int[100];
      for(int b = 1; b <= 6; b++)
      {
         for(int c = 1; c<=6; c++)
         {
            mag2[b+c]++; //since these loops are nested, they create O(n^2)
         }         
      }
      
      for(int d = 1; d<10;d++)
      {
         System.out.print(" " + mag2[d]);
      }
      
      System.out.println();
               
       double ohMagLog = 1;
       for (double ohMagLog1 = 2; ohMagLog1 <10; ohMagLog1++)
       {
         ohMagLog = Math.log(ohMagLog1);
         System.out.print(ohMagLog + " ");
         
       }
   }
}