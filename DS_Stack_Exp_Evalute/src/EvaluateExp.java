
public class EvaluateExp {
	
	//String expression;
	int length;
	
	
	/*public EvaluateExp(String expression){
		this.expression = expression;
	}*/
	
	
	public boolean arePair(char opening,char closing){
		
		if(opening == '(' && closing ==')'){return true;}
		if(opening == '{' && closing =='}'){return true;}
		if(opening == '[' && closing ==']'){return true;}
		
		return false;
		
	}
	
	
	
	public boolean evaluateExpression(String expression){
		length = expression.length();
		
		Stack obj = new Stack();
		
		for(int i=0;i<length;i++){
			
			char value = expression.charAt(i);
			
			if(value == '(' || value == '{' || value == '['){
				
				obj.push(value);
		
			}
			else if( value == ')' || value == '}' || value == ']'){
				
				char top = obj.top();
				//System.out.println(top);
				//System.out.println(value);
				
				if(obj.isEmpty() || !(arePair(top, value)) || top == '\0'){
					return false;
				}
				else{
					obj.pop();
				}
				
			}
		}
		if(obj.isEmpty()){
			return true;
			}
		else{
			return false;
			}
	}
	
	
	}
	
	
	
	
	
	
	


