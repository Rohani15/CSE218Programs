
package p8sharma;

public class Main 
{

   public static void main(String[] args) 
   {

       Queue<StudentListing> queue = new Queue<StudentListing>(10);

       StudentListing l1 = new StudentListing();
       StudentListing l2 = new StudentListing();
       StudentListing l3 = new StudentListing();
      
       l1.input();
       queue.enque(l1);
       l2.input();
       queue.enque(l2);
       l3.input();
       queue.enque(l3);
      
       System.out.println(queue.deque());
       System.out.println(queue.deque());
       System.out.println(queue.deque());
   }

}