package com.pose.linkedList;

import java.util.Iterator;

public class QueueInLinkedList<T> implements Iterable<T> {
	
	private Node first;
	
	private Node last;
	
	private int size ;
	public boolean isEmpty(){
		return first ==null;
	}
	
	public void enQueue(T t){
		Node old = last;
		last = new Node();
		last.t = t;
		last.next =null;
		if(isEmpty()){
			first = last;
		}else{
			old.next = last;
		}
		size++;
	}
	
	public Object deQueue() throws Exception{
		if(isEmpty()){
			last = null;
			throw new Exception("empty");
		}
		Object object = first.t;
		first = first.next;
		size--;
		return object;
		
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private class Node<T>{
		T t;
		Node next;
	}
	
	public static void main(String[] args) throws Exception {
		QueueInLinkedList<Integer> queue = new QueueInLinkedList<Integer>();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}
}
