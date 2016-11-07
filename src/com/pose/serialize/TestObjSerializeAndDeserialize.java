package com.pose.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * * <p>ClassName: TestObjSerializeAndDeserialize<p>
  * <p>Description: 测试对象的序列化和反序列<p>
 * @author zhangdd
 * @createTime2016年10月27日
 *
 */
public class TestObjSerializeAndDeserialize {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializePerson();
		Person p1 = DeserializePerson();
		Person p2 = DeserializePerson();
		System.out.println(p1.getName()==p2.getName());
		
		read();
		
	}
	/**
	 * Description: 序列化Perons对象
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void SerializePerson() throws FileNotFoundException, IOException{
			Person person = new Person();
			person.setName("Mugiwara");
			person.setSex("男");
			person.setAge(22);
			
			ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("E:/person,txt")));
			oo.writeObject(person);
			System.out.println("Person 序列化对象成功");
			oo.close();
	}
	
	/**
	 * Description:反序列化Person对象
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private static Person DeserializePerson() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("E:/person,txt"));
		Person person = (Person) oi.readObject();
		System.out.println("Person对象反序列化成功！");
		return person;
		
	}
	
	
	public static void read() throws IOException{
		FileInputStream in = new FileInputStream(new File("E:/person,txt"));
		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = in.read(buf))!=-1) {
			in.read(buf, 0, len);
			System.out.println(buf.hashCode());
		}
	}
}
