
public class QueueDriver {
	
	
	public static void main(String[] args) {
		
		
		Queue obj = new Queue();
		
		obj.enQueue(1);
		obj.deQueue();
		obj.enQueue(2);
		obj.enQueue(3);
		int front = obj.front();
		System.out.println(Integer.toString(front));
		obj.printQueue();
		
		
		
		
	}

}
