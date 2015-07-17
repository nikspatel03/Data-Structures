
public class Queue {
	
	public static final int MAX_SIZE = 10;
	int[] A = new int[MAX_SIZE];
	int front;
	int rear;
	int count;
	
	
	public Queue(){
		
		front = -1;
		rear = -1;
		count = 0;
		
	}
	
	
	public void enQueue(int data){
		if(isEmpty()){
			front = 0;
			rear = 0;
		}
		else if(isFull()){
			System.out.println("Can not inserted: Queue Full");
			return;
		}
		else{
			rear = (rear+1) % MAX_SIZE;
		}
		
		A[rear] = data;
		//count++;
		
	}
	
	
	public void deQueue(){
		
		if(isEmpty()){
			System.out.println("Queue is empty:");
			return;
		}
		else if(front == rear){
			front = -1;
			rear = -1;
		}
		else{
			front = (front+1) % MAX_SIZE;
		}
		//count--;
	}
	
	public int front(){
		
		if(isEmpty()){
			System.out.println(" Queue Empty");
			return -1;
		}
		else{
			return A[front];
		}
	}
	
	public void printQueue(){
		
		if(isEmpty()){
			System.out.println("Queue is Empty:");
			return;
		}
		else{
		
		
		count = (rear+MAX_SIZE-front)%MAX_SIZE + 1;
		 
		for(int i=0 ; i<count; i++){
			int index = (front+i) % MAX_SIZE;
			System.out.println(Integer.toString(A[index]));
		}
		
		}
	}
	
	
	public boolean isEmpty(){
		
		if(front == -1 && rear == -1){
			return true;
		}
		
		return false;
		
	}
	
	public boolean isFull(){
		
		if((rear+1)%MAX_SIZE == front ){
			
			return true;
		}
		return false;
		
	}
	

	

}
