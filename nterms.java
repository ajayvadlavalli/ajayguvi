import java.util.*;

import java.lang.*;

import java.io.*;

import java.math.*;

class Ideone

{

public static void main (String[] args) throws java.lang.Exception

	{

		Scanner h = new Scanner (System.in);

		int n = h.nextInt();

		int a = h.nextInt();

		int d = h.nextInt();

		int m=0,k=0;

		for (int i=1;i<=n;i++)

		  {

			m = a+(i-1)*d;

			k = k+m;

		  }

		  System.out.println(k);

	}

}
