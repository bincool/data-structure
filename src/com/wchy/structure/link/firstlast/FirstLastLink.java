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
public class FirstLastLink 
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
	private Link first;
	
	/**
	 * ����β��.
	 */
	private Link last;
	
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
	public void insertFirst(int data) 
	{
		Link newLink = new Link(data);
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
	public void insertLast(int data) 
	{
		Link newLink = new Link(data);
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
	* @Description: ɾ������ͷ�����ݣ�����ǰӦ���п��ж�.
	* @param @return �趨�ļ�. 
	* @return int �������� .
	* @throws 
	* 		�쳣.
	 */
	public int deleteFirst() 
	{
		int ret = first.getData();
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
		Link current = first;
		while (null != current) 
		{
			sb.append(current.getData()).append(" ");
			current = current.getNext();
		}
		LOGGER.info(sb.toString());
		sb.delete(0, sb.length());
	}
	
}
