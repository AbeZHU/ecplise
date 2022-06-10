package scanner;
import java.util.Scanner;

public class ScannerClass {
    void Main() {
    
    	System.out.println("enter the id");
       	Scanner a =new Scanner(System.in);
	   	String x=a.nextLine();
	   	
	
	
	   	System.out.println("enter the Name");
	   	Scanner b = new Scanner(System.in);
	   	String y = b.nextLine();
	   	
	   	System.out.println("enter the Email");
	   	Scanner c = new Scanner(System.in);
	   	String z = c.nextLine(); 
	   	
	   	System.out.println("enter the phoneNo");	   	
	   	Scanner d= new Scanner(System.in);
	   	String q = d.nextLine();
	   	
	   	System.out.println("enter the salary");
	   	Scanner e= new Scanner(System.in);
	   	String w = e.nextLine();
	   	
	   	System.out.println("enter the Gender");
	   	Scanner f = new Scanner(System.in);
	   	String r = f.nextLine();
	   	
	   	System.out.println("enter the City");
	   	Scanner g = new Scanner(System.in);
	   	String t = g.nextLine();
	   	
	   	System.out.println("your id is " +x);
	  	System.out.println("your name is " +y);
	   	System.out.println("your email is " +z);
	   	System.out.println("your phoneno is "+q);
	   	System.out.println("the salary is "+w);
	   	System.out.println("Genser is "+r);
	   	System.out.println("city of employee is "+t);
	 	
	   	
    }
    public static void main(String[] args) {
		ScannerClass n = new ScannerClass();
		n.Main();
	}
	
}
