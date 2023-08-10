public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("Task1 Sum count\n");
        int i = -10;
        int even = 0;
        int noteven = 0;
        do {

            if(i % 2 ==0 ) {
                even = even + i;
            } else {
                noteven = noteven + i;
            }
            i++;
        } while (i <= 21);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = "+even+", а нечетных = "+noteven);
    }
}
