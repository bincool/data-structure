package com.wchy.structure.common.utils;

/**
 * 
* @ClassName CompareIntf.java
* @Description 
* <p>
* 比较器接口.
* </p>
* <p>
* 详细描述.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author wchy.
* 
* @Date 2017年9月17日 下午2:43:40.
* 
* @param <T>
 */
public interface CompareIntf<T> 
{
	
	/**
	 * 
	* @Title: compareTo 
	* @Description: 比较器接口.
	* @param @param o
	* @param @return 设定文件. 
	* @return int 返回类型 .
	* @throws 
	* 		异常.
	 */
	public int compareTo(T o);

}
