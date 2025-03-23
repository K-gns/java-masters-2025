package laba3;

public class n3_task7_HeadLinkedList {
    public static void main(String[] args) {
        Node head = null; // изначально список пуст

        // Добавляем элементы, постоянно перемещая голову
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }

        // Вывод списка
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
