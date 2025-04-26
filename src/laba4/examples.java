package laba4;

class Example1 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
//            System.out.println("1");  //недостижимая строка
        } catch (RuntimeException e) {
            System.out.println("1  " + e);
        }
        System.out.println("2");
    }
}

class Example2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (Exception e) {
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }
}

class Example3 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
}

class Example4 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");
        } catch (Error e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
}

class Example5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        }
        System.out.println("2");
    }
}

class Example6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (ArithmeticException e) {
            System.out.println("2");
        } catch (RuntimeException e) {
            System.out.println("3");
        } catch (Exception e) {
            System.out.println("4");
        }
        System.out.println("5");
    }
}

class Example7 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("0");
                throw new NullPointerException("ошибка");
            } catch (NullPointerException e) {
                System.out.println("1");
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("2");
        }
        System.out.println("3");
    }
}

class Example8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        System.out.println(m());
    }
}

class Example9 {
    public static int m() {
        try {
            System.out.println("0");
            return 55;
        } finally {
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        System.out.println(m());
    }
}

class Example10 {
    public static int m() {
        try {
            System.out.println("0");
            return 15;
        } finally {
            System.out.println("1");
            return 20;
        }
    }
    public static void main(String[] args) {
        System.out.println(m());
    }
}

class Example11 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } finally {
            System.out.println("2");
        }
        System.out.println("3");
    }
}

class Example12 {
    public static void m(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }
    public static void main(String[] args) {
        m(null, 0.000001);
    }
}

class Example13 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            int h = 10 / l;
            args[l + 1] = "10";
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        }
    }
}

class Example14 {
    public static void m(int x) throws ArithmeticException {
        int h = 10 / x;
    }
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            m(l);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}
