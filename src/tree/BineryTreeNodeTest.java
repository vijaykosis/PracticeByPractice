package tree;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import linklist.merge_two_sorted_lists.Solution;

class BineryTreeNodeTest {
	BineryTreeNode br = null;

	@BeforeEach
	void setUp() throws Exception {
		br = new BineryTreeNode(1);
		br.left = new BineryTreeNode(2);
		br.right = new BineryTreeNode(3);

		br.left.left = new BineryTreeNode(4);
		br.left.right = new BineryTreeNode(5);

		br.right.left = new BineryTreeNode(6);
		br.right.right = new BineryTreeNode(7);
	}

	@Test
	void testPreOrder1() {
		List<Integer> ddd = br.preOrderA(br);
		assertArrayEquals(Arrays.asList(1, 2, 4, 5, 3, 6, 7).toArray(), ddd.toArray());
	}


	@Test
	void testInOrderA1() {
		List<Integer> ddd = br.inOrderA(br);
		assertArrayEquals(Arrays.asList(4, 2, 5, 1, 6, 3, 7).toArray(), ddd.toArray());
	}

	

	@Test
	void testPostOrderA1() {
		List<Integer> ddd = br.postOrderA(br);
		assertArrayEquals(Arrays.asList(4, 5, 2, 6, 7, 3, 1).toArray(), ddd.toArray());
	}

	@Test
	void testlevelOrderA() {
		List<Integer> ddd = br.levelOrderA(br);
		assertArrayEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7).toArray(), ddd.toArray());
	}

	@Test
	void testMaxInBinneryTree() {		
		int mx = br.maxInBinaryTree(br);
		assertEquals(7, mx);
	}

	@Test
	void testMaxInBinneryTreeWithoutRecursion() {		
		int mx = br.maxInBinaryTree(br);
		assertEquals(7, mx);
	}
	
	@Test
	void testfindInBinneryTreeFound() {		
		boolean isFound = br.findInBT(br, 2);
		assertTrue(isFound);
	}
	
	@Test
	void testfindInBinneryTreeNotFound() {		
		boolean isFound = br.findInBT(br, 8);
		assertFalse(isFound);
	}
	
	@Test
	void testfindInBinneryTreeWRFound() {		
		boolean isFound = br.findInBTWR(br, 2);
		assertTrue(isFound);
	}
	
	@Test
	void testfindInBinneryTreeNotWRFound() {		
		boolean isFound = br.findInBTWR(br, 8);
		assertFalse(isFound);
	}
	
	@Test
	void testInsterInBinneryTree() {		
		BineryTreeNode.insterInBinneryTree(br, 8);
		List<Integer> ddd = br.levelOrderA(br);		
		assertArrayEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).toArray(), ddd.toArray());
	}
	
	@Test
	void testSizeOfTree() {		
		int size = BineryTreeNode.size(br);
		assertEquals(7, size);
	}
	@Test
	void testlevelOrderTreversalInreverse() {		
		List<Integer> ddd = BineryTreeNode.levelOrderTreversalInreverse(br);	
		assertArrayEquals(Arrays.asList(7,6,5,4,3,2,1).toArray(), ddd.toArray());
	}
	
	
	@Test
	void testmaxDeptResursive() {
		int ddd = BineryTreeNode.maxDeptResursive(br);	
		assertEquals(3, ddd);
	}
	
	@Test
	void testmaxDeptItrative() {
		int ddd = BineryTreeNode.maxDeptItrative(br);	
		assertEquals(3, ddd);
	}
	@Test
	void mirrorTest() {
		BineryTreeNode mirror = BineryTreeNode.mirror(br);
		List<Integer> ddd = BineryTreeNode.levelOrderA(mirror);	
		assertArrayEquals(Arrays.asList(1,3,2,7,6,5,4).toArray(), ddd.toArray());
	}
	
	@Test
	void buildBTpreIn() {
		List<Integer> pre = br.preOrderA(br);
		List<Integer> in = br.inOrderA(br);
		int [] inA =  in.stream().mapToInt(Integer::intValue).toArray();
		int [] preA = pre.stream().mapToInt(Integer::intValue).toArray();
		BineryTreeNode bt = BineryTreeNode.build(inA, preA);
		List<Integer> ddd = br.levelOrderA(br);		
		assertArrayEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7).toArray(), ddd.toArray());
	}
	
	@Test
	void getAllAncen() {
		List<Integer> ddd = BineryTreeNode.getAllAncen(br, 5);		
		System.out.println(ddd);
	}
}
