package com.wchy.structure.tree.binary;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wchy.structure.tree.bean.Schedule;
import com.wchy.structure.tree.intf.Tree;

/**
 * 
* @ClassName BinaryTreeTest.java
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
* @Date 2017��8��28�� ����12:25:19.
*
 */
public class BinaryTreeTest 
{
	
	/**
	 * ��־����.
	 */
	private static final Logger LOGGER = Logger.getLogger(BinaryTreeTest.class);
	
	/**
	 * ��ʱ�ַ����������.
	 */
	private static final StringBuffer sb = new StringBuffer();
	
	/**
	 * ����������.
	 */
	private Tree<Schedule> treeApp;

	@Before
	public void setUp() throws Exception 
	{
		treeApp = new BinaryTree<Schedule>();
		
		for (int i = 0; i <= 9; i++) 
		{
			sb.append("20170").append((int)(Math.random()*8 + 1)).append((int)(Math.random() * 2)).append((int)(Math.random() * 8)).append("0000");
			treeApp.insert(new Schedule("test" + i, "home" + (9 - i), sb.toString(), "201709010000"));
			sb.delete(0, sb.length());
		}
		
	}

	@After
	public void tearDown() throws Exception 
	{
		treeApp = null;
	}

	@Test
	public void testOrder() 
	{
		//treeApp.order("preOrder");
		treeApp.order("inOrder");
		//treeApp.order("postOrder");
		LOGGER.info(treeApp.minimum());
		LOGGER.info(treeApp.maximum());
	}

}
