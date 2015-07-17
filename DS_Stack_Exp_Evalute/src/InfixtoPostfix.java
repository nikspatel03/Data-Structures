
public class InfixtoPostfix {

		int length;
		
		Stack obj = new Stack();
		
		public String infixToPostfix(String exp){
			
			length = exp.length();
			
			StringBuilder result = new StringBuilder();
			
			for(int i=0; i < length; i++){
				
				char temp = exp.charAt(i);
				
				if(isOperand(temp)){
					
					result.append(temp);
					
				}
				else if (isOperator(temp)){
					
					while(!obj.isEmpty() && higherPrecedence(obj.top(), temp) && !isOpeningBracket(temp)){
						
						result.append(obj.top());
						obj.pop();
					}
					
					obj.push(temp);
					
				}
				else if (isOpeningBracket(temp)){
					
					obj.push(temp);
					
				}
				else if(isClosingBracket(temp)){
					
					while(!obj.isEmpty() && !isOpeningBracket(obj.top())){
						result.append(obj.top());
						obj.pop();
						
					}
					obj.pop();
				}
				
			}
			
			while(!obj.isEmpty()){
				result.append(obj.top());
				obj.pop();
			
			}
			
			return result.toString();
			
		}
		
		public boolean isOperand(char temp){
			
			if(temp >= 'a' && temp <= 'z')
				return true;
			if(temp >= 'A' && temp <= 'Z')
				return true;
			if(temp >= '0' && temp <= '9')
				return true;
			
			
			return false;
		}
	
		public boolean isOperator(char temp){
			
			if(temp == '+' || temp == '-' || temp == '*' || temp =='/'){
				return true;
			}
			
			return false;
		}
	
		public boolean isOpeningBracket(char temp){
			
			if(temp == '(' || temp =='{' ||temp == '['){ 
				return true;
			}
			return false;
		}
		
	
	
		public boolean isClosingBracket(char temp){
			
			if(temp == ')' || temp =='}' ||temp == ']'){ 
				return true;
			}
			return false;
		}
	
		public boolean higherPrecedence(char operator1 , char operator2 ){
			
			int op1 = getOperatorWeight(operator1);
			int op2 = getOperatorWeight(operator2);
			
			if(op1 > op2)
				return true;
			
			
			return false;
			
		}
		
		public int getOperatorWeight(char temp){
			
			if(temp == '+' || temp == '-')
				return 1;
			if(temp == '*' || temp == '/')
				return 2;
			
			return -1;
		}
		
	
}
