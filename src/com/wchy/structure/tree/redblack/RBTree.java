package com.wchy.structure.tree.redblack;

import org.apache.log4j.Logger;

import com.wchy.structure.common.utils.CompareIntf;
import com.wchy.structure.tree.bean.RBTNode;
import com.wchy.structure.tree.bean.TreeNode;
import com.wchy.structure.tree.constants.RBTConstant;
import com.wchy.structure.tree.intf.Tree;

/**
 * 
* @ClassName RBTree.java
* @Description 
* <p>
* �����.
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
* @Date 2017��9��17�� ����3:38:39.
* 
* @param <T>
 */
public class RBTree<T extends CompareIntf<T>> implements Tree<T>
{
	
	/**
	 * ��־����.
	 */
	private static final Logger LOGGER = Logger.getLogger(RBTree.class);
	
	
	/**
	 * ���ڵ�.
	 */
	private RBTNode<T> root;
	
	/**
	 * 
	* @Title: parentOf 
	* @Description: ��ȡ�ڵ㸸�ڵ�.
	* @param @param node
	* @param @return �趨�ļ�. 
	* @return RBTNode<T> �������� .
	* @throws 
	* 		�쳣.
	 */
	private RBTNode<T> parentNodeOf(RBTNode<T> node) 
	{
		return null != node ? node.getParentNode() : null;
	}
	
	/**
	 * 
	* @Title: colorOf 
	* @Description: ��ȡ�ڵ���ɫ.
	* @param @param node
	* @param @return �趨�ļ�. 
	* @return boolean �������� .
	* @throws 
	* 		�쳣.
	 */
	private boolean colorOf(RBTNode<T> node) 
	{
		return null != node ? node.getColor() : RBTConstant.BLACK;
	}
	
	/**
	 * 
	* @Title: isRed 
	* @Description: �ڵ��Ǻ�ɫ��.
	* @param @param node
	* @param @return �趨�ļ�. 
	* @return boolean �������� .
	* @throws 
	* 		�쳣.
	 */
	private boolean isRed(RBTNode<T> node) 
	{
		return (null != node && RBTConstant.RED == node.getColor()) ? true : false;
	}
	
	/**
	 * 
	* @Title: isRed 
	* @Description: �ڵ��Ǻ�ɫ��.
	* @param @param node
	* @param @return �趨�ļ�. 
	* @return boolean �������� .
	* @throws 
	* 		�쳣.
	 */
	private boolean isBlack(RBTNode<T> node) 
	{
		return !isRed(node);
	}
	
	/**
	 * 
	* @Title: setRed 
	* @Description: ���ڵ�����Ϊ��ɫ.
	* @param @param node �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
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
	* @Description: ���ڵ�����Ϊ��ɫ.
	* @param @param node �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
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
	* @Description: ���ýڵ�ĸ��ڵ�.
	* @param @param node
	* @param @param parentNode �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
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
	* @Description: ���ýڵ���ɫ.
	* @param @param node
	* @param @param color �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
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
	* @Description: �Ժ�����Ľڵ�xNode��������ת,ǰ��������xNode���Һ��Ӵ���.
	* @param @param xNode �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	private void leftRotate(RBTNode<T> xNode) 
	{
		// 1 �ҵ�xNode���Һ���yNode.
		RBTNode<T> yNode = xNode.getRightChild();
		
		// 2 ����xNode���Һ���ΪyNode�����ӣ�yNode���ӵĸ��ڵ�ΪxNode.
		xNode.setRightChild(yNode.getLeftChild());
		if (null != yNode.getLeftChild()) 
		{
			yNode.getLeftChild().setParentNode(xNode);
		}
		
		// ��yNode�ڵ�ĸ��ڵ�����ΪxNode�ĸ��ڵ�.
		yNode.setParentNode(xNode.getParentNode());
		if (null == xNode.getParentNode()) 
		{
			// ���xNode�ĸ��ڵ�Ϊnull����yNode����Ϊ��.
			root = yNode;
		} 
		else 
		{
			// ���xNode���丸�ڵ������.
			if (xNode == xNode.getParentNode().getLeftChild()) 
			{
				// ��yNode����ΪxNode���ڵ������.
				xNode.getParentNode().setLeftChild(yNode);
			} 
			else 
			{
				// ��yNode����ΪxNode���ڵ���Һ���.
				xNode.getParentNode().setRightChild(yNode);
			}
		}
		
		// ��xNode��ΪyNode�����ӡ�.
		yNode.setLeftChild(xNode);
		
		// ��xNode�ĸ��ڵ�����ΪyNode.
		xNode.setParentNode(yNode);
	}
	
	/**
	 * 
	* @Title: rightRotate 
	* @Description: �Ժ�����Ľڵ�yNode��������ת.
	* @param @param yNode �趨�ļ�.
	* @return void ��������.
	* @throws 
	* 		�쳣.
	 */
	private void rightRotate(RBTNode<T> yNode) 
	{
		// 1 �ҵ�yNode������.
		RBTNode<T> xNode = yNode.getLeftChild();
		
		// 2 ����yNode������ΪxNode���Һ���,xNode�Һ��ӵĸ��ڵ�ΪyNode.
		yNode.setLeftChild(xNode.getRightChild());
		if (null != xNode.getRightChild()) 
		{
			xNode.getRightChild().setParentNode(yNode);
		}
		
		// 3 ����xNode�ĸ��ڵ�ΪyNode�ĸ��ڵ�.
		xNode.setParentNode(yNode.getParentNode());
		if (null == yNode.getParentNode()) 
		{
			// ���yNode�ĸ��ڵ�Ϊ�գ�����xNodeΪ���ڵ�.
			root = xNode;
		} 
		else 
		{
			// ���yNode���丸�ڵ���Һ���.
			if (yNode == yNode.getParentNode().getRightChild()) 
			{
				// ����xNodeΪyNode�ĸ��ڵ���Һ���.
				yNode.getParentNode().setRightChild(xNode);
			} 
			else 
			{
				// ����xNodeΪyNode�ĸ��ڵ������.
				yNode.getParentNode().setLeftChild(xNode);
			}
		}
		
		// ��yNode��ΪxNode���Һ���.
		xNode.setRightChild(yNode);
		
		// ��yNode�ĸ��ڵ���ΪxNode.
		yNode.setParentNode(xNode);
		
	}

	@Override
	public void insert(T data) 
	{
		LOGGER.info("Begin to execute the insert method.");
		
		LOGGER.info("End to execute the insert method.");
	}

	@Override
	public TreeNode<T> find(T data) 
	{
		return null;
	}

	@Override
	public boolean delete(T data) 
	{
		return false;
	}

	@Override
	public void order(String methodType) 
	{
		
	}

	@Override
	public TreeNode<T> minimum() 
	{
		return null;
	}

	@Override
	public TreeNode<T> maximum() 
	{
		return null;
	}
	
}
