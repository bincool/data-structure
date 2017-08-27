package com.wchy.structure.link.bean;

public class Link 
{
	/**
	 * ��������.
	 */
	private int data;
	
	/**
	 * ����Ͱ�ڵ㣬ָ����һ���ڵ�.
	 */
	private Link next;
	
	public Link() 
	{
	}
	
	public Link(int data) 
	{
		this.data = data;
	}

	/**
	 * 
	* @Title: getData 
	* @Description: ��ȡͰ�е�����.
	* @param @return �趨�ļ�. 
	* @return T �������� .
	* @throws 
	* 		�쳣.
	 */
	public int getData() 
	{
		return data;
	}

	/**
	 * 
	* @Title: setData 
	* @Description: ����Ͱ�е�����.
	* @param @param data �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setData(int data) 
	{
		this.data = data;
	}

	/**
	 * 
	* @Title: getNext 
	* @Description: ��ȡ��һ��Ͱ�ڵ�.
	* @param @return �趨�ļ�. 
	* @return Bucket<T> �������� .
	* @throws 
	* 		�쳣.
	 */
	public Link getNext() 
	{
		return next;
	}

	/**
	 * 
	* @Title: setNext 
	* @Description: ������һ��Ͱ�ڵ�.
	* @param @param next �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setNext(Link next) 
	{
		this.next = next;
	}

	@Override
	public String toString() {
		return "Link [data=" + data + "]";
	}
}
