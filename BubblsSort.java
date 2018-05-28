package algorithms;

import java.util.Arrays;

public class BubblsSort {

    public static void main(String[] args) {
        int b[] = {10,6,8,3,5};
        bubble(b,5);
        System.out.println(Arrays.toString(b));
    }

    public static void bubble(int a[], int n){
        int i,j;
        int flag;

        for (i = n - 1; i > 0;i--){
            flag = 0;
            for (j = 0;j < i;j++){
                if (a[j] > a[j+1]){
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    flag = 1;
                }
            }
            if (flag == 0){
                break;
            }
        }
    }
}
