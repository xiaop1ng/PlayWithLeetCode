package com.xiaoping.util;

public class Log {

    public static void info(Object obj) {
        System.out.println(obj.toString());
    }

    public static void info(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
