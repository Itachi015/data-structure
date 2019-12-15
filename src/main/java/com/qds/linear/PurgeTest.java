package com.qds.linear;

import java.util.Arrays;

/**
 * @author kong
 */
public class PurgeTest {

    public static int[] purge(int[] a) {
        int len = a.length;
        int endIndex = len -1;
        for (int i = 0; i <= endIndex; i++) {
            int index = LocatedNode(a, endIndex, i);
            if (index != -1) {
                deleteList(a, index, endIndex);
                endIndex--;
            }
        }
        return Arrays.copyOf(a, endIndex + 1);
    }

    /**
     * 移除制定下标元素, 同时移动元素
     *
     * @param a
     * @param startIndex
     * @param endIndex
     */
    private static void deleteList(int[] a, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            a[i] = a[i + 1];
        }
        a[endIndex] = 0;
    }

    /**
     * 确认当前值下标
     *
     * @param c
     * @param endIndex
     * @param index
     * @return -1 不存在
     */
    private static int LocatedNode(int[] c, int endIndex, int index) {
        for (int i = index + 1; i <= endIndex; i++) {
            if (c[index] == c[i]) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4, 4, 5, 6};
        int[] rs = purge(a);
        System.out.println(Arrays.toString(rs));
    }
}
