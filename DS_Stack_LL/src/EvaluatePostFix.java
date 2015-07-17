
public class EvaluatePostFix {
	
	int length;
	
	Stack obj = new Stack();
	
	public int evaluatePostFix(String exp){
		
		length = exp.length();
		
		for(int i=0;i<length;i++){
			
			char temp = exp.charAt(i);
			
			if(isNumeric(temp)){
				
				obj.push(Character.getNumericValue(temp));
				//System.out.println(temp);
				
			}
			else if(isOperator(temp)){
				
				int op2 = obj.Top();
				obj.pop();
				
				int op1 = obj.Top();
				obj.pop();
				
				int result = evaluteOperator(temp,op1,op2);
				
				obj.push(result);
				
			}
			else{
				System.out.println("Not Valid Expression");
			}
				
		}
		return obj.Top();
		
	}
	
	public boolean isNumeric(char temp){
		if(temp >= '0' && temp<= '9'){
			return true;
		}
		return false;
	}
	
	
	public boolean isOperator(char temp){
		if(temp == '+' || temp =='-' || temp=='*' || temp=='/'){
			return true;
		}
		return false;
		
	}
	
	public int evaluteOperator(char temp,int op1,int op2){
		
		if(temp=='+'){
			int result = op1 + op2;
			return result;
			
		}
		if(temp =='-'){
			int result = op1-op2;
			return result;
		}
		
		if(temp =='*'){
			int result = op1 * op2;
			return result;
		}
		
		if(temp =='/'){
			int result = op1 / op2;
			return result;
		}
		
		return -1;
		
	}
	
	
}
