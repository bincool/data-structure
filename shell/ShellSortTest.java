package com.wchy.structure.sort.shell;

import org.junit.Before;
import com.wchy.structure.sort.base.SortTest;

/**
 * 
* @ClassName ShellSortTest.java
* @Description 
* <p>
* ���֣�ϣ�����������.
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
* @Date 2017��8��26�� ����7:48:09.
*
 */
public class ShellSortTest extends SortTest<Integer>
{
	
	@Before
	public void setUp() throws Exception 
	{
		defalutSize = 11;
		sortApp = new ShellSort<Integer>(defalutSize);
		for(int i = 0; i < defalutSize; i++) 
		{
			sortApp.put((int)(Math.random()*99));
		}
	}

}
