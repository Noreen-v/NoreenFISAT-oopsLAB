import java.io.*;
import java.util.Scanner;
class Complexno
{
  int real;
  int imaginary;
  void read()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the real no:");
    real=sc.nextInt();
    System.out.println("enter the imaginary no:");
    imaginary=sc.nextInt();

  }
  void display()
  {
    System.out.println(real+"+"+imaginary+"i");
  }
  Complexno addComplexno(Complexno c)
  {
    Complexno d=new Complexno();
    d.real=real+c.real;
    d.imaginary=imaginary+c.imaginary;
    return(d);
  }
}
class Complexdemo
{
 public static void main(String args[])
 {
  Complexno c1=new Complexno();
  Complexno c2=new Complexno();
  Complexno c3=new Complexno();
  c1.read();
  c2.read();
  c1.display();
  c2.display();
  System.out.println("--------------");
  c3=c2.addComplexno(c1);
  c3.display();
 }
}
