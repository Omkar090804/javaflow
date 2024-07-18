Addition of 2D arrays

/*public class array2D {
    public static void main(String[] args) {
        int arr1[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},};
        int arr2[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},};
        int arr3[][] = new int[5][5];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/
  Multiplication 
public class array2D {
    public static void main(String[] args) {
        int arr1[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},};
        int arr2[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},};
        int arr3[][] = new int[5][5];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr3[i][j] = 0;
                for (int k = 0; k < arr1[i].length; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
