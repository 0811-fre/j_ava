package cn.young.enum0;

import cn.young.Test;

import java.util.Arrays;

public class Enum0 extends Test {
    /*static class Color
    {
        public static final Color RED = new Color();
        public static final Color BLUE = new Color();
        public static final Color GREEN = new Color();
    }*/
    enum Color {
        RED, GREEN, BLUE;

        // 构造函数
        private Color() {
            System.out.println("Constructor called for : " + this.toString());
        }

        public void colorInfo() {
            System.out.println("Universal Color");
        }
    }

    public static class Test0 {

        public Test0() {
        }

        // 执行输出结果
        public static void main(String[] args) {
            Color c1 = Color.RED;
            System.out.println(c1);
            c1.colorInfo();

            System.out.println("\n"+Test.class.isAssignableFrom(Enum0.class));
            System.out.println("\n"+Enum0.class.isAssignableFrom(Test.class));
            System.out.println(Test0.class.isAssignableFrom(Enum0.class) );
            System.out.println(Enum0.class.isAssignableFrom(Test0.class) );
            System.out.println("\nTest.main");
            System.out.println("args = " + Arrays.deepToString(args));
            System.out.println("c1 = " + c1);
        }
    }
}
