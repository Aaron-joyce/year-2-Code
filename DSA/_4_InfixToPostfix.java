package syitpracs;

import java.util.*;

public class _4_InfixToPostfix {

	public static void main(String[] args) {
//		convert infix to postfix
		String infix = "((m*n)/((p+q)*(a-b)))";
		System.out.println("postfix is:"+ infixToPostfix(infix));
	}
	
	static String infixToPostfix(String in) {
		Stack<String> stk = new Stack<String>();
		String postfix = "";
		char c;
		
		for(int i =0;i<in.length();i++) {
			c = in.charAt(i);

			// Checking if current character is an operator or opening bracket and adding to stack
			if(c == '+'|| c == '-'|| c == '*'|| c=='^' || c == '/'|| c == '%'|| c == '(') {
				stk.push(c+"");
			}

			// checking if the character is closing bracket			
			else if(c == ')') {
				String s= stk.peek();

				// checking if top most element is not '('
				if(s!= "(") {
					postfix+=stk.pop();
				}

				// popping the top most opening bracket in stack				
				stk.pop();
			}

			// adding variables and numbers in stack 
			else {
				postfix+=(c+"");
			}
		}
		return postfix;
	}
}
