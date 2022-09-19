package cn.young.object;

import java.util.ArrayList;

public class Object0 {


    public static void main(String[] args) {

        // getClass() with Object
        Object obj1 = new Object();
        System.out.println("obj1 的类为: " + obj1.getClass());

        // getClass() with String
        String obj2 = new String();
        System.out.println("obj2 的类为: " + obj2.getClass());

        // getClass() with ArrayList
        ArrayList<Integer> obj3 = new ArrayList<>();
        System.out.println("obj3 的类为: " + obj3.getClass());


        RunoobTest obj = new RunoobTest();

        // RunoobTest 继承 Object 类，Object 是所有类的超类
        // 调用 getClass() 方法
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
        System.out.println(obj.getClass());
    }
    static class RunoobTest{
        public RunoobTest() {
        }
    }
}
