package com.wchy.structure.queue.link;

import com.wchy.structure.link.firstlast.FirstLastLink;
import com.wchy.structure.queue.intf.MyQueue;

/**
 * 
* @ClassName Queue.java
* @Description 
* <p>
* ����˫������ʵ�ֶ���.
* </p>
* <p>
* ��ϸ����������˫������ʵ�ֶ��У�.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author wchy.
* 
* @Date 2017��8��27�� ����12:49:21.
*
 */
public class Queue<T> implements MyQueue<T>
{
	
	/**
	 * ˫������,����д��static��������ͬһ����̬�ڴ��.
	 */
	private FirstLastLink<T> firstLastLink = new FirstLastLink<T>();
	
	/**
	 * 
	* @Title: display 
	* @Description: ��ӡ����.
	* @param  �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void display() 
	{
		firstLastLink.display();
	}
	
	/**
	 * 
	* @Title: pop 
	* @Description: �Ӷ����ﵯ������,����ǰ����Ҫ���пռ��.
	* @param @return �趨�ļ�. 
	* @return Integer �������� .
	* @throws 
	* 		�쳣.
	 */
	public T removeByCheck() 
	{
		if (firstLastLink.isEmpty()) 
		{
			return null;
		} 
		else 
		{
			return firstLastLink.deleteFirst();
		}
	}

	@Override
	public void insert(T element) 
	{
		firstLastLink.insertLast(element);
		
	}
	
	@Override
	public T remove() 
	{
		return firstLastLink.deleteFirst();
	}

	@Override
	public T peek() 
	{
		return firstLastLink.peekFirst();
	}

	@Override
	public boolean isEmpty() 
	{
		return firstLastLink.isEmpty();
	}

	
	
}
