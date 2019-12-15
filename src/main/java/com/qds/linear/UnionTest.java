package com.qds.linear;

import java.util.Arrays;

/**
 * @author kong
 */
public class UnionTest {

    /**
     * 求并集, 将数组b中在数组a中不包含的元素放入数组a
     *
     * @param a
     * @param b
     * @return
     */
    public static int[] union(int[] a, int[] b) {
        // 扩容
        int lb = b.length;
        int la = a.length;
        int[] c = Arrays.copyOf(a, la + lb);

        for (int i = 0; i < lb; i++) {
            int v = b[i];
            if (LocatedNode(c, la, v) == -1) {
                c[la++] = v;
            }
        }
        return Arrays.copyOf(c, la);
    }

    /**
     * 确认当前值下标
     *
     * @param c
     * @param len
     * @param v
     * @return -1 不存在
     */
    private static int LocatedNode(int[] c, int len, int v) {
        for (int i = 0; i < len; i++) {
            if (v == c[i]) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {3, 4, 5, 6};
        int[] c = union(a, b);
        System.out.println(Arrays.toString(c));


    }

}
