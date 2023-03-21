public class testTractorLoaderHarvester{
   public static void main(String[] args){
      /*
         Tractor(Color, Vehicle ID, RentalRate, RentalDays, Profit Calc)
         Harvester + TrailerSize, updated profit calc, updated rentaldays
         Loader + TowSize, updated profit calc
         */
      
         try{
         
      
               tractor red = new tractor();
               red.setColor("Cherry");
               red.setID("001");
               red.setRentalRate(125);
               red.setRentalDays(25);
               //System.out.println(red.toString());
               red.saveData("tractor.data");
               red.loadData("tractor.data");
               System.out.println(red);

      
      
      
               Loader green = new Loader();
               green.setColor("Fern");
               green.setID("002");
               green.setRentalRate(125);
               green.setBucketSize(5);
               green.setRentalDays(25);
               
               //System.out.println(green.toString());
      
      
      
               Harvester white = new Harvester();
               white.setColor("Pearl");
               white.setRentalRate(125);
               white.setTrailerSize(3);
               
               //System.out.println(white.toString());   
         
         } //catch (tractorException e) {
      //  System.out.println(e.getMessage());
    //} 
    catch (Exception e) {
        System.out.println("General Exception");
    }
          
   

   
   
   }
}