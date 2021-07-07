public class Wolf {
    private String sex;
    private String name;
    private float weight;
    private byte age;
    private String color;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println(name + " идет");
    }

    public void sit() {
        System.out.println(name + " сидит");
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    public void howl() {
        System.out.println(name + " воет");
    }

    public void hunt() {
        System.out.println(name + " охотится");
    }
}