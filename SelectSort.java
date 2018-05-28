package algorithms;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
        int b[] = {10,6,8,3,5};
        select(b,5);
        System.out.println(Arrays.toString(b));
    }

    public static void select(int a[],int n){
        int i,j,min;

        for (i = 0;i < n;i++){
            min = i;
            for (j = i + 1;j < n;j++){
                if (a[j] < a[min]){
                    min = j;
                }
            }

            if (min != i){
                int t = a[i];
                a[i] = a[min];
                a[min] = t;
            }
        }

    }
}
