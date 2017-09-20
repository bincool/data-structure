package com.wchy.structure.tree.redblack;

import org.apache.log4j.Logger;

import com.wchy.structure.common.utils.CompareIntf;
import com.wchy.structure.tree.bean.RBTNode;
import com.wchy.structure.tree.constants.RBTConstant;
import com.wchy.structure.tree.intf.Tree;

/**
 * 
* @ClassName RBTree.java
* @Description 
* <p>
* 红黑树.
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
* @Date 2017年9月17日 下午3:38:39.
* 
* @param <T>
 */
public class RBTree<T extends CompareIntf<T>> implements Tree<T>
{
	
	/**
	 * 日志对象.
	 */
	private static final Logger LOGGER = Logger.getLogger(RBTree.class);
	
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
	 * 根节点.
	 */
	private RBTNode<T> root;
	
	/**
	 * 
	* @Title: parentOf 
	* @Description: 获取节点父节点.
	* @param @param node
	* @param @return 设定文件. 
	* @return RBTNode<T> 返回类型 .
	* @throws 
	* 		异常.
	 */
	private RBTNode<T> parentNodeOf(RBTNode<T> node) 
	{
		return null != node ? node.getParentNode() : null;
	}
	
	/**
	 * 
	* @Title: colorOf 
	* @Description: 获取节点颜色.
	* @param @param node
	* @param @return 设定文件. 
	* @return boolean 返回类型 .
	* @throws 
	* 		异常.
	 */
	private boolean colorOf(RBTNode<T> node) 
	{
		return null != node ? node.getColor() : RBTConstant.BLACK;
	}
	
	/**
	 * 
	* @Title: isRed 
	* @Description: 节点是红色的.
	* @param @param node
	* @param @return 设定文件. 
	* @return boolean 返回类型 .
	* @throws 
	* 		异常.
	 */
	private boolean isRed(RBTNode<T> node) 
	{
		return (null != node && RBTConstant.RED == node.getColor()) ? true : false;
	}
	
	/**
	 * 
	* @Title: isRed 
	* @Description: 节点是黑色的.
	* @param @param node
	* @param @return 设定文件. 
	* @return boolean 返回类型 .
	* @throws 
	* 		异常.
	 */
	private boolean isBlack(RBTNode<T> node) 
	{
		return !isRed(node);
	}
	
