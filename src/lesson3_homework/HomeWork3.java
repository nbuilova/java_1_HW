package lesson3_homework;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {
    static Random random = new Random();

    public static void main(String[] args) {

        int[] arr = getRandomArrBinary(random.nextInt(10) + 1);
        System.out.println(Arrays.toString(arr));
        inversionArrItem(arr);


        System.out.println(Arrays.toString(fillArrOrdinal(100)));


        int[] mass = getRandomArr(10,7);
        System.out.println(Arrays.toString(mass));
        doubleArrItem(mass, 6);
        int[] mass1 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        doubleArrItem(mass1,6);


        drawArrDiagonal(9);


        System.out.println(Arrays.toString(getArrWithInitialValue(10,1)));


        int[] mass2 = getRandomArr(10, 100);
        System.out.println(Arrays.toString(mass2));
        getMaxArrItem(mass2);
        getMinArrItem(mass2);


        int[] mass3 = new int[]{2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(mass3));
        int[] mass4 = new int[]{1, 1, 1, 2, 1};
        System.out.println(checkBalance(mass4));

        moveArrItem(mass3,5);
    }

    public static void inversionArrItem(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.printf("%-3d", arr[i]);
        }
    }

    public static int[] getRandomArrBinary(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }
        return arr;
    }

    public static int[] fillArrOrdinal(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static int[] getRandomArr(int size, int range) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(range);
        }
        return arr;
    }

    public static void doubleArrItem(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < number) {
                arr[i] *= 2;
            }
            System.out.printf("%-3d", arr[i]);
        }
    }

    public static void drawArrDiagonal(int size) {
        int[][] square = new int[size][size];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                if ((i == j) || (i + j == square.length - 1)) {
                    square[i][j] = 1;
                }
                System.out.printf("%-3d", square[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] getArrWithInitialValue(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    public static void getMaxArrItem(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.printf("Max - %d", max);
    }

    public static void getMinArrItem(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.printf("Min - %d", min);
    }

    public static boolean checkBalance(int[] arr) {
        int left = arr[0];
        int sum = Arrays.stream(arr).sum();
        int right = sum - left;
        for (int i = 1; i < arr.length; i++) {
            left += arr[i];
            right = sum - left;
            if (right == left) {
                break;
            }
        }
        return (right == left);
    }

    public static void moveArrItem(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            for (int j = arr.length - 1; j > 0 ; j--) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
