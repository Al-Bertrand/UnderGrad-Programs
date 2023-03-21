/* Alexis Bertrand
CS250
Student Program 2
//need stu_ID[], stu_name[], and stu_grade[] which stores the data as data in entered
      This means we also need the program to recognize when it is not sequential
         Does this mean I need the program to return the IDs ordered properly?
         
Make room to enter 100 IDs, 100 students, and 100 grades properly connected to one another
also have display()
   this time display the IDs properly sorted smallest is largest
also have classAVG()
also have findid()

display() magnitude is...
classAVG() magnitude is...
findid() magnitude is...
*/

import java.util.*;

public class student2
{

   public static void display(int idPlace[], String names[], int grade[])
   {
      //for the array length, display student records
      // O(n^2) because there is a nested for() loop
       
      for(int i = 0; i<idPlace.length; i++) 
      {
         if(names[i] !=null)
          System.out.println(idPlace[i] + " " + names[i] + " " + grade[i]+ "\n");            
      }
   }
   
   public static void classAVG(int avg[]) //O(n)
   {
   
      double total = 0;
      int classAVG = 0;
      int count = 0;
         
      for(int i=0; i<avg.length; i++)
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

       
   
   public static void main(String a[])
   {
    int[] stu_grade = new int[101];
    String[] stu_name = new String[101];
    int[] stu_ID = new int[101];
    int something=0;
    boolean done=false;
    int student_count=0;
    
    Scanner input = new Scanner(System.in);
    while (!done) 
    {
        System.out.print("Enter a student ID 1-100(0 to exit):");
        something = input.nextInt();
        while (something<0 || something>100) 
        {
            System.out.print("\nInvalid!!! Enter a student ID 1-100(0 to exit):");
            something = input.nextInt();
        }
        if (something==0) done=true;
        else 
        {
            // enter the part name and part quantity
            // store the data into the next available slot
            // of the partially full array
            stu_ID[student_count]=something;
            System.out.print("Enter a student name:");
            input.nextLine(); // remove the leftover
            stu_name[student_count] = input.nextLine();
            System.out.print("Enter the grade:");
            stu_grade[student_count] = input.nextInt();
            student_count++;
        }
    }
    
    display(stu_ID, stu_name, stu_grade);
    classAVG(stu_grade);
        
   }
}
/*
The first distinct difference between student1 and student2 is the way the ID values are stored. 
With student1, my ID is automatically assigned while in sutdent2 I am allowed to assign the value of the ID to the array location. 
However, with stuent2, without a method of sorting the data either by name or by sequential ID number, it looks clunky to me.
I think we will come across systems to sort both of these methods by reading the values inside of the array to sort them. 
*/