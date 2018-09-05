package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaTwo {
    //Для массива из задачи 1 вычислить среднее арифметическое элементов. Вывести результат на экран.
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner inn = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("введите целое число");
            nums[i] = inn.nextInt();
        }
        double srednee = 0;
        if (nums.length > 0) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            srednee = sum / nums.length;
            System.out.println(srednee + "среднее арифметическое элементов массива");
        }
    }
}


