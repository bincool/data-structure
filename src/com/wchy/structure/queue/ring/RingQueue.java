package com.wchy.structure.queue.ring;

import com.wchy.structure.queue.intf.MyQueue;

/**
 * 
* @ClassName RingQueue.java
* @Description 
* <p>
* ���ζ���.
* </p>
* <p>
* ��ϸ���������ζ��У������������ȶ�������������ֵ��1.
 * rear + 1 = head,��.
 * rear = front,��.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author wchy.
* 
* @Date 2017��8��27�� ����10:20:27.
* 
* @param <T>
 */
public class RingQueue<T> implements MyQueue<T> 
{

	@Override
	public void insert(T element) 
	{
		
	}

	@Override
	public T remove() 
	{
		return null;
	}

	@Override
	public T peek() 
	{
		return null;
	}

	@Override
	public boolean isEmpty() 
	{
		return false;
	}

}
