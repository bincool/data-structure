package com.wchy.structure.tree.huffman;

import org.apache.log4j.Logger;

import com.wchy.structure.queue.arr.priority.PriorityQueue;
import com.wchy.structure.tree.bean.HuffmanNode;

/**
 * 
* @ClassName HuffmanTree.java
* @Description 
* <p>
* ��������-�ַ�����.
* </p>
* <p>
* ��ϸ�����������ȼ�����ʵ�֣��������ȼ����е��ڲ�������ʵ��.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author wchy.
* 
* @Date 2017��9��3�� ����11:28:35.
*
 */
public class HuffmanTree 
{
	
	/**
	 * ��־����.
	 */
	private static final Logger LOGGER = Logger.getLogger(HuffmanTree.class);
	
	/**
	 * �ַ�������,��ӡʹ��.
	 */
	private static final StringBuffer sb = new StringBuffer();
	
	/**
	 * �����������ڵ�.
	 */
	private HuffmanNode root;
	
	/**
	 * ���ȼ�����.
	 */
	private PriorityQueue<HuffmanNode> queue;
	
	public HuffmanTree(PriorityQueue<HuffmanNode> queue) 
	{
		this.queue = queue;
	}
	
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
	 * 
	* @Title: createTree 
	* @Description: ������������.
	* @param  �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
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
	* @Description: ������������.
	* @param @param methodType �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
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
	* @Description: ���ʽڵ�.
	* @param @param rNode �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
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
	* @Description: �������.
	* @param  �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	private void inOrder(HuffmanNode root) 
	{
		if (null != root) 
		{
			// ����������.
			if (!isLeaf(root)) 
			{
				sb.append("0");
			}
			inOrder(root.getLeftChild());
			
			// Ҷ�ӽڵ����.
			accessNode(root);
			
			// ����������.
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
	* @Description: ǰ�����.
	* @param  �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	private void preOrder(HuffmanNode root) 
	{
		if (null != root) 
		{
			// Ҷ�ӽڵ����.
			accessNode(root);
			
			// ����������.
			if (!isLeaf(root)) 
			{
				sb.append("0");
			}
			preOrder(root.getLeftChild());
			
			// ����������.
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
	* @Description: �������.
	* @param  �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	private void postOrder(HuffmanNode root) 
	{
		if (null != root) 
		{
			// ����������.
			if (!isLeaf(root)) 
			{
				sb.append("0");
			}
			postOrder(root.getLeftChild());
			
			// ����������.
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
			
			// Ҷ�ӽڵ����.
			accessNode(root);
		}
	}
	
	/**
	 * 
	* @Title: isLeaf 
	* @Description: ���ڵ��Ƿ���Ҷ�ڵ�.
	* @param @param rNode
	* @param @return �趨�ļ�. 
	* @return boolean �������� .
	* @throws 
	* 		�쳣.
	 */
	private boolean isLeaf(HuffmanNode rNode) 
	{
		return null == rNode.getLeftChild() && null == rNode.getRightChild();
	}
	
}
