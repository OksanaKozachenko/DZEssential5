package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<>();

        zoo.add(0,"Пони");
        zoo.add(1,"Слон");
        zoo.add(2,"Страус");
        zoo.add(3,"Жираф");
        zoo.add(4,"Лось");
        zoo.add(5,"Волк");
        zoo.add(6,"Лиса");
        zoo.add(7,"Рись");

        System.out.println(zoo);

        zoo.remove(3);
        zoo.remove(5);
        //zoo.remove(7);

        System.out.println(zoo.size());

    }
}
