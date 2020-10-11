// THE APPLICATION CLASS
package sharmaproject1;

import java.util.Hashtable;
import javax.swing.JOptionPane;

public class studentApplication //extends studentListing 
{ 
 public static void main(String[] args)

   {
       int options = 0;
       String inputTotal = JOptionPane.showInputDialog("Enter the number of operations: ");

       studentListing s1 = new studentListing();
       UOAUtilities u1 = new UOAUtilities(Integer.parseInt(inputTotal));
       
       String number = JOptionPane.showInputDialog("Enter the number of Students: "); 
       int num = Integer.parseInt(number);
       
       //Object[] originalArray = new Object[(Integer.parseInt(inputTotal))]; 
       //int count;
       //int temp; 
 
       
       for (int i = 0; i < num; i++) 
       {   
           if(options < 1 || options > 6)
            {
                System.out.println("Invalid: "); 
            } 
            else
            {
                System.exit(0); 
            }   
           s1.input();
                if (!u1.insert(s1.deepCopy())); 
                {
                    System.out.println("No space");      
                }
       }   
       //SWITCH STATEMENT: 
        while (options != 6)
       {
         
            String pickoptions = JOptionPane.showInputDialog("SELECT AN OPTION: "+
                                                            "\n\ninsert new student's information: 1 " + 
                                                            "\nfetch and output a student’s information: 2 " + 
                                                            "\ndelete a student’s information: 3 " + 
                                                            "\nupdate a student’s information: 4 " +
                                                            "\noutput all student’s information: 5 " +
                                                            "\nexit the program: 6 " +
                                                            "\n\n"); 
           options = Integer.parseInt(pickoptions);
           switch (options) 
           {
           case 1: //Insert
               s1.input();
               u1.insert(s1);
               JOptionPane.showMessageDialog(null, "Successfull.");
               break;
            
           case 2: //Fetch
               s1 = u1.fetch(JOptionPane.showInputDialog("Enter name to Fetch: "));
               System.out.println("Fetched: " + s1);
               break;

           case 3: //Delete
               String targetKey1 = JOptionPane.showInputDialog("Students to be Deleted"); 
               u1.delete(targetKey1);
              
               u1.delete(inputTotal);
               JOptionPane.showMessageDialog(null, "Successfull.");
               break;

           case 4: //Update
               String targetKey = JOptionPane.showInputDialog("Students to be Updated");
               s1.input();
               u1.update(targetKey, s1.deepCopy());
               JOptionPane.showMessageDialog(null, "Successfull.");
               break;

           case 5: //Output 
               u1.showAll();
               break;

           case 6: //Exit program
               System.exit(0); 
               break;
           }

       }
    //Modify the data structure class so that it expands (doubles in size) when full


   }
   
 
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
            

