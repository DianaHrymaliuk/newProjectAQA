package lesson6;

public class Main {
    public static void main(String[] args) {
        String[][] arr1 = new String[][]{{"3", "4", "6", "7"}, {"3", "7", "6", "7"},
                {"3", "4", "6", "9"}, {"3", "4", "6", "9"}};
        String[][] arr2 = new String[][]{{"3", "bla-bla", "6", "7"}, {"3", "7", "6", "7"},
                {"3", "4", "6", "9"}, {"3", "4", "6", "9"}};
        String[][] arr3 = new String[][]{{"3", "4", "6", "7", "6"}, {"3", "7", "6", "7"},
                {"3", "4", "6", "9"}, {"3", "4", "0", "9"}};
        try {
            System.out.println("Cумма елементов массива равна "+ ex(arr1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Cумма елементов массива равна "+ ex(arr2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Cумма елементов массива равна "+ ex(arr3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int ex(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int res = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr.length; j++) {
                try {
                    res += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return res;
    }

    private static class MyArraySizeException extends Exception {
        public MyArraySizeException() {
            super("Неверный размер массива");
        }
    }
    private static class MyArrayDataException extends Exception {
        public MyArrayDataException(int i, int j) {
            super("Неверный формат данных елемента массива: строка: " + i + ", столбец: " + j);
        }
    }
}
