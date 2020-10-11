/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharmaproject1;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author rohani1596
 */
public class studentListing 
{
    
        private String name; //Key Field
        private String IdNumber;
        private String GPA; 
        
        public studentListing(String a, String b, String c)
        {
            this.name = a; 
            this.IdNumber = b; 
            this.GPA = c; 
        }
        
        public studentListing()
        {
            
        }
        
        public String toString()
        {
            return("Student name is: " +  name + "\n" + 
                    "Student ID is: " + IdNumber + "\n" + 
                    "GPA is: " + GPA);
        }
        
        public studentListing deepCopy()
        {
            studentListing clone = new studentListing(name, IdNumber, GPA);
            return clone; 
        }
        
        public int compareTo(String targetKey)
        {
            return(name.compareTo(targetKey)); 
        }
        
        public void input()
        {
            name = JOptionPane.showInputDialog("Enter a name: "); 
            
            IdNumber = JOptionPane.showInputDialog("Enter a ID: "); 
            
            GPA = JOptionPane.showInputDialog("Enter a GPA: "); 


        }
    

        public void setName(String name) 
        {
            this.name = name;
        }

        public void setIdNumber(String IdNumber) 
        {
            this.IdNumber = IdNumber;
        }

        public void setGPA(String GPA) 
        {
            this.GPA = GPA;
        }

        public String getName() 
        {
            return name;
        }

        public String getIdNumber() 
        {
            return IdNumber;
        }

        public String getGPA() 
        {
            return GPA;
        }
            
        
    }

    


