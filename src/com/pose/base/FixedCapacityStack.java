package com.pose.base;

import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * Created by poseture on 2016/11/6.
 */
public class FixedCapacityStack<E> implements Iterable<E> {
    /**
     * The array buffer into which the components of the statck are stroed;
     * the capavity of the stack is the length of this buffered array
     *
     */
    protected  Object[] elementData;


    /**
     * The number of the valid components in this object;
     */
    protected  int elementCount;


    public FixedCapacityStack(int capacity){
        if (capacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: "+
                    capacity);
        elementData = new Object[capacity];
    }

    /**
     * the default length of buffered array is 10
     */
    public FixedCapacityStack(){
        this(10);
    }

    /**
     *
     * @param o
     */
    public void push(Object o){
        if(elementCount == elementData.length){
            reSize(elementCount*2);
        }
        elementData[elementCount++] = o;
    }


    /**
     * 返回并移除栈顶的值
     * 栈的长度小于数组的1／4时，数组的长度将被减半
     * @return Object
     */
    public Object pop(){

        Object object = elementData[--elementCount];
        elementData[elementCount] = null;   //避免对象游离，被弹出的元素的引用仍然存在数组当中，但是JAVA垃圾收集器无法知道这点，除非该引用被覆盖
        if(elementCount>0 && elementCount == elementData.length/4){
            reSize(elementData.length/2);
        }
        return object;
    }

    public int size(){
        return elementCount;
    }

    public boolean isEmpty(){
        return elementCount==0;
    }

    public void reSize(int max){
        Object[] temp = new Object[max];

        for(int i=0;i<elementCount;i++){
            temp[i] = elementData[i];
        }
        elementData = temp;
    }

    public static void main(String[] args) {
        FixedCapacityStack<Integer> stack = new FixedCapacityStack<Integer>(6);
        for(int i=0;i<100;i++){
            stack.push(i);
        }
        while(stack.size()>0){
            System.out.println(stack.pop());
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ReserveArrayIterator();
    }

    private class ReserveArrayIterator implements Iterator{

        private int i = elementCount;

        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public Object next() {
            return elementData[--i];

        }

        @Override
        public void remove() {

        }

    }
}
