
public class DLinkedList {
	
	int count;
	Node head;
	
	
	public DLinkedList(){
		
		count = 0;
		head = null;

	}

	
	public void addAtBegin(int data){
		
		if(head == null){
			
			head = new Node(data);
			
		}
		else{
			//Node current = head;
			Node newNode = new Node(data);
			
			head.prev = newNode;
			newNode.next = head;
			
			head = newNode;
			
		}
		
		count++;
		
	}
	
	
	
	public void addAtLast(int data){
		
		
		if ( head == null){
			
			head = new Node(data);
			
			
		}
		else{
			
			Node current = head;
			
			while (current.next != null){
				
				current = current.next;
			}
			
			Node newNode = new Node(data);
			
			current.next = newNode;
			newNode.prev = current;
			
		}
		count++;
		
	}
	
	
	public void ReversePrintDLL(){
		
		if(head == null){
			System.out.println("Empty");
		}
		else{
			
			Node current = head;
			
			while(current.next != null){
				
				current = current.next;
			}
			
			while(current != null){
				
				
				System.out.println(Integer.toString(current.data));
				current= current.prev;
			
			}
			
		}
			
			
			
			
			
			
		}
				
	
	public void Print(){
		
		if ( head == null ){
			
			System.out.println("Empty Linked Lidt");
			
		}
		else
		{
				Node current = head;
	
				while(current != null){
					System.out.println(Integer.toString(current.data));
					current = current.next;
				}
				
		}
		
		
	
	}
	
	


}
