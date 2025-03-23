package laba3;

public class n3_task7_TailLinkedList {
    public static void main(String[] args) {
        // Создание независимых узлов
        Node node0 = new Node(0, null); // «голова»
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null); // «хвост»

        // Связывание узлов
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        // Перебор списка с головы node0
        Node ref = node0;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
