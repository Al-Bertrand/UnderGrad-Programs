//Counting primes
//Alexis Bertrand - cs214
//02 09 2023

public class countingPrimes
{
   public static void main(String[] args)
   {
      //take a command-line argument and find the number of primes 
      //print the primes to the console 
      
      /*
         a = args[]
         for some n=1 to a
         or some d=2 to a/n
         isPrime - false
         if n%d==0, isPrime=true
         end loop d
         print if n is prime or not
      */
      
            
      long a = Integer.parseInt(args[0]); //this is the value that goes into the testing conditions
      long isPrime = 0;
      
      for(long n = 3; n <= a; n++)//starting at 3, if some number is less than or 
                                 //equal to the entered argument, update the number
        {
            isPrime = 0;//as long as the above condition is met, set isPrime to 0
         for (long d =2; d<= n/2; d++)//on the first iteration of n being less than the 
                                       //entered argument, it must also be met that so long
                                       //as 2 is less than our iteration divided by 2, update d
            {
               if(n%d==0)//if it is true that the remainder of the division of a n and d leaves 
               //a remainder of zero
               isPrime = 1; //when this is set, we don't print n using 
                           //using our parameter of isPrime needing to be
                           //0 for n to "get through" to be printed
               
               //break; if I put this in, I get the printed value right
               //the entered value, why?OH
               //because it runs the final value, breaks off and doesn't set
               //isPrime to 1 to prevent it from being printed. I think.
            }
            
          if (isPrime==0)//this is kind of like a fancy else; in the case isPrime comes through as 0
                          //then we can print the n that matches our parameters
            System.out.print(n + " ");
        }
    }
}