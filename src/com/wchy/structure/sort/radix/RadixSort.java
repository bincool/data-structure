package com.wchy.structure.sort.radix;

import com.wchy.structure.queue.link.Queue;
import com.wchy.structure.sort.base.NumberSort;

/**
 * 
* @ClassName RadixSort.java
* @Description 
* <p>
* ��������.
* </p>
* <p>
* ��ϸ��������˫����ʽ���д��Ͱ���ݣ���������ȿ����������1���ռ�.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author wchy.
* 
* @Date 2017��8��27�� ����2:28:00.
*
 */
public class RadixSort extends NumberSort<Integer> 
{
	
	/**
	 * 10��Ͱ���ֱ����λ��Ϊ0-9������.
	 */
	private static Queue[] buckets = new Queue[] 
			{
					new Queue(),
					new Queue(),
					new Queue(),
					new Queue(),
					new Queue(),
					new Queue(),
					new Queue(),
					new Queue(),
					new Queue(),
					new Queue()
			};
	
	/**
	 * ����������������λ��.
	 */
	private int d;
	
	/**
	 * 
	* <p>Title: </p>
	* <p>Description: </p>
	* @param d
	* 		�������λ��.
	 */
	public RadixSort(int d) 
	{
		super(10);
		this.d = d;
	}

	/**
	 * ������.
	* <p>Title: </p>
	* <p>Description: </p>
	* @param initCapacity
	* 		����.
	* @param d
	* 		�������λ��.
	 */
	public RadixSort(int initCapacity, int d) 
	{
		super(initCapacity);
		this.d = d;
	}

	@Override
	public void sort() 
	{
		// ����λ����Ӧ������1,10,100...
		int n = 1;
		Number[] arr = getArr();
		while (d-- > 0) 
		{
			// ������arr���ÿ�����ַ��õ���Ӧ��Ͱ��.
			for (Number number : arr) 
			{
				int num = number.intValue();
				int digit = (num / n) % 10;
				buckets[digit].push(num);
			}
			
			// ��Ͱ�е����ݸ��ƻ�����arr.
			for (int i = 0, j = 0; j < 10; j++) 
			{
				while (!buckets[j].isEmpty()) 
				{
					arr[i++] = buckets[j].pop();
				}
			}
			
			// ��λ.
			n *= 10;
		}
	}

}
