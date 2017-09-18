package com.wchy.structure.tree.bean;

import com.wchy.structure.common.utils.CompareIntf;
import com.wchy.structure.tree.constants.RBTConstant;

/**
 * 
* @ClassName RBTNode.java
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
* @Date 2017��9��17�� ����2:45:47.
* 
* @param <T>
 */
public class RBTNode<T extends CompareIntf<T>> 
{
	
	/**
	 * �ڵ�����.
	 */
    private T data;
    
    /**
     * ����.
     */
    private RBTNode<T> leftChild;
    
    /**
     * �Һ���.
     */
    private RBTNode<T> rightChild;
    
    /**
     * ���ڵ�.
     */
    private RBTNode<T> parentNode;
    
    /**
     * �ڵ���ɫ,Ĭ��Ϊ��ɫ.
     */
    private boolean color = RBTConstant.BLACK;

    /**
     * 
    * @Title: getData 
    * @Description: ��ȡ�ڵ�����.
    * @param @return �趨�ļ�. 
    * @return T �������� .
    * @throws 
    * 		�쳣.
     */
	public T getData() 
	{
		return data;
	}

	/**
	 * 
	* @Title: setData 
	* @Description: ���ýڵ�����.
	* @param @param data �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setData(T data) 
	{
		this.data = data;
	}

	/**
	 * 
	* @Title: getLeft 
	* @Description: ��ȡ����.
	* @param @return �趨�ļ�. 
	* @return RBTNode<T> �������� .
	* @throws 
	* 		�쳣.
	 */
	public RBTNode<T> getLeftChild() 
	{
		return leftChild;
	}

	/**
	 * 
	* @Title: setLeft 
	* @Description: ��������.
	* @param @param left �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setLeftChild(RBTNode<T> leftChild) 
	{
		this.leftChild = leftChild;
	}

	/**
	 * 
	* @Title: getRight 
	* @Description: ��ȡ�Һ���.
	* @param @return �趨�ļ�. 
	* @return RBTNode<T> �������� .
	* @throws 
	* 		�쳣.
	 */
	public RBTNode<T> getRightChild() 
	{
		return rightChild;
	}

	/**
	 * 
	* @Title: setRight 
	* @Description: �����Һ���.
	* @param @param right �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setRightChild(RBTNode<T> rightChild) 
	{
		this.rightChild = rightChild;
	}

	/**
	 * 
	* @Title: getParent 
	* @Description: ��ȡ���ڵ�.
	* @param @return �趨�ļ�. 
	* @return RBTNode<T> �������� .
	* @throws 
	* 		�쳣.
	 */
	public RBTNode<T> getParentNode() 
	{
		return parentNode;
	}

	/**
	 * 
	* @Title: setParent 
	* @Description: ���ø��ڵ�.
	* @param @param parent �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setParentNode(RBTNode<T> parentNode) 
	{
		this.parentNode = parentNode;
	}
	
	/**
	 * 
	* @Title: setColor 
	* @Description: ��ȡ�ڵ���ɫ.
	* @param @return �趨�ļ�. 
	* @return boolean �������� .
	* @throws 
	* 		�쳣.
	 */
	public boolean getColor() 
	{
		return color;
	}

	/**
	 * 
	* @Title: getColor 
	* @Description: ���ýڵ���ɫ.
	* @param @param color �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setColor(boolean color) 
	{
		this.color = color;
	}

	@Override
	public String toString() {
		if (RBTConstant.BLACK == color) 
		{
			return "RBTNode [data=" + data + "]-->Black";
		} 
		else 
		{
			return "RBTNode [data=" + data + "]-->Red";
		}
	}
    
}
