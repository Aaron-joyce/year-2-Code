package main;
import java.util.Scanner;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
}

public class _6_BinarySearchTree {

		TreeNode node = null;
		TreeNode root = null;
		TreeNode p = root;
		TreeNode q = root;
		
		public TreeNode insert(TreeNode root, int data) {
			if(root==null) {
				root = new TreeNode(data);
				return root;
			}
			
			if(data<=root.getData()) {
				root.setLeft(insert(root.getLeft(), data));
			}
			else if(data>root.getData()) {
				root.setRight(insert(root.getRight(), data));
			}
			return root;
		}
		
		void inOrder(TreeNode node) {
			if(node == null) {
				return;
			}
			inOrder(node.getLeft());
			System.out.print(node.getData()+",");
			inOrder(node.getRight());
		}

		void postOrder(TreeNode node) {
			if(node == null) {
				return;
			}
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.print(node.getData()+",");
		}

		void preOrder(TreeNode node) {
			if(node == null) {
				return;
			}
			System.out.print(node.getData()+",");
			postOrder(node.getLeft());
			postOrder(node.getRight());
		}
		
	public static void main(String[] args) {
		TreeNode root = null;
		_6_BinarySearchTree tree = new _6_BinarySearchTree(); 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no. of inputs");
		int n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			System.out.println("Enter next Value:");
			int tempval = sc.nextInt();
			root = tree.insert(root, tempval);
		}
		
		System.out.println("Tree created successfully");
		
		System.out.println("\nin order:");
		tree.inOrder(root);
		System.out.println("\n\nPre order:");
		tree.postOrder(root);
		System.out.println("\n\nPost order:");
		tree.preOrder(root);
	}

}
