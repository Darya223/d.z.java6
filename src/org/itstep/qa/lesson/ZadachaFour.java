package org.itstep.qa.lesson;

public class ZadachaFour {
    //Напишите программу, выводящую количество нулевых элементов в заданном целочисленном массиве.
    //Массив можно задать любым удобным способом
    public static void main(String[] args) {
        int[] nums = {0, 0, 8, 13, 1, 3, 0};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count++;
        }
        System.out.println("колличество нулевых элементов в массиве равно" + count);
    }
}

