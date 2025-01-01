package main;

// Creating Linked list using library
// the library automatically connects the objects
// in the order in which they were added
import java.util.LinkedList;

// the iterator library makes it easier to iterate
// over the elements of complex datatypes like linked List
import java.util.Iterator;

public class _1_LinkedList {

	public static void main(String[] args) {
		LinkedList node1 = new LinkedList<Integer>();
		node1.add(10);
		node1.add(20);
		node1.add(30);
		node1.add(40);
		node1.add(50);
		
		LinkedList node2 = new LinkedList<Integer>();
		node2.add(10);
		node2.add(20);
		node2.add(30);
		node2.add(40);
		node2.add(50);
		
		_1_LinkedList ll = new _1_LinkedList();
		int total = ll.SumLL(node1, node2);
		System.out.println(total);
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
}
