package org.itstep.qa.lesson;
import java.util.Scanner;
import java.util.Arrays;
public class ZadachaThree {
    //В массиве из задачи 1 поменять местами первый и последний элементы. Вывести массив на экран до замены и после замены.
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner inn = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("введите целое число");
            nums[i] = inn.nextInt();

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + "мой массив до замены");
        }
        for (int i = 0; i < nums.length; i++) {
            int c = nums[0];
            nums[0] = nums[9];
            nums[9] = c;
            for (i = 0; i < nums.length; i++) {
                System.out.println(nums[i] + "мой массив после замены");
            }
        }
    }
}