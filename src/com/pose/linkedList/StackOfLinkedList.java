package com.pose.linkedList;

import java.util.Iterator;

/**
 * 下压堆栈，链表实现
 * @author zhangdd
 * @createTime2016年11月7日
 *
 */
public class StackOfLinkedList<T> implements Iterable<T>{
	
	private int size;
	
	private Node first;
	
	public int size(){
		return size;
	}
	
	public void push(T t){
		Node old = first;
		first = new Node();
		first.t = t;//赋值
		first.next = old;
		size++;
	}
	
	public Object pop() throws Exception{
		if(first==null){
			throw new Exception("栈空");
		}
		Object object = first.t;
		Node old = first;
		first = first.next;
		old = null;//防止对象游离
		size--;
		return object;
	}
	
	
	
	/**
	 * 定义节点的内部类
	 * @author zhangdd
	 * @createTime2016年11月7日
	 *
	 */
	private class Node<T>{
		
		T t;//对象信息
		Node next;//指向下一个节点
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) throws Exception {
		StackOfLinkedList<Integer> stack = new StackOfLinkedList<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		//System.out.println(stack.size);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop());
		
	}
}
