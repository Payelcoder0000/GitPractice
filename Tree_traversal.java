package Java_Code;

class Node{
	int d;
	Node left;
	Node right;
	
	Node(int data)
	{
		d=data;
		left=null;
		right=null;
	}
}


public class Tree_traversal {
	Node root;
	
		
		Tree_traversal(){
			root=null;
		}
		
		
		private void printPostOrder(Node root2) {
				// TODO Auto-generated method stub
			if(root2==null)
				return;
			printPostOrder(root2.left);
			printPostOrder(root2.right);
			System.out.println(root2.d);
				
			}
		
		private void printPostOrder() {
			// TODO Auto-generated method stub
			printPostOrder(root);
			
		}
		


	public static void main(String[] args) {
		Tree_traversal t = new Tree_traversal();
		t.root = new Node(0);
		t.root.left = new Node(1);
		t.root.right = new Node(2);
		t.root.left.left = new Node(3);
		t.root.left.right = new Node(4);
		t.printPostOrder();
	}




	

}
