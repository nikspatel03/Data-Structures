
public class Queue {

	Node front;
	Node rear;
	int count;
	
	
	public Queue(){
		front=null;
		rear =null;
		count = 0;
	}
	
	
	public void enQueue(int data){
		
		if(front == null && rear == null ){
			
			front = new Node(data);
			rear = front;
			
		}
		else{
			
			Node newNode = new Node(data);
			rear.next = newNode;
			rear = newNode;
		
		}
		
		count++;
		
	}
	
	public void deQueue(){
		
		if(front == rear){
			front = null;
			rear=null;
		}
		else{
			front = front.next;
		}
		count--;
	}
	
	public boolean isEmpty(){
		if(front ==null && rear ==null){
			return true;
		}
		else
			return false;
	}
	
	public int front(){
		if(front == null && rear == null){
			System.out.println("Empty Queue");
			return -1;
		}
		else{
			return front.data;
		}
	}
	
	public void print(){
		
		Node tempNode = front;
		
		while(tempNode!= null){
			
			System.out.println(Integer.toString(tempNode.data));
			tempNode=tempNode.next;
			
		}
		
	
	}
	
	
	
	
	
	
	
	
	
}
