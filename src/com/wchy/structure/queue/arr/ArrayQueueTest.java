package com.wchy.structure.queue.arr;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wchy.structure.queue.intf.MyQueue;

/**
 * 
* @ClassName ArrayQueueTest.java
* @Description 
* <p>
* ������ʵ�ֵĶ��в�����.
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
* @Date 2017��8��27�� ����10:06:07.
*
 */
public class ArrayQueueTest 
{
	
	/**
	 * ��־����.
	 */
	private static final Logger LOGGER = Logger.getLogger(ArrayQueueTest.class);
	
	/**
	 * ���ж���.
	 */
	private MyQueue<Integer> queueApp;
	
	private StringBuffer sb;

	@Before
	public void setUp() throws Exception 
	{
		sb = new StringBuffer();
		queueApp = new ArrayQueue<Integer>();
		int randomNum;
		for (int i = 0; i < 10; i++) 
		{
			randomNum = (int)(Math.random() * 99);
			queueApp.insert(randomNum);
			sb.append(randomNum).append(" ");
		}
		LOGGER.info(sb.toString());
		sb.delete(0, sb.length());
	}

	@After
	public void tearDown() throws Exception 
	{
		queueApp = null;
		sb = null;
	}

	@Test
	public void testRemove() 
	{
		while (!queueApp.isEmpty()) 
		{
			sb.append(queueApp.remove()).append(" ");
		}
		LOGGER.info(sb.toString());
	}

}
