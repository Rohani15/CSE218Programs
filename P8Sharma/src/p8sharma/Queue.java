package p8sharma;

public class Queue<T>
{
   private T[] data;
   private int size;
   private int numOfNodes;
   private int front;
   private int rear;
  
   public Queue()
   {
       size = 100;
       numOfNodes = 0;
       front = 0;
       rear = 0;
       data = (T[])new Object[100];
   }
   public Queue(int n)
   {
       size = n;
       numOfNodes = 0;
       front = 0;
       rear = 0;
       data = (T[])new Object[n];
   }
  
   public boolean enque(T newNode)
   {
       if(numOfNodes == size) //if there is an overflow error
           return false; 
       else
       {
           numOfNodes = numOfNodes +1;
           data[rear] = newNode;
           rear = (rear +1) % size;
           return true; 
       }
   }
  
   public T deque()
   {
       //undeflow
       int frontLocation;
       if(numOfNodes == 0)
           return null; 
       else
       {
           frontLocation = front;
           front = (front + 1) % size;
           numOfNodes = numOfNodes -1;
           return data[frontLocation];
       }
   }
  
   public void showAll()
   {
       int i = front;
       for(int c = 1; c <= numOfNodes; c++)
       {
           System.out.println(data[i].toString( ));
           i = (i + 1) % size;
       }
   }
}

