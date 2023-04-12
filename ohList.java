/*Alexis Bertrand
CS250
OList

Add( String value )
   Adds the value in the list in the correct location.
Remove( String value )
   Remove the value from the list
toString() 
Display(), 
size(),
 a constructor method
You may add some private “helper” methods
*/



class node{
   String str;
   
}

class Node {
   //str and link to next node
    String str;
    Node nextnode;
    
}

public class ohList  {
      
      Node firstnode = null;
      protected int size = 0;
      
      //constructor
     ohList(){
         firstnode = null;
         size = 0;
      }
      
      //add string item
      public String add(String s){
            Node newnode = new Node();
            newnode.str = s;
            newnode.nextnode = firstnode;
            firstnode = newnode;
            size++;   
      
         return null;
      }
      
      public int addEnd(String s) {
          // O(n)
          // we could do some validation here if needed
          Node newnode = new Node();
          Node current;
          newnode.str = s;

          if (firstnode!=null) {
             current = firstnode;
             // finding the end of the list
             while(current.nextnode!=null) {
                 current = current.nextnode;
             }
             // add the new node to the end of the list
             current.nextnode = newnode;
          } else firstnode = newnode;

          size++;
          return 0;
    }
      
    void add_front(String s) {
        // create a node
        Node newnode = new Node();
        // add the node to the linklist   
        if (firstnode ==null) {
           firstnode = newnode;  
        } 
        else {
            //first.next=newnode;
            newnode.nextnode=firstnode;
            firstnode=newnode;
        }
        size++;
    }
    
    public int addAt(String s) {
         Node newnode = new Node();
         newnode.str = s;
                  
    
         //if the first node is empty, add
         if (firstnode==null) {
            this.add(s);
            return 0;
         }
         
        else if(s.compareTo(firstnode.str) < 0) {          
        // if the char value between the new string and the first node is less than zero--like Bird comes before Anaconda, then put in the front
           this.add(s);
           return 0;
        }
        
        else {
            //traverse until it is != 0, add(s);
            Node current = firstnode;
            Node previous = null;
            
            while(current.str.compareTo(newnode.str) < 0)//while current node is less than what I'm trying to add, then we'll keep looking 
            {
               previous = current;
               current = current.nextnode;
               if(current == null)  {
                  break;
               }
            }
            previous.nextnode = newnode;
            newnode.nextnode = current;            
        }
        
        size++;
        return 0;
      }
         
         
            
    // remove from the front of the list and return the value
    public String remove() {
        String str = null;
        // throw an exception if the list is empty
        if (firstnode!=null) {
             str = firstnode.str;
             // remove the firstnode
             firstnode = firstnode.nextnode;
             size--;
        }
        return str;
    }
    
    public int getSize() {
        // O(1)
        return size;
    }
    
    public String toString() {
        // O(n)
        String out = "(" + getSize()+ ") ";
        Node current = firstnode;
        
        while(current!=null) {
            out += " " + current.str;
            current = current.nextnode;
        }
        return out;
    }
    
    void display() {
        Node current = firstnode;
        
        System.out.print( "Size=" + size +  ": ");
        
        while (current!=null) {
            System.out.print( current.str + "   ");
            current = current.nextnode;
        }
        System.out.println();
    }

      public static void main(String[] a) {
            ohList mylist = new ohList();
            
            mylist.addAt("Umbreon");
            mylist.addAt("Nidoking");
            mylist.addAt("Bowser");
            mylist.addAt("Kirby");
            mylist.addAt("Olimar");
             mylist.addAt("Mario");

            
            
            //I have not figure out the middle part...
            mylist.addAt("Articuno");
            
            
            
            mylist.display();
     
      }
}
