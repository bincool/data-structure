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
	private RBTNode<T> parentOf(RBTNode<T> node) 
	{
		return null != node ? node.getParent() : null;
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
	* @Title: setParent 
	* @Description: ���ýڵ�ĸ��ڵ�.
	* @param @param node
	* @param @param parent �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	private void setParent(RBTNode<T> node, RBTNode<T> parent) 
	{
		if (null != node) 
		{
			node.setParent(parent);
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
