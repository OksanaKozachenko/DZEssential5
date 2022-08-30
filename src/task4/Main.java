package task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> chisla = new ArrayList<>();
        chisla.add(4);
        chisla.add(2);
        chisla.add(6);
        chisla.add(8);
        chisla.add(3);
        chisla.add(5);
        System.out.println(chisla);



        ListIterator<Integer> listIterator = chisla.listIterator();

        while (listIterator.hasNext()) {
            Integer integer = listIterator.next();
            System.out.print(integer+1);
        }
    }
}
