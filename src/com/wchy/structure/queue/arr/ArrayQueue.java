package com.wchy.structure.queue.arr;

import com.wchy.structure.queue.intf.MyQueue;

/**
 * 
* @ClassName ArrayQueue.java
* @Description 
* <p>
* 底层用数组实现的队列.
* </p>
* <p>
* 详细描述.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author wchy.
* 
* @Date 2017年8月27日 下午9:46:24.
*
 */
public class ArrayQueue<T> implements MyQueue<T>
{
	
	/**
	 * 队列长度.
	 */
	private int maxSize;
	
	/**
	 * 队列元素聚集,数组.
	 */
	private Object[] queueArray;
	
	/**
	 * 队首.
	 */
	private int front = 0;
	
	/**
	 * 队尾.
	 */
	private int rear = 0;
	
	/**
	 * 排队数.
	 */
	private int size = 0;
	
	public ArrayQueue() 
	{
		maxSize = 10;
		queueArray = new Object[maxSize];
	}
	
	public ArrayQueue(int initCapacity) 
	{
		maxSize = initCapacity;
		queueArray = new Object[maxSize];
	}

	@Override
	public void insert(T element) 
	{
		if (!isFull()) 
		{
			if (rear == maxSize) 
			{
				rear = 0;
			}
			queueArray[rear++] = element;
			size++;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove() 
	{
		Object ret = queueArray[front++];
		if (front == maxSize) 
		{
			front = 0;
		}
		size--;
		return (T)ret;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T peek() 
	{
		return (T)queueArray[front];
	}

	@Override
	public boolean isEmpty() 
	{
		return size == 0;
	}
	
	/**
	 * 
	* @Title: isFull 
	* @Description: 队列满判断.
	* @param @return 设定文件. 
	* @return boolean 返回类型 .
	* @throws 
	* 		异常.
	 */
	private boolean isFull() 
	{
		return size == maxSize;
	}

}
