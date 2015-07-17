
public class EvaluateInfix {
	
	int length;
	
	
	Stack obj = new Stack();
	
	
	public int evaluteInfix(String exp){
		
		length = exp.length();
		
		for(int i=length-1 ; i>=0 ; i--){
			
			char temp = exp.charAt(i);
			
			if(isNumeric(temp)){
				
				obj.push(Character.getNumericValue(temp));
				
			}
			else if(isOperator(temp)){
				
				int op1 = obj.Top();obj.pop();
				int op2 = obj.Top();obj.pop();
				
				int result = evalute(temp, op1, op2);
				
				obj.push(result);
				
			}
			else{
				System.out.println("Not valid");
			}
		
		}
		
		return obj.Top();
	}
	
	public boolean isNumeric(char temp){
		if(temp >= '0' && temp <= '9'){
			return true;
		}
		return false;
	}
	
	public boolean isOperator(char temp){
		if(temp == '+' || temp == '-' || temp == '*' || temp =='/'){
			return true;
		}
		return false;
	}
	
	public int evalute(char temp,int op1,int op2){
		
		if(temp == '+')
			return op1 + op2;
		if(temp == '-')
			return op1 - op2;
		if(temp == '*')
			return op1 * op2;
		if(temp == '/')
			return op1 / op2;
		
		return -1;
		
	}
	

}
