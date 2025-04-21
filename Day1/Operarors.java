package Day1;

import java.util.List;

public class Operarors {

    public static void main(String[] args) {

        //Assignment
        int num1 = 5;
        System.out.println(num1);

        //Arithmetic
        int sum = num1 + 5;
        System.out.println(sum);

        int sub = num1 - 4;
        System.out.println(sub);

        int mul = num1 * 2;
        System.out.println(mul);

        int div = num1 / 1;
        System.out.println(div);

        int mod = num1 % 2;
        System.out.println(mod);

        //relational
        boolean flag = 1 == 1;
        System.out.println(flag);

        System.out.println(2 != 9);
        System.out.println(8 < 5);
        System.out.println(8 > 5);
        System.out.println(4 <= 5);
        System.out.println(8 >= 8);

        //logical
        boolean isvalid = true && false;
        System.out.println(isvalid);
        System.out.println(true || true);
        System.out.println(!false);

        //Assignment
        int sum2 = 5;
        num1 += 1;
        System.out.println(num1);

        num1 -= 1;
        System.out.println(num1);

        num1 *= 5;
        System.out.println(num1);

        num1 /= 5;
        System.out.println(num1);

        //bitwise
        int result = 7 << 3;
        System.out.println(result);

        System.out.println(100 >> 500);
        System.out.println(1 | 5);
        System.out.println(5 ^ 5);
        System.out.println(~5);
        System.out.println(true || false);
        System.out.println(!false);

        //unary
        int answer = sum++ - --sum2;
        System.out.println(answer);

        //ternary
        String data = "ant".equals("ant") ? "correct" : "wrong";
        System.out.println(data);

        boolean experiment = 'a' > 100;
        System.out.println(experiment);


    }
}