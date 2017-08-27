package com.wchy.structure.queue.ring;

import com.wchy.structure.queue.intf.MyQueue;

/**
 * 
* @ClassName RingQueue.java
* @Description 
* <p>
* 环形队列.
* </p>
* <p>
* 详细描述：环形队列，让数组容量比队列数据项的最大值大1.
 * rear + 1 = head,满.
 * rear = front,空.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author wchy.
* 
* @Date 2017年8月27日 下午10:20:27.
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
