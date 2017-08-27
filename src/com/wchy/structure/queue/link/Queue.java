package com.wchy.structure.queue.link;

import com.wchy.structure.link.firstlast.FirstLastLink;

/**
 * 
* @ClassName Queue.java
* @Description 
* <p>
* 利用双端链表实现队列.
* </p>
* <p>
* 详细描述：利用双端链表实现队列，.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author wchy.
* 
* @Date 2017年8月27日 下午12:49:21.
*
 */
public class Queue<T> 
{
	
	/**
	 * 双端链表,不能写成static，否则是同一个静态内存块.
	 */
	private FirstLastLink<T> firstLastLink = new FirstLastLink<T>();
	
	/**
	 * 
	* @Title: push 
	* @Description: 向队列里插入数据.
	* @param @param data 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void push(T data) 
	{
		firstLastLink.insertLast(data);
	}
	
	/**
	 * 
	* @Title: isEmpty 
	* @Description: 队列空判断.
	* @param @return 设定文件. 
	* @return boolean 返回类型 .
	* @throws 
	* 		异常.
	 */
	public boolean isEmpty() 
	{
		return firstLastLink.isEmpty();
	}
	
	/**
	 * 
	* @Title: display 
	* @Description: 打印队列.
	* @param  设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void display() 
	{
		firstLastLink.display();
	}
	
	/**
	 * 
	* @Title: pop 
	* @Description: 从队列里弹出数据,调用前需要先进行空检查.
	* @param @return 设定文件. 
	* @return Integer 返回类型 .
	* @throws 
	* 		异常.
	 */
	public T pop() 
	{
		return firstLastLink.deleteFirst();
	}
	
	/**
	 * 
	* @Title: pop 
	* @Description: 从队列里弹出数据,调用前不需要进行空检查.
	* @param @return 设定文件. 
	* @return Integer 返回类型 .
	* @throws 
	* 		异常.
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
