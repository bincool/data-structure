package com.wchy.structure.sort.select;

import org.junit.Before;
import com.wchy.structure.sort.base.SortTest;

/**
 * 
* @ClassName SelectSortTest.java
* @Description 
* <p>
* ���֣�ѡ�����������.
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
* @Date 2017��8��26�� ����7:47:21.
*
 */
public class SelectSortTest extends SortTest<Float>
{

	@Before
	public void setUp() throws Exception 
	{
		sortApp = new SelectSort<Float>();
		for (int i = 0; i < defalutSize/2; i++) 
		{
			sortApp.put((float)(Math.random()*99));
		}
	}

}
