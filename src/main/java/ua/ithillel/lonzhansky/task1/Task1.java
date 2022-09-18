package ua.ithillel.lonzhansky.task1;


// Задано метод, який приймає масив.
// Реалізувати підрахунок середнього арифметичного всіх елементів масиву та повернути результат.
// Якщо масив порожній, повернути 0.
// Якщо масив дорівнює null, повернути -1
public class Task1 {

    public static double getArithmeticMeanOfArrayElements(int[] array) {
        if (array == null) {
            return -1;
        }
        if (array.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }
}
