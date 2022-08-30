package task6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teacher = new ArrayList<>();

        teacher.add(0,"Інна Олександрівна");
        teacher.add(1,"Михайло Петрович");
        teacher.add(2,"Ганна Геннадіївна");
        teacher.add(3,"Ксенія Вікторівна");
        teacher.add(4,"Лариса Олексіївна");
        teacher.add(5,"Тетяна Олександрівна");
        teacher.add(6,"Василь Миронович");
        teacher.add(7,"Раїса Аркадіївна");

        System.out.println(teacher);
        System.out.println("Найкращий вчитель - " + teacher.indexOf("Тетяна Олександрівна"));
        System.out.println("Найгірший вчитель - " + teacher.indexOf("Інна Олександрівна"));
    }
}
