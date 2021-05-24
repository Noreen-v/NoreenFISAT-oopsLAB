import java.io.*;
import java.util.Scanner;
class SymmetricMatrix
{
  int n;
  int mat[][]=new int[10][10];
  void readMatrix()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of rows & columns :");
    n=sc.nextInt();
    System.out.println("Enter the Matrix:-------------------------");
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        mat[i][j]=sc.nextInt();

      }
    }
  }
  void checkSymmetric()
  {
    int y=0;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(mat[i][j]!=mat[j][i])
        {
        y++;
        }
      }
    }
    if(y==0)
    {
      System.out.println("Matrix is Symmetric....!");
    }
    else
    {
      System.out.println("Matrix Not Symmetric....!");
    }
  }
}
class Symmetricdemo
{
  public static void main(String args[])
  {
    SymmetricMatrix a1=new SymmetricMatrix();
    a1.readMatrix();
    a1.checkSymmetric();

  }

}
