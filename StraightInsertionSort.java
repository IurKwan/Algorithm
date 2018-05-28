package algorithms;

import java.util.Arrays;

public class StraightInsertionSort {

    public static void main(String[] args) {
        int b[] = {6,8,3,5,10};
        straight(b,5);
//        System.out.println(Arrays.toString(b));
    }

    public static void straight(int a[],int n){
        int i, j, k;
        for (i = 1; i < n; i++) {
            //为a[i]在前面的a[0...i-1]有序区间中找一个合适的位置
            for (j = i - 1; j >= 0; j--){
                if (a[j] <= a[i])
                    break;
            }

            //如找到了一个合适的位置
            if (j != i - 1) {
                System.out.println("换位");
                //将比a[i]大的数据向后移
                int temp = a[i];
                for (k = i - 1; k > j; k--){
                    a[k + 1] = a[k];
                }
                //将a[i]放到正确位置上
                a[k + 1] = temp;
            }

            System.out.println(Arrays.toString(a));
        }

    }
}
