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
* 二叉树.
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
* @Date 2017年8月27日 下午8:01:23.
* 
* @param <T>
 */
public class BinaryTree<T extends Schedule> implements Tree<T> 
{
	
	/**
	 * 日志对象.
	 */
	private final static Logger LOGGER = Logger.getLogger(BinaryTree.class);
	
	/**
	 * 遍历二叉树的方法.
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
	 * 二叉树根节点.
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
					// 左子树中.
					current = current.getLeftChild();
					if (null == current) 
					{
						parent.setLeftChild(newNode);
						return;
					}
				} 
				else 
				{
					// 右子树中.
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
	* @Description: 比较日程表的开始时间.
	* @param @param a
	* @param @param b
	* @param @return 设定文件. 
	* @return boolean 返回类型 .
	* 		true:a的开始时间晚于b.false:b的时间早等于a.
	* @throws 
	* 		异常.
	 */
	private boolean compare(Schedule a, Schedule b) 
	{
		return a.getStartDate().compareTo(b.getStartDate()) > 0;
	}
	
	/**
	 * 
	* @Title: accessNode 
	* @Description: 访问节点.
	* @param @param rNode 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	private void accessNode(TreeNode<T> rNode) 
	{
		LOGGER.info(rNode.getData());
	}
	
	/**
	 * 
	* @Title: inOrder 
	* @Description: 中序遍历.
	* @param  设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
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
	* @Description: 前序遍历.
	* @param  设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
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
	* @Description: 后序遍历.
	* @param  设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
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
