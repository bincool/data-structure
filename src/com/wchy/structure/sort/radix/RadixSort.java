package com.wchy.structure.sort.radix;

import com.wchy.structure.queue.link.Queue;
import com.wchy.structure.sort.base.NumberSort;

/**
 * 
* @ClassName RadixSort.java
* @Description 
* <p>
* 基数排序.
* </p>
* <p>
* 详细描述：用双端链式队列存放桶数据，基数排序比快速排序多了1倍空间.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author wchy.
* 
* @Date 2017年8月27日 下午2:28:00.
*
 */
public class RadixSort extends NumberSort<Integer> 
{
	
	/**
	 * 10个桶，分别放置位上为0-9的数据.
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
	 * 基数排序的数的最大位数.
	 */
	private int d;
	
	/**
	 * 
	* <p>Title: </p>
	* <p>Description: </p>
	* @param d
	* 		最大数的位数.
	 */
	public RadixSort(int d) 
	{
		super(10);
		this.d = d;
	}

	/**
	 * 构造子.
	* <p>Title: </p>
	* <p>Description: </p>
	* @param initCapacity
	* 		容量.
	* @param d
	* 		最大数的位数.
	 */
	public RadixSort(int initCapacity, int d) 
	{
		super(initCapacity);
		this.d = d;
	}

	@Override
	public void sort() 
	{
		// 代表位数对应的数：1,10,100...
		int n = 1;
		Number[] arr = getArr();
		while (d-- > 0) 
		{
			// 将数组arr里的每个数字放置到相应的桶里.
			for (Number number : arr) 
			{
				int num = number.intValue();
				int digit = (num / n) % 10;
				buckets[digit].push(num);
			}
			
			// 将桶中的数据复制回数组arr.
			for (int i = 0, j = 0; j < 10; j++) 
			{
				while (!buckets[j].isEmpty()) 
				{
					arr[i++] = buckets[j].pop();
				}
			}
			
			// 移位.
			n *= 10;
		}
	}

}
