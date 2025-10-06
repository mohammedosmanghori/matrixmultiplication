import java.util.*;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for matrix m : ");
        int rows1 = sc.nextInt();
        System.out.print("Enter the number of columns for matrix m : ");
        int cols1 = sc.nextInt();
        int[][] matrix1 = new int [rows1][cols1];
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the number of rows for matrix n : ");
        int rows2 = sc.nextInt();
        System.out.print("Enter the number of columns for matrix n : ");
        int cols2 = sc.nextInt();
        if(cols2!=rows1){
            System.out.println("Matrix multiplication is not possible! ");
            return;
        }
        int [][] matrix2 = new int [rows2][cols2];
        for(int i=0;i<rows2;i++){
            for(int j=0;j<cols2;j++){
                matrix2[i][j]= sc.nextInt();
            }
        }
        int [][] matrix3 = new int [rows1][cols2];
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols2;j++){
                matrix3[i][j] = 0;
                for(int k=0;k<cols1;k++){
                    matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
                } 
            }

        }
        System.out.println("The resultant matrix is : ");
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols2;j++){
                System.out.print(matrix3[i][j] + " ");

            }
            System.out.println();

        }

        }

    }

            

        
    

