package com.wchy.structure.tree.huffman;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wchy.structure.queue.arr.priority.PriorityQueue;
import com.wchy.structure.tree.bean.HuffmanNode;

/**
 * 
* @ClassName HuffmanTreeTest.java
* @Description 
* <p>
* ������������.
* </p>
* <p>
* ��ϸ����.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author wchy.
* 
* @Date 2017��9��3�� ����10:13:00.
*
 */
public class HuffmanTreeTest 
{
	
	private HuffmanTree huffmanTree;

	@Before
	public void setUp() throws Exception 
	{
		PriorityQueue<HuffmanNode> queueApp = new PriorityQueue<HuffmanNode>();
		queueApp.insert(new HuffmanNode('A', 2));
		queueApp.insert(new HuffmanNode('E', 2));
		queueApp.insert(new HuffmanNode('I', 3));
		queueApp.insert(new HuffmanNode('S', 6));
		queueApp.insert(new HuffmanNode('T', 1));
		queueApp.insert(new HuffmanNode('U', 1));
		queueApp.insert(new HuffmanNode('Y', 2));
		queueApp.insert(new HuffmanNode('#', 4));
		queueApp.insert(new HuffmanNode('$', 1));
		huffmanTree = new HuffmanTree(queueApp);
	}

	@After
	public void tearDown() throws Exception 
	{
		huffmanTree = null;
	}

	@Test
	public void testCreateTree() 
	{
		huffmanTree.createTree();
		huffmanTree.order("preOrder");
		huffmanTree.order("inOrder");
		huffmanTree.order("postOrder");
	}

}
