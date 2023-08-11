package L2;

import java.sql.SQLOutput;

public class WolfTest {
    public static void main(String[] args) {
        Wolf Zloivolk = new Wolf();
        Zloivolk.name = "Zloivolk";
        Zloivolk.age = 2;
        System.out.println(Zloivolk.name + " " + Zloivolk.age);
        Zloivolk.howl();
    }
}
