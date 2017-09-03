package com.wchy.structure.tree.bean;

/**
 * 
* @ClassName HuffmanNode.java
* @Description 
* <p>
* �����������ַ�.
* </p>
* <p>
* ��ϸ����:��һ���ַ�����ͳ��Ȩ�أ����й����������죬���ڵ����ݱ���T extends Comparable.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author wchy.
* 
* @Date 2017��9��3�� ����8:50:23.
*
 */
public class HuffmanNode
{
	
	/**
	 * �ַ�.
	 */
	private char data;
	
	/**
	 * �ַ����ֵ�Ȩ��.
	 */
	private int weight;
	
	/**
	 * ����.
	 */
	private HuffmanNode leftChild;
	
	/**
	 * �Һ���.
	 */
	private HuffmanNode rightChild;
	
	public HuffmanNode() 
	{
	}
	
	public HuffmanNode(char data, int weight) 
	{
		this.data = data;
		this.weight = weight;
	}
	
	/**
	 * 
	* @Title: getData 
	* @Description: ��ȡ�ַ�����.
	* @param @return �趨�ļ�. 
	* @return char �������� .
	* @throws 
	* 		�쳣.
	 */
	public char getData() 
	{
		return data;
	}

	/**
	 * 
	* @Title: setData 
	* @Description: �����ַ�����.
	* @param @param data �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setData(char data) 
	{
		this.data = data;
	}

	/**
	 * 
	* @Title: getWeight 
	* @Description: ��ȡȨ��.
	* @param @return �趨�ļ�. 
	* @return int �������� .
	* @throws 
	* 		�쳣.
	 */
	public int getWeight() 
	{
		return weight;
	}

	/**
	 * 
	* @Title: setWeight 
	* @Description: ����Ȩ��.
	* @param @param weight �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setWeight(int weight) 
	{
		this.weight = weight;
	}

	/**
	 * 
	* @Title: getLeftChild 
	* @Description: ��ȡ����.
	* @param @return �趨�ļ�. 
	* @return HuffmanNode �������� .
	* @throws 
	* 		�쳣.
	 */
	public HuffmanNode getLeftChild() 
	{
		return leftChild;
	}

	/**
	 * 
	* @Title: setLeftChild 
	* @Description: ��������.
	* @param @param leftChild �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setLeftChild(HuffmanNode leftChild) 
	{
		this.leftChild = leftChild;
	}

	/**
	 * 
	* @Title: getRightChild 
	* @Description: ��ȡ�Һ���.
	* @param @return �趨�ļ�. 
	* @return HuffmanNode �������� .
	* @throws 
	* 		�쳣.
	 */
	public HuffmanNode getRightChild() 
	{
		return rightChild;
	}

	/**
	 * 
	* @Title: setRightChild 
	* @Description: �����Һ���.
	* @param @param rightChild �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setRightChild(HuffmanNode rightChild) 
	{
		this.rightChild = rightChild;
	}

	@Override
	public String toString() 
	{
		return "HuffmanNode [data=" + data + "]";
	}
	
}
