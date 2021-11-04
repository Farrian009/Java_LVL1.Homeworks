import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {
        System.out.println("Task 2.1");

        //"Задайте массив"
        int[] arr = {0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0};
        changenumbers(arr);
        System.out.print(Arrays.toString(arr));
        System.out.println();

        System.out.println("Task 2.2");

        int[] arr2 = new int[8];
        fillarray(arr2);
        System.out.print(Arrays.toString(arr2));
        System.out.println();

        System.out.println("Task 2.3");

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        doublearray(arr3);
        System.out.print(Arrays.toString(arr3));
        System.out.println();

        System.out.println("Task 2.4");

        int[][] twoArr = new int[5][5];
        filldiagonal(twoArr);
        System.out.println();

        System.out.println("Task 2.5");

        int[] arr4 = {1, 20, -3, 2, 15, 4, 5, -9, 3, 8, 9, 0};
        minmax(arr4);

        System.out.println();

        System.out.println("Task 2.6");

        int[] nums = {1, 2, 3, 6};
        balance(nums);

        System.out.println("checkBalance() → sum_left ");

            }

    static void changenumbers(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == 0) {
                 arr[i] = 1;
             } else
                 arr[i] = 0;
         }
    }

    static void fillarray(int[] arr2) {
        for (int b = 0; b < arr2.length; b++) {
            arr2[b] = b * 3;
            }
    }

    static void doublearray(int[] arr3) {
        for (int c = 0; c < arr3.length; c++) {
            if (arr3[c] < 6) {
                arr3[c] = arr3[c] * 2;
            }
        }
    }

    static void filldiagonal(int [][] twoArr) {
        for (int l = 0; l < twoArr.length; l++) {
            for (int h = 0; h < twoArr[l].length; h++) {
                if (h == twoArr[l].length - l - 1)
                    twoArr[l][h] = 1;
            }
        }
        for (int l = 0; l < twoArr.length; l++) {
            for (int h = 0; h < twoArr[l].length; h++) {
                if (h == l)
                    twoArr[l][h] = 1;
            }
        }
        for (int l = 0; l < twoArr.length; l++) {
            for (int h = 0; h < twoArr[l].length; h++) {
                System.out.print(twoArr[l][h] + " ");
            }
            System.out.println();
        }
    }
    static  void minmax (int [] arr4) {
        int min = arr4[0];
        int max = arr4[0];
        for (int n = 0; n < arr4.length; n++) {
            if (arr4[n] < min) {
                min = arr4[n];
            }
            if (arr4[n] > max) {
                max = arr4[n];
            }
        }
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
    }

        static boolean balance(int[] nums) {
            int sum_left = 0;
            for (int z = 0; z < nums.length; z++) {
                sum_left += nums[z];
                int sum_right = 0;
                for (int y = (z + 1); y < nums.length; y++) {
                    sum_right += nums[y];
                }
                if (sum_left == sum_right) {
                    return true;
                }
            }
            return false;
        }

}