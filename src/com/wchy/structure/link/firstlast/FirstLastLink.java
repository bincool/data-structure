package com.wchy.structure.link.firstlast;

import org.apache.log4j.Logger;

import com.wchy.structure.link.bean.Link;

/**
 * 
* @ClassName FirstLastLink.java
* @Description 
* <p>
* 双端链表.
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
* @Date 2017年8月27日 下午12:30:23.
*
 */
public class FirstLastLink<T> 
{
	
	/**
	 * 日志对象.
	 */
	private static final Logger LOGGER = Logger.getLogger(FirstLastLink.class);
	
	/**
	 * 打印字符串，利用同一块缓存区域.
	 */
	private static final StringBuffer sb = new StringBuffer();
	
	/**
	 * 链表头部.
	 */
	private Link<T> first;
	
	/**
	 * 链表尾部.
	 */
	private Link<T> last;
	
	/**
	 * 
	* @Title: isEmpty 
	* @Description: 链表空检查.
	* @param @return 设定文件. 
	* @return boolean 返回类型 .
	* @throws 
	* 		异常.
	 */
	public boolean isEmpty() 
	{
		return first == null;
	}
	
	/**
	 * 
	* @Title: insertFirst 
	* @Description: 链表头部插入数据节点.
	* @param @param data 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
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
	* @Description: 链表尾部插入数据节点.
	* @param @param data 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
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
	* @Description: 查看链表头部数据.
	* @param @return 设定文件. 
	* @return int 返回类型 .
	* @throws 
	* 		异常.
	 */
	public T peekFirst() 
	{
		return first == null ? null : first.getData();
	}
	
	/**
	 * 
	* @Title: deleteFirst 
	* @Description: 删除链表头部数据，调用前应进行空判断.
	* @param @return 设定文件. 
	* @return int 返回类型 .
	* @throws 
	* 		异常.
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
	* @Description: 打印双端链表.
	* @param  设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
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
