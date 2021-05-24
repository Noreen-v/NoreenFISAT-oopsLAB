import java.io.*;
import java.util.Scanner;
class Matrix
{
  int m,n;
  int mat[][]=new int[10][10];
  void readMatrix()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the row size:");
    m=sc.nextInt();
    System.out.println("enter the column size:");
    n=sc.nextInt();
    System.out.println("enter the matrix:");
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        mat[i][j]=sc.nextInt();
      }

    }

  }
  void display(Matrix a,Matrix b)
  {
    if(a.m==b.m && a.n==b.n)
   {
    System.out.println("Matrix addition:----------------------");
    for(int i=0;i<a.m;i++)
    {
      for(int j=0;j<a.n;j++)
      {
        System.out.print(a.mat[i][j]+b.mat[i][j]+" ");
      }
      System.out.println();
    }
   }
   else
   {
     System.out.println("invalid matrices...!");
   }

  }


}
class Matrixdemo
{
  public static void main(String[] args)
  {
    Matrix a1=new Matrix();
    Matrix b1=new Matrix();
    System.out.println("First Matrix:---------------------");
    a1.readMatrix();
    System.out.println("Second Matrix:--------------------");
    b1.readMatrix();
    b1.display(a1,b1);
  }
}
