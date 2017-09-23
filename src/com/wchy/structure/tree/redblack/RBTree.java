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
	
	/**
	 * 
	* @Title: accessNode 
	* @Description: ���ʽڵ�.
	* @param @param rNode �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	private void accessNode(RBTNode<T> rNode) 
	{
		LOGGER.info(rNode.toString());
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
	* @Description: ǰ�����.
	* @param  �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
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
	* @Description: �������.
	* @param  �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
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
	* @Description: ������treeΪ���ڵ��������С�ڵ�.
	* @param @param tree
	* @param @return �趨�ļ�. 
	* @return RBTNode<T> �������� .
	* @throws 
	* 		�쳣.
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
	* @Description: ������treeΪ���ڵ���������ڵ�.
	* @param @param tree
	* @param @return �趨�ļ�. 
	* @return RBTNode<T> �������� .
	* @throws 
	* 		�쳣.
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
	* @Description: ��ȡxNode�ڵ�ĺ�̽ڵ㣬��xNode�����С�ڵ�.
	* @param @param xNode
	* @param @return �趨�ļ�. 
	* @return RBTree<T> �������� .
	* @throws 
	* 		�쳣.
	 */
	private RBTNode<T> getSuccessor(RBTNode<T> xNode) 
	{
		// ���xNode�����Һ��ӣ���xNode�ĺ�̽ڵ�Ϊ�����Һ���Ϊ������������С�ڵ�.
		if (null != xNode.getRightChild()) 
		{
			return minimum(xNode.getRightChild());
		}
		
		// ���xNodeû���Һ��ӣ���xNode���������.
		// xNode��һ�����ӣ���xNode�ĺ�̽ڵ�Ϊ���ĸ��ڵ�.
		// xNode��һ���Һ��ڣ������xNode����͵ĸ��ڵ㣬���������͸��ڵ�Ҫ�������ӣ��ҵ������͵ĸ��ڵ����xNode�ĺ�̽ڵ�.
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
	* @Description: ��xNode��ǰ���ڵ㣬��xNodeС�����ڵ�.
	* @param @param xNode
	* @param @return �趨�ļ�. 
	* @return RBTNode<T> �������� .
	* @throws 
	* 		�쳣.
	 */
	private RBTNode<T> getPredecessor(RBTNode<T> xNode) 
	{
		// ���xNode�������ӣ���xNode��ǰ���ڵ�Ϊ��������Ϊ�������������ڵ�.
		if (null != xNode.getLeftChild()) 
		{
			return maximum(xNode);
		}
		
		// ���xNodeû�����ӣ���xNode�����ֿ���.
		// xNode��һ���Һ��ӣ���xNode��ǰ���ڵ�Ϊ���ĸ��ڵ�.
		// xNode��һ�����ӣ������xNode����͵ĸ��ڵ㣬���Ҹø��ڵ��Ҫ�����Һ��ӣ��ҵ������͸��ڵ����xNodeǰ���ڵ�.
		RBTNode<T> yNode = xNode.getParentNode();
		while ((null != yNode) && (yNode.getLeftChild() == xNode)) 
		{
			xNode = yNode;
			yNode = yNode.getParentNode();
		}
		
		return yNode;
	}
	
	/**
	 * 
	* @Title: insertFix 
	* @Description: �������������������������������ڵ�֮�����ƽ�⣬�������¹����һ�ú����.
	* @param @param node �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	private void insertFix(RBTNode<T> node) 
	{
		RBTNode<T> pNode = parentNodeOf(node);
		RBTNode<T> gNode = null;
		
		// �����ڵ���ڣ��Ҹ��ڵ����ɫ�Ǻ�ɫ.
		while (null != pNode && isRed(pNode)) 
		{
			gNode = parentNodeOf(pNode);
			
			// ���ݸ��ڵ��λ�ý��з��������.
			if (pNode == gNode.getLeftChild()) 
			{
				// �����ڵ����游�ڵ������.
				RBTNode<T> uNode = gNode.getRightChild();
				
				// ��������ڵ���շ��������.
				if (null != uNode && isRed(uNode)) 
				{
					// 1 ����ڵ�ʱ��ɫ.
					setBlack(uNode);
					setBlack(pNode);
					setRed(gNode);
					node = gNode;
				} 
				else 
				{
					// 2 ����ڵ�ʱ��ɫ���ҵ�ǰ�ڵ�ʱ�Һ���.
					if (pNode.getRightChild() == node) 
					{
						leftRotate(pNode);
						RBTNode<T> tmp = pNode;
						pNode = node;
						node = tmp;
					}
					
					// 3 ����ڵ�ʱ��ɫ���ҵ�ǰ�ڵ�������.
					setBlack(pNode);
					setRed(gNode);
					rightRotate(gNode);
				}
			} 
			else 
			{
				// ���ڵ����游�ڵ���Һ���.
				RBTNode<T> uNode = gNode.getLeftChild();
				
				// ��������ڵ���շ��������.
				if (null != uNode && isRed(uNode)) 
				{
					// 1 ����ڵ�ʱ��ɫ.
					setBlack(uNode);
					setBlack(pNode);
					setRed(gNode);
					node = gNode;
				} 
				else 
				{
					// 2 ����ڵ�ʱ��ɫ���ҵ�ǰ�ڵ�������.
					if (pNode.getLeftChild() == node) 
					{
						rightRotate(pNode);
						RBTNode<T> tmp = pNode;
						pNode = node;
						node = tmp;
					}
					
					// 3 ����ڵ�ʱ��ɫ���ҵ�ǰ�ڵ����Һ���.
					setBlack(pNode);
					setRed(gNode);
					leftRotate(gNode);
				}
			}
			
			pNode = parentNodeOf(node);
		} 
		
		// �����ڵ�����Ϊ��ɫ.
		setBlack(root);
	}
	
	/**
	 * 
	* @Title: removeFix 
	* @Description: �����ɾ��������������������ɾ���ڵ�֮�󣬽������¹����һ�ú����.
	* @param @param node �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	private void removeFix(RBTNode<T> node, RBTNode<T> paretNode) 
	{
		
	}

	@Override
	public void insert(T data) 
	{
		RBTNode<T> node = new RBTNode<T>();
		node.setData(data);
		
		int cmp;
		RBTNode<T> yNode = null;
		RBTNode<T> xNode = root;
		
		// 1 �����������һ�Ŷ�������������ڵ���ӵ���������.
		while (null != xNode) 
		{
			yNode = xNode;
			cmp = data.compareTo(xNode.getData());
			if (cmp < 0) 
			{
				xNode = xNode.getLeftChild();
			} 
			else 
			{
				xNode = xNode.getRightChild();
			}
		}
		
		node.setParentNode(yNode);
		if (null != yNode) 
		{
			cmp = data.compareTo(yNode.getData());
			if (cmp < 0) 
			{
				yNode.setLeftChild(node);
			} 
			else 
			{
				yNode.setRightChild(node);
			}
		} 
		else 
		{
			root = node;
		}
		
		
		// 2 ���ýڵ����ɫΪ��ɫ.
		node.setColor(RBTConstant.RED);
		
		// 3 ������������Ϊһ�ź����.
		insertFix(node);
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
		RBTNode<T> childNode = null;
		RBTNode<T> parentNode = null;
		boolean color = false;
		
		// 1 ��ѯ��ɾ������.
		RBTNode<T> node = find(data);
		
		// 2 ��ѯ��ɾ�������Ƿ����.
		if (null == node) 
		{
			return false;
		}
		
		// 3 ���ݴ�ɾ�ڵ�ĺ���������д���.
		if (null != node.getLeftChild() && null != node.getRightChild()) 
		{
			// ����ɾ���Ľڵ����������ӽڵ�ʱ.
			
		} 
		else 
		{
			// ����ɾ���Ľڵ���Ҷ�ڵ���亢�ӽڵ�ֻ��һ��ʱ��ֱ��ɾ���������亢�ӽڵ�͸��ڵ㽨����ϵ�����������ɫ����ƽ��.
			parentNode = node.getParentNode();
			color = node.getColor();
			
			// �����亢��.
			if (null != node.getLeftChild()) 
			{
				childNode = node.getLeftChild();
			} 
			else 
			{
				childNode = node.getRightChild();
			}
			
			// ���ӻ��Һ��Ӳ�Ϊ��ʱ�������ĸ��ڵ�����Ϊ���ӵĸ��ڵ�.
			if (null != childNode) 
			{
				childNode.setParentNode(parentNode);
			}
			
			// node���Ǹ��ڵ㣬���丸�ڵ�ָ��������ϵָ���亢�ӽڵ�.
			if (null != parentNode) 
			{
				// node�����ӣ���node�ĸ��ڵ����������Ϊnode�ĺ���.
				if (parentNode.getLeftChild() == node) 
				{
					parentNode.setLeftChild(childNode);
				} 
				else 
				{
					parentNode.setRightChild(childNode);
				}
			} 
			else 
			{
				root = childNode;
			}
			
			// ����ɾ����node�ڵ��Ǻ�ɫ�ڵ㣬����Ҫ����ƽ��.
			if (color == RBTConstant.BLACK) 
			{
				removeFix(node, parentNode);
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
