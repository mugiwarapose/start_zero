package com.pose.object;

/**
 * Created by poseture on 2016/11/6.
 */
public class LinkedList<T> {

    private Node head;

    private Node next;

    public LinkedList(){
        head = new Node();
    }

    /**
     * 头插法
     * @param t
     */
    public void insert(T t){
        Node node  =  new Node();
        node.t = t;
        if(head.next==null){
            head.next = node;
        }else{
            node.next = head.next;
            head.next = node;
        }

    }



    /**
     * 定义一个节点
     * @param <T>
     */
    private class Node<T>{
        /**
         * 数据元素
         */
        private T t;
        /**
         * 指向下一个节点
         */
        private Node next;
    }
}
