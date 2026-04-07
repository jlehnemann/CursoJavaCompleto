package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas da nova matriz: ");
        int m = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o número de colunas da nova matriz: ");
        int n = sc.nextInt();
        sc.nextLine();


        int[][] matrix = new int[m][n];

        for (int i=0; i< matrix.length; i++) {
            System.out.println("Digite os " + n + " números da " + (i+1) + "a linha, separados por espaços:");
            for (int j=0; j< matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        System.out.print("Digite um número pertencente à matriz: ");
        int x = sc.nextInt();


        while(!xBelongsToMatrix(x, matrix)) {
            System.out.println("Você digitou um número que não pertence à matriz, tente novamente");
            System.out.println("Digite um número pertencente à matriz: ");
            x = sc.nextInt();
        }

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("Position " + i + ", " + j + ":");
                    if (j-1>=0) {
                        System.out.println("Left: " + matrix[i][j-1]);
                    }
                    if (j+1<n) {
                        System.out.println("Right: " + matrix[i][j+1]);
                    }
                    if (i-1>=0){
                        System.out.println("Up: " + matrix[i-1][j]);
                    }
                    if (i+1<m) {
                        System.out.println("Down: " + matrix[i+1][j]);
                    }

                }
            }

        }

        sc.close();
    }

    public static boolean xBelongsToMatrix (int x, int[][] matrix) {

        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                if (matrix[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

}



