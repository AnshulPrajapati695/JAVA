import java.util.*;
public class TwoDArray{
    public static void main(String[] args){
        //Print the spiral order matrix as output for a given matrix of numbers. 
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of rows=");
        int rows=sc.nextInt();

        System.out.print("Enter number of columns=");
        int cols=sc.nextInt();

        int[][] matrix=new int[rows][cols];

        //input
        System.out.println("Enter elements of matrix:");
        //rows
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
                System.out.print("("+i+","+j+")=");
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Actual Matrix");
        //output
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //spiral order of matrix
        System.out.println("Spiral order of Matrix");
        int rowStart=0;
        int rowEnd=rows-1;
        int colStart=0;
        int colEnd=cols-1;
        while(rowStart <= rowEnd && colStart <= colEnd){
             //1
          for(int col=colStart; col<=colEnd; col++) {
              System.out.print(matrix[rowStart][col] + " ");
          }
          rowStart++;


          //2
          for(int row=rowStart; row<=rowEnd; row++) {
              System.out.print(matrix[row][colEnd] +" ");
          }
          colEnd--;


          //3
          for(int col=colEnd; col>=colStart; col--) {
              System.out.print(matrix[rowEnd][col] + " ");
          }
          rowEnd--;


          //4
          for(int row=rowEnd; row>=rowStart; row--) {
              System.out.print(matrix[row][colStart] + " ");
          }
          colStart++;


          System.out.println();


        }

        //For a given matrix of N x M, print its transpose
        System.out.println("Transpose Matrix");
        //output
        for(int i=0;i<cols;i++){
            //columns
            for(int j=0;j<rows;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}