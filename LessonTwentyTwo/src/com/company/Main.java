package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        // HashSet - хранение уникальныйх значений
        HashSet<String> set = new HashSet<>();
        set.add("Black");
        set.add("White");
        set.add("Red");
        set.add("Black");
        System.out.println(set);

        /* в коллекции типа Hash* при сравнении элементов
        сначала вызывается метод Equals(), и только
        потом HashCode()
         */
        HashSet<Cat> cats = new HashSet<>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.id = 124;
        cat2.id = 125;
        cat1.name = "Barsik";
        cat2.name = "Barsik";
        cats.add(cat1);
        cats.add(cat2);
        System.out.println(cats);

        // HashMap (Dictionary)
        // key: value
        // key - должен быть уникальным
        // value - может повторяться
        HashMap<Integer, String> phones = new HashMap<>();
        // добавление элемента
        phones.put(12345, "Ivanov Ivan");
        phones.put(22345, "Skvortsov Igor");
        phones.put(32345, "Getter Setter");
        System.out.println(phones);

        // проверка существования ключа в коллекции
        System.out.println(phones.containsKey(12345));
        System.out.println(phones.containsKey(589476));

        // проверка существования значения в еоллекции
        System.out.println(phones.containsValue("Ivanov Ivan"));
        System.out.println(phones.containsValue("dkjfnk"));

        // получения списка ключей
        Set<Integer> keySet = new HashSet<>(phones.keySet());
        System.out.println(keySet);

        // получение списка значений
        System.out.println(phones.values());

        // получение значения по ключу
        System.out.println(phones.get(12345));
        System.out.println(phones.getOrDefault(223, "not found"));
        System.out.println(phones.getOrDefault(22345, "Skvortsov Igor"));

        // удаление значений
        phones.remove(12345);
        phones.remove(12345, "Ivanov Ivan");

        // дана строка, содержащая латинские символы
        // вывести на экран кол-во повторений символов в строке
        String s = "kjfdjskfkjdsnfojdsnfjdhghshgf";
        HashMap<Character, Integer> chars = new HashMap<>();
        for (char c : s.toCharArray()) {
            chars.put(c, chars.getOrDefault(c, 0) + 1);
        }
        System.out.println(chars);

        TenetList<Integer> tl = new TenetList<>();
        tl.add(67);
        tl.add(87);
        tl.add(45);
        tl.add(900);

        for (int i = 0; i < tl.size(); i++) {
            System.out.println(tl.get(i));
        }

        // при старте цикл Foreach вызывает у объекта коллекции
        // метод iterator()+-
        for (int e : tl) {
            System.out.println(e);
        }

        LinkedList<Cat> catList = new LinkedList<>();
        catList.add(new Cat(2, "Barsik"));
        catList.add(new Cat(3, "Tom"));
        catList.add(new Cat(1, "Bagira"));
        Collections.sort(catList);
        System.out.println(catList.toString());
        Collections.sort(catList, new Cat.CateratorName());
        System.out.println(catList);
        Collections.sort(catList, new Cat.CateratorID(false));
        System.out.println(catList);
    }


}
