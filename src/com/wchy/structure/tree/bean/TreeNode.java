package com.wchy.structure.tree.bean;

/**
 * 
* @ClassName TreeNode.java
* @Description 
* <p>
* 二叉树-节点bean.
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
* @Date 2017年8月27日 下午7:51:01.
* 
* @param <T>
 */
public class TreeNode<T> 
{
	
	/**
	 * 节点数据项.
	 */
	private T data;
	
	/**
	 * 左孩子节点.
	 */
	private TreeNode<T> leftChild;
	
	/**
	 * 右孩子节点.
	 */
	private TreeNode<T> rightChild;

	/**
	 * 
	* @Title: getData 
	* @Description: 获取节点数据.
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
	* @Description: 设置节点数据.
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
	* @Title: getLeftChild 
	* @Description: 获取左孩子节点.
	* @param @return 设定文件. 
	* @return TreeNode<T> 返回类型 .
	* @throws 
	* 		异常.
	 */
	public TreeNode<T> getLeftChild() 
	{
		return leftChild;
	}

	/**
	 * 
	* @Title: setLeftChild 
	* @Description: 设置左孩子节点.
	* @param @param leftChild 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setLeftChild(TreeNode<T> leftChild) 
	{
		this.leftChild = leftChild;
	}

	/**
	 * 
	* @Title: getRightChild 
	* @Description: 获取右孩子节点.
	* @param @return 设定文件. 
	* @return TreeNode<T> 返回类型 .
	* @throws 
	* 		异常.
	 */
	public TreeNode<T> getRightChild() 
	{
		return rightChild;
	}

	/**
	 * 
	* @Title: setRightChild 
	* @Description: 设置右孩子节点.
	* @param @param rightChild 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setRightChild(TreeNode<T> rightChild) 
	{
		this.rightChild = rightChild;
	}

	@Override
	public String toString() 
	{
		return "TreeNode [data=" + data + "]";
	}
	
}
