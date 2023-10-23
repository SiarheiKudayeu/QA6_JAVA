package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        // ArrayList это класс наследуемый от интерфейса List.
        //Это автоматически расширяемый массив, который может содержать элементы любого типа
        //Но в одном ArrayList могут находится только однотипные элементы
        //Мы не можем указывать примитивыне типы данных при создании ArrayList.
        //только их одноименные классы обертки
        List<String> stringsArrayList = new ArrayList<>();
        System.out.println(stringsArrayList);

        //add
        stringsArrayList.add("One");
        stringsArrayList.add("Two");
        stringsArrayList.add("Three");
        stringsArrayList.add("Four");
        System.out.println(stringsArrayList);

        //toArray()
        Object[] strings = stringsArrayList.toArray();
        System.out.println(Arrays.toString(strings));

        //size(), get()
        System.out.println(stringsArrayList.size());
        System.out.println(stringsArrayList.get(0));
        String[] strings1 = new String[stringsArrayList.size()];
        for (int i = 0; i < stringsArrayList.size(); i++) {
            strings1[i] = stringsArrayList.get(i);
        }
        System.out.println(Arrays.toString(strings1));

        //remove() удаление элемента [One, null, Three, Four]
        stringsArrayList.remove(1);
        System.out.println(stringsArrayList);

        //set()замена элемента   (numbers[1] = 23)
        stringsArrayList.set(1, "Two");
        stringsArrayList.set(2, "Three");
        System.out.println(stringsArrayList);

        //прямая инициализация
        List<String> stringsArrayList2 = new ArrayList<>(Arrays.asList("Array1", "Array2", "Array3", "Array4"));
        System.out.println(stringsArrayList2);

        //contains(), indexOf()
        System.out.println(stringsArrayList2.contains("Array23"));
        System.out.println(stringsArrayList2.indexOf("Array2"));

        //trimToSize()
        ArrayList<String> stringsArrayList3 = new ArrayList<>(30);
        stringsArrayList3.add("ldvjdlvljdk");
        stringsArrayList3.add("ldvjdlvljdk");
        stringsArrayList3.add("ldvjdlvljdk");
        stringsArrayList3.add("ldvjdlvljdk");

        stringsArrayList3.trimToSize();
        stringsArrayList3.ensureCapacity(10);
        System.out.println(stringsArrayList3.size());


    }
}
