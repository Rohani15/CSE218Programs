
package p8sharma;
import javax.swing.JOptionPane;

public class StudentListing
{
  
   private String name; //Key Field
   private String IdNumber;
   private String GPA;
  
   public StudentListing(String a, String b, String c)
   {
       this.name = a;
       this.IdNumber = b;
       this.GPA = c;
   }
  
   public StudentListing()
   {
  
   }
  
   public String toString()
   {
       return("Student name is: " + name + "\n" +
       "Student ID is: " + IdNumber + "\n" +
       "GPA is: " + GPA);
   }
  
   public StudentListing deepCopy()
   {
       StudentListing clone = new StudentListing(name, IdNumber, GPA);
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
