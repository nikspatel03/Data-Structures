import java.util.Scanner;


public class StackDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result;
		//EvaluatePostFix obj = new EvaluatePostFix();
		
		EvaluateInfix obj_infix = new EvaluateInfix();
		
		/*Stack obj1 = new Stack();
		
		
		obj1.push(2);
		obj1.push(4);
		obj1.push(6);
		
		obj1.pop();
		
		obj1.push(88);
		
		obj1.pop();
		obj1.pop();
		
		
		obj1.print();*/
		
		System.out.println("Enter Infix Notation: ");
		
		String s;
		Scanner in = new Scanner(System.in);
		s = in.nextLine();
		
		//result = obj.evaluatePostFix(s);
		result = obj_infix.evaluteInfix(s);
	
		in.close();
		
		System.out.println("Answer is : "+Integer.toString(result));
		
	}

}
