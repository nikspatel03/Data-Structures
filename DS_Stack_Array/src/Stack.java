import java.util.ArrayList;


public class Stack {
	
	public static final int MAX_ARRAY = 100;
	
	int[] A = new int[MAX_ARRAY];
	
	//ArrayList<Item> A = new ArrayList<Item>();
	
	
	int top;
	
	
	public Stack(){
		top = -1;
	}
	
	
	public void push(int data){
		
		if (top == MAX_ARRAY - 1 ){
			System.out.println("Stack overflow");
			return;
		}
		
		//top++;
		A[++top] = data;
		
	}
	
	public void pop(){
		
		if(top == -1){
			
			System.out.println("Stack is Empty: Invalid Operation");
			return;
		}
		
		top--;
		
		
	}
	
	public boolean isEmpty(){
		
		if(top == -1){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public int top(){
		return A[top];
	}
	
	public void print(){
		
		//System.out.println("Stack:");
		
		for(int i =0;i<=top;i++){
			System.out.println(Integer.toString(A[i]));
		}
		
		
	}
	
	

}
