public class Game {
    public static void main(String[] args) {
        int num = 100;
        int mynum = 13;

        System.out.println("Start");
        while (true) {
            if(mynum == num) {
                System.out.println("You win");
                break;
            } if(mynum > num) {
                System.out.println("Your number "+ mynum + " > than my number");
                mynum--;
            } if(mynum < num) {
                System.out.println("Your number "+ mynum + " < than my number");
                mynum++;
            }
        }
        System.out.println("Finish");
    }
}