	/**
	 * 
	* @Title: setRed 
	* @Description: 将节点设置为红色.
	* @param @param node 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	private void setRed(RBTNode<T> node) 
	{
		if (null != node) 
		{
			node.setColor(RBTConstant.RED);
		}
	}
	
	/**
	 * 
	* @Title: setBlack 
	* @Description: 将节点设置为黑色.
	* @param @param node 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	private void setBlack(RBTNode<T> node) 
	{
		if (null != node) 
		{
			node.setColor(RBTConstant.BLACK);
		}
	}
	
	/**
	 * 
	* @Title: setParentNode 
	* @Description: 设置节点的父节点.
	* @param @param node
	* @param @param parentNode 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	private void setParentNode(RBTNode<T> node, RBTNode<T> parentNode) 
	{
		if (null != node) 
		{
			node.setParentNode(parentNode);
		}
	}
	
	/**
	 * 
	* @Title: setColor 
	* @Description: 设置节点颜色.
	* @param @param node
	* @param @param color 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	private void setColor(RBTNode<T> node, boolean color) 
	{
		if (null != node) 
		{
			node.setColor(color);
		}
	}
	
	/**
	 * 
	* @Title: leftRotate 
	* @Description: 对红黑树的节点xNode进行左旋转,前提条件是xNode的右孩子存在.
	* @param @param xNode 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	private void leftRotate(RBTNode<T> xNode) 
	{
		// 1 找到xNode的右孩子yNode.
		RBTNode<T> yNode = xNode.getRightChild();
		
		// 2 设置xNode的右孩子为yNode的左孩子，yNode左孩子的父节点为xNode.
		xNode.setRightChild(yNode.getLeftChild());
		if (null != yNode.getLeftChild()) 
		{
			yNode.getLeftChild().setParentNode(xNode);
		}
		
		// 将yNode节点的父节点设置为xNode的父节点.
		yNode.setParentNode(xNode.getParentNode());
		if (null == xNode.getParentNode()) 
		{
			// 如果xNode的父节点为null，则将yNode设置为根.
			root = yNode;
		} 
		else 
		{
			// 如果xNode是其父节点的左孩子.
			if (xNode == xNode.getParentNode().getLeftChild()) 
			{
				// 将yNode设置为xNode父节点的左孩子.
				xNode.getParentNode().setLeftChild(yNode);
			} 
			else 
			{
				// 将yNode设置为xNode父节点的右孩子.
				xNode.getParentNode().setRightChild(yNode);
			}
		}
		
		// 将xNode设为yNode的左孩子”.
		yNode.setLeftChild(xNode);
		
		// 将xNode的父节点设置为yNode.
		xNode.setParentNode(yNode);
	}
	
	/**
	 * 
	* @Title: rightRotate 
	* @Description: 对红黑树的节点yNode进行右旋转.
	* @param @param yNode 设定文件.
	* @return void 返回类型.
	* @throws 
	* 		异常.
	 */
	private void rightRotate(RBTNode<T> yNode) 
	{
		// 1 找到yNode的左孩子.
		RBTNode<T> xNode = yNode.getLeftChild();
		
		// 2 设置yNode的左孩子为xNode的右孩子,xNode右孩子的父节点为yNode.
		yNode.setLeftChild(xNode.getRightChild());
		if (null != xNode.getRightChild()) 
		{
			xNode.getRightChild().setParentNode(yNode);
		}
		
		// 3 设置xNode的父节点为yNode的父节点.
		xNode.setParentNode(yNode.getParentNode());
		if (null == yNode.getParentNode()) 
		{
			// 如果yNode的父节点为空，设置xNode为根节点.
			root = xNode;
		} 
		else 
		{
			// 如果yNode是其父节点的右孩子.
			if (yNode == yNode.getParentNode().getRightChild()) 
			{
				// 设置xNode为yNode的父节点的右孩子.
				yNode.getParentNode().setRightChild(xNode);
			} 
			else 
			{
				// 设置xNode为yNode的父节点的左孩子.
				yNode.getParentNode().setLeftChild(xNode);
			}
		}
		
		// 将yNode设为xNode的右孩子.
		xNode.setRightChild(yNode);
		
		// 将yNode的父节点设为xNode.
		yNode.setParentNode(xNode);
		
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
	private void accessNode(RBTNode<T> rNode) 
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
	private void inOrder(RBTNode<T> root) 
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
	private void preOrder(RBTNode<T> root) 
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
	private void postOrder(RBTNode<T> root) 
	{
		if (null != root) 
		{
			postOrder(root.getLeftChild());
			postOrder(root.getRightChild());
			accessNode(root);
		}
	}
	
	/**
	 * 
	* @Title: minimum 
	* @Description: 查找以tree为根节点的树的最小节点.
	* @param @param tree
	* @param @return 设定文件. 
	* @return RBTNode<T> 返回类型 .
	* @throws 
	* 		异常.
	 */
	private RBTNode<T> minimum(RBTNode<T> tree) 
	{
		RBTNode<T> current = tree;
		if (null == current) 
		{
			return null;
		}
		
		while (null != current.getLeftChild()) 
		{
			current = current.getLeftChild();
		}
		
		return current;
	}
	
	/**
	 * 
	* @Title: maximum 
	* @Description: 查找以tree为根节点的树的最大节点.
	* @param @param tree
	* @param @return 设定文件. 
	* @return RBTNode<T> 返回类型 .
	* @throws 
	* 		异常.
	 */
	private RBTNode<T> maximum(RBTNode<T> tree) 
	{
		RBTNode<T> current = tree;
		if (null == current) 
		{
			return null;
		} 
		
		while (null != current.getRightChild()) 
		{
			current = current.getRightChild();
		} 
		
		return current;
	}
	
	/**
	 * 
	* @Title: getSuccessor 
	* @Description: 获取xNode节点的后继节点，比xNode大的最小节点.
	* @param @param xNode
	* @param @return 设定文件. 
	* @return RBTree<T> 返回类型 .
	* @throws 
	* 		异常.
	 */
	public RBTNode<T> getSuccessor(RBTNode<T> xNode) 
	{
		// 如果xNode存在右孩子，则xNode的后继节点为以其右孩子为根的子树的最小节点.
		if (null != xNode.getRightChild()) 
		{
			return minimum(xNode.getRightChild());
		}
		
		// 如果xNode没有右孩子，则xNode有两种情况.
		// xNode是一个左孩子，则xNode的后继节点为它的父节点.
		// xNode是一个右孩在，则查找xNode的最低的父节点，并且这个最低父节点要具有左孩子，找到这个最低的父节点就是xNode的后继节点.
		RBTNode<T> yNode = xNode.getParentNode();
		while ((null != yNode) && (yNode.getRightChild() == xNode)) 
		{
			xNode = yNode;
			yNode = yNode.getParentNode();
		}
		
		return yNode;
	}
	
	/**
	 * 
	* @Title: getPredecessor 
	* @Description: 找xNode的前驱节点，比xNode小的最大节点.
	* @param @param xNode
	* @param @return 设定文件. 
	* @return RBTNode<T> 返回类型 .
	* @throws 
	* 		异常.
	 */
	public RBTNode<T> getPredecessor(RBTNode<T> xNode) 
	{
		// 如果xNode存在左孩子，则xNode的前驱节点为以其左孩子为根的子树的最大节点.
		if (null != xNode.getLeftChild()) 
		{
			return maximum(xNode);
		}
		
		// 如果xNode没有左孩子，则xNode有两种可能.
		// xNode是一个右孩子，则xNode的前驱节点为它的父节点.
		// xNode是一个左孩子，则查找xNode的最低的父节点，并且该父节点的要具有右孩子，找到这个最低父节点就是xNode前驱节点.
		RBTNode<T> yNode = xNode.getParentNode();
		while ((null != yNode) && (yNode.getLeftChild() == xNode)) 
		{
			xNode = yNode;
			yNode = yNode.getParentNode();
		}
		
		return yNode;
	}

	@Override
	public void insert(T data) 
	{
		LOGGER.info("Begin to execute the insert method.");
		
		// 1 将红黑树当作一颗二叉查找树，将节点添加到二叉树中.
		
		// 2 设置节点的颜色为红色.
		
		// 3 将它重新修正为一颗红黑树.
		
		LOGGER.info("End to execute the insert method.");
	}

	@Override
	public RBTNode<T> find(T data) 
	{
		RBTNode<T> current = root;
		
		if (null == current) 
		{
			return null;
		} 
		else 
		{
			int cmp = 0;
			while (0 != (cmp = current.getData().compareTo(data))) 
			{
				
				if (cmp < 0) 
				{
					current = current.getRightChild();
				} 
				else 
				{
					current = current.getLeftChild();
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
		return false;
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
	public RBTNode<T> minimum() 
	{
		return minimum(root);
	}

	@Override
	public RBTNode<T> maximum() 
	{
		return maximum(root);
	}
	
}
