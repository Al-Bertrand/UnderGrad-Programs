public class minesweeper{
   public static void main(String[] args){
   
      int m = Integer.parseInt(args[0]);//rows directly from the user in the argument line
      int n = Integer.parseInt(args[1]);//columns directly from the user in the argument line
      double p = Double.parseDouble(args[2]);//probablity calculator strictly less than 1 holding a lot of digits
                                             //directly from the user in the argument line

      boolean[][] field = new boolean[m+2][n+2];//create a boolean array
      field[m][n] = false;//declare everything false; we want to check each slot and change it to true in order to print
         //we want to check each slot against true
   
      for(int row = 0; row < m; row++){         
         for(int col = 0; col < n; col++){
            int prob = (int)(Math.random()*(100));
            if(prob < p){
               field[row][col] = true;
               
            }
            else{
               field[row][col] = false;
            }
            
            
            //if statement for pretty
            if(field[row][col]==true){System.out.print("* ");}
            else{
               System.out.print("- ");
            }
            //System.out.print(field[row][col] + " ");
         }
         System.out.println(); //space to go to next row
        }
        System.out.println();
      
      //calculate the proximity array which tells me, from each spot, how far away my space is from the mine
      //same row and col loop
      //we'll have an if statement that checks every cell around it we'll have 8 if statements to check the area
      
      
      
      //boolean BombBoolean = true;
      //int modular = BombBoolean ? 2 : 0;
           
      int[][] ProxArray = new int[m+2][n+2];
      
      for(int row = 0; row < m; row++){         
         for(int col = 0; col < n; col++){
           
                int count = 0;
                
                // cell 0,0 because it only has 3 touching squares
                if (row > 0 && field[row-1][col]==true) count++;
                // Bottom Cell
                if (row < m && field[row + 1][col]==true) count++;
                // Left Cell
                if (col > 0 && field[row][col - 1]==true) count++;
                // Right Cell
                if (col < n && field[row][col + 1]==true) count++;
                // Top Left Diagonal
                if (row > 0 && col > 0 && field[row - 1][col - 1]==true) count++;
                // Bottom Right Diagonal
                if (row < m && col < n && field[row + 1][col + 1]==true) count++;
                // Top Right Diagonal
                if (row > 0 && col < n && field[row - 1][col + 1]==true) count++;
                // Bottom Left Diagonal
                if (row < m && col > 0 && field[row + 1][col - 1]==true) count++;
                // Store the count in the "surroundingMines" array
                ProxArray[row][col] = count;     
         }
      }
      
      for(int row = 0; row<m; row++){
         for(int col = 0; col < n; col++){
            if(field[row][col]==true){
               System.out.print(" * ");
            }
            else{   
               System.out.print(ProxArray[row][col]  + " ");
            }
         }
         
         System.out.println();
      }
  }
}
 
 //you can use 8 if statements using pluses and minuses to count up the stuff going on around the thing
