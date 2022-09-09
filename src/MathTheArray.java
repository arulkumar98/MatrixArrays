import java.util.Scanner;

public class MathArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr1 = new int[2][];
        int[][] arr2 = new int[2][];
        System.out.print("Enter the 2D array :");
        for (int row = 0; row < arr1.length; row++) {
            for(int col=0 ; col < arr1[0].length; col++){
                arr1[row][col] = input.nextInt();
            }
            System.out.println(); // new line
        }
        for (int row = 0; row < arr1.length; row++) {
            for(int col=0 ; col < arr1[0].length; col++){
                arr2[row][col] = input.nextInt();
            }

            System.out.println();
        }
        int[][] result = new int[arr1[0].length][arr2.length];

        if((arr1[0].length) == arr2.length){
            for(int row = 0;row < arr1.length;row++){
                for(int col = 0;col < arr2[0].length;col++){
                    result[row][col] = 0;
                    for(int i=0;i < arr1[0].length;i++){
                        result[row][col] += arr1[row][i] * arr2[i][col];
                    }
                }
            }
        }
        else System.out.println("Mission Impossible");

        for(int row = 0;row < arr1.length;row++){
            for(int col = 0;col < arr1[0].length;col++)
                System.out.print(result[row][col]+" ");
            //new array
            System.out.println();
        }
    }
}
