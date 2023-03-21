/* Al Bertrand
CS214
02/21/2023
DiceSimulation
*/

public class DiceSimulation 
{ 
    public static void main(String[] args) 
    {
		int[] frequencies = new int[13];
            for(int i = 1; i<=6; i++)
            {
                  for(int j =1; j<=6; j++)
                  {
                        frequencies[i+j]++; 
                  }
            }
            
            double[] probabilities = new double[13];
            for (int k = 2; k<=12; k++)
            {
                  probabilities[k] = frequencies[k]/36.0*100;
                  System.out.printf("%4d %4d %6.1f\n", k, + frequencies[k],  probabilities[k]);
                  //the printed table tells us the likelihood of two die adding to equal k
                  //the middle term tells us the frequencies of times the number may show up
            } 
		
      System.out.println();

		int N = Integer.parseInt(args[0]);//user input for # of rolls
		int[] actualFreq = new int[13]; //array to store the "real" frequencies of the rolled values
      double[] actualProb = new double [13];//array to store the "real" probablities, this is the actual distribution of your sim'd roll
      int d1, d2, sum;//the die and the sum of the die

		for (int i = 1; i <= N; i++) //user input number of rolls
      {                
            d1 = (int)(Math.random()*6+1);//randomization of die 1 by putting mat*6 in () we do the math first them (int) conversion
            d2 = (int)(Math.random()*6+1);//randomization of die 2
            actualFreq[d1+d2]++;
            //we have to add one here so that the dice never roll to 0
            
            //System.out.printf("%4d %4d %4d\n", i, d1, d2); this was to check and make sure our dice were rolling correctly
            
       }
       
      for (int j = 2; j <= 12; j++)
       {  
            actualProb[j] = actualFreq[j];
            System.out.printf("%4d %4d %6.1f\n", j, actualFreq[j], actualProb[j]);            
       }
	}    
}

//We have to start getting into some pretty significantly large number of rolls to see
   //the actuality of the distribution. One of my best distributions was N = 100