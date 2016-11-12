package com.pose.elementarySort;

/**
 * 参数继承Comparable接口，调用compareTo方法比较大小
 * 如果返回值>0 表示大于
 * 如果返回值=0 表示等于
 *
 * 首先找到数组当中最小第元素，其次将它跟数组的第一个元素交换位置，
 * then在剩下的元素中找到最小的元素，将它与数组的第二个元素交换位置，如此往复
 * Created by poseture on 2016/11/12.
 *
 */
public class Selection {

    public static void sort(Comparable[] a){
        int n = a.length;
        for(int i=0;i<n;i++){
            //最小值标志
            int min = i;
            for(int j=i+1;j<a.length;j++){
                if(a[min].compareTo(a[j])>0){
                    min = j;
                }
            }
            //如果第i位第就是最小值则不需要交换
            if(min!=i){
                Comparable t = a[i];
                a[i] = a[min];
                a[min] = t;
            }
        }
    }

    public static void exch(Comparable[] a,int i,int l){



    }


    public static void main(String[] args) {
        Integer[] list={49,38,65,97,76,13,27,14,10};
        sort(list);
        for(int i=0;i< list.length;i++){
            System.out.println(list[i]);
        }
    }
}
