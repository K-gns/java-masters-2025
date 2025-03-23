package laba3;

public class n3_task8_ListClass {

    // -------------------------------------
    // Вложенный класс Node (звено списка)
    // -------------------------------------
    private static class Node {
        int value;      // данные
        Node next;      // ссылка на следующий узел

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // "Голова" списка
    private Node head;

    // ====================================
    // 1. МЕТОДЫ С ИСПОЛЬЗОВАНИЕМ ЦИКЛА
    // ====================================

    /**
     * createHead(): Ввод списка с головы.
     * Элементы массива записываются в список так, что
     * последний элемент массива оказывается в хвосте списка.
     */
    public void createHead(int[] values) {
        head = null; // изначально список пуст
        // идём с конца массива к началу, каждый новый элемент ставим "в голову"
        for (int i = values.length - 1; i >= 0; i--) {
            head = new Node(values[i], head);
        }
    }

    /**
     * createTail(): Ввод списка с хвоста.
     * Элементы массива в порядке (values[0], values[1], ...).
     */
    public void createTail(int[] values) {
        head = null;
        if (values.length == 0) {
            return;
        }
        // Создаём первый узел - голова
        head = new Node(values[0], null);
        Node tail = head; // временная переменная для хвоста
        // Пробегаем по остальным элементам массива
        for (int i = 1; i < values.length; i++) {
            tail.next = new Node(values[i], null);
            tail = tail.next;
        }
    }

    /**
     * Возвращает строку со всеми элементами списка
     * (циклический перебор).
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node ref = head;
        while (ref != null) {
            sb.append(ref.value).append(" ");
            ref = ref.next;
        }
        return sb.toString().trim();
    }

    /**
     * Добавление элемента в начало (AddFirst).
     */
    public void AddFirst(int value) {
        head = new Node(value, head);
    }

    /**
     * Добавление элемента в конец (AddLast).
     */
    public void AddLast(int value) {
        if (head == null) {
            head = new Node(value, null);
            return;
        }
        Node ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = new Node(value, null);
    }

    /**
     * Вставка элемента в список по индексу (Insert).
     * index=0 => вставка в начало (аналогична AddFirst).
     */
    public void Insert(int index, int value) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Negative index");
        }
        if (index == 0) {
            AddFirst(value);
            return;
        }
        // Идём до узла, который ПРЕДШЕСТВУЕТ вставляемому
        Node ref = head;
        for (int i = 0; i < index - 1; i++) {
            if (ref == null) {
                throw new IndexOutOfBoundsException("Index > size");
            }
            ref = ref.next;
        }
        // Вставка нового узла между ref и ref.next
        ref.next = new Node(value, ref.next);
    }

    /**
     * Удаление первого элемента (RemoveFirst).
     */
    public void RemoveFirst() {
        if (head == null) return; // список уже пуст
        head = head.next;
    }

    /**
     * Удаление последнего элемента (RemoveLast).
     */
    public void RemoveLast() {
        if (head == null) return;        // пустой список
        if (head.next == null) {         // список из одного элемента
            head = null;
            return;
        }
        // Ищем предпоследний
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    /**
     * Удаление элемента по индексу (Remove).
     * index=0 => удаляем голову.
     */
    public void Remove(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Negative index");
        }
        if (index == 0) {
            RemoveFirst();
            return;
        }
        Node ref = head;
        for (int i = 0; i < index - 1; i++) {
            if (ref == null || ref.next == null) {
                throw new IndexOutOfBoundsException("Index >= size");
            }
            ref = ref.next;
        }
        // "Пропускаем" узел ref.next
        if (ref.next == null) {
            throw new IndexOutOfBoundsException("Index >= size");
        }
        ref.next = ref.next.next;
    }


    // ====================================
    // 2. МЕТОДЫ С ИСПОЛЬЗОВАНИЕМ РЕКУРСИИ
    // ====================================

    /**
     * createHeadRec(): Рекурсивный ввод с головы.
     * Каждый новый элемент массива ставится в голову списка
     * (в итоге получается та же логика, что и в createHead, но без цикла).
     */
    public void createHeadRec(int[] values) {
        head = null;
        createHeadRecHelper(values, values.length - 1);
    }

    // Рекурсивная функция, которая идёт с конца массива к началу
    private void createHeadRecHelper(int[] arr, int index) {
        if (index < 0) {
            return; // базовый случай
        }
        head = new Node(arr[index], head);
        createHeadRecHelper(arr, index - 1);
    }

    /**
     * createTailRec(): Рекурсивный ввод с хвоста.
     * Каждый следующий элемент массива добавляется в конец.
     * В итоге "головой" становится первый элемент массива, "хвост" – последний.
     */
    public void createTailRec(int[] values) {
        head = createTailRecHelper(values, 0);
    }

    // Рекурсивная функция, которая идёт от 0 к arr.length-1
    // и формирует связанный список
    private Node createTailRecHelper(int[] arr, int index) {
        if (index >= arr.length) {
            return null;
        }
        Node newNode = new Node(arr[index], null);
        newNode.next = createTailRecHelper(arr, index + 1);
        return newNode;
    }

    /**
     * toStringRec(): Рекурсивный вывод списка.
     */
    public String toStringRec() {
        return toStringRecHelper(head).trim();
    }

    // Рекурсивная помощь: если node == null, возвращаем пустую строку
    private String toStringRecHelper(Node node) {
        if (node == null) {
            return "";
        }
        return node.value + " " + toStringRecHelper(node.next);
    }

}
