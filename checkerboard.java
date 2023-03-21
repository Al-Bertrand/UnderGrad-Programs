//checkerboard problem 1 3 29
//Alexis Bertrand - CS214
//02 09 2023

//for checkerboard to work

public class checkerboard{

   public static void main(String[] args){
      //we want to take command-line arguments
      //
      int n = Integer.parseInt(args[0]);
      //print a square for the astericks to go in
      
      for(int i = 0; i<=n; i++){ //first slot of the row
         for(int j=0; j<n; j++){
            if(i%2==0 && j%2==0){
               System.out.print("x ");         
             }
             else if (i%2!=0 && j%2!=0){
               System.out.print("x ");
             }
             
             else{
               System.out.print("o ");
             }
             
         }
         System.out.println();         
      }
   }
}