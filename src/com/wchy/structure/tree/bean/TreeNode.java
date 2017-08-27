package com.wchy.structure.tree.bean;

/**
 * 
* @ClassName TreeNode.java
* @Description 
* <p>
* ������-�ڵ�bean.
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
* @Date 2017��8��27�� ����7:51:01.
* 
* @param <T>
 */
public class TreeNode<T> 
{
	
	/**
	 * �ڵ�������.
	 */
	private T data;
	
	/**
	 * ���ӽڵ�.
	 */
	private TreeNode<T> leftChild;
	
	/**
	 * �Һ��ӽڵ�.
	 */
	private TreeNode<T> rightChild;

	/**
	 * 
	* @Title: getData 
	* @Description: ��ȡ�ڵ�����.
	* @param @return �趨�ļ�. 
	* @return T �������� .
	* @throws 
	* 		�쳣.
	 */
	public T getData() 
	{
		return data;
	}

	/**
	 * 
	* @Title: setData 
	* @Description: ���ýڵ�����.
	* @param @param data �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setData(T data) 
	{
		this.data = data;
	}

	/**
	 * 
	* @Title: getLeftChild 
	* @Description: ��ȡ���ӽڵ�.
	* @param @return �趨�ļ�. 
	* @return TreeNode<T> �������� .
	* @throws 
	* 		�쳣.
	 */
	public TreeNode<T> getLeftChild() 
	{
		return leftChild;
	}

	/**
	 * 
	* @Title: setLeftChild 
	* @Description: �������ӽڵ�.
	* @param @param leftChild �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setLeftChild(TreeNode<T> leftChild) 
	{
		this.leftChild = leftChild;
	}

	/**
	 * 
	* @Title: getRightChild 
	* @Description: ��ȡ�Һ��ӽڵ�.
	* @param @return �趨�ļ�. 
	* @return TreeNode<T> �������� .
	* @throws 
	* 		�쳣.
	 */
	public TreeNode<T> getRightChild() 
	{
		return rightChild;
	}

	/**
	 * 
	* @Title: setRightChild 
	* @Description: �����Һ��ӽڵ�.
	* @param @param rightChild �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
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
