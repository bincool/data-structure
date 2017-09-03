package com.wchy.structure.queue.arr.priority;

import com.wchy.structure.queue.intf.MyQueue;
import com.wchy.structure.tree.bean.HuffmanNode;

/**
 * 
* @ClassName PriorityQueue.java
* @Description 
* <p>
* 优先级队列.
* </p>
* <p>
* 详细描述：权值从小到大的优先级队列.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author wchy.
* 
* @Date 2017年9月3日 下午8:36:25.
* 
* @param <T>
 */
public class PriorityQueue implements MyQueue<HuffmanNode> 
{
	
	/**
	 * 队列容量.
	 */
	private int capacity;
	
	/**
	 * 存放队列的数组.
	 */
	private HuffmanNode[] queueArr;
	
	/**
	 * 队列中元素个数.
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
	* @Description: 哈夫曼节点比较.
	* @param @param a
	* @param @param b
	* @param @return 设定文件. 
	* @return boolean 返回类型 .
	* @throws 
	* 		异常.
	 */
	private boolean compare(HuffmanNode a, HuffmanNode b) 
	{
		return a.getWeight() > b.getWeight();
	}

}
