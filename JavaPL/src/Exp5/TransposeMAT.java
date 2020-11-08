/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp5;

import java.util.*;

/**
 *
 * @author Student
 */
public class TransposeMAT
{

    static int MAX = 100;

    public static void main(String[] args) 
    {
        int i, j, row, col;
        int A[][] = new int[MAX][MAX];
        int B[][] = new int[MAX][MAX];
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of rows in Matrix A: ");
        row = s.nextInt();
        System.out.print("Enter no. of columns in Matrix A: ");
        col = s.nextInt();
        System.out.println("***Enter Matrix A***");
        for (i = 0; i < row; i++) {
            System.out.println("Enter row"+(i+1));
            for (j = 0; j < col; j++) 
            {
                A[i][j] = s.nextInt();
                
            }
        }
        System.out.println("Transpose of Matrix A is:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                B[i][j] = A[j][i];
                System.out.print(B[i][j]+" ");
            }System.out.println();
        }
    }
}
