package com.grayMatter.Arrays;

public class TwoDimenArray {
public static void main(String[] args) {
	int mat1[][]={ { 1, 1, 1 },
            { 2, 2, 2 },
            { 3, 3, 3 }};
	
	int mat2[][]={ { 1, 1, 1 },
            { 2, 2, 2 },
            { 3, 3, 3 }};
	
	int row1=mat1.length;
	int row2=mat2.length;
	int col1=mat1[0].length;
	int col2=mat2[0].length;
	
	
	int mat3[][]=new int[row1][col2];
	for(int i=0;i<row1;i++)
	{
		for(int j=0;j<col2;j++)
		{
			for(int k=0;k<row2;k++) {
				mat3[i][j]+=mat1[i][k]*mat2[k][j];
			}
		}
	}
	
	for (int i = 0; i < mat3.length; i++) {
        for (int j = 0; j < mat3[0].length; j++)
            System.out.print(mat3[i][j] + " ");

        System.out.println();
    }
}
}
