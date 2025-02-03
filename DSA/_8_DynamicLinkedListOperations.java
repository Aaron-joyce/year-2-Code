package edu;

class listElement{
	int data;
	listElement next;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public listElement getNext() {
		return next;
	}
	public void setNext(listElement next) {
		this.next = next;
	}
	
	listElement(int data){
		this.data = data;
		this.next = null;
	}
	
}

public class _8_DynamicLinkedListOperations {
	
	static listElement head;
	
	static listElement deleteNode(int pos) {
		listElement p = head;
		listElement q = p;
		int i = 0;
		pos -= 1;
		if(pos == 0) {
			head = p.getNext();
			p = null;
		}
		else {
			// stops 1 node before node to be deleted
			while(i!=pos) {
				q = p;
				p = p.getNext();
				i++;
			}
			
			q.setNext(p.getNext());
			
		}
		return head;
	}
	
	public static listElement AddNode(int data) {
		if(head == null) {
			
			head = new listElement(data);
		}
		else {
			listElement p = head;
			listElement q = head;
			while(p!=null) {
				q = p;
				p = p.getNext();
			}
			p = new listElement(data);
			q.setNext(p);
		}
		
		return head;
	}
	
	public static void displayList() {
		listElement p = head;
		while(p!=null) {
			System.out.print(p.getData()+"->");
			p = p.getNext();
		}
		System.out.println();
	}
	
	public static int findMax() {
		listElement p = head;
		int max = 0;
		while(p!=null) {
			if(p.getData()>max) {
				max = p.getData();
			}
			p = p.getNext();
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddNode(1);
		AddNode(2);
		AddNode(3);
		AddNode(4);
		AddNode(5);
		displayList();
		
		deleteNode(3);
		displayList();
		
		AddNode(6);
		AddNode(8);
		AddNode(7);
		displayList();
		
		System.out.println("max element in Linked List: "+findMax());
	}

}
