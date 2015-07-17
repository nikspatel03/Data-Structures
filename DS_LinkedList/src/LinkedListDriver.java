
public class LinkedListDriver {
	
	public static void main (String[] args){
	
		LinkedList obj1 = new LinkedList();
		
		obj1.addAtBegin(2);
		obj1.addAtBegin(1);
		obj1.addAtLast(3);
		obj1.addAtNth(4,4);
		obj1.addAtNth(5,5);
		
		//obj1.deleteAtNth(1);
		
		obj1.ReverseLinkedList();
		
		obj1.print();
	
	}
	
	

}
