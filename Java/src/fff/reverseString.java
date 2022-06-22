package fff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class reverseString {public static void main(String[] args) {
	

	Scanner sc  =  new Scanner(System.in);
	String xc = sc.nextLine();
	List<String> lol = new ArrayList<String>();
	char[]xx = xc.toCharArray();
	String dd ="";
	for(int i =xx.length-1;i>=0;i--) {
		dd=dd+xx[i];
	}
	System.out.println(dd);
	StringBuffer buff = new StringBuffer(dd);
	buff.reverse();
	buff.setLength(202);
	
	buff.append(xc);
	System.out.println(buff.reverse());
	
	String bb = "";
	for(int i = xc.length()-1;i>=0;i--) {
		bb= bb+xc.charAt(i);
		
	}
	
	System.out.println(bb);
}

	
}
