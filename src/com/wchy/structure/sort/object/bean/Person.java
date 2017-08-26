package com.wchy.structure.sort.object.bean;

import com.wchy.structure.common.TimeSn;

/**
 * 
* @ClassName Person.java
* @Description 
* <p>
* ��.
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
* @Date 2017��8��26�� ����7:54:46.
*
 */
public class Person 
{
	
	/**
	 * ID.
	 */
	private long id;
	
	/**
	 * ����.
	 */
	private String name;
	
	/**
	 * �Ա�.
	 */
	private String sex;
	
	/**
	 * ����.
	 */
	private int age;
	
	public Person() 
	{
	}
	
	public Person(String name, String sex, int age) 
	{
		/**
		 * �õ�����������.
		 */
		this.id = TimeSn.getInstance().getSn();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	/**
	 * 
	* @Title: getId 
	* @Description: ��ȡID.
	* @param @return �趨�ļ�. 
	* @return long �������� .
	* @throws 
	* 		�쳣.
	 */
	public long getId() 
	{
		return id;
	}

	/**
	 * 
	* @Title: setId 
	* @Description: ����ID.
	* @param @param id �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setId(long id) 
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
	* @Description: ��������
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
	* @Title: getSex 
	* @Description: ��ȡ�Ա�.
	* @param @return �趨�ļ�. 
	* @return String �������� .
	* @throws 
	* 		�쳣.
	 */
	public String getSex() 
	{
		return sex;
	}

	/**
	 * 
	* @Title: setSex 
	* @Description: �����Ա�.
	* @param @param sex �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setSex(String sex) 
	{
		this.sex = sex;
	}

	/**
	 * 
	* @Title: getAge 
	* @Description: ��ȡ����.
	* @param @return �趨�ļ�. 
	* @return int �������� .
	* @throws 
	* 		�쳣.
	 */
	public int getAge() 
	{
		return age;
	}

	/**
	 * 
	* @Title: setAge 
	* @Description: ��������.
	* @param @param age �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setAge(int age) 
	{
		this.age = age;
	}

	@Override
	public String toString() 
	{
		return "Person [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
}
