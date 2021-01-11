import java.util.Scanner;
public class Queue1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the queue:");
	int n=sc.nextInt();
	new Queue();
	new Queue(n);
 }
}

class Queue{
	
	int front=-1,rear=-1,item;
    int[]arr=new int[15];
    Queue()
	{
		System.out.println("\nPERFORMING QUEUE OPERATIONS\n------------------------------\n");
	}
	Queue(int n)
	{
		int choice;
		do {
		      Scanner sc1=new Scanner(System.in);
		      System.out.println("\nOPERATIONS\n-----------\n1.ENQUEUE\n2.DEQUEUE\n3.DISPLAY\n");
	          System.out.println("Enter choice:");
		      choice=sc1.nextInt();
		       switch(choice)
		       {
		         case 1:
			     enqueue(n);
			     break;
		         case 2:
			     dequeue(n);
			     break;
		         case 3:
			     display(rear);
			     break;
		         case 4:
		        	 System.exit(0);
		        	 
		         default:
			     break;			
			
		       }
		}while(choice<5); 	
		
	}
	void enqueue(int n)
	{
		if(rear>=n-1)
		{
			System.out.println("\n Overflow");
		}
		else
		{
			if(front==-1&&rear==-1)
			{
				front++;
			}
			System.out.println("\nEnter the element to be inserted: ");
			Scanner sc2=new Scanner(System.in);
			item=sc2.nextInt();
			rear++;
			arr[rear]=item;
		}
	}
	void dequeue(int n)
	{
		if(front==-1)
		{
			System.out.println("\n Underflow");
		}
		else {
			    int del=arr[front];
			    System.out.printf("Deleted element is: %d",del);
			   if(front==rear)
			   {
				 front=-1;
				 rear=-1;
			   }	
			  else
			  {
				  front++;
			  }
			
		   }
		
	}
	void display(int rear)
	{
		System.out.println("Displaying elements");
		for(int i=front;i<=rear;i++)
		{	
			System.out.printf("%d ",arr[i]);
		}
	}
}