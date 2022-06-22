package fff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class werw {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String now = sc.nextLine();
		String then ="";
		String b = null;
		char sp;
		int z = 0;
		ArrayList<Character> fast = new ArrayList<Character>();
	for(int i =now.length()-1;i>=0;i--) {
		if(z>=0) {
		fast.add(z, now.charAt(i));
		z++;
	}
		
	}

	for (Character character : fast) {
		System.out.print(character);
		
	}
		for(int i = now.length()-1;i>=0;i--) {
			sp = now.charAt(i);
			then = then+sp;
		}
		//System.out.println(then);
		StringBuffer buff = new StringBuffer(now);
		//StringBuffer reverse = buff.reverse();
		//System.out.println(reverse);
		//ReverseString sca = new ReverseString();
		
	}
}
