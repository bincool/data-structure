package com.wchy.structure.tree.huffman;

import org.apache.log4j.Logger;

import com.wchy.structure.queue.arr.priority.PriorityQueue;
import com.wchy.structure.tree.bean.HuffmanNode;

/**
 * 
* @ClassName HuffmanTree.java
* @Description 
* <p>
* 哈夫曼树-字符编码.
* </p>
* <p>
* 详细描述：用优先级队列实现，其中优先级队列的内部用数组实现.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author wchy.
* 
* @Date 2017年9月3日 下午11:28:35.
*
 */
public class HuffmanTree 
{
	
	/**
	 * 日志对象.
	 */
	private static final Logger LOGGER = Logger.getLogger(HuffmanTree.class);
	
	/**
	 * 字符串缓存,打印使用.
	 */
	private static final StringBuffer sb = new StringBuffer();
	
	/**
	 * 哈夫曼树根节点.
	 */
	private HuffmanNode root;
	
	/**
	 * 优先级队列.
	 */
	private PriorityQueue<HuffmanNode> queue;
	
	public HuffmanTree(PriorityQueue<HuffmanNode> queue) 
	{
		this.queue = queue;
	}
	
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
	 * 
	* @Title: createTree 
	* @Description: 创建哈夫曼树.
	* @param  设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void createTree() 
	{
		HuffmanNode minFirst = null;
		HuffmanNode mingSecond = null;
		while (!queue.isEmpty()) 
		{
			minFirst = queue.remove();
			if (queue.isEmpty()) 
			{
				break;
			} 
			mingSecond = queue.remove();
			HuffmanNode newNode = new HuffmanNode();
			newNode.setWeight(minFirst.getWeight() + mingSecond.getWeight());
			newNode.setLeftChild(minFirst);
			newNode.setRightChild(mingSecond);
			queue.insert(newNode);
		}
		root = minFirst;
	}
	
	/**
	 * 
	* @Title: order 
	* @Description: 遍历哈夫曼树.
	* @param @param methodType 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
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
	
	/**
	 * 
	* @Title: accessNode 
	* @Description: 访问节点.
	* @param @param rNode 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	private void accessNode(HuffmanNode rNode) 
	{
		if (isLeaf(rNode)) 
		{
			LOGGER.info(rNode.getData() + "[" + rNode.getWeight() + "]:" + sb.toString());
			sb.delete(sb.length() - 1, sb.length());
		}
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
	private void inOrder(HuffmanNode root) 
	{
		if (null != root) 
		{
			// 左子数遍历.
			if (!isLeaf(root)) 
			{
				sb.append("0");
			}
			inOrder(root.getLeftChild());
			
			// 叶子节点访问.
			accessNode(root);
			
			// 右子树遍历.
			if (!isLeaf(root)) 
			{
				if (isLeaf(root.getRightChild())) 
				{
					sb.append("1");
					LOGGER.info(root.getRightChild().getData() + "[" + root.getRightChild().getWeight() + "]:" + sb.toString());
					sb.delete(0, sb.length());
					return;
				}
				sb.append("1");
			}
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
	private void preOrder(HuffmanNode root) 
	{
		if (null != root) 
		{
			// 叶子节点访问.
			accessNode(root);
			
			// 左子数遍历.
			if (!isLeaf(root)) 
			{
				sb.append("0");
			}
			preOrder(root.getLeftChild());
			
			// 右子树遍历.
			if (!isLeaf(root)) 
			{
				if (isLeaf(root.getRightChild())) 
				{
					sb.append("1");
					LOGGER.info(root.getRightChild().getData() + "[" + root.getRightChild().getWeight() + "]:" + sb.toString());
					sb.delete(0, sb.length());
					return;
				}
				sb.append("1");
			} 
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
	private void postOrder(HuffmanNode root) 
	{
		if (null != root) 
		{
			// 左子数遍历.
			if (!isLeaf(root)) 
			{
				sb.append("0");
			}
			postOrder(root.getLeftChild());
			
			// 右子树遍历.
			if (!isLeaf(root)) 
			{
				if (isLeaf(root.getRightChild())) 
				{
					sb.append("1");
					LOGGER.info(root.getRightChild().getData() + "[" + root.getRightChild().getWeight() + "]:" + sb.toString());
					sb.delete(0, sb.length());
					return;
				}
				sb.append("1");
			} 
			postOrder(root.getRightChild());
			
			// 叶子节点访问.
			accessNode(root);
		}
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
	private boolean isLeaf(HuffmanNode rNode) 
	{
		return null == rNode.getLeftChild() && null == rNode.getRightChild();
	}
	
}
