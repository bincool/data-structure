package com.wchy.structure.common.utils;

/**
 * 
* @ClassName CompareIntf.java
* @Description 
* <p>
* �Ƚ����ӿ�.
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
* @Date 2017��9��17�� ����2:43:40.
* 
* @param <T>
 */
public interface CompareIntf<T> 
{
	
	/**
	 * 
	* @Title: compareTo 
	* @Description: �Ƚ����ӿ�.
	* @param @param o
	* @param @return �趨�ļ�. 
	* @return int �������� .
	* @throws 
	* 		�쳣.
	 */
	public int compareTo(T o);

}
