
public class Stack {
	
	int count;
	Node head;
	
	
	public Stack(){
		
		count = 0;
		head = null;
		
	}
	
	
	public void push(int data){
		
		if(head == null){
			head = new Node(data);
		}
		else{
			
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
		
		count++;
		
		
	}
	
	public void pop(){
		if(head == null){
			System.out.println("Underflow");
			return;
		}
		else{
			head = head.next;
		}
		
	}
	
	public boolean isEmpty(){
		
		if(head == null){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public int Top(){
		
		return head.data;
		
		
	}
	
	public void print(){
		
		Node current = head;
		
		while(current != null){
			
			System.out.println(Integer.toString(current.data));
			
			current = current.next;
			
		}

	}

}
