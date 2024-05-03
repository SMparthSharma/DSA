public class Array_2D_clockwise_rotetion {
    static int[][] transpose(int arr[][]) {
        int[][] matrix = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                matrix[j][i] = arr[i][j];

            }
        }
        return matrix;

    }

    static int[][] array_revers(int tranArr[][]) {
        // int i = 0;
        // int j = tranArr[0].length - 1;
        System.out.println("dkgisdg");
        for (int k = 0; k < tranArr.length; k++) {System.out.println("dkgisdg");
        int i = 0;
        int j = tranArr[0].length - 1;
            // for (int l = 0; l < tranArr[k].length; l++) {//4
                while (i < j) {
                    int temp = tranArr[k][i];
                    tranArr[k][i] = tranArr[k][j];
                    tranArr[k][j] = temp;
                    i++;
                    j--;
                }
            // }
        }
        System.out.println("dkgisdg");
        return tranArr;
    }

    static void display(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("enter the lenght of array");
        int[][] my = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 10, 11 }, { 12, 13, 14, 15 }, { 16, 17, 18, 19 } };
        System.out.println("simple matrix");
        display(my);
        System.out.println("transpose matrix");
        my = transpose(my);
        display(my);
        my = array_revers(my);
        System.out.println("clock wise roteted matrix");
        display(my);

    }

}
