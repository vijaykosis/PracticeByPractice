package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BineryTreeNode {
	public int data;

	public BineryTreeNode left, right;

	public BineryTreeNode(int data) {
		this.data = data;
	}

	public void preOrder(BineryTreeNode root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}

	}

	public List<Integer> preOrderA(BineryTreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		Stack<BineryTreeNode> treeNods = new Stack<BineryTreeNode>();
		treeNods.push(root);
		while (!treeNods.isEmpty()) {
			BineryTreeNode br = treeNods.pop();
			list.add(br.data);
			if (br.right != null)
				treeNods.push(br.right);
			if (br.left != null)
				treeNods.push(br.left);
		}
		return list;
	}

	public void inOrder(BineryTreeNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	public List<Integer> inOrderA(BineryTreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		Stack<BineryTreeNode> treeNods = new Stack<BineryTreeNode>();
		BineryTreeNode cnode = root;
		boolean isDone = false;
		while (!isDone) {
			if (cnode != null) {
				treeNods.push(cnode);
				cnode = cnode.left;
			} else {
				if (treeNods.isEmpty()) {
					isDone = true;
				} else {
					cnode = treeNods.pop();
					list.add(cnode.data);
					cnode = cnode.right;
				}

			}

		}
		return list;
	}

	public void postOrder(BineryTreeNode root) {
		if (root != null) {
			preOrder(root.left);
			preOrder(root.right);
			System.out.println(root.data);
		}

	}

	public List<Integer> postOrderA(BineryTreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		Stack<BineryTreeNode> S = new Stack<BineryTreeNode>();
		S.push(root);
		BineryTreeNode prev = null;
		while (!S.isEmpty()) {
			BineryTreeNode current = S.peek();
			if (prev == null || prev.left == current || prev.right == current) {
				if (current.left != null)
					S.push(current.left);
				else if (current.right != null)
					S.push(current.right);
				else {
					S.pop();
					list.add(current.data);
				}

			} else if (current.left == prev) {
				if (current.right != null)
					S.push(current.right);
				else {
					S.pop();
					list.add(current.data);
				}

			} else if (current.right == prev) {
				S.pop();
				list.add(current.data);
			}

			prev = current;
		}
		return list;
	}
	
	public void breadth(BineryTreeNode root){
	      if (root == null)
	          return;

	      System.out.print(root.data + " ");
	      breadth(root.left);
	      breadth(root.right);
	 }
	public List<Integer> levelOrderA(BineryTreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		
		Queue<BineryTreeNode> treeNodes = new LinkedList<BineryTreeNode>();		
		treeNodes.offer(root);	
				
		while (!treeNodes.isEmpty()) {
			BineryTreeNode el = treeNodes.poll();
			list.add(el.data);
			if (el.left != null)
				treeNodes.add(el.left);
			if (el.right != null)
				treeNodes.add(el.right);
			
		}
		return list;
	}
	
	public static int maxInBinaryTree(BineryTreeNode root) {
		int maxValue = Integer.MIN_VALUE;
		if (root != null){
	        int leftMax = maxInBinaryTree(root.left);
	        int rightMax = maxInBinaryTree(root.right);
	         
	        if (leftMax > rightMax)
	        	maxValue = leftMax;
	        else
	        	maxValue = rightMax;
	             
	        if (root.data > maxValue)
	        	maxValue = root.data;
	    }
		return maxValue;		
	}
	public static int maxInBinaryTreeWR(BineryTreeNode root) {
		int maxValue = Integer.MIN_VALUE;
		Queue<BineryTreeNode> qbt = new LinkedList<>();
		qbt.offer(root);
		while(!qbt.isEmpty()) {
			BineryTreeNode el = qbt.poll();
			if(el.data > maxValue) {
				maxValue = el.data;
			}
			if (el.left != null)
				qbt.add(el.left);
			if (el.right != null)
				qbt.add(el.right);
		}
		return maxValue;		
	}
	
	public static boolean findInBT(BineryTreeNode root, int data) {
		if(root == null) return false;		
		if(root.data == data) return true;		
		return findInBT(root.left, data) ||findInBT(root.right,data);
		
	}
	
	public static boolean findInBTWR(BineryTreeNode root,  int data) {
		Queue<BineryTreeNode> qbt = new LinkedList<>();
		qbt.offer(root);
		while(!qbt.isEmpty()) {
			BineryTreeNode el = qbt.poll();
			if(el.data == data) {
				return true;
			}
			if (el.left != null)
				qbt.add(el.left);
			if (el.right != null)
				qbt.add(el.right);
		}
		return false;		
	}
}
