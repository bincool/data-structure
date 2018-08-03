package com.wchy.structure.queue.arr.priority;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wchy.structure.tree.bean.HuffmanNode;

/**
 * 
* @ClassName PriorityQueueTest.java
* @Description 
* <p>
* ���ȼ����в���.
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
* @Date 2017��9��3�� ����9:29:09.
*
 */
public class PriorityQueueTest 
{
	
	/**
	 * ��־����.
	 */
	private static final Logger LOGGER = Logger.getLogger(PriorityQueueTest.class);
	
	/**
	 * ���ж���.
	 */
	private PriorityQueue<HuffmanNode> queueApp;

	@Before
	public void setUp() throws Exception 
	{
		queueApp = new PriorityQueue<HuffmanNode>();
		queueApp.insert(new HuffmanNode('A', 2));
		queueApp.insert(new HuffmanNode('E', 2));
		queueApp.insert(new HuffmanNode('I', 3));
		queueApp.insert(new HuffmanNode('S', 6));
		queueApp.insert(new HuffmanNode('T', 1));
		queueApp.insert(new HuffmanNode('U', 1));
		queueApp.insert(new HuffmanNode('Y', 2));
		queueApp.insert(new HuffmanNode('#', 4));
		queueApp.insert(new HuffmanNode('$', 1));
	}

	@After
	public void tearDown() throws Exception 
	{
		queueApp = null;
	}

	@Test
	public void testInsert() 
	{
		while (!queueApp.isEmpty()) 
		{
			LOGGER.info(queueApp.remove());
		}
	}

}
