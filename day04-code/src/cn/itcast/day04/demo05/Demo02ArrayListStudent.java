package cn.itcast.day04.demo05;

import java.util.ArrayList;

/*
* 定义4个学生对象，添加到集合，并遍历 - 注意添加到集合当中的式对象
*
* 思路：
* 1、自定义Student学生类，四个部分。
* 2、创建一个集合，用来存储学生对象。泛型：<Student>
* 3、根据类，创建4个学生对象。
* 4、将4个学生对象添加到集合当中。add
* 5、遍历集合。for、size、get
* */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("源氏", 1);
        Student two = new Student("半藏", 2);
        Student three = new Student("安娜", 3);
        Student four = new Student("狂鼠", 4);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
//            System.out.println("姓名：" + list.get(i).getName() + "，年龄：" + list.get(i).getAge());    //也对
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge());
        }
    }

}
