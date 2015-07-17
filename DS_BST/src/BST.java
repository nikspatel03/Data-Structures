import java.util.LinkedList;
import java.util.Queue;



public class BST {
	
	BstNode root;
	
	Queue<BstNode> q = new LinkedList<BstNode>();
	
	
	public static final int MIN_VAL = Integer.MIN_VALUE;
	public static final int MAX_VAL = Integer.MAX_VALUE;
	
	public BST(){
		
		root = null;
		
	}
	
	
	public void insert(int data){
		
		
		root = insert(root,data);
		
		
	}
	
	
	public BstNode insert(BstNode node , int data){
		
		if(node == null){
			
			node = new BstNode(data);
			
		}
		else if(data <= node.data){
			
			node.left = insert(node.left,data);
		
		}
		else{
			
			node.right = insert(node.right,data);
		}
		
		return node;
		
		
	}
	
	
	public boolean search(int data){
		
		
		return search(root,data);
		
	}
	
	public boolean search(BstNode root , int data){
		
		if(root == null){
			return false;
		}
		else if(root.data == data){
			return true;
		}
		else if(data <= root.data){
			return search(root.left,data);
			
		}
		else
			return search(root.right,data);
	}
	
	
	
	public int findMin(){
		
		return findMin(root);
		
	}
	
	public int findMin(BstNode root1){
		
		if(root1 == null){
			System.out.println("Error");
			return -1;
		}
		else if(root1.left == null){
			return root1.data;
		}
		
		return findMin(root1.left);
		

		}
	
public int findMax(){
		
		return findMax(root);
		
	}
		
public int findMax(BstNode root2){
		
		if(root2 == null){
			System.out.println("Error");
			return -1;
		}
		else if(root2.right == null){
			return root2.data;
		}
		
		return findMax(root2.right);
		

		}


public int findHeight(){
	
	return findHeight(root);
}
		
public int findHeight(BstNode node){
	
	if(node == null){
		return -1;
	}
	
	return Math.max(findHeight(node.left),findHeight(node.right))+1;
	
	
}


public void levelTraversal(){
	
	levelTraversal(root);
}

public void levelTraversal(BstNode node){
	
	if (node  == null){
		return;
	}
	
	q.add(node);
	
	
	while(!q.isEmpty()){
		
		BstNode current = q.peek();
		
		System.out.print(Integer.toString(current.data)+" ");
		
		if(current.left!=null){
			q.add(current.left);
		}
		
		if(current.right!=null){
			q.add(current.right);
		}
		
		q.poll();
		
	}
	
}


public void preOrder(){
	
	preOrder(root);
	
}

public void preOrder(BstNode node){
	
	if(node == null){
		return ;
	}
	System.out.print(Integer.toString(node.data)+" ");
	preOrder(node.left);
	preOrder(node.right);
	
}


public void inOrder(){
	
	inOrder(root);
	
}

public void inOrder(BstNode node){
	if(node == null){
		return ;
	}
	inOrder(node.left);
	System.out.print(Integer.toString(node.data)+" ");
	inOrder(node.right);
	
}


public void postOrder(){
	
	postOrder(root);
	
}

public void postOrder(BstNode node){
	if(node == null){
		return ;
	}
	
	postOrder(node.left);
	postOrder(node.right);
	System.out.print(Integer.toString(node.data)+" ");

}


public boolean isBinarySearchTree(){
	
	return isBinarySearchTree(root,MIN_VAL,MAX_VAL);
	
}

public boolean isBinarySearchTree(BstNode node,int minVal,int maxVal){
	
	if(node == null){
		return true;	
	}
	
	if(node.data<=maxVal && node.data>minVal 
			&& isBinarySearchTree(node.left, minVal, node.data) 
			&& isBinarySearchTree(node.right,node.data, maxVal) ){
		
		return true;
	}
	else{
		return false;
	}
}



public BstNode deleteNode(int data){
	
	
	return deleteNode(root,data);
	
	
}

public BstNode deleteNode(BstNode node, int data){
	
	
	if(node == null){
		return node; 
		}
	else if(data < node.data){
		node.left = deleteNode(node.left,data);
	}
	else if(data > node.data){
		node.right = deleteNode(node.right,data);
	}
	else{
		
		if(node.left == null && node.right == null){
			node = null;
		}
		else if(node.left == null){
			node = node.right;
		}
		else if(node.right == null){
			node = node.left;
		}
		else{
			
			node.data = findMin(node.right);
			
			node.right = deleteNode(node.right,node.data);
			
		}
		
	}
	return node;
	
}


public int getSuccesor(int data){
	
	BstNode result = getSuccesor(root,data);
	if(result==null){
		System.out.println("Succesor is : null");
		return -1;
	}
	else{
	return result.data;}
	
	
}

public BstNode getSuccesor(BstNode node,int data){
	
	BstNode current = getCurrent(root,data);
	
	if(current == null){
		return null;
	}
	if(current.right != null){
		
		return findMinimum(current.right);
		
	}
	else{
	
		BstNode ancestor = root;
		BstNode succesor = null;
	
	
		while(ancestor != current){
			if(current.data < ancestor.data){
				succesor = ancestor;
				ancestor = ancestor.left;
			}
			else{
				ancestor = ancestor.right;
			}
			
		}
		return succesor;
	}
	
	
}

public BstNode findMinimum(BstNode node){
	
	if(node == null){
		return null;
	}
	while(node.left!=null){
		node = node.left;
	}
	
	return node;
}

public BstNode getCurrent(BstNode node,int data){
	
	if(node == null){
		return null;
	}
	else if(node.data == data){
		return node;
	}
	else if(data<node.data){
		return getCurrent(node.left, data);
	}
	else{
		return getCurrent(node.right,data);
	}
	}

}



