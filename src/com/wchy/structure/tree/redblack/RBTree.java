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
	private RBTNode<T> parentOf(RBTNode<T> node) 
	{
		return null != node ? node.getParent() : null;
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
	* @Title: setParent 
	* @Description: 设置节点的父节点.
	* @param @param node
	* @param @param parent 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
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
