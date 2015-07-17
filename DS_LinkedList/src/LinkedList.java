
public class LinkedList {
	
	private Node head;
	private int count;
	
	public LinkedList(){
		count = 0;
		head = null;
	}
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	public void addAtLast(int data){
		
		if(head == null){
			
			head = new Node(data);
			
		}
		else{
			
			Node current;
			current = head;
			
			while(current.next != null){
				
				current = current.next;
				
			}
			
			Node newnode = new Node(data);
			
			current.next = newnode;
			
		}
		
		count++;
		
	}
	
	public void addAtBegin(int data){
		
		if(head == null){
			
			head = new Node(data);
			
		}
		else{
			Node newNode = new Node(data);
			newNode.next=head;
			head=newNode;
		}
		
		count++;
		
	}
	
	
	public void addAtNth(int data,int index){
		
		if (index > count+1 || index <= 0){
			System.out.println("Index Not Valid");
			System.exit(0);
		}
		
		if (index == 1){
			
			if(head == null){
				
				head = new Node(data);
				
			}
			else{
				Node newNode = new Node(data);
				newNode.next = head;
				head = newNode;
			}
			
			
		}
		else{
			
			Node current = head;
			
			for(int i=0 ; i< index-2 ; i++){
				
				current = current.next;
				
			}
			
			Node newNode = new Node(data);
			
			newNode.next = current.next;
			current.next = newNode;
	
		}
	
		count++;
	
	}
	
	
	
	public void deleteAtNth(int index){
		
		if (index > 0 && index <= count){
			
			if(index == 1){
				
				head = head.next;
	
			}
			else{
				
				Node current = head;
				
				for(int i=0 ; i< index-2; i++){
					
					current = current.next;
					
				}
				
				current.next = current.next.next;
				
			}
			
			count--;
			
		}
		else{
			System.out.println("index not Valid");
			System.exit(0);
		}
		
		
	}
	
	
	
	public void ReverseLinkedList(){
		
		Node current = head;
		Node previous=null;
		Node next;
		
		while(current != null){
			
			next= current.next;
			
			current.next= previous;
			
			previous=current;
			current = next;
		}
		
		head = previous;

	}
	
	
	
	public void print(){
		
		if(head  == null){
			
			System.out.println("Empty Linked List");
		}
		else
		{
		
			Node current;
			current = head;
			
			while(current != null){
				
				System.out.println(Integer.toString(current.data));
				current = current.next;
				
				
			}
		 	
		}
		}
	}


