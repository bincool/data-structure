package com.wchy.structure.queue.arr;

import com.wchy.structure.queue.intf.MyQueue;

/**
 * 
* @ClassName ArrayQueue.java
* @Description 
* <p>
* �ײ�������ʵ�ֵĶ���.
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
* @Date 2017��8��27�� ����9:46:24.
*
 */
public class ArrayQueue<T> implements MyQueue<T>
{
	
	/**
	 * ���г���.
	 */
	private int maxSize;
	
	/**
	 * ����Ԫ�ؾۼ�,����.
	 */
	private Object[] queueArray;
	
	/**
	 * ����.
	 */
	private int front = 0;
	
	/**
	 * ��β.
	 */
	private int rear = 0;
	
	/**
	 * �Ŷ���.
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
	* @Description: �������ж�.
	* @param @return �趨�ļ�. 
	* @return boolean �������� .
	* @throws 
	* 		�쳣.
	 */
	private boolean isFull() 
	{
		return size == maxSize;
	}

}
