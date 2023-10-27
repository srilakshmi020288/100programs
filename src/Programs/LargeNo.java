package Programs;

import java.util.Scanner;
import java.math.BigInteger;

public class LargeNo {
	public static void main(String[] args) {
		String a,b;
		System.out.println("Enter two Nos");
		Scanner scan = new Scanner(System.in);
			a=scan.nextLine();
			b=scan.nextLine();
		
	System.out.println("First No A:"+a+"Second No B:"+b);
		BigInteger x=new BigInteger(a);
		BigInteger y= new BigInteger(b);
		BigInteger c;
		c=x.add(y);
		System.out.println(c);
	}

}
