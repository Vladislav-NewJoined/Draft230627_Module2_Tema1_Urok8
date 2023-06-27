package lessons.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Random;
import java.util.stream.Stream;

public class Draft1_Task2_1_8 {

    //        Пример _ ППППППППППППППППППППППППППППППППППП
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10, отфильтруйте их " +
                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
                "\n\nРешение: ");
        int[] array = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Исходный массив: ");
        IntStream.of(array).forEach(a -> System.out.print(a + " "));
        System.out.println(); // Это перенос строки

        Random random = new Random();
        System.out.println("Создаём потоковый массив рандомных чисел в количестве 20 чисел, отфильтровываем " +
                "\nиз него положительные числа, сортируем по возрастанию и выводим на печать:  ");
        IntStream s = random.ints(20, -10, 10);
        s.filter((a) -> a > 0).sorted().forEach(a -> System.out.print(a + " "));
        System.out.println(); // Это перенос строки

    }
}
    //        Конец Примера _ КККККККККККККККК







//    //        Пример 15 ППППППППППППППППППППППППППППППППППП Сделано кроме сортировки
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10, отфильтруйте их " +
//                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
//                "\n\nРешение: ");
//        int[] array = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        IntStream.of(array).forEach(a -> System.out.print(a + " "));
//        System.out.println(); // Это перенос строки
//
//        Random random = new Random();
//        IntStream s = random.ints(10, -10, 10);
//        s.filter((a) -> a > 0).forEach(a -> System.out.print(a + " "));
//        System.out.println(); // Это перенос строки
//
//    }
//}
//    //        Конец Примера 15 КККККККККККККККК







//    //        Пример 14 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10, отфильтруйте их " +
//                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
//                "\n\nРешение: ");
//        int[] array = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        IntStream.of(array).forEach(a -> System.out.print(a + " "));
//        System.out.println(); // Это перенос строки
//
//        Random random = new Random();
//        random.ints(10,-10,10).forEach(a -> System.out.print(a + " "));
//    }
//}
//    //        Конец Примера 14 КККККККККККККККК







//    //        Пример 13 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10, отфильтруйте их " +
//                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
//                "\n\nРешение: ");
//        int[] array = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//
//        IntStream.of(array).forEach(a -> System.out.print(a + " "));
//        System.out.println(); // Это перенос строки
//        // Делаем фильтр и печатаем
////        IntStream.of(array).filter((a) -> a > 0).forEach(a -> System.out.print(a + " "));
//        /*System.out.println(); // Это перенос строки*/
//
//        Random random = new Random();
////        List <Integer> intList = random.ints(5, -5, 5)
////                .boxed()
////                .collect(Collectors.toList());
////        System.out.println(intList);
//
//        random.ints(10,-10,10).forEach(a -> System.out.print(a + " "));
//
//
//        /*IntStream  s = IntStream.of(array).filter((a) -> a > 0).peek(System.out::println);
//        System.out.println(s.sum());*/
//
//    }
//}
//    //        Конец Примера 13 КККККККККККККККК







//    //        Пример 12 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10, отфильтруйте их " +
//                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
//                "\n\nРешение: ");
//        int[] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
//
//
//        IntStream.of(array).forEach(a -> System.out.print(a + " "));
//        System.out.println(); // Это перенос строки
//        // Делаем фильтр и печатаем
//        IntStream.of(array).filter((a) -> a > 0).forEach(a -> System.out.print(a + " "));
//        System.out.println(); // Это перенос строки
//
//        Random random = new Random();
//        List <Integer> intList = random.ints(5, -5, 5)
//                .boxed()
//                .collect(Collectors.toList());
//        System.out.println(intList);
//
//        random.ints(10,-10,10).forEach(a -> System.out.print(a + " "));
//
//
//
//        /*IntStream  s = IntStream.of(array).filter((a) -> a > 0).peek(System.out::println);
//        System.out.println(s.sum());*/
//
//    }
//}
//    //        Конец Примера 12 КККККККККККККККК







