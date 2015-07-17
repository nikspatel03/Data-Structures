import java.util.Scanner;



public class EvaluteDriver {
	
	public static void main(String[] args) {
		
		String userinput;
		boolean result;
		
		System.out.println("Enter any Expression");
		
		Scanner in = new Scanner(System.in);
		
		userinput = in.nextLine();
		
		
		EvaluateExp obj1 = new EvaluateExp();
		
		result = obj1.evaluateExpression(userinput);
		
	
		InfixtoPostfix obj_infix = new InfixtoPostfix();
		
		String result1 = obj_infix.infixToPostfix(userinput);		
				
		System.out.println(result1);
		
		
		in.close();
		
	/*	if(result == true){
			System.out.println("Balanced");
		}
		else{
			System.out.println("UnBalanced");
		}
	*/
		
		
	}

}
