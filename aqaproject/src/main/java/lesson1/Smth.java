package lesson1;

import java.util.Arrays;

public class Smth {
    public static void main(String[] args) {
        str1(3, 2);
        str1("Hello!");
        for (int i = 0; i < 4; i++) {
            str1("Smth");
        }
        String a = "JAAAAVA";
        reve(a);

        int arr1 [] = {1,2,5,1,10,3};
        String str2 [] = {"n", "a", "c", "b"};
        seredynaMasyvu(arr1);
        maxMinAvg(arr1);

        //Arrays.sort(arr1);
        //System.out.println("Метод сорт " + Arrays.toString(arr1));

        bubbleSort(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[arr1.length-1]);
        Arrays.sort(str2);
        System.out.println(Arrays.toString(str2));
    }

    public static void str1(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);
    }

    public static void str1(String str) {
        System.out.println(str);
    }
    public static void bubbleSort(int [] arr){
        for (int i= arr.length-1; i>0; i--){
            for (int j =0; j<i;j++){
                if (arr[j]>arr[j+1]){
                    int tmp = arr [j];
                    arr[j] = arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        System.out.println("Метод бульбашки " + Arrays.toString(arr));
    }
    public static void seredynaMasyvu(int [] arr){
        int a = arr.length / 2;
        System.out.println(arr[a]);
    }
    public static void maxMinAvg(int [] arr){
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            if(max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];
        }
        for ( int i = 0; i<arr.length; i++){
            sum += arr[i];

        }
        int avg = sum/arr.length;
        System.out.println("max: "+ max);
        System.out.println("min: "+ min);
        System.out.println("avg: "+ avg);
        System.out.println("sum: "+ sum);
    }
    public static void reve(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
    }
}


