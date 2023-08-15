package L2;

public class Wolf {
   private String name = "Zloivolk";
    private String sex;
    private int weight;
    private int age = 2;
    private String color;

    public String getName() {
       return name;
    }

    public void run() {
        System.out.println("is running");
    }

   public void sit() {
        System.out.println("is sitting");
    }

    public void walk() {
        System.out.println("is walking");
    }

    public void howl() {
        System.out.println(name + " is howling");
    }

    public void hunt() {
        System.out.println(name + " is hunting");
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if (age < 8 ) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
