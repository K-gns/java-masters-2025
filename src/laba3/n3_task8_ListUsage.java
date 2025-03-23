package laba3;

public class n3_task8_ListUsage {
    public static void main(String[] args) {

        // Создаём объект нашего списка
        n3_task8_ListClass myList = new n3_task8_ListClass();

        // 1) Создание списка (ЦИКЛ) с головы
        myList.createHead(new int[]{1, 2, 3, 4});
        System.out.println("После createHead (cycle): " + myList.toString());

        // 2) Добавление в начало
        myList.AddFirst(100);
        System.out.println("После AddFirst(100): " + myList);

        // 3) Добавление в конец
        myList.AddLast(999);
        System.out.println("После AddLast(999): " + myList);

        // 4) Вставка элемента в позицию 2
        myList.Insert(2, 777);
        System.out.println("После Insert(2, 777): " + myList);

        // 5) Удалить первый
        myList.RemoveFirst();
        System.out.println("После RemoveFirst(): " + myList);

        // 6) Удалить последний
        myList.RemoveLast();
        System.out.println("После RemoveLast(): " + myList);

        // 7) Удалить элемент на позиции 2
        myList.Remove(2);
        System.out.println("После Remove(2): " + myList);


        // -----------------------------------------
        // 8) Рекурсивный ввод с головы
        myList.createHeadRec(new int[]{10, 20, 30});
        System.out.println("После createHeadRec: " + myList.toStringRec());

        // 9) Рекурсивный ввод с хвоста
        myList.createTailRec(new int[]{100, 200, 300});
        // Рекурсивный вывод
        System.out.println("После createTailRec: " + myList.toStringRec());

    }
}
