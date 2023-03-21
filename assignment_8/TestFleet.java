import java.util.*;

public class TestFleet{

/*
    Create a method called displayFleetProfit(Tractor fleet[]). This method will have a parameter
for the array of Tractors and use a loop to display the information about the tractors in a
tabular format. Use a for loop display the tractor id number, the Valuation and the
RentalProfit. Use the instanceof operator to record separate totalprofits for Loaders and
Harvesters. Include a title line with the Company name and column headings. Display the
total profits as well as the Harvester and Loader profit calculations at the bottom of the report.

 */
 
   public static void main(String[] a){
      tractor[] fleet = new tractor[9];
      tractor.Company = "BigLargeVehicle";
      Loader.Company = "BigLargeVehicle";
      Harvester.Company = "BigLargeVehicle";
      fleet[0] = new tractor("white", "001", 25, 1255);
      fleet[1] = new tractor("red", "002", 5, 1255);
      fleet[2] = new tractor("orange", "003", 125, 5);
      fleet[3] = new Loader("white", "011", 125, 125, 1);
      fleet[4] = new Loader("white", "012", 125, 125, 2);
      fleet[5] = new Loader("white", "013", 125, 125, 4);
      fleet[6] = new Harvester("white", "021", 25, 125, 2);
      fleet[7] = new Harvester("white", "022", 24, 125, 3);
      fleet[8] = new Harvester("white", "023", 125, 1255, 1);
      
      displayFleetProfit(fleet);

   }
   
  public static void displayFleetProfit(tractor fleet[]){
   
      int TotalProfit = 0;
      int TractorProfit = 0;
      int LoaderProfit = 0;
      int HarvesterProfit = 0;
      System.out.printf("\n%12s %12s %12s", "Vehicle ID", "Valuation", "Rental Profit");
      System.out.println();
            
      for (int x = 0; x < 9; x++){
         
         System.out.printf("%12s %12s %12s", fleet[x].getID(), fleet[x].Valuation(), fleet[x].calculateProfit());
         System.out.println();  
         
         TotalProfit += fleet[x].Valuation();
         
         if (fleet[x] instanceof Loader){
               LoaderProfit += fleet[x].Valuation();
         }
         
         else if (fleet[x] instanceof Harvester){
               HarvesterProfit += fleet[x].Valuation();
         }
         
      
      }
      
      System.out.println();
      System.out.println("Total Profits = $" + TotalProfit);
      System.out.println("Tractor Profits = $" + (TotalProfit - LoaderProfit - HarvesterProfit));
      System.out.println("Loader Profits = $" + LoaderProfit);
      System.out.println("Harvester Profits = $" + HarvesterProfit);
        
   } 
}

   