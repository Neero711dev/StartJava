package L2_L3.calculator;

import java.util.Scanner;

public class CalcV2Test {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.println("Calculator's executing...");
        CalcV2 execute = new CalcV2();
        String A= "y";
        int a;
        int b;
        cycS:
        while(A.equals("y")) {

            System.out.println("Введите первое число: ");
            a = con.nextInt();
            if (a > 0) {execute.setA(a);} else {System.out.println("Negative numeral"); continue cycS;}
            System.out.println("Введите знак математической операции: ");
            execute.setSign(con.next()); // TODO exception - divide by zero / wrong operation / rest
            System.out.println("Введите второе число: ");
            b = con.nextInt();
            if (b > 0) {execute.setB(b);} else {System.out.println("Negative numeral"); continue cycS;}
            execute.count(execute.getA(), execute.getB(), execute.getSign());
            System.out.println(execute.getResult());
            System.out.println("Continue y/n");
            A = con.next();
        }
    }
}
