package com.wchy.structure.queue.arr.priority;

import com.wchy.structure.queue.intf.MyQueue;
import com.wchy.structure.tree.bean.HuffmanNode;

/**
 * 
* @ClassName PriorityQueue.java
* @Description 
* <p>
* ���ȼ�����.
* </p>
* <p>
* ��ϸ������Ȩֵ��С��������ȼ�����.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author wchy.
* 
* @Date 2017��9��3�� ����8:36:25.
* 
* @param <T>
 */
public class PriorityQueue implements MyQueue<HuffmanNode> 
{
	
	/**
	 * ��������.
	 */
	private int capacity;
	
	/**
	 * ��Ŷ��е�����.
	 */
	private HuffmanNode[] queueArr;
	
	/**
	 * ������Ԫ�ظ���.
	 */
	private int size;
	
	public PriorityQueue() 
	{
		capacity = 10;
		queueArr = new HuffmanNode[capacity];
	}
	
	public PriorityQueue(int initCapacity) 
	{
		capacity = initCapacity;
		queueArr = new HuffmanNode[capacity];
	}

	@Override
	public void insert(HuffmanNode element) 
	{
		if (isEmpty()) 
		{
			queueArr[size++] = element;
		} 
		else 
		{
			int i;
			for (i = size - 1; i >= 0; i--) 
			{
				if (compare(element, queueArr[i])) 
				{
					queueArr[i + 1] = queueArr[i];
				} 
				else 
				{
					break;
				}
			}
			queueArr[i + 1] = element;
			size++;
		}
	}

	@Override
	public HuffmanNode remove() 
	{
		return queueArr[--size];
	}

	@Override
	public HuffmanNode peek() 
	{
		return queueArr[size - 1];
	}

	@Override
	public boolean isEmpty() 
	{
		return size == 0;
	}
	
	/**
	 * 
	* @Title: compare 
	* @Description: �������ڵ�Ƚ�.
	* @param @param a
	* @param @param b
	* @param @return �趨�ļ�. 
	* @return boolean �������� .
	* @throws 
	* 		�쳣.
	 */
	private boolean compare(HuffmanNode a, HuffmanNode b) 
	{
		return a.getWeight() > b.getWeight();
	}

}
