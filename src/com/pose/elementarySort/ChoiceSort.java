package com.pose.elementarySort;

/**
 * Created by poseture on 2016/11/12.
 */
public class ChoiceSort {
    public static void sort(Integer[] a){
        if(a==null  ||  a.length<=0)
        return;

        for(int i=0;i<a.length;i++){
            int min = i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }

    }

    public static void main(String[] args) {
        Integer[] list={49,38,65,97,76,13,27,14,10};
        sort(list);
        for(int i=0;i< list.length;i++){
            System.out.println(list[i]);
        }

    }


}
