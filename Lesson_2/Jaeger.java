public class Jaeger {
    private String modelName;
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    private String mark;
    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }

    private String origin;
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    private float height;
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    private float weight;
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    private int strenght;
    public int getStrenght() {
        return strenght;
    }
    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    private int speed;
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int armor;
    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Jaeger() {
        this("Bracer Phoenix", "Mark-5", "USA", 70.7f, 2.1f, 8, 10, 9);
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int strenght, int speed, int armor) {
        this.setModelName(modelName);
        this.setMark(mark);
        this.setOrigin(origin);
        this.setHeight(height);
        this.setWeight(weight);
        this.setStrenght(strenght);
        this.setSpeed(speed);
        this.setArmor(armor);
    }

    public boolean drift() {
        return true;
    }

    public void move() {
        System.out.println("moving");
    }

    public String scanKaiju() {
        return "scanning";
    }

    public void useVortexCannon() {
        System.out.println("activated");
    }
}