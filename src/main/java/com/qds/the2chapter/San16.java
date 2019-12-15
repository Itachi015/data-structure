package com.qds.the2chapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author kong
 */
public class San16 {

    public static String nowStr(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i % 15 + 1);
        }
        System.out.println(Math.abs(-1));

        int indira = 0;
        System.out.println(indira);
        int safari = 0;
        System.out.println(safari);
    }

}
