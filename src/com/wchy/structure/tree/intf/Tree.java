package com.wchy.structure.tree.intf;

import com.wchy.structure.tree.bean.TreeNode;

/**
 * 
* @ClassName Tree.java
* @Description 
* <p>
* �������ӿ���.
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
* @Date 2017��8��27�� ����7:53:46.
* 
* @param <T>
 */
public interface Tree<T> 
{
	
	/**
	 * 
	* @Title: insert 
	* @Description: �����ڵ�����.
	* @param @param data �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	void insert(T data);
	
	/**
	 * 
	* @Title: find 
	* @Description: ���ؼ��ֲ��ҽڵ�.
	* @param @param key
	* @param @return �趨�ļ�. 
	* @return TreeNode<T> �������� .
	* @throws 
	* 		�쳣.
	 */
	TreeNode<T> find(T data);
	
	/**
	 * 
	* @Title: delete 
	* @Description: ���ؼ���ɾ���ڵ�.
	* @param @param key �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	void delete(T data);
	
	/**
	 * 
	* @Title: order 
	* @Description: ����������.
	* @param @param methodType �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	void order(String methodType);
	
}