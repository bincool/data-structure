package com.wchy.structure.tree.bean;

import com.wchy.structure.common.utils.CompareIntf;

/**
 * 
* @ClassName Score.java
* @Description 
* <p>
* �����-����bean.
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
* @Date 2017��9��23�� ����7:02:12.
*
 */
public class Score implements CompareIntf<Score> 
{
	
	/**
	 * id.
	 */
	private int id;
	
	/**
	 * ����.
	 */
	private String name;
	
	/**
	 * ����.
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
	* @Description: ��ȡid.
	* @param @return �趨�ļ�. 
	* @return int �������� .
	* @throws 
	* 		�쳣.
	 */
	public int getId() 
	{
		return id;
	}

	/**
	 * 
	* @Title: setId 
	* @Description: ����id.
	* @param @param id �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setId(int id) 
	{
		this.id = id;
	}

	/**
	 * 
	* @Title: getName 
	* @Description: ��ȡ����.
	* @param @return �趨�ļ�. 
	* @return String �������� .
	* @throws 
	* 		�쳣.
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * 
	* @Title: setName 
	* @Description: ��������.
	* @param @param name �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * 
	* @Title: getScore 
	* @Description: ��ȡ����.
	* @param @return �趨�ļ�. 
	* @return int �������� .
	* @throws 
	* 		�쳣.
	 */
	public int getScore() 
	{
		return score;
	}

	/**
	 * 
	* @Title: setScore 
	* @Description: ���÷���.
	* @param @param score �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
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
