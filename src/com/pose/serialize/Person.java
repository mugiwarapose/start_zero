package com.pose.serialize;

import java.io.Serializable;

/**
 * <p>ClassName:Person</p>
 * <p>Description:测试对象序列化和反序列化</p>
 * @author zhangdd
 * @createTime2016年10月27日
 *
 */
public class Person implements Serializable {

	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 1301160652120126800L;
	
	private String name;
	
	private String sex;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
