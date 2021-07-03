public class Wolf {
    String sex;
    String name;
    float weight;
    byte age;
    String color;

    void move() {
        System.out.println(name + " идет");
    }

    void sit() {
        System.out.println(name + " сидит");
    }

    void run() {
        System.out.println(name + " бежит");
    }

    void howl() {
        System.out.println(name + " воет");
    }

    void hunt() {
        System.out.println(name + " охотится");
    }
}