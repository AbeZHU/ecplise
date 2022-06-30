package fff;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {

	 public static void main(String[] args) {
		int m =2;
		int n =3;
		m=m^n;
		n=m^n;
		m=m^n;
		System.out.println(m);
		System.out.println(n);
	}
}
