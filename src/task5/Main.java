package task5;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();

        friends.add(0,"Катя");
        friends.add(1,"Марія");
        friends.add(2,"Анна");
        friends.add(3,"Таня");
        friends.add(4,"Мія");
        friends.add(5,"Рената");
        friends.add(6,"Лариса");
        friends.add(7,"Оксана");

        System.out.println(friends);
        Collections.sort(friends);
        System.out.println(friends);
    }
}
