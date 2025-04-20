package LearningJava;

import java.util.Scanner;

public class PowerOfAny {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int base = in.nextInt();
		int raisedPower = in.nextInt();
		int ans=power(base,raisedPower);
		System.out.println(base+"^"+raisedPower+"="+ans);
		in.close();

	}
	public static int power(int base,int raisedPower) {
		if(raisedPower!=0) {
			return base*power(base,raisedPower-1);
		}
		else {
			return 1;
		}
	}

}
