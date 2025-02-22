//package main;
//
//class Node{
//	int data;
//	Node left;
//	Node right;
//	
//	Node(int data){
//		this.data = data;
//		this.left = null;
//		this.right = null;
//	}
//	
//	public int getData() {
//		return data;
//	}
//	public void setData(int data) {
//		this.data = data;
//	}
//	public Node getLeft() {
//		return left;
//	}
//	public void setLeft(Node left) {
//		this.left = left;
//	}
//	public Node getRight() {
//		return right;
//	}
//	public void setRight(Node right) {
//		this.right = right;
//	}
//	
//}
//
//public class _5_TreeDemo {
//
//		Node node = null;
//		Node root = null;
//		Node p = root;
//		Node q = root;
//		
//		public Node insert(Node root, int data) {
//			if(root==null) {
//				root = new Node(data);
//				return root;
//			}
//			
//			if(data<=root.getData()) {
//				root.setLeft(insert(root.getLeft(), data));
//			}
//			else if(data>root.getData()) {
//				root.setRight(insert(root.getRight(), data));
//			}
//			return root;
//		}
//		
//		void inOrder(Node node) {
//			if(node == null) {
//				return;
//			}
//			inOrder(node.getLeft());
//			System.out.print(node.getData()+",");
//			inOrder(node.getRight());
//		}
//
//		void postOrder(Node node) {
//			if(node == null) {
//				return;
//			}
//			postOrder(node.getLeft());
//			postOrder(node.getRight());
//			System.out.print(node.getData()+",");
//		}
//
//		void preOrder(Node node) {
//			if(node == null) {
//				return;
//			}
//			System.out.print(node.getData()+",");
//			preOrder(node.getLeft());
//			preOrder(node.getRight());
//		}
//		
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Node root = null;
//		_5_TreeDemo tree = new _5_TreeDemo(); 
//		
//		root = tree.insert(root, 9);
//		root = tree.insert(root, 7);
//		root = tree.insert(root, 5);
//		root = tree.insert(root, 3);
//		root = tree.insert(root, 1);
//		root = tree.insert(root, 2);
//		root = tree.insert(root, 4);
//		root = tree.insert(root, 6);
//		root = tree.insert(root, 8);
//		root = tree.insert(root, 0);
//		System.out.println("Tree created successfully");
//		
//		System.out.println("\nin order:");
//		tree.inOrder(root);
//		System.out.println("\nPre order:");
//		tree.postOrder(root);
//		System.out.println("\nPost order:");
//		tree.preOrder(root);
//	}
//
//}
