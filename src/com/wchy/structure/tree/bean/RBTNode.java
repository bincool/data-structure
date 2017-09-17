package com.wchy.structure.tree.bean;

import com.wchy.structure.common.utils.CompareIntf;
import com.wchy.structure.tree.constants.RBTConstant;

/**
 * 
* @ClassName RBTNode.java
* @Description 
* <p>
* TODO 一句话对这个类进行描述.
* </p>
* <p>
* TODO 详细描述.
* </p>
* <p>
* TODO 示例代码.
* </p>
*
* @Author wchy.
* 
* @Date 2017年9月17日 下午2:45:47.
* 
* @param <T>
 */
public class RBTNode<T extends CompareIntf<T>> 
{
	
	/**
	 * 节点数据.
	 */
    private T data;
    
    /**
     * 左孩子.
     */
    private RBTNode<T> left;
    
    /**
     * 右孩子.
     */
    private RBTNode<T> right;
    
    /**
     * 父节点.
     */
    private RBTNode<T> parent;
    
    /**
     * 节点颜色,默认为黑色.
     */
    private boolean color = RBTConstant.BLACK;

    /**
     * 
    * @Title: getData 
    * @Description: 获取节点数据.
    * @param @return 设定文件. 
    * @return T 返回类型 .
    * @throws 
    * 		异常.
     */
	public T getData() 
	{
		return data;
	}

	/**
	 * 
	* @Title: setData 
	* @Description: 设置节点数据.
	* @param @param data 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setData(T data) 
	{
		this.data = data;
	}

	/**
	 * 
	* @Title: getLeft 
	* @Description: 获取左孩子.
	* @param @return 设定文件. 
	* @return RBTNode<T> 返回类型 .
	* @throws 
	* 		异常.
	 */
	public RBTNode<T> getLeft() 
	{
		return left;
	}

	/**
	 * 
	* @Title: setLeft 
	* @Description: 设置左孩子.
	* @param @param left 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setLeft(RBTNode<T> left) 
	{
		this.left = left;
	}

	/**
	 * 
	* @Title: getRight 
	* @Description: 获取右孩子.
	* @param @return 设定文件. 
	* @return RBTNode<T> 返回类型 .
	* @throws 
	* 		异常.
	 */
	public RBTNode<T> getRight() 
	{
		return right;
	}

	/**
	 * 
	* @Title: setRight 
	* @Description: 设置右孩子.
	* @param @param right 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setRight(RBTNode<T> right) 
	{
		this.right = right;
	}

	/**
	 * 
	* @Title: getParent 
	* @Description: 获取父节点.
	* @param @return 设定文件. 
	* @return RBTNode<T> 返回类型 .
	* @throws 
	* 		异常.
	 */
	public RBTNode<T> getParent() 
	{
		return parent;
	}

	/**
	 * 
	* @Title: setParent 
	* @Description: 设置父节点.
	* @param @param parent 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setParent(RBTNode<T> parent) 
	{
		this.parent = parent;
	}
	
	/**
	 * 
	* @Title: setColor 
	* @Description: 获取节点颜色.
	* @param @return 设定文件. 
	* @return boolean 返回类型 .
	* @throws 
	* 		异常.
	 */
	public boolean getColor() 
	{
		return color;
	}

	/**
	 * 
	* @Title: getColor 
	* @Description: 设置节点颜色.
	* @param @param color 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
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
