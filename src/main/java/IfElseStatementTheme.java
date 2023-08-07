public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("Task 1 Translate to Java\n");
        String sex = "male";
        int age = 22;
        float height = 1.7f;
        String name = "Ivan";
        if (!sex.equals("male")) {
            System.out.println("female");
        } else {
            System.out.println("male");
        }
        if (age > 18) {
            System.out.println("Is adult");
        } else {
            System.out.println("Is not adult");
        }
        if (height > 1.8) {
            System.out.println("Not so tall");
        } else {
            System.out.println("tall enough");
        }
        char nFirstL = name.charAt(0);
        if (nFirstL == 'M') {
            System.out.println("Name' first letter is M");
        } else if (nFirstL == 'I') {
            System.out.println("Name' first letter is I");
        } else {
            System.out.println("Unknown name' first letter");
        }
        System.out.println("Task higher numeral\n");
        int a = 2;
        int b = 7;
        int highestValue;
        if (a > b) {
            highestValue = a;
        } else {
            highestValue = b;
        }
        if (a == b) {
            System.out.println(a + " = " + b);
        } else {
            System.out.println(a + " " + b + " " + "Higher numeral  " + highestValue);
        }

        System.out.println("Task3 Numeral check\n");
        int check = 3;

        if (check != 0) {
            if (check % 2 == 0 && check < 0) {
                System.out.println("Numeral " + check + " is negative and even");
            } else if (check % 2 == 0 && check > 0) {
                System.out.println("Numeral " + check + " is positive and even");
            } else if (check % 2 != 0 && check < 0) {
                System.out.println("Numeral " + check + " is negative and not even");
            } else {
                System.out.println("Numeral " + check + " is positive and not even");
            }
        }

        System.out.println("Task7 Subject grades\n");

    }
}
