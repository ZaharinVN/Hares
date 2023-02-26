import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<MountainHare> hares = new ArrayList<>();
        hares.add(new MountainHare(4, 4.4, 120));
        hares.add(new MountainHare(7, 3.6, 150));
        hares.add(new MountainHare(1, 2.3, 100));

        System.out.println("В лесу лето!");
        Forest.setSeason("лето");// задайте сезон "лето"
        Forest forest = new Forest(hares);// создайте объект "летний лес с зайцами"
        System.out.println("Список зайцев:");
        forest.printHares();// напечатайте список всех зайцев
        System.out.println("В лесу зима!");
        Forest.setSeason("зима");// поменяйте время года на зиму
        System.out.println("Список зайцев:");
        forest.printHares();// напечатайте список всех зайцев
    }
}

class MountainHare {

    private int age;
    private double weight;
    private int jumpLength;
    static String color;

    public MountainHare(int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    public String toString() {
        return "Заяц-беляк { " +
                "возраст = " + age +
                ", вес = " + weight +
                ", длина прыжка = " + jumpLength +
                ", цвет = " + color +
                " }";
    }
}

class Forest {

    private static String season;
    private ArrayList<MountainHare> hares;

    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }

    public static void setSeason(String newSeason) {
        season = newSeason;

        if (newSeason.equals("зима")) {
            MountainHare.color = "белый";
        } else {
            MountainHare.color = "серо-рыжий";
        }
    }

    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}