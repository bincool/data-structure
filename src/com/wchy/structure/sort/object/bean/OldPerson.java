package com.wchy.structure.sort.object.bean;

/**
 * 
* @ClassName OldPerson.java
* @Description 
* <p>
* ����.
* </p>
* <p>
* ��ϸ���������ˣ��̳���person���������ݽ�.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author wchy.
* 
* @Date 2017��8��26�� ����7:49:46.
*
 */
public class OldPerson extends Person 
{
	
	/**
	 * ���ݽ�.
	 */
	private String pension;
	
	public OldPerson() 
	{
	}
	
	public OldPerson(String name, String sex, int age, String pension) 
	{
		super(name, sex, age);
		this.pension = pension;
	}

	/**
	 * 
	* @Title: getPension 
	* @Description: ��ȡ���ݽ�.
	* @param @return �趨�ļ�. 
	* @return String �������� .
	* @throws 
	* 		�쳣.
	 */
	public String getPension() 
	{
		return pension;
	}

	/**
	 * 
	* @Title: setPension 
	* @Description: �������ݽ�.
	* @param @param pension �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setPension(String pension) 
	{
		this.pension = pension;
	}

	@Override
	public String toString() 
	{
		return "OldPerson [id=" + this.getId() + ", name=" + this.getName() + ", sex=" + this.getSex() + ", age=" + this.getAge() + ", pension=" + this.getPension() + "]";
	}

}
