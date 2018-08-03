package com.wchy.structure.queue.intf;

/**
 * 
* @ClassName MyQueue.java
* @Description 
* <p>
* 队列接口.
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
* @Date 2017年8月27日 下午9:32:24.
* 
* @param <T>
 */
public interface MyQueue<T> 
{
	
	/**
	 * 
	* @Title: insert 
	* @Description: 向队列中插入数据.
	* @param @param element 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	void insert(T element);
	
	/**
	 * 
	* @Title: remove 
	* @Description: 从队列中弹出数据.
	* @param @return 设定文件. 
	* @return T 返回类型 .
	* @throws 
	* 		异常.
	 */
	T remove();
	
	/**
	 * 
	* @Title: peek 
	* @Description: 查看队首数据.
	* @param @return 设定文件. 
	* @return T 返回类型 .
	* @throws 
	* 		异常.
	 */
	T peek();
	
	/**
	 * 
	* @Title: isEmpty 
	* @Description: 队列空判断.
	* @param @return 设定文件. 
	* @return boolean 返回类型 .
	* @throws 
	* 		异常.
	 */
	boolean isEmpty();
	
}
