package cn.young;

import cn.young.interface0.Formula;

public class Test {
    public static void main(String[] args) {
        String s = new String("111");
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return 0;
            }
        };

        Formula formula1 = new Formula() {
            @Override
            public double calculate(int a) {
                return 0;
            }

        };
        if (formula1.equals(formula)) {
            System.out.println(formula1 == formula);

        } else {
            System.out.println(666);
            System.out.println(formula);

            System.out.println(formula1);
        }

        StringBuilder sb = new StringBuilder(10);
        sb.append(s);
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        Thread thread=new Thread();

        thread.run();
        System.out.println( sb.length());
        sb.insert(sb.length(), "Java");
        System.out.println(sb );
        sb.delete(5,8);
        System.out.println(sb);
    }
}
