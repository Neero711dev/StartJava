package L2;

import java.sql.SQLOutput;

public class WolfTest {
    public static void main(String[] args) {
        Wolf Volk = new Wolf();
        System.out.println("Name : "+ Volk.getName() + " ; Age : " + Volk.getAge());
        Volk.setName("Dobriyvolk");
        Volk.setAge(19);
        System.out.println("Name : "+ Volk.getName() + " ; Age : " + Volk.getAge());

        Volk.howl();
        Volk.hunt();
    }
}
