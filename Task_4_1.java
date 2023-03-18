// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёт «перевёрнутый» список

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Task_4_1 {
    public static void main(String args[]) {

        System.out.print("\033[H\033[J");
        System.out.println("Переворачиваем список наоборот");
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < 20; i++) {
            ll.add(new Random().nextInt(0, 20));
        }
        System.out.println("Исходный список выглядит так:");
        System.out.println(ll);
        reverseArray(ll);
        System.out.println("Перевёрнутый список выглядит так:");
        System.out.println(ll);

    }

    // Метод, переворачивающий список:
    public static void reverseArray (LinkedList inputll){
        Collections.reverse(inputll);
    }

}