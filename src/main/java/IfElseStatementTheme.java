public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("Task 1 Translate to Java");
        System.out.println();
        String sex = "male";
        int age = 22;
        float height = 1.7f;
        String name = "Ivan";
        if(!sex.equals("male")) {
            System.out.println("female");
        } else {
            System.out.println("male");
        }
        if(age > 18) {
            System.out.println("Is adult");
        } else {
            System.out.println("Is not adult");
        }
        if(height > 1.8) {
            System.out.println("Not so tall");
        } else {
            System.out.println("tall enough");
        }
        char nFirstL = name.charAt(0);
        if(nFirstL == 'M') {
            System.out.println("Name' first letter is M");
        } else if(nFirstL == 'I') {
            System.out.println("Name' first letter is I");
        } else {
            System.out.println("Unknown name' first letter");
        }

    }
}
