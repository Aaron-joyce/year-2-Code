package edu;

import java.util.Scanner;

class ListNode{
	int data;
	ListNode next;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	
	ListNode(int data){
		this.data = data;
		this.next = null;
	}
	
}

public class _7_StaticLinkedListOperations {
	
	static ListNode head = null;

	static void display () {
		ListNode p = head;
		while(p!=null) {
			System.out.print(p.getData()+"-> ");
			p = p.getNext();
		}
		System.out.println();
	}
	
	static ListNode deleteNode(int pos) {
		ListNode p = head;
		ListNode q = p;
		int i = 0;
		pos -= 1;
		if(pos == 0) {
			System.out.println(p.getData());
			head = p.getNext();
			p = null;
			System.out.println(head.getData());
		}
		else {
			// stops 1 node before node to be deleted
			while(i!=pos) {
				System.out.println(p.getData());
				q = p;
				p = p.getNext();
				i++;
			}
			
			q.setNext(p.getNext());
			
		}
		return head;
	}
	
	public static ListNode AddNode(int data) {
		if(head == null) {
			head.setData(data);
		}
		else {
			ListNode p = head;
			ListNode q = head;
			while(p!=null) {
				q = p;
				p = p.getNext();
			}
			p = new ListNode (data);
			q.setNext(p);
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode (1);
		head = node1;
		ListNode node2 = new ListNode(2);
		node1.setNext(node2);
		ListNode node3 = new ListNode(3);
		node2.setNext(node3);
		ListNode node4 = new ListNode(4);
		node3.setNext(node4);
		ListNode node5 = new ListNode(5);
		node4.setNext(node5);
		ListNode node6 = new ListNode(6);
		node5.setNext(node6);
		
		display();
		deleteNode(1);
		display();
		AddNode(7);
		display();
	}

}
