/package lab3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static int mass[];
    private static Random rnd = new Random();
    
    public static void main(String[] args) {
        mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt(100);
        }

        System.out.printf("Task 1 :\nInput Array = %s\n", Arrays.toString(mass));
        System.out.printf("Array is sorted = %b\n",task1(mass));

        int[] testFirstArray = {1, 2, 3};
        System.out.printf("Array %s is sorted = %b\n", Arrays.toString(testFirstArray), task1(testFirstArray));

        int[] testSecondArray = {3, 2, 1};
        System.out.printf("Array %s is sorted = %b\n", Arrays.toString(testSecondArray), task1(testSecondArray));

        System.out.printf("\t\tTask 2 : \nInput Array = %s\n", Arrays.toString(mass));
        System.out.printf("Output Array = %s\n", task2(mass));

        testSecondArray = new int[] {4, 5, 6};
        System.out.printf("\t\tTask 3 : \nFist Array = %s\nSecond Array = %s\nResult Array = %s\n",
                Arrays.toString(testFirstArray), Arrays.toString(testSecondArray),
                Arrays.toString(task3(testFirstArray, testSecondArray)));
    }

    public static boolean task1(int[] arr) {
        int up = 0, down = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) down++;
            if (arr[i] < arr[i+1]) up++;
        }
        return ((Math.abs(down-up) == arr.length-1));
    }

    public static String task2(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            for(int j = i; j > 0 && arr[j-1] > arr[j]; j--) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
        return Arrays.toString(arr);
    }

    public static int[] task3(int fistArray[], int secondArray[]) {
        int[] outArray = new int[fistArray.length + secondArray.length];
        int i = 0, j = 0;
        for (int k = 0; k < outArray.length; k++) {
            if (i > fistArray.length-1) {
                int a = secondArray[j];
                outArray[k] = a;
                j++;
            }
            else if (j > secondArray.length-1) {
                int a = fistArray[i];
                outArray[k] = a;
                i++;
            }
            else if (fistArray[i] < secondArray[j]) {
                int a = fistArray[i];
                outArray[k] = a;
                i++;
            }
            else {
                int b = secondArray[j];
                outArray[k] = b;
                j++;
            }
        }
        return outArray;
    }
}