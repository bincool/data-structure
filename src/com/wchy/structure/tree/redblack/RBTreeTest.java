package com.wchy.structure.tree.redblack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wchy.structure.tree.bean.Score;

/**
 * 
* @ClassName RBTreeTest.java
* @Description 
* <p>
* �����-������.
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
* @Date 2017��9��20�� ����12:39:55.
*
 */
public class RBTreeTest 
{
	
	/**
	 * ���������.
	 */
	private RBTree<Score> rbTree;
	
	/**
	 * ����.
	 */
	private int[] score = new int[10];

	@Before
	public void setUp() throws Exception 
	{
		rbTree = new RBTree<Score>();
		for (int i = 0; i < 10; i++) 
		{
			score[i] = (int)(Math.random() * 99);
		}
	}

	@After
	public void tearDown() throws Exception 
	{
		rbTree = null;
	}

	@Test
	public void testInsert() 
	{
		rbTree.insert(new Score(13, "name13", score[0]));
		rbTree.insert(new Score(8, "name8", score[1]));
		rbTree.insert(new Score(17, "name17", score[2]));
		rbTree.insert(new Score(11, "name11", score[3]));
		rbTree.insert(new Score(1, "name1", score[4]));
		rbTree.insert(new Score(15, "name15", score[5]));
		rbTree.insert(new Score(25, "name25", score[6]));
		rbTree.insert(new Score(22, "name22", score[7]));
		rbTree.insert(new Score(6, "name6", score[8]));
		rbTree.insert(new Score(27, "name27", score[9]));
		
		rbTree.order("inOrder");
	}

}
