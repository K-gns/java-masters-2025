package laba3;

class Node {
    int value;
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class n3_task4 {
    public static void main(String[] args) {
        // Создаём три независимых узла:
        Node first = new Node(1, null);
        Node second = new Node(2, null);
        Node third = new Node(3, null);

        // Связываем
        first.next = second;
        second.next = third;

        // Выведем значения:
        Node ref = first;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
    }
}
