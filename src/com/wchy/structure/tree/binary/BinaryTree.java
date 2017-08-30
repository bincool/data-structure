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
			while (!isEquals(current.getData(), data)) 
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
	public boolean delete(T data) 
	{
		TreeNode<T> current = root;
		TreeNode<T> parent = root;
		boolean isLeftChild = true;
		
		if (null == current) 
		{
			return false;
		} 
		else 
		{
			// 1 查找要删除的节点，找不到返回false.
			while (!isEquals(current.getData(), data)) 
			{
				parent = current;
				if (compare(current.getData(), data)) 
				{
					isLeftChild = true;
					current = current.getLeftChild();
				} 
				else 
				{
					isLeftChild = false;
					current = current.getRightChild();
				}
				if (null == current) 
				{
					return false;
				}
			}
			
			// 2 检查节点是否是叶节点，已经检查节点是否是根.
			if (isLeaf(current)) 
			{
				if (current == root) 
				{
					root = null;
				} 
				else if (isLeftChild) 
				{
					parent.setLeftChild(null);
				} 
				else 
				{
					parent.setRightChild(null);
				}
			} 
			// 2.1 有一个左孩子节点.
			else if (null == current.getRightChild()) 
			{
				if (current == root) 
				{
					root = current.getLeftChild();
				} 
				else if (isLeftChild) 
				{
					parent.setLeftChild(current.getLeftChild());
				} 
				else 
				{
					parent.setRightChild(current.getLeftChild());
				}
			} 
			// 2.2 有一个右孩子节点.
			else if (null == current.getLeftChild()) 
			{
				if (current == root) 
				{
					root = current.getRightChild();
				} 
				else if (isLeftChild) 
				{
					parent.setLeftChild(current.getRightChild());
				} 
				else 
				{
					parent.setRightChild(current.getRightChild());
				}
			} 
			// 2.3 有两个孩子节点.
			else 
			{
				// 2.3.1 查找后继节点.
				TreeNode<T> successor = getSuccessor(current);
				if (current == root) 
				{
					root = successor;
				} 
				else if (isLeftChild)
				{
					parent.setLeftChild(successor);
				} 
				else 
				{
					parent.setRightChild(successor);
				}
				successor.setLeftChild(current.getLeftChild());
			}
		}
		
		return true;
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
	private boolean isEquals(Schedule a, Schedule b) 
	{
		return a.getStartDate().equals(b.getStartDate());
	}
	
	/**
	 * 
	* @Title: isLeaf 
	* @Description: 检查节点是否是叶节点.
	* @param @param rNode
	* @param @return 设定文件. 
	* @return boolean 返回类型 .
	* @throws 
	* 		异常.
	 */
	private boolean isLeaf(TreeNode<T> rNode) 
	{
		return null == rNode.getLeftChild() && null == rNode.getRightChild();
	}
	
	/**
	 * 
	* @Title: getSuccessor 
	* @Description: 找节点的后继节点.
	* @param @param rNode
	* 		含右孩子节点.
	* @param @return 设定文件. 
	* @return TreeNode<T> 返回类型 .
	* @throws 
	* 		异常.
	 */
	private TreeNode<T> getSuccessor(TreeNode<T> rNode) 
	{
		TreeNode<T> successorParent = rNode;
		TreeNode<T> successor = rNode;
		TreeNode<T> current = rNode.getRightChild();
		while (null != current) 
		{
			successorParent = successor;
			successor = current;
			current = current.getLeftChild();
		}
		
		if (successor != rNode.getRightChild()) 
		{
			successorParent.setLeftChild(successor.getRightChild());
			successor.setRightChild(rNode.getRightChild());
		}
		return successor;
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
