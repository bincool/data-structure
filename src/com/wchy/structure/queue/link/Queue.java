package com.wchy.structure.queue.link;

import com.wchy.structure.link.firstlast.FirstLastLink;

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
public class Queue<T> 
{
	
	/**
	 * ˫������,����д��static��������ͬһ����̬�ڴ��.
	 */
	private FirstLastLink<T> firstLastLink = new FirstLastLink<T>();
	
	/**
	 * 
	* @Title: push 
	* @Description: ��������������.
	* @param @param data �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void push(T data) 
	{
		firstLastLink.insertLast(data);
	}
	
	/**
	 * 
	* @Title: isEmpty 
	* @Description: ���п��ж�.
	* @param @return �趨�ļ�. 
	* @return boolean �������� .
	* @throws 
	* 		�쳣.
	 */
	public boolean isEmpty() 
	{
		return firstLastLink.isEmpty();
	}
	
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
	* @Description: �Ӷ����ﵯ������,����ǰ��Ҫ�Ƚ��пռ��.
	* @param @return �趨�ļ�. 
	* @return Integer �������� .
	* @throws 
	* 		�쳣.
	 */
	public T pop() 
	{
		return firstLastLink.deleteFirst();
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
	public T popByCheck() 
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
	
}