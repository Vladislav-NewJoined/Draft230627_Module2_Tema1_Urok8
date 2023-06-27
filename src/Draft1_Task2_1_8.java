import java.util.Random;
import java.util.stream.IntStream;

public class Draft1_Task2_1_8 {
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10,отфильтруйте их " +
                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
                "\n\nРешение: ");

        Random random = new Random();
        IntStream intStream = IntStream.generate(()->random.nextInt(10)).limit(10);
        intStream.filter((a) -> a >= -10).filter((a) -> a <= 10).forEach(System.out::println);
    }
}