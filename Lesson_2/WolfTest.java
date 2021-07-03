public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.name = "Шарик";
        wolfOne.sex = "мальчик";
        wolfOne.weight = 5.4f;
        wolfOne.age = 3;
        wolfOne.color = "серый";

        System.out.println("Волка зовут " + wolfOne.name);
        System.out.println("Его пол: " + wolfOne.sex);
        System.out.println("Ему " + wolfOne.age + " года(лет)");
        System.out.println("Он весит " + wolfOne.weight + " кг");
        System.out.println("У него " + wolfOne.color + " окрас");

        wolfOne.move();
        wolfOne.run();
        wolfOne.hunt();
        wolfOne.sit();
        wolfOne.howl();
    }
}