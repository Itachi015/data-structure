package com.qds.linear;

import java.util.Arrays;

/**
 * @author kong
 */
public class San14 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {3, 4, 10};

        int start = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = start; j < b.length; ) {
                if (a[i] >= b[j]) {
                    if (a[i] == b[j]) {
                        b[j] = 0;
                    }
                    start = ++j;
                } else {
                    System.out.println("退出");
                    break;
                }
            }
        }
        // 10   10 * 5
        // 5    10 * 5
        System.out.println(Arrays.toString(b));
    }

}
