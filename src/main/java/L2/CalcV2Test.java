package L2;

import java.util.Scanner;

public class CalcV2Test {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        CalcV2 execute = new CalcV2();
        System.out.println("Введите первое число: ");
        execute.setA(con.nextInt());
        System.out.println("Введите знак математической операции: ");
        execute.setSign(con.next());
        System.out.println("Введите второе число: ");
        execute.setB(con.nextInt());
        execute.count(execute.getA(), execute.getB(),execute.getSign());
        System.out.println(execute.getResult());
    }
}
