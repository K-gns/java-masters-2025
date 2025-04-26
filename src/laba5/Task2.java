package laba5;

import java.util.*;
import java.util.stream.*;

class Task2 {
    public static int[] filterEvenNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .toArray();
    }
}

class Task3 {
    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2).anyMatch(y -> y == x))
                .toArray();
    }
}

class Task4 {
    public static List<String> filterCapitalizedStrings(List<String> list) {
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}

class Task5 {
    public static List<Integer> squareNumbers(List<Integer> list) {
        return list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }
}

class Task6 {
    public static List<String> filterBySubstring(List<String> list, String substring) {
        return list.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}

class Task7 {
    public static List<Integer> divisibleByNumber(List<Integer> list, int divisor) {
        return list.stream()
                .filter(x -> x % divisor == 0)
                .collect(Collectors.toList());
    }
}

class Task8 {
    public static List<String> filterByLength(List<String> list, int minLength) {
        return list.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }
}

class Task9 {
    public static List<Integer> numbersGreaterThan(List<Integer> list, int value) {
        return list.stream()
                .filter(x -> x > value)
                .collect(Collectors.toList());
    }
}

class Task10 {
    public static List<String> filterOnlyLetters(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }
}

class Task11 {
    public static List<Integer> numbersLessThan(List<Integer> list, int value) {
        return list.stream()
                .filter(x -> x < value)
                .collect(Collectors.toList());
    }
}