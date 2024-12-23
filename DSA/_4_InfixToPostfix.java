package syitpracs;

import java.util.*;

public class _4_InfixToPostfix {

	public static void main(String[] args) {
//		convert infix to postfix
		String infix = "(((a+b)-c)*(a/b))";
		System.out.println("postfix is:"+ infixToPostfix(infix));
	}
	
	static String infixToPostfix(String in) {
		Stack<String> stk = new Stack<String>();
		String postfix = "";
		char c;
		
		for(int i =0;i<in.length();i++) {
			c = in.charAt(i);
			if(c == '+'|| c == '-'|| c == '*'|| c == '/'|| c == '%'|| c == '(') {
				stk.push(c+"");
			}
			else if(c == ')') {
				String s= stk.peek();
				if(s!= "(") {
					postfix+=stk.pop();
				}
				stk.pop();
			}
			else {
				postfix+=(c+"");
			}
		}
		return postfix;
	}
}
