//Alexis Bertrand Harvester

/*behind trailer of size 1 2 or 3 that adds 1000 2000 or 3000 dollars to the RentalProfit() calc
   create a fully parameterized constructor that uses super()
   orverride toString to contain the base tractor in plus the trailer option
   */

public class Harvester extends tractor{
      private int TrailerSize;
      
      public void setTrailerSize(int size){
         if(size<=0) System.out.println("Error with trailer size.");
         
         if(size>=4) System.out.println("Error with trailer size.");
         
         else{
            TrailerSize = size;
         }
      }
      
      public int getTrailerSize(){
         return TrailerSize;
      }
      
      @Override
      public int calculateProfit(){
         return super.calculateProfit() + 1000*TrailerSize;
      }
      
      @Override
      public void setRentalDays(int days) //setter for days
    {
         if(days <= 20) System.out.println("An error has occurred with rental days.");
         else
         {
            this.RentalDays = days;
         }
    }
    
      public int getRentalDays(){
            return RentalDays;
      }
      
            
      
      public Harvester(){ //set default parameters
         super();
         this.TrailerSize = 0;
          
    }
    
    public Harvester(String c, String i, int d, int r, int t){
         super(c, i, d, r); 
         this.setTrailerSize(t);
    }
    
    
    public String toString(){
         return super.toString() + " | Your trailer size: " + this.TrailerSize;
    }
    
    public int Valuation() {
      
      int value = 100000 + super.Valuation() + 10000*TrailerSize;
      return value;
      
   }

}