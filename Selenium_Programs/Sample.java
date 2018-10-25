package Selenium_Programs;
import java.util.Scanner;

public class Sample {
	static Scanner sc=new Scanner(System.in);
   public static void main(String[] args)
   {
	   System.out.print("Enter the data to search for:");
	   String data=sc.nextLine();
	   Google g = null;
	   
	   if(data.equalsIgnoreCase("All"))
		   g=new Images();
	   else if(data.equalsIgnoreCase("Images"))
		   g=new Images();
	   else if(data.equalsIgnoreCase("Maps"))
  	       g=new Maps();
	      
  	       g.search("Karna");
	   }
   }

interface Google
{
	void search(String data);
}
class All implements Google
{
	public void search(String data)
	{
		System.out.println("Connect to All DB get info of ==>"+data);
	}
}
class Images implements Google
{
	public void search(String data)
	{
		System.out.println("Connect to Images DB get info of ==>"+data);
	}
}
class Maps implements Google
{
	public void search(String data)
	{
		System.out.println("Connect to Maps DB get info of ==>"+data);
	}
}

