package cn.young.interface0;


public class FormulaTest {
    public static void main(String[] args) {
        System.out.println("abc");
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        System.out.println(formula.calculate(100)); // 100.0 formula.sqrt(16);
        System.out.println(formula.sqrt(16)); // 4.0

        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted); // 123


        int p = 0;


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <2 ; j++) {
                for (int k = 0; k <1 ; k++) {


                    System.out.println(++p);
                }
            }
        }

        System.out.println();
        System.out.printf("");


    }

}
