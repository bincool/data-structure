package com.wchy.structure.queue.intf;

/**
 * 
* @ClassName MyQueue.java
* @Description 
* <p>
* ���нӿ�.
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
* @Date 2017��8��27�� ����9:32:24.
* 
* @param <T>
 */
public interface MyQueue<T> 
{
	
	/**
	 * 
	* @Title: insert 
	* @Description: ������в�������.
	* @param @param element �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	void insert(T element);
	
	/**
	 * 
	* @Title: remove 
	* @Description: �Ӷ����е�������.
	* @param @return �趨�ļ�. 
	* @return T �������� .
	* @throws 
	* 		�쳣.
	 */
	T remove();
	
	/**
	 * 
	* @Title: peek 
	* @Description: �鿴��������.
	* @param @return �趨�ļ�. 
	* @return T �������� .
	* @throws 
	* 		�쳣.
	 */
	T peek();
	
	/**
	 * 
	* @Title: isEmpty 
	* @Description: ���п��ж�.
	* @param @return �趨�ļ�. 
	* @return boolean �������� .
	* @throws 
	* 		�쳣.
	 */
	boolean isEmpty();
	
}
