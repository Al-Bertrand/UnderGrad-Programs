import java.io.*;
/*

Putting private into our variables allows us to protect our code from
   dumb users or other intentionally or unintentionally malicious
   
Can also protect our code from crashes

Zero parameter constructors is a default that sets everything to a default
   we can set our own defaults
   
The parameterized one is where the user can set values as they need to

Nullifying - get rid of the tractor - tractor 3 - null



*/

// shipping business example

public class tractor{ 

    private String Color;
    private String VehicleID;
    private int RentalRate;
    protected int RentalDays;

    
    public static String Company;//static attributes are shared by all objects in the class - all tractors have a Company (the fleet)
    
    public void setColor(String color) //set the color
    {
         this.Color = color;
    }
    
    public String getColor() //get the color
    {
         return Color;
    }
    
    /*
    public void setProfit(int profit){
         Profit = RentalDays*RentalRate; 
    }
    */
    
    public int calculateProfit(){
         int calcProfit = getRentalRate()*getRentalDays(); //you could just do RentalRate*RentalDays because of the access
         return calcProfit;
         
    }
    
    public void setID(String id) // a setter for the VIN 
    {
         this.VehicleID = id;
    }
    
    public String getID() //getter for the VIN
    {
         return VehicleID;
    }
    
    
    public void setRentalRate(int rate) //a setter for the rate
    {
         if(rate <= 0) System.out.println("Error with rental rate");
         else
         {
            this.RentalRate = rate;
         }
    }
    
     public int getRentalRate() //getter for the rate
    {
         return RentalRate;
    }
    
    public void setRentalDays(int days) //setter for days
    {
         if(days <= 0) System.out.println("An error has occurred with rental days.");
         else
         {
            this.RentalDays = days;
         }
    }
    
    public int getRentalDays() //get the days
    {
         return RentalDays;
    }    
    
    
    public tractor() //set default parameters
    {
         this.Color = "[unassigned]";
         this.VehicleID= "[unassigned]";
         this.RentalDays = 0;
         this.RentalRate = 0;
         
    }
    
    public tractor(String c, String i, int d, int r){
         this.setColor(c);
         this.setID(i);
         this.setRentalDays(d);
         this.setRentalRate(r);
         
    }
    
    public int Valuation() {
      
      int value = 50000 + 100 * RentalRate;
      return value;
      
   }

    
       
    public void display() //a display method to help us look at our stuff
    {
        System.out.println("Tractor selected: " + this.Color + " | Vehicle ID: " + this.VehicleID + " | Daily Rate: " + this.RentalRate + " | Rented Days " + this.RentalDays
              + " | Rental Bill ");
    }
      
    
    public String toString()
    {
         return "Your tractor color: " + this.Color + " | your tractor ID: " + this.VehicleID + ". Number of days out: " + this.RentalDays + ". Flat rental rate: " + this.RentalRate 
                  + ". Total Rental Bill: " + calculateProfit();
    }
    
    //ripped straight from HighLevel.java
    public void saveData(String tractor) throws IOException {
   
   File outFile = new File(tractor);
   FileOutputStream outFileStream = new FileOutputStream(outFile);
   PrintWriter outDataStream = new PrintWriter(outFileStream);

	outDataStream.println(this.Color);
   outDataStream.println(this.VehicleID);
   outDataStream.println(this.RentalRate);
   outDataStream.println(this.RentalDays);
   
   outDataStream.close();     
   }
   
   public void loadData(String filename) throws IOException {
   
      File             inFile       = new File(filename);
      FileReader fileReader = new FileReader(inFile);
      BufferedReader buffReader = new BufferedReader(fileReader);
     
      String str = buffReader.readLine();
      //System.out.println(str);
      this.setColor(str);
     
      String str1 = buffReader.readLine();
      //System.out.println(str1); 
      this.setID(str1);
      
      String str2 = buffReader.readLine();
      //System.out.println(str2); 
      Integer.parseInt(str2); 
      
      String str3 = buffReader.readLine();
      //System.out.println(str3);  
      Integer.parseInt(str3);    
      
   	
    	//input done, so close the stream
    	buffReader.close();
   }

}    
