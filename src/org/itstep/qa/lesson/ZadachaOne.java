package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaOne {
    //Объявить массив целых чисел длиной 10 элементов.Ввести значения для элементов массива с клавиатуры,
    // сделать проверку правильности ввода элемента типа Integer, если элемент введен неправильно – дать возможность повторить его ввод.
    //Вывести массив на экран.
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner inn = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("введите 10 целых чисел");
            if (inn.hasNextInt()) {
                nums[i] = inn.nextInt();
            } else {
                System.out.println("это не число. повторите ввод");
                inn.nextLine();
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + "мой массив");
        }
    }
}



