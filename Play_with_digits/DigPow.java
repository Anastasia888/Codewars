package exampleLessons;

import java.util.ArrayList;
import java.util.List;

public class DigPow {
	public static long digPow(int n, int p) {
		 int sum = 0;
		 
		 String number = Integer.toString(n);
		 char[] charArray = number.toCharArray();
		 List<Integer> list = new ArrayList<Integer>();
		 for (int i = 0; i<charArray.length; i++){
			 int c = Character.getNumericValue(charArray[i]);
			 list.add(c);
			 sum +=(int)(Math.pow(list.get(i),p+i));			 
			 if(sum%n==0) {
			 return sum/n; 
		 }
    }
   return -1;
	}
}
