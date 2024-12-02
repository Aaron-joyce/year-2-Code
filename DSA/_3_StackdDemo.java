package main;

import java.util.Stack;
public class _3_StackdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating stack
		Stack<Integer> stk = new Stack<>();
		
		System.out.println("Stack created ->"+stk);

		// adding elements		
		pushToStack(stk, 1);
		pushToStack(stk, 2);
		pushToStack(stk, 3);
		pushToStack(stk, 4);
		pushToStack(stk, 5);
		
		
		// removing element
		popFromStack(stk);
		popFromStack(stk);
		popFromStack(stk);
		popFromStack(stk);
		popFromStack(stk);
		try {
			popFromStack(stk);
		}
		catch (Exception e) {
			System.out.println("Caution!!:Stack empty");
		}
	}
	
	static void pushToStack(Stack<Integer> stk, int x) {
		// calling push method of stack class		
		stk.push((Integer)x);
		
		// display the changes
		System.out.println("pushed -> "+x);
		System.out.println("stack after changes -> "+ stk);
	}
	
	static void popFromStack(Stack stk) {
		// calling pop method of stack class			
		Integer x = (Integer)stk.pop();
		
		// display changes
		System.out.println("Popped -> "+x);
		System.out.println("stack after changes -> "+ stk);
	}

}
