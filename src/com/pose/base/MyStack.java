package com.pose.base;

import java.util.EmptyStackException;
import java.util.Objects;
import java.util.Vector;

/**
 * Created by poseture on 2016/11/6.
 */
public class MyStack<E> extends Vector<E> {
    /**
     * create an empty statck
     */
    public MyStack(){}

    /**
     * push an item onto the top of this statck .This has exactly
     * the same effect as :
     * <blockquote><pre>
     *      addElement(item)
     * </blockquote></pre>
     * @param item
     * @return
     */
    public E push(E item){
        addElement(item);
        return item;
    }



    public synchronized E pop(){
        E object;
        int len = size();
        object = peek();

        removeElementAt(len -1);

        return object;
    }

    public synchronized E peek(){
        int len = size();
        if(len==0){
            throw new EmptyStackException();
        }
        return elementAt(len-1);
    }

    public boolean isEmpty(){
        return size()==0;
    }


    public synchronized  int search(Object o){
        int i = lastIndexOf(o);

        if(i>=0){
            return size()-1;
        }
        return -1;
    }


    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<String>();
        stack.push("1");
        stack.push("2");
        stack.push("3");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}
