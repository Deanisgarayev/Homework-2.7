import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
    public static void main(String[] args) {
        task1();
        space();
        task2();
        space();
        task3();
        space();
        task4();
    }

    public static void space() {
        System.out.print(" ");
    }
//    Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
//    Код должен работать с любой последовательностью и объемом списка чисел.
    public static void task1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num);
            }
        }
    }
    public static void task2() {
//        Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
        Collections.sort(nums);
        int prevNum= Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                prevNum = num;
                System.out.print(num);
            }
        }
    }
    public static void task3() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.print(uniqueWords);
//        Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
    }
    public static void task4() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.print(words.size() - uniqueWords.size());
//        Напишите код, который выводит в консоль количество дублей для каждого уникального слова.
    }
}
