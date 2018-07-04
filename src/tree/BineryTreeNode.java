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

	public void breadth(BineryTreeNode root) {
		if (root == null)
			return;

		System.out.print(root.data + " ");
		breadth(root.left);
		breadth(root.right);
	}

	public static List<Integer> levelOrderA(BineryTreeNode root) {
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
		if (root != null) {
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
		while (!qbt.isEmpty()) {
			BineryTreeNode el = qbt.poll();
			if (el.data > maxValue) {
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
		if (root == null)
			return false;
		if (root.data == data)
			return true;
		return findInBT(root.left, data) || findInBT(root.right, data);

	}

	public static boolean findInBTWR(BineryTreeNode root, int data) {
		Queue<BineryTreeNode> qbt = new LinkedList<>();
		qbt.offer(root);
		while (!qbt.isEmpty()) {
			BineryTreeNode el = qbt.poll();
			if (el.data == data) {
				return true;
			}
			if (el.left != null)
				qbt.add(el.left);
			if (el.right != null)
				qbt.add(el.right);
		}
		return false;
	}

	public static void insterInBinneryTree(BineryTreeNode root, int data) {
		Queue<BineryTreeNode> qbt = new LinkedList<>();
		qbt.offer(root);
		while (!qbt.isEmpty()) {
			BineryTreeNode el = qbt.poll();
			if (el.left != null) {
				qbt.add(el.left);
			} else {
				el.left = new BineryTreeNode(data);
				return;
			}
			if (el.right != null) {
				qbt.add(el.right);
			} else {
				el.right = new BineryTreeNode(data);
				return;
			}
		}
	}

	public static int size(BineryTreeNode root) {
		int left = root.left == null ? 0 : size(root.left);
		int right = root.right == null ? 0 : size(root.right);
		return 1 + left + right;
	}

	public static List<Integer> levelOrderTreversalInreverse(BineryTreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;

		Queue<BineryTreeNode> treeNodes = new LinkedList<BineryTreeNode>();
		Stack<Integer> stack = new Stack<Integer>();
		treeNodes.offer(root);

		while (!treeNodes.isEmpty()) {
			BineryTreeNode el = treeNodes.poll();
			if (el.left != null)
				treeNodes.add(el.left);
			if (el.right != null)
				treeNodes.add(el.right);
			stack.push(el.data);
		}
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}

	public static int maxDeptResursive(BineryTreeNode root) {
		if (root == null)
			return 0;
		int left = maxDeptResursive(root.left);
		int right = maxDeptResursive(root.left);
		return Math.max(left, right) + 1;
	}

	public static int maxDeptItrative(BineryTreeNode root) {
		if (root == null)
			return 0;
		Queue<BineryTreeNode> treeNodes = new LinkedList<BineryTreeNode>();

		treeNodes.offer(root);
		int lenght = 0;
		while (!treeNodes.isEmpty()) {
			lenght++;
			int count = treeNodes.size();
			while (count > 0) {
				BineryTreeNode newnode = treeNodes.peek();
				treeNodes.remove();
				if (newnode.left != null)
					treeNodes.add(newnode.left);
				if (newnode.right != null)
					treeNodes.add(newnode.right);
				count--;
			}

		}
		return lenght;
	}

	public static BineryTreeNode mirror(BineryTreeNode root) {
		if (root != null) {
			mirror(root.left);
			mirror(root.right);
			BineryTreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
		return root;
	}

	public static BineryTreeNode build(int in[], int pr[]) {
		if (in.length == 0 || pr.length == 0) {
			return null;
		}

		return buildBt(pr, 0, pr.length - 1, in, 0, in.length - 1);
	}

	private static BineryTreeNode buildBt(int[] pr, int i, int j, int[] in, int k, int l) {
		if (i > j || k > l) {
			return null;
		}
		int data = pr[i];
		BineryTreeNode root = new BineryTreeNode(data);

		int o = k;

		for (; o < l; o++) {
			if (in[o] == data) {
				break;
			}
		}
		root.left = buildBt(pr, i + 1, i + o - k, in, k, o - 1);
		root.right = buildBt(pr, i + o - k + 1, j, in, o + 1, k);
		return root;
	}

	public static List<Integer> getAllAncen(BineryTreeNode root, int data) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		Stack<BineryTreeNode> st = new Stack<>();
		while (true) {
			if (root != null && root.data != data) {
				st.push(root);
				root = root.left;
				continue;
			}
			if (root != null && root.data == data) {
				break;
			}
			root = st.peek();
			if (root.right == null) {
				st.pop();
				root = st.peek();
				continue;
			} else {
				root = root.right;
			}
		}

		while (st.isEmpty()) {
			list.add(st.pop().data);
		}

		return list;
	}

	public void shay(int a, float b) {

	}

	public void shay(float a, int b) {

	}

	
}
