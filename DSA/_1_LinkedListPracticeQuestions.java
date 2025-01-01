package questions;

// Q1: find the max number from both linked list
// Q2: find single digit numbers from linked list
// Q3: find the numbers that are not repeated in both the list

import java.util.LinkedList;
import java.util.Iterator;

public class _1_LinkedListPracticeQuestions {


	public static void main(String[] args) {
		LinkedList node1 = new LinkedList<Integer>();
		node1.add(1);
		node1.add(2);
		node1.add(3);
		node1.add(4);
		node1.add(3);
		
		LinkedList node2 = new LinkedList<Integer>();
		node2.add(30);
		node2.add(4);
		node2.add(50);
		node2.add(6);
		node2.add(70);
		
		_1_LinkedListPracticeQuestions p1 = new _1_LinkedListPracticeQuestions();
		int total = p1.SumLL(node1, node2);
		int max = p1.MaxNoLL(node1, node2);
//		System.out.println(total);
//		System.out.println(max);
//		p1.SingleDigitNo(node1, node2);
//		p1.NoRepeat(node1, node2);
		
	}
	
	int SumLL(LinkedList a, LinkedList b) {
		int sum = 0;
		Iterator it = a.iterator();
		while(it.hasNext()) {
			int n = (Integer)it.next();
			sum+=n;
		}
		
		it = b.iterator();
		while(it.hasNext()) {
			int n = (Integer)it.next();
			sum +=n;
		}
		return sum;
	}
	
	// Q1: find the max number from both linked list
	int MaxNoLL(LinkedList a, LinkedList b) {
		int max = 0;
		Iterator it = a.iterator();
		while(it.hasNext()){
			int n = (Integer)it.next();
			if(n>max) {
				max=n;
			}
		}
		it = b.iterator();
		while(it.hasNext()) {
			int n = (Integer)it.next();
			if(n>max) {
				max=n;
			}
		}
		return max;
	}
	
	// Q2: find single digit numbers from linked list
//	LinkedList<Integer> SingleDigitNo(LinkedList a, LinkedList b){
	void SingleDigitNo(LinkedList a, LinkedList b){
//		LinkedList list = new LinkedList<Integer>();
		Iterator it = a.iterator();
		while (it.hasNext()) {
			int n = (Integer)it.next();
			if(n < 10) {
				System.out.print(n+", ");
			}
		}
		it = b.iterator();
		while(it.hasNext()) {
			int n = (Integer)it.next();
			if(n < 10) {
				System.out.print(n+", ");
			}
		}
	}
	
// Q3: find the numbers that are not repeated in both the list
}