public class VariablesTheme {
    public static void main(String[] args) {
        byte cores = 4;
        int display = 27;
        long memory = 16;
        float freq = 2.7f;
        double storage = 1.0d;
        boolean isDesktop = true;
        short vRAM = 4;
        char speakers = 0x32 ;

        System.out.print("Cores "+cores+"\nDisplay "+display+"\nMemory "+memory+"\nCore frequency "+freq+"\nStorage "+storage+"\nIs it desktop pc? "+isDesktop+"\nvRAM "+vRAM+"\nSpeakers count "+speakers+"\n");
        System.out.println("");
        int bpen = 100;
        int bbook = 200;
        System.out.println("Overall "+(bpen+bbook));
        double a= (bpen+bbook)*0.11;
        System.out.println("Discount "+a);
        double b = (bpen+bbook)*0.89;
        System.out.println("Overall price with discount "+b);

    }
}

