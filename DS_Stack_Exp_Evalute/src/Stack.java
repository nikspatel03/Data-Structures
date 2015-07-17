
public class Stack {
	
	Node head;
	int count;
	
	public Stack(){
		head = null;
		count = 0;
	}
	
	public void push(char data){
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
			System.out.println("Not Valid Operation");
			return;
		}
		else{
			head = head.next;
		}
		count--;
	}
	
	public char top(){
		if(head == null){
			return '\0';
		}
		return head.data;
		
	}
	
	public boolean isEmpty(){
		
		if(head == null){
			return true;
		}
		else{
			return false;
		}
		
	}

}
