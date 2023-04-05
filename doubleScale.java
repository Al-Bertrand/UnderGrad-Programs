/* Alexis Bertrand
CS214
2.1.16
Take a static method scale() that takes a double array as its argument and has the side effect of scaling the array
so that each element is between 0 and 1 (by subtrating the minimum value from each element and when dividing each 
element by the difference between the minmum and maximum values). Use the max() method defined in the table in the text,
and write and use a matching min() method.
*/

public class doubleScale{
      //ripped straight from p209 in Sedegewick
      public static double max(double[] a)  {
            double max = Double.NEGATIVE_INFINITY;
            for(int i = 0; i < a.length; i++)  {
                  if(a[i] > max) max = a[i];
            }
            
            return max;
      }
      
      //guessed at what min would look like; it works!
      public static double min(double[] a)  {
         double min = Double.POSITIVE_INFINITY;
         for(int i = 0; i < a.length; i++)  {
            if(a[i] < min) min = a[i];
         }
         
         return min;
      }
      //sub by the min val, div by the max val
      public static void scale(double[] a)   {
      
               double div = max(a);
               double sub = min(a);
               double [] scale = new double[a.length];
               
            for(int i = 0; i< a.length; i++) {
                  scale[i] = (a[i] - sub)/div;
                  System.out.print(" " + scale[i]); //show us the vals              
            }
           
      }
      
      public static void main(String[] a)  {
         
         double[] myArr = {1234.5, 1234.4};
         
         /*put in to test whether min and max work
         System.out.println(max(myArr));
         System.out.println(min(myArr)); 
         */
         
        scale(myArr);
      }
}