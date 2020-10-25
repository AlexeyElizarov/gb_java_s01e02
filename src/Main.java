import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        boolean toCheck = false;
        
        // Задание 1
        print("Задание 1");
        doTask1();

        // Задание 2
        print("\nЗадание 2");
        doTask2();

        // Задание 3
        print("\nЗадание 3");
        doTask3();

        // Задание 4
        print("\nЗадание 4");
        doTask4();

        // Задание 5
        print("\nЗадание 5");
        doTask5();

        // Задание 6
        print("\nЗадание 6");
        int[] arr1 = {1, 1, 1, 2, 1}; // -> True
        int[] arr2 = {1, 1, 1, 2, 1}; // -> True
        int[] arr3 = {1, 0, 1, 2, 1}; // -> False
        print(Boolean.toString(doTask6(arr1)));
        print(Boolean.toString(doTask6(arr2)));
        print(Boolean.toString(doTask6(arr3)));

        // Задание 7
        print("\nЗадание 7");

        int[] arr4 = {1, 2, 3, 4};
        int n = 5;

        for (int i = -n; i <= n; i++) {
            print(i + ": " + Arrays.toString(doTask7(Arrays.copyOf(arr4, arr4.length), i)));
        }
    }

    public static int[] doTask7(int[] array, int n) {
        // **** Написать метод, которому на вход подается одномерный массив и число n
        // (может быть положительным, или отрицательным),
        // при этом метод должен сместить все элементы массива на n позиций.
        // Для усложнения задачи нельзя пользоваться вспомогательными массивами.


        int increment = 0;
        int i = 0;
        int size = array.length;

        if (n != 0) {
            increment = n / Math.abs(n);
        }

        if (increment < 0) {
            i = size;
        }

        while (i != n) {
            int temp = array[size - 1];
            for (int j = size - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
            i += increment;
        }
        return array;
    }

    private static boolean doTask6(int[] arr) {
        // ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true,
        // если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        // checkBalance([1, 1, 1, || 2, 1]) → true,
        // граница показана символами ||, эти символы в массив не входят.

        int sum_left = 0;

        for (int i = 0; i < arr.length; i++) {

            sum_left += arr[i];
            int sum_right = 0;

            for (int j = i + 1; j < arr.length; j++){
                sum_right += arr[j];
            }

            if (sum_left == sum_right) {
                return true;
            }
        }
        return false;
    }

    private static void doTask5() {
        // ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

        int[] arr = {1, 5, 3, 2, 11, -4, 5, 2, 4, 8, 9, 1};
        int max_val = arr[0];
        int min_val = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_val) {
                max_val = arr[i];
            }
            if (arr[i] < min_val) {
                min_val = arr[i];
            }
        }

        print(Arrays.toString(arr));
        print("Минимальное значение: " + min_val);
        print("Максимальное значение: " + max_val);

    }

    private static void doTask4() {
        // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int size = 10;
        int[][] square_arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    square_arr[i][j] = 1;
                }
            }
            print(Arrays.toString(square_arr[i]));
        }

    }

    private static void doTask3() {
        // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом
        // и числа меньшие 6 умножить на 2;

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        print("Исходный массив: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }

        print("Новый массив: " + Arrays.toString(arr));
    }

    private static void doTask1() {
        // Задание 1
        // Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        print("Исходный массив: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else {
                arr[i] = 0;}
        }

        print("Новый массив: " + Arrays.toString(arr));
    }

    private static void doTask2() {
        // Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int size = 8;
        int[] arr = new int[size];

        for (int i = 0; i < 8; i++) {
            arr[i] = i * 3;
        }

        print(Arrays.toString(arr));

    }

    private static void print(String text) {
        System.out.println(text);
    }
}
