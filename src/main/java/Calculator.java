public class Calculator {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        String c = "^";
        int result = 1;
        if(a > 0 && b > 0) {
            if(c.equals("%")) {
                result = a%b;
            } else if (c.equals("+")) {
                result = a + b;
            } else if (c.equals("-")) {
                result = a - b;
            } else if (c.equals("*")) {
                result = a * b;
            } else if (c.equals("/")) {
                result = a / b;
            } else if (c.equals("^")) {
                for (int i = 1;i<=b;i++) {
                    result = a * result;

                }
            }
        }
        System.out.println(a + " " + c + " " + b + " = " + result);
    }
}
