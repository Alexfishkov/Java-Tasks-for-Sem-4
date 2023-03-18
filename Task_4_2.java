// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;
import java.util.Scanner;

public class Task_4_2 {
    public static void main(String args[]) {
        System.out.print("\033[H\033[J");
        System.out.println("Реализуем очередь с функционалом для элемента: поместить в конец, возвратить первый и удалить, либо не удалять");
        Deque <Integer> ourQueue = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            ourQueue.add(new Random().nextInt(0, 20));
        }
        System.out.println("Исходная очередь выглядит так:");
        System.out.println(ourQueue);
        System.out.println("Выберете, что вы хотите сделать:\nпоместить элемент в конец очереди - 1,\nудалить первый элемент и показать его - 2,\nпоказать первый элемент и не удалять - 3");
        String answer = System.console().readLine("=>");

        switch (answer){
            case "1":
                enqueue(ourQueue);
                System.out.println("Очередь выглядит теперь так:");
                System.out.println(ourQueue);
                break;
            case "2":
                dequeue(ourQueue);
                System.out.println("Очередь выглядит теперь так:");
                System.out.println(ourQueue);
                break;
            case "3":
                first(ourQueue);
                System.out.println("Очередь осталась без изменений");
                break;
            default:
                System.out.println("Некорректный выбор");
                break;
        }
        
    }

    public static void dequeue(Deque queue) {
        int element = (int) queue.remove();
        System.out.printf("Удалили элемент: %d\n", element);
    }

    public static void first(Deque queue) {
        int element = (int) queue.peek();
        System.out.printf("Первый элемент в очереди: %d\n", element);
    }

    public static void enqueue(Deque queue) {
        System.out.println("Укажите значение элемента, которого вы хотите переставить в конец очереди");
        System.out.println("Если такой элемент повторяется, то перемещён будет первый по очереди=>");
        Scanner iScanner = new Scanner (System.in);
        int element = iScanner.nextInt();
        iScanner.close();
        queue.removeFirstOccurrence(element);
        queue.addLast(element);
        System.out.printf("Переместили элемент в конец очереди: %d\n", element);
    }

}

