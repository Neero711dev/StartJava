package L2;

public class CalcV2 {
    private int a;
    private int b;
    private String sign;
    private int result;

    public int getA() {
        return a;
    }

    public int count(int a, int b, String sign) {

        if (a > 0 && b > 0) {
            switch (sign) {
                case ("%"):
                    result = a % b;
                    break;
                case ("+"):
                    result = a + b;
                    break;
                case ("-"):
                    result = a - b;
                    break;
                case ("*"):
                    result = a * b;
                    break;
                case ("/"):
                    result = a / b;
                    break;
                case ("^"):
                    for (int i = 1; i <= b; i++) {
                        result = a * result;
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
        return result;
    }

    public int getResult() {
        return result;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getB() {
        return b;
    }

    public String getSign() {
        return sign;
    }
}
