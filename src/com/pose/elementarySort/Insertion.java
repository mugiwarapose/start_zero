package com.pose.elementarySort;

/**
 * 在计算机实现中，为了给要插入的元素腾出空间，我们要将其余所有元素在插入前都向右移动一位，这种算法叫做插入排序
 * Created by poseture on 2016/11/12.
 */
public class Insertion {

    public static void sort(Comparable[] arr){
        for(int i=1;i<arr.length;i++){
            Comparable currentValaue = arr[i];
            int position =i;
            for(int j=i-1;j>=0;j--){
                if(currentValaue.compareTo(arr[j])<0){
                    arr[j+1] = arr[j];
                    position --;
                }else{
                    break;
                }
            }

            arr[position] = currentValaue;

            }
        }

    public static void main(String[] args) {
        Integer[] list={49,38,65,97,76,13,27,14,10};
        sort(list);
        ArrayUtil.printArray(list,Integer.class);

    }
}
