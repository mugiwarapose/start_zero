package com.pose.base;

import java.util.EmptyStackException;

/**
 * Created by poseture on 2016/11/6.
 */
public class FixedCapacityStackOfString {

    public String[] elements = new String[10];

    public int length =0;

    public int capacity;

    public FixedCapacityStackOfString(int capcaity){
        elements = new String[capcaity];
        this.capacity = capcaity;
    }

    public void push(String item){
        if(length>capacity){
            throw new  StackOverflowError();
        }
        elements[length] = item;
        length++;
    }

    public String  pop(){
        String temp = null;
        if(length>0){
            temp = elements[--length];
            return temp;
        }else{
            throw new EmptyStackException();

        }

    }

    public boolean isEmpty(){
        return length>0;
    }

    public int size(){
        return length+1;
    }

    public static void main(String[] args) {
        FixedCapacityStackOfString stack  = new FixedCapacityStackOfString(6);

        stack.push("I");
        stack.push("am");
        stack.push("fall");
        stack.push("into");
        stack.push("trouble");
        stack.push("I don't know how to do");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
