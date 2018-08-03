package com.wchy.structure.tree.bean;

/**
 * 
* @ClassName HuffmanNode.java
* @Description 
* <p>
* 哈夫曼树：字符.
* </p>
* <p>
* 详细描述:对一串字符进行统计权重，进行哈夫曼树构造，后期的数据必须T extends Comparable.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author wchy.
* 
* @Date 2017年9月3日 下午8:50:23.
*
 */
public class HuffmanNode
{
	
	/**
	 * 字符.
	 */
	private char data;
	
	/**
	 * 字符出现的权重.
	 */
	private int weight;
	
	/**
	 * 左孩子.
	 */
	private HuffmanNode leftChild;
	
	/**
	 * 右孩子.
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
	* @Description: 获取字符数据.
	* @param @return 设定文件. 
	* @return char 返回类型 .
	* @throws 
	* 		异常.
	 */
	public char getData() 
	{
		return data;
	}

	/**
	 * 
	* @Title: setData 
	* @Description: 设置字符数据.
	* @param @param data 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setData(char data) 
	{
		this.data = data;
	}

	/**
	 * 
	* @Title: getWeight 
	* @Description: 获取权重.
	* @param @return 设定文件. 
	* @return int 返回类型 .
	* @throws 
	* 		异常.
	 */
	public int getWeight() 
	{
		return weight;
	}

	/**
	 * 
	* @Title: setWeight 
	* @Description: 设置权重.
	* @param @param weight 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setWeight(int weight) 
	{
		this.weight = weight;
	}

	/**
	 * 
	* @Title: getLeftChild 
	* @Description: 获取左孩子.
	* @param @return 设定文件. 
	* @return HuffmanNode 返回类型 .
	* @throws 
	* 		异常.
	 */
	public HuffmanNode getLeftChild() 
	{
		return leftChild;
	}

	/**
	 * 
	* @Title: setLeftChild 
	* @Description: 设置左孩子.
	* @param @param leftChild 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setLeftChild(HuffmanNode leftChild) 
	{
		this.leftChild = leftChild;
	}

	/**
	 * 
	* @Title: getRightChild 
	* @Description: 获取右孩子.
	* @param @return 设定文件. 
	* @return HuffmanNode 返回类型 .
	* @throws 
	* 		异常.
	 */
	public HuffmanNode getRightChild() 
	{
		return rightChild;
	}

	/**
	 * 
	* @Title: setRightChild 
	* @Description: 设置右孩子.
	* @param @param rightChild 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
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