//    //        Пример 11 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10, отфильтруйте их " +
//                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
//                "\n\nРешение: ");
//        int[] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
//        /*int summary = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 0) {
//
//
//            summary += array[i];
//            *//*System.out.print(array[i] + " "); // это я дописал*//*
//            }
//        }*/
//        /*System.out.println(summary);*/  // Это первая 15
//
//        /*System.out.println(IntStream.of(array).filter((a) -> a > 0).sum());*/ // Это вторая 15
//        IntStream.of(array).forEach(a -> System.out.print(a + " "));
//        System.out.println(); // Это перенос строки
//        // Делаем фильтр и печатаем
//        IntStream.of(array).filter((a) -> a > 0).forEach(a -> System.out.print(a + " "));
//        System.out.println(); // Это перенос строки
//
//        /*System.out.println("Возвращаем IntStream и в отдельной сроке печатаем сумму, " +
//                "\nтогда срабатывает промежуточный peek");// Возвращаем IntStream и в отдельной сроке печатаем сумму
//        IntStream  s = IntStream.of(array).filter((a) -> a > 0).peek(System.out::println);
//        System.out.println(s.sum());*/
//
//        Random random = new Random();
//        // Пишет массив random только из положительных чисел
//        /*IntStream.generate(() -> random.nextInt(10)).limit(10).forEach(a -> System.out.print(a + " "));*/
//
//
//
//    }
//}
//    //        Конец Примера 11 КККККККККККККККК







//    //        Пример 10 ППППППППППППППППППППППППППППППППППП Фильтруем, без random и без sort
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10, отфильтруйте их " +
//                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
//                "\n\nРешение: ");
//        int[] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
//        int summary = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 0) {
//
//
//            summary += array[i];
//            /*System.out.print(array[i] + " "); // это я дописал*/
//            }
//        }
//        System.out.println(summary);
//
//        System.out.println(IntStream.of(array).filter((a) -> a > 0).sum());
//        IntStream.of(array).forEach(a -> System.out.print(a + " "));
//        System.out.println();
//        IntStream.of(array).filter((a) -> a > 0).forEach(a -> System.out.print(a + " "));
//
//
//    }
//}
//    //        Конец Примера 10 КККККККККККККККК







//    //        Пример 9 ППППППППППППППППППППППППППППППППППП Нахождение суммы из Урока 7
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10, отфильтруйте их " +
//                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
//                "\n\nРешение: ");
//        int[] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
//        int summary = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 0) {
//
//
//            summary += array[i];
//            /*System.out.print(array[i] + " "); // это я дописал*/
//            }
//        }
//        System.out.println(summary);
//
//        System.out.println(IntStream.of(array).filter((a) -> a > 0).sum());
//
//
//    }
//}
//    //        Конец Примера 9 КККККККККККККККК







//public class Draft1_Task2_1_8 {
//
//    //        Пример 8 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10, отфильтруйте их " +
//                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
//                "\n\nРешение: ");
//
//        int[] array = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        /*IntStream.of(array)*/
//        IntStream.of(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//            .forEach(a -> System.out.print(a + " "));
//        System.out.println();
//
//        Random random = new Random();
//
//        List<Integer> intList = random.ints(10, -10, 10)
//                .boxed()
//                .collect(Collectors.toList());
//
//        System.out.println(intList);
//
//
//
////        List<Integer> intList = new Random().ints(10, -10, 10)
////                .boxed()
////                .collect(Collectors.toList());
////
////        System.out.println(intList);
//
//    }
//}
//    //        Конец Примера 8 КККККККККККККККК







//    //        Пример 7 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10, отфильтруйте их " +
//                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
//                "\n\nРешение: ");
//
//        int[] array = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        /*IntStream.of(array)*/
//        IntStream.of(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//            .forEach(a -> System.out.print(a + " "));
//        System.out.println();
//
//        Random random = new Random();
//
//        List<Integer> intList = random.ints(10, -10, 10)
//                .boxed()
//                .collect(Collectors.toList());
//
//        System.out.println(intList);
//
//
//
////        List<Integer> intList = new Random().ints(10, -10, 10)
////                .boxed()
////                .collect(Collectors.toList());
////
////        System.out.println(intList);
//
//    }
//}
//    //        Конец Примера 7 КККККККККККККККК







