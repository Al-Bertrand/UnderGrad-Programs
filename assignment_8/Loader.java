/*Alexis Bertrand
CS250
test the Tractor class
02/27/2023
*/

public class Loader extends tractor{
    private int BucketSize;
    
      @Override
      public int calculateProfit(){
         return super.calculateProfit() + 1000*BucketSize;
      }
    
       public void setBucketSize(int bucket){ //sets the bucket size and performs validation of the data
            if(bucket<=0){
               System.out.println("Error with bucket.");
            }
            
                  
            else if(bucket > 5){
               System.out.print("Error with  bucket.");
            }
            
            else{
               BucketSize = bucket;  
         
            }
        }

 
      public int getBucketSize(){
            return BucketSize;
      }
      
          
     
     public String toString(){
         return super.toString() + " | Your bucket size: " + this.BucketSize;
         
     }
     
     public Loader(String c, String i, int d, int r, int b){
         super(c, i, d, r); 
         this.setBucketSize(b);
    }
    
    public Loader(){ //set default parameters
         super();
         this.BucketSize = 0;
    }
    
     public int Valuation() {
      
      int value = 50000 + super.Valuation() + 5000*BucketSize;
      return value;
      
   }
     
}