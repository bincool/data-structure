package com.wchy.structure.tree.bean;

import com.wchy.structure.common.utils.CompareIntf;

/**
 * 
* @ClassName Score.java
* @Description 
* <p>
* 红黑树-测试bean.
* </p>
* <p>
* 详细描述.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author wchy.
* 
* @Date 2017年9月23日 下午7:02:12.
*
 */
public class Score implements CompareIntf<Score> 
{
	
	/**
	 * id.
	 */
	private int id;
	
	/**
	 * 姓名.
	 */
	private String name;
	
	/**
	 * 分数.
	 */
	private int score;
	
	/**
	 * 
	* <p>Title: </p>
	* <p>Description: </p>
	 */
	public Score() 
	{
	}
	
	/**
	 * 
	* <p>Title: </p>
	* <p>Description: </p>
	* @param id
	* @param name
	* @param score
	 */
	public Score(int id, String name, int score) 
	{
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	/**
	 * 
	* @Title: getId 
	* @Description: 获取id.
	* @param @return 设定文件. 
	* @return int 返回类型 .
	* @throws 
	* 		异常.
	 */
	public int getId() 
	{
		return id;
	}

	/**
	 * 
	* @Title: setId 
	* @Description: 设置id.
	* @param @param id 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setId(int id) 
	{
		this.id = id;
	}

	/**
	 * 
	* @Title: getName 
	* @Description: 获取姓名.
	* @param @return 设定文件. 
	* @return String 返回类型 .
	* @throws 
	* 		异常.
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * 
	* @Title: setName 
	* @Description: 设置姓名.
	* @param @param name 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * 
	* @Title: getScore 
	* @Description: 获取分数.
	* @param @return 设定文件. 
	* @return int 返回类型 .
	* @throws 
	* 		异常.
	 */
	public int getScore() 
	{
		return score;
	}

	/**
	 * 
	* @Title: setScore 
	* @Description: 设置分数.
	* @param @param score 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setScore(int score) 
	{
		this.score = score;
	}

	@Override
	public int compareTo(Score o) 
	{
		return this.id - o.getId();
	}

	@Override
	public String toString() 
	{
		return "Score [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	
}
