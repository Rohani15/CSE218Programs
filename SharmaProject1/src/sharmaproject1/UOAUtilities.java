// The Data Structure Class
package sharmaproject1;

public class UOAUtilities
{   private int next;
    private int size;
    private studentListing[ ] data;
    
    private int array[]; 
    private int temp; 
    private int sizeA;
    private int count; 

    public UOAUtilities ( )
    {  next = 0;
        size = 100;
        data = new studentListing[size];
     }//end of constructor

    public UOAUtilities (int s)
     {  next = 0;
        data = new studentListing[s];
        size = s;
     }//end of constructor
    
     public boolean insert(studentListing newStudentListing)
     {  if(next >= size)  // the structure is full
            return false;
         data[next]= newStudentListing.deepCopy( );  // store a deep copy of the client’s node
         if(data[next] == null)
            return false;
         next = next + 1; // prepare for the next insert
           return true;
     }// end of insert method

     public studentListing fetch(String targetKey)
     {  studentListing node;
         studentListing temp;
       // access the node using a sequential search
         int i = 0;
         while ( i < next && !(data[i].compareTo(targetKey) == 0))
         {  i++;
         }
       if(i== next) // node not found
           return null;
       //deep copy the node's information into the client's node
          node = data[i].deepCopy( );
       // move the node up one position in the array, unless it is the first node
          if(i != 0) // bubble-up accessed node
         {   temp = data[i-1];
              data[i-1] = data[i];
              data[i] = temp;
         }
         return node;
     } // end of fetch method
     

     public boolean delete(String targetKey)
     {// access the node using a sequential search
         int i = 0;
         while (i < next && !(data[i].compareTo(targetKey) == 0))
         {   i++;
         }
         if(i == next) // node not found
             return false;
         //move the last node into the deleted node's position
          data[ i] = data[ next -1];
          data[next-1] = null;
          next = next - 1;
          return true; // node found and deleted
     }//end of the delete method

      public boolean update(String targetKey, studentListing newNode)
     {  if(delete(targetKey) == false)  // node not in the structure
             return false;
         else if( insert(newNode ) == false)  // insufficient memory
             return false;
         else
             return true;  // node found and updated
      }// end of update method
      public void showAll( )
      {  for(int i = 0; i< next; i++)
              System.out.println(data[i].toString( ));
      }// end showAll method

    // function makes size double of array 
    private void doubleSize() 
    { 
        int temp[] = null; 
        if (count == sizeA) 
        { 
            // temp is a double size array of array 
            // and store array elements 
            temp = new int[sizeA * 2]; 
            { 
                for (int i = 0; i < sizeA; i++) 
                { 
                    // copy all array value into temp 
                    temp[i] = array[i]; 
                } 
            } 
        }
    }
}
//end of class UOAUtilities







