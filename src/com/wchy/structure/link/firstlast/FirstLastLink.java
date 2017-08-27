package com.wchy.structure.link.firstlast;

import org.apache.log4j.Logger;

import com.wchy.structure.link.bean.Link;

/**
 * 
* @ClassName FirstLastLink.java
* @Description 
* <p>
* ˫������.
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
* @Date 2017��8��27�� ����12:30:23.
*
 */
public class FirstLastLink<T> 
{
	
	/**
	 * ��־����.
	 */
	private static final Logger LOGGER = Logger.getLogger(FirstLastLink.class);
	
	/**
	 * ��ӡ�ַ���������ͬһ�黺������.
	 */
	private static final StringBuffer sb = new StringBuffer();
	
	/**
	 * ����ͷ��.
	 */
	private Link<T> first;
	
	/**
	 * ����β��.
	 */
	private Link<T> last;
	
	/**
	 * 
	* @Title: isEmpty 
	* @Description: ����ռ��.
	* @param @return �趨�ļ�. 
	* @return boolean �������� .
	* @throws 
	* 		�쳣.
	 */
	public boolean isEmpty() 
	{
		return first == null;
	}
	
	/**
	 * 
	* @Title: insertFirst 
	* @Description: ����ͷ���������ݽڵ�.
	* @param @param data �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void insertFirst(T data) 
	{
		Link<T> newLink = new Link<T>(data);
		if (isEmpty()) 
		{
			last = newLink;
		}
		newLink.setNext(first);
		first = newLink;
	}
	
	/**
	 * 
	* @Title: insertLast 
	* @Description: ����β���������ݽڵ�.
	* @param @param data �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void insertLast(T data) 
	{
		Link<T> newLink = new Link<T>(data);
		if (isEmpty()) 
		{
			first = newLink;
		} 
		else 
		{
			last.setNext(newLink);
		}
		last = newLink;
	}
	
	/**
	 * 
	* @Title: deleteFirst 
	* @Description: �鿴����ͷ������.
	* @param @return �趨�ļ�. 
	* @return int �������� .
	* @throws 
	* 		�쳣.
	 */
	public T peekFirst() 
	{
		return first == null ? null : first.getData();
	}
	
	/**
	 * 
	* @Title: deleteFirst 
	* @Description: ɾ������ͷ�����ݣ�����ǰӦ���п��ж�.
	* @param @return �趨�ļ�. 
	* @return int �������� .
	* @throws 
	* 		�쳣.
	 */
	public T deleteFirst() 
	{
		T ret = first.getData();
		if (null == first.getNext()) 
		{
			last = null;
		}
		first = first.getNext();
		return ret;
	}
	
	/**
	 * 
	* @Title: display 
	* @Description: ��ӡ˫������.
	* @param  �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void display() 
	{
		Link<T> current = first;
		while (null != current) 
		{
			sb.append(current.getData()).append(" ");
			current = current.getNext();
		}
		LOGGER.info(sb.toString());
		sb.delete(0, sb.length());
	}
	
}
