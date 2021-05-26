import java.util.Scanner;
class salesMan
{
	String sname;
	String scode;
	int samount;
	double commission;
	void readData()
	{
		Scanner.out.println("name:");
		sname=dp.nextLine();
		System.out.println("scode");
		scode=dp.nextLine();
		System.out.println("amount");
		amount=dp.nextLine();
	
	}
	
	void calculatecommision()
	{
		if(samount < 2000)
			commission=0.07*samount;
		else if (samount <= 5000)
			commission=0.10*samount;
		else if(samount >5000)
			commission=0.12*samount;
	}

	void display()
	{
		System.out.println("salesman name:"+ sname);
		System.out.println("sales amount:"+samount);
		System.out.println("commission"+commission);
	}
}
class Salesmans
{
	public static void main(String args[])
	{
		Salesman s1=new Salesman();
		s1.readData();
		s1.calculateCommission();
		s1.display();
	}
}