//    //        Пример 6 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10, отфильтруйте их " +
//                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
//                "\n\nРешение: ");
//
//        int[] array = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        IntStream.of(array)
//            .forEach(a -> System.out.print(a + " "));
//        System.out.println();
//
//        Random random = new Random();
//        IntStream.rangeClosed(-10, 10).forEach(a -> System.out.print(a + " "));
//        System.out.println();
//        IntStream.generate(() -> random.nextInt(10)).limit(10).forEach(a -> System.out.print(a + " "));
//    }
//}
//    //        Конец Примера 6 КККККККККККККККК







//    //        Пример 5 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10, отфильтруйте их " +
//                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
//                "\n\nРешение: ");
//
//        int[] array = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        IntStream.of(array)
//            .forEach(a -> System.out.print(a + " "));
//        System.out.println();
//
//        /*IntStream intStream = IntStream.generate(()->random.nextInt());*/
//
//            /*.filter(a -> a > 0)
//            .peek(a -> System.out.println("Filtered value: " + a*//* + " "*//*))
//            .map(a -> a * a)
//            .peek(a -> System.out.println("Mapped value: " + a))
//            .sum();*/
//
//        Random random = new Random();
//
//
////        Random random = new Random();
////        IntStream intStream = IntStream.generate(()->random.nextInt(10)).limit(10);
////        intStream.filter((a) -> a >= -10).filter((a) -> a <= 10).forEach(System.out::println);
//
////        System.out.println(IntStream.of(array).filter((a) -> a > 0).peek(System.out::println));
////        System.out.println(IntStream.of(array).filter((a) -> a > 0).peek(System.out::println));
//
//    }
//
//    private static int random(int[] array) {
//        return 0;
//    }
//}
//    //        Конец Примера 5 КККККККККККККККК







////        Пример 4 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10,отфильтруйте их " +
//                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
//                "\n\nРешение: ");
//
//        /*int[] array = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};*/
//
//        IntStream.of(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//            .filter(a -> a > 0)
//            .peek(a -> System.out.println("Filtered value: " + a/* + " "*/))
//            .map(a -> a * a)
//            .peek(a -> System.out.println("Mapped value: " + a))
//            .sum();
//
//
////        Random random = new Random();
////        IntStream intStream = IntStream.generate(()->random.nextInt(10)).limit(10);
////        intStream.filter((a) -> a >= -10).filter((a) -> a <= 10).forEach(System.out::println);
//
////        System.out.println(IntStream.of(array).filter((a) -> a > 0).peek(System.out::println));
////        System.out.println(IntStream.of(array).filter((a) -> a > 0).peek(System.out::println));
//
//    }
//}
////        Конец Примера 4 КККККККККККККККК







//    //        Пример 3 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10,отфильтруйте их " +
//                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
//                "\n\nРешение: ");
//
//        int[] array = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
////        Random random = new Random();
////        IntStream intStream = IntStream.generate(()->random.nextInt(10)).limit(10);
////        intStream.filter((a) -> a >= -10).filter((a) -> a <= 10).forEach(System.out::println);
//
//        System.out.println(IntStream.of(array).filter((a) -> a > 0).peek(System.out::println));
//        System.out.println(IntStream.of(array).filter((a) -> a > 0).peek(System.out::println));
//
//    }
//}
//    //        Конец Примера 3 КККККККККККККККК







//    //        Пример 2 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10,отфильтруйте их " +
//                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
//                "\n\nРешение: ");
//
//        int[] array = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        Random random = new Random();
//        IntStream intStream = IntStream.generate(()->random.nextInt(10)).limit(10);
//        intStream.filter((a) -> a >= -10).filter((a) -> a <= 10).forEach(System.out::println);
//    }
//}
//    //        Конец Примера 1 КККККККККККККККК







