package com.wchy.structure.tree.binary;

import org.apache.log4j.Logger;

import com.wchy.structure.tree.bean.Schedule;
import com.wchy.structure.tree.bean.TreeNode;
import com.wchy.structure.tree.intf.Tree;

/**
 * 
* @ClassName BinaryTree.java
* @Description 
* <p>
* ������.
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
* @Date 2017��8��27�� ����8:01:23.
* 
* @param <T>
 */
public class BinaryTree<T extends Schedule> implements Tree<T> 
{
	
	/**
	 * ��־����.
	 */
	private final static Logger LOGGER = Logger.getLogger(BinaryTree.class);
	
	/**
	 * �����������ķ���.
	 */
	private static enum OrderMethod 
	{
		preOrder,
		inOrder,
		postOrder;
		
		protected static OrderMethod getMethodType(String methodType) 
		{
			return valueOf(methodType);
		}
		
	}
	
	/**
	 * ���������ڵ�.
	 */
	private TreeNode<T> root;

	@Override
	public void insert(T data) 
	{
		TreeNode<T> newNode = new TreeNode<>();
		newNode.setData(data);
		if (null == root) 
		{
			root = newNode;
		} 
		else 
		{
			TreeNode<T> current = root;
			TreeNode<T> parent;
			while (true) 
			{
				parent = current;
				if (compare(current.getData(), data)) 
				{
					// ��������.
					current = current.getLeftChild();
					if (null == current) 
					{
						parent.setLeftChild(newNode);
						return;
					}
				} 
				else 
				{
					// ��������.
					current = current.getRightChild();
					if (null == current) 
					{
						parent.setRightChild(newNode);
						return;
					}
				}
			}
			
		}
	}

	@Override
	public TreeNode<T> find(T data) 
	{
		TreeNode<T> current = root;
		if (null == current) 
		{
			return null;
		} 
		else 
		{
			while (current.getData().getStartDate().equals(data.getStartDate())) 
			{
				if (compare(current.getData(), data)) 
				{
					current = current.getLeftChild();
				} 
				else 
				{
					current = current.getRightChild();
				}
				if (null == current) 
				{
					return null;
				}
			}
			return current;
		}
	}

	@Override
	public void delete(T data) 
	{
		
	}

	@Override
	public void order(String methodType) 
	{
		switch (OrderMethod.getMethodType(methodType)) 
		{
		case preOrder:
			preOrder(root);
			break;
		case inOrder:
			inOrder(root);
			break;
		case postOrder:
			postOrder(root);
			break;
		default:
			break;
		}
	}
	
	@Override
	public TreeNode<T> minimum() 
	{
		TreeNode<T> current = root;
		TreeNode<T> parent = null;
		while (null != current) 
		{
			parent = current;
			current = current.getLeftChild();
		}
		return parent;
	}

	@Override
	public TreeNode<T> maximum() 
	{
		TreeNode<T> current = root;
		TreeNode<T> parent = null;
		while (null != current) 
		{
			parent = current;
			current = current.getRightChild();
		}
		return parent;
	}
	
	/**
	 * 
	* @Title: compare 
	* @Description: �Ƚ��ճ̱�Ŀ�ʼʱ��.
	* @param @param a
	* @param @param b
	* @param @return �趨�ļ�. 
	* @return boolean �������� .
	* 		true:a�Ŀ�ʼʱ������b.false:b��ʱ�������a.
	* @throws 
	* 		�쳣.
	 */
	private boolean compare(Schedule a, Schedule b) 
	{
		return a.getStartDate().compareTo(b.getStartDate()) > 0;
	}
	
	/**
	 * 
	* @Title: accessNode 
	* @Description: ���ʽڵ�.
	* @param @param rNode �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	private void accessNode(TreeNode<T> rNode) 
	{
		LOGGER.info(rNode.getData());
	}
	
	/**
	 * 
	* @Title: inOrder 
	* @Description: �������.
	* @param  �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	private void inOrder(TreeNode<T> root) 
	{
		if (null != root) 
		{
			inOrder(root.getLeftChild());
			accessNode(root);
			inOrder(root.getRightChild());
		}
	}
	
	/**
	 * 
	* @Title: preOrder 
	* @Description: ǰ�����.
	* @param  �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	private void preOrder(TreeNode<T> root) 
	{
		if (null != root) 
		{
			accessNode(root);
			preOrder(root.getLeftChild());
			preOrder(root.getRightChild());
		}
	}
	
	/**
	 * 
	* @Title: postOrder 
	* @Description: �������.
	* @param  �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	private void postOrder(TreeNode<T> root) 
	{
		if (null != root) 
		{
			postOrder(root.getLeftChild());
			postOrder(root.getRightChild());
			accessNode(root);
		}
	}
	
}
