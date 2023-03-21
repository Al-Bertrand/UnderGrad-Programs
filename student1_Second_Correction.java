/* Alexis Bertrand
CS250
Student Program 1
Store student names stu_name[]
Store student grades stu_grade[]
Make room to enter 100 students and 100 grades belonging to each student

Edit: the first time I submitted this, I forgot the findid() method)
*/
import java.util.*;

public class student1_Second_Correction
{

   public static void display(String names[])
   {
      //for the array length, display student records
      // O(n)  
       
      for(int i = 1; i<names.length; i++) 
      {
         if(names[i] != null)
          System.out.println("  " + names[i]);
      }
   }
   
   public static void classAVG(int avg[])
   {
   
      double total = 0;
      int classAVG = 0;
      int count = 0;
         
      for(int i=1; i<avg.length; i++)
      {
            if(avg[i] != 0)
            {
            total += avg[i];
            count++;
            }
       }
       classAVG = (int)((total/count));
       System.out.println("The class average is: " + classAVG);   
    }
    
    public static int findid(String[] name, int[] grade, int ID) 
    {
    if (grade[ID]==0) 
    {
        System.out.println("Student ID " + ID + " not found!!!");
        return -1;
    } else {
        System.out.print("Found student record: " + ID + " Name: " + name[ID] + 
            " Grade: " + grade[ID] + "\n");
    }
    return ID;
    }
   
   public static void main(String[] args)//let's load the students and the grades
   {
         String[] stu_name = new String[101];//array for the names
         int[] stu_grade = new int[101];//array for the grades
         int stu_ID = 0; //initializing ID to slot 0
         boolean done = false;//help us stop
         
         Scanner input = new Scanner(System.in);//taking input from the keyboard
         while(!done)
         {
               System.out.print("Enter a student ID (enter 0 to exit): ");
               stu_ID = input.nextInt();
               
               while(stu_ID<0 || stu_ID>100)
                  {
                     System.out.print("Invalid! Please try another student ID (enter 0 to exit): ");
                     stu_ID = input.nextInt();
                  }
                  
               if (stu_ID==0) done=true;//when we trigger the end of the entry process     
                         
               else 
               {  
                  System.out.print("Enter a student name: ");//student name
                  input.nextLine(); // remove the leftover
                  stu_name[stu_ID] = input.nextLine();
                  System.out.print("Enter student score:");
                  stu_grade[stu_ID] = input.nextInt();
               } 
         }
         display(stu_name);
         classAVG(stu_grade);
         
         System.out.println();
         
         boolean exit = false;
         
         while(!exit)
         {
            System.out.print("Enter ID to recieve a report (0 to exit): ");
            stu_ID = input.nextInt();
            
            while(stu_ID < 0 || stu_ID > 100)
            {
               System.out.print("Invalid record! Please enter a student ID to receive a report (0 to exit): ");
               input.nextInt();
            }
            
            if(stu_ID==0) exit = true;
            
            else
            {
               int id2Find = stu_ID;
               findid(stu_name, stu_grade, id2Find);
            }
         }
    } 
   
}



/*
The magnitude of display() is O(n).
The magnitude of classAVG() is O(n).
The magnitude of main() is O(n^2).

The first distinct difference between student1 and student2 is the way the ID values are stored. 
With student1, my ID is automatically assigned while in sutdent2 I am allowed to assign the value of the ID to the array location. 
However, with stuent2, without a method of sorting the data either by name or by sequential ID number, it looks clunky to me.
I think we will come across systems to sort both of these methods by reading the values inside of the array to sort them. 
*/