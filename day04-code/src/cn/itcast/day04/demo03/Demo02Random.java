package cn.itcast.day04.demo03;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(10);    //范围实际上是0~9
            System.out.println(num);
        }
    }
}
