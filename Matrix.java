import java.util.Scanner;
 
public class MatrixCreation
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter The Number Of Rows");
         
        int row = sc.nextInt();
         
        System.out.println("Enter The Number Of Columns");
         
        int cols = sc.nextInt();
         
        //defining 2D array to hold matrix data
         
        int[][] matrix = new int[row][cols];
         
        System.out.println("Enter Matrix Data");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
         
        System.out.println("Your Matrix is : ");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
             
            System.out.println();
        }
    }
}



import java.util.Scanner;
 
public class MatrixAddition
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter The Number Of Rows");
         
        int row = sc.nextInt();
         
        System.out.println("Enter The Number Of Columns");
         
        int cols = sc.nextInt();
         
        int[][] matrix1 = new int[row][cols];
         
        int[][] matrix2 = new int[row][cols];
         
        int[][] sum = new int[row][cols];
         
        System.out.println("Enter The Data For First Matrix :");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }
         
        System.out.println("Enter The Data For Second Matrix :");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }
         
        System.out.println("First Matrix = ");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix1[i][j]+"\t");
            }
             
            System.out.println();
        }
         
        System.out.println("Second Matrix = ");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix2[i][j]+"\t");
            }
             
            System.out.println();
        }
         
        System.out.println("Sum = ");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                 
                System.out.print(sum[i][j]+"\t");
            }
             
            System.out.println();
        }
    }
}




import java.util.Scanner;
 
public class MatrixSubtraction
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter The Number Of Rows");
         
        int row = sc.nextInt();
         
        System.out.println("Enter The Number Of Columns");
         
        int cols = sc.nextInt();
         
        int[][] matrix1 = new int[row][cols];
         
        int[][] matrix2 = new int[row][cols];
         
        int[][] sub = new int[row][cols];
         
        System.out.println("Enter The Data For First Matrix :");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }
         
        System.out.println("Enter The Data For Second Matrix :");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }
         
        System.out.println("First Matrix = ");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix1[i][j]+"\t");
            }
             
            System.out.println();
        }
         
        System.out.println("Second Matrix = ");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix2[i][j]+"\t");
            }
             
            System.out.println();
        }
         
        System.out.println("Subtraction = ");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                sub[i][j] = matrix1[i][j] - matrix2[i][j];
                 
                System.out.print(sub[i][j]+"\t");
            }
             
            System.out.println();
        }
    }
}


import java.util.Scanner;
 
public class MatrixMultiplication
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter The Number Of Rows In First Matrix");
         
        int rowsInFirst = sc.nextInt();
         
        System.out.println("Enter The Number Of Columns In First Matrix / Rows In Second Matrix");
         
        int colsInFirstRowsInSecond = sc.nextInt();
         
        System.out.println("Enter The Number Of Columns In Second Matrix");
         
        int colsInSecond = sc.nextInt();
         
        int[][] matrix1 = new int[rowsInFirst][colsInFirstRowsInSecond];
         
        int[][] matrix2 = new int[colsInFirstRowsInSecond][colsInSecond];
         
        int[][] product = new int[rowsInFirst][colsInSecond];
         
        System.out.println("Enter The Data For First Matrix :");
         
        for (int i = 0; i < rowsInFirst; i++)
        {
            for (int j = 0; j < colsInFirstRowsInSecond; j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }
         
        System.out.println("Enter The Data For Second Matrix :");
         
        for (int i = 0; i < colsInFirstRowsInSecond; i++)
        {
            for (int j = 0; j < colsInSecond; j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }
         
        System.out.println("First Matrix = ");
         
        for (int i = 0; i < rowsInFirst; i++)
        {
            for (int j = 0; j < colsInFirstRowsInSecond; j++)
            {
                System.out.print(matrix1[i][j]+"\t");
            }
             
            System.out.println();
        }
         
        System.out.println("Second Matrix = ");
         
        for (int i = 0; i < colsInFirstRowsInSecond; i++)
        {
            for (int j = 0; j < colsInSecond; j++)
            {
                System.out.print(matrix2[i][j]+"\t");
            }
             
            System.out.println();
        }
         
        System.out.println("Product = ");
         
        for (int i = 0; i < rowsInFirst; i++)
        {
            for (int j = 0; j < colsInSecond; j++)
            {
                for (int k = 0; k < colsInFirstRowsInSecond; k++)
                {
                    product[i][j] +=  matrix1[i][k] * matrix2[k][j];
                }
            }
        }
         
        for (int i = 0; i < rowsInFirst; i++)
        {
            for (int j = 0; j < colsInSecond; j++)
            {
                System.out.print(product[i][j]+"\t");
            }
             
            System.out.println();
        }
    }
}

import java.util.Scanner;
 
public class MatrixTranspose
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter The Number Of Rows");
         
        int rows = sc.nextInt();
         
        System.out.println("Enter The Number Of Columns");
         
        int cols = sc.nextInt();
         
        int[][] matrix = new int[rows][cols];
     
        int[][] transpose = new int[cols][rows];
         
        System.out.println("Enter The Data For Matrix :");
         
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
         
        System.out.println("Your Matrix is :");
         
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
             
            System.out.println();
        }
         
        System.out.println("Transpose of Matrix is :");
         
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                transpose[j][i] = matrix[i][j];
            }
        }
         
        for (int i = 0; i < cols; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                System.out.print(transpose[i][j]+"\t");
            }
             
            System.out.println();
        }
    }
}