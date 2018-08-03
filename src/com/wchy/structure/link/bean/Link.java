package com.wchy.structure.link.bean;

public class Link<T> 
{
	/**
	 * 数字数据.
	 */
	private T data;
	
	/**
	 * 数字桶节点，指向下一个节点.
	 */
	private Link<T> next;
	
	public Link() 
	{
	}
	
	public Link(T data) 
	{
		this.data = data;
	}

	/**
	 * 
	* @Title: getData 
	* @Description: 获取桶中的数据.
	* @param @return 设定文件. 
	* @return T 返回类型 .
	* @throws 
	* 		异常.
	 */
	public T getData() 
	{
		return data;
	}

	/**
	 * 
	* @Title: setData 
	* @Description: 设置桶中的数据.
	* @param @param data 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setData(T data) 
	{
		this.data = data;
	}

	/**
	 * 
	* @Title: getNext 
	* @Description: 获取下一个桶节点.
	* @param @return 设定文件. 
	* @return Bucket<T> 返回类型 .
	* @throws 
	* 		异常.
	 */
	public Link<T> getNext() 
	{
		return next;
	}

	/**
	 * 
	* @Title: setNext 
	* @Description: 设置下一个桶节点.
	* @param @param next 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setNext(Link<T> next) 
	{
		this.next = next;
	}

	@Override
	public String toString() {
		return "Link [data=" + data + "]";
	}
}
