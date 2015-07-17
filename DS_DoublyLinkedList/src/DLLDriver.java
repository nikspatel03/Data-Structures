
public class DLLDriver {
	
	
	public static void main(String[] args) {
		
		
		DLinkedList obj1 = new DLinkedList();
		
		
		obj1.addAtBegin(3);
		obj1.addAtBegin(2);
		obj1.addAtBegin(1);
		
		obj1.addAtLast(4);
		obj1.addAtLast(5);
			
		obj1.Print();
		
		System.out.println("Reverse Order");
		
		obj1.ReversePrintDLL();
		

	}

}
