package lesson1;

public class Algorithms {
    public static void main(String[] args) {
        int n = 100; // Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100;
        }

        double max = array[0]; // Массив не должен быть пустым
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg += array[i] / array.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);

        for (int i = 0; i < array.length; i++) { //Реализуйте алгоритм сортировки пузырьком для сортировки массива
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) { //Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
                                                // Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
            System.out.println(array[i]);
        }

        for(int i = 2; i <= 100; i ++){
            boolean isPrime = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
