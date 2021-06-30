package ru.geekbrains.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        //задание 1
        Integer[] numbers = {11, 1, 10, 7, 8, 41};
        String [] letters = {"f", "K", "p", "Y"};
        changingPlaces(numbers,2,0);
        changingPlaces(letters,1,3);
        //Задание 2
        List list = new ArrayList<>(Arrays.asList(letters));
        list.forEach(x -> System.out.println(x));
        //Задание 3
        Box<Orange> orange1 = new Box<>();
        Box<Orange> orange2 = new Box<>();
        Box<Apple> apple1 = new Box<>();
        Box<Apple> apple2 = new Box<>();
        orange1.addFruit(new Orange(),10);
        orange2.addFruit(new Orange(),12);
        apple1.addFruit(new Apple(),8);
        apple2.addFruit(new Apple(),4);
        System.out.println("Коробка №1: "+orange1.getWeight());
        System.out.println("Коробка №2: "+orange2.getWeight());
        System.out.println("Коробка №3: "+apple1.getWeight());
        System.out.println("Коробка №4: "+apple2.getWeight());
        orange1.pourTo(orange2);
        apple1.pourTo(apple2);
        System.out.println("Коробка №1: "+orange1.getWeight());
        System.out.println("Коробка №2: "+orange2.getWeight());
        System.out.println("Коробка №3: "+apple1.getWeight());
        System.out.println("Коробка №4: "+apple2.getWeight());
    }
    public static void changingPlaces(Object[] array, int a, int b){
        Object change = array[a];
        array[a] = array[b];
        array[b] = change;
    }
    //lesson1
}
