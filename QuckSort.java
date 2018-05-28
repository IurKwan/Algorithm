package com.company.algorithm;

import java.util.Arrays;

public class QuckSort {

    public static void main(String[] args) {
        int t[] = {10,8,6,5,9};
        qucksort(t,0,4);
        System.out.println(Arrays.toString(t));
    }

    /**
     * 快速排序
     * @param a 待排序的数组
     * @param l 数组的左边界(例如，从起始位置开始排序，则l=0)
     * @param r 数组的右边界(例如，排序截至到数组末尾，则r=a.length-1)
     */
    public static void qucksort(int a[], int l, int r){
        if (l < r){
            int i,j,x;
            i = l;
            j = r;
            x = a[i];
            while (i < j){
                while (i < j && a[j] > x){
                    j--;// 从右向左找第一个小于x的数
                }
                if (i < j){
                    a[i++] = a[j];
                }
                while (i < j && a[i] < x){
                    i++;// 从左向右找第一个大于x的数
                }
                if (i < j){
                    a[j--] = a[i];
                }
            }

            a[i] = x;
            qucksort(a,l,i - 1); /* 递归调用 */
            qucksort(a,i + 1,r); /* 递归调用 */
        }
    }
}
