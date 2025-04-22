import java.util.*;
public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        deque.add("Middle");
        System.out.println("Deque: " + deque);
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());
        System.out.println("Deque: " + deque);
    }
}
