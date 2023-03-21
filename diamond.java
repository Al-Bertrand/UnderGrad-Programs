public class diamond
{
    public static void main(String[] args) 
    {
        int no = Integer.parseInt(args[0]);

        int count = 1;
        
        for (int i = 1; i <= 2 * no - 1; i++) 
            {
               for (int j = count; j <= no; j++) 
               {
                  System.out.print("  ");
               }
            for (int k = 1; k <= count * 2 - 1; k++) {
                System.out.print("* ");
            }
            
            if (i < no)
                count++;
            else
                count--;
            System.out.println("");
        }
    }
}