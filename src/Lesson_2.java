public class Lesson_2 {
    public static void main(String[] args) {
        checkSumSign(2, 3);
        System.out.println(checkSumSign(2, 3));
        System.out.println();
        checkSignNumber1(7);
        System.out.println();
        checkSignNumber2(-7);
        System.out.println(checkSignNumber2(-7));
        System.out.println();
        printText(5, "Строка текста");
        System.out.println();
        visocosnyYear(2024);
        System.out.println(visocosnyYear(2024));
        System.out.println();
        arrayOne();
        System.out.println();
        System.out.println();
        arrayTwo();
        System.out.println();
        System.out.println();
        arrayThree();
        System.out.println();
        System.out.println();
        arrayFour();
        System.out.println();
        System.out.println();
        arrayFive(5, 10);
    }

    public static boolean checkSumSign(int a, int b)
    { if ((a+b)>=10&&(a+b)<=20)
        return true;
        else
        return false;
    }

    public static void checkSignNumber1(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static boolean checkSignNumber2(int a) {

        if (a <= 0)
        return true;
        else
            return false;
    }

    public static void printText(int a, String b) {
        if (a >= 0) {
            for(int i = 0; i < a; ++i) {
                System.out.println(b);
            }
        } else {
            System.out.println("Введенное вами число - меньше либо равно 0");
        }

    }

    public static boolean visocosnyYear(int a) {
        if ((a >= 0)&&(a % 400 == 0))
            return true;
        else
        {
            if ((a >= 0) && ((a % 4 == 0) & (a % 100 != 0)))
                return true;
            else return false;

        }


    }

    public static void arrayOne() {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        int i;
        for(i = 0; i < arr.length; ++i) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        for(i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void arrayTwo() {
        int[] arr = new int[100];

        int i;
        for(i = 0; i < arr.length; ++i) {
            arr[i] = i + 1;
        }

        for(i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void arrayThree() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        int i;
        for(i = 0; i < arr.length; ++i) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }

        for(i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void arrayFour() {
        int[][] arr = new int[10][10];
        int i = 0;

        int j;
        for(j = 0; i < 10 && j < 10; ++j) {
            arr[i][j] = 1;
            ++i;
        }

        i = 0;

        for(j = 9; i < 10 && j >= 0; --j) {
            arr[i][j] = 1;
            ++i;
        }

        for(i = 0; i < 10; ++i) {
            for(j = 0; j < 10; ++j) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }

    public static void arrayFive(int len, int initialValue) {
        int[] arr = new int[len];

        int i;
        for(i = 0; i < arr.length; ++i) {
            arr[i] = initialValue;
        }

        for(i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }
}
