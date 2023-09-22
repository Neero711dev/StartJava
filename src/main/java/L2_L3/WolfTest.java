package L2_L3;

public class WolfTest {
    public static void main(String[] args) {
        Wolf Volk = new Wolf();
        System.out.println("Name : "+ Volk.getName() + " ; Age : " + Volk.getAge());
        Volk.setName("Dobriyvolk");
        Volk.setAge(5);
        System.out.println("Name : "+ Volk.getName() + " ; Age : " + Volk.getAge());

        Volk.howl();
        Volk.hunt();
    }
}
