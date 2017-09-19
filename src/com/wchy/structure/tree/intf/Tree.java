package com.wchy.structure.tree.intf;

/**
 * 
* @ClassName Tree.java
* @Description 
* <p>
* 二叉树接口类.
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
* @Date 2017年8月27日 下午7:53:46.
* 
* @param <T>
 */
public interface Tree<T> 
{
	
	/**
	 * 
	* @Title: insert 
	* @Description: 新增节点数据.
	* @param @param data 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	void insert(T data);
	
	/**
	 * 
	* @Title: find 
	* @Description: 按关键字查找节点.
	* @param @param key
	* @param @return 设定文件. 
	* @return Object 返回类型 .
	* @throws 
	* 		异常.
	 */
	Object find(T data);
	
	/**
	 * 
	* @Title: delete 
	* @Description: 按关键字删除节点.
	* @param @param key 设定文件. 
	* @return boolean 返回类型 .
	* @throws 
	* 		异常.
	 */
	boolean delete(T data);
	
	/**
	 * 
	* @Title: order 
	* @Description: 遍历二叉树.
	* @param @param methodType 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	void order(String methodType);
	
	/**
	 * 
	* @Title: minimum 
	* @Description: 查找最小关键字的节点.
	* @param @return 设定文件. 
	* @return Object 返回类型 .
	* @throws 
	* 		异常.
	 */
	Object minimum();
	
	/**
	 * 
	* @Title: maximum 
	* @Description: 查找最大关键字的节点.
	* @param @return 设定文件. 
	* @return Object 返回类型 .
	* @throws 
	* 		异常.
	 */
	Object maximum();
	
}
