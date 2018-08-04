package threads;
// Below is a completed program that uses brute force to crack a 9-digit password. 
// On average, the program takes about 0.125 seconds to find the password.
// Your goal is to re-write the algorithm using Threads. Try to shorten the time it takes 
// to find the code to be as little as possible.
// Let's see who can crack the code the fastest!

import java.net.StandardSocketOptions;

// Pro-tip: Do not include the creation of the threads as part of the time. 

import java.util.Random;

public class BruteForceCracker {
	static long code = (long)(new Random().nextDouble() * 1_000_000_000);
	static long startTime;
	static long endTime;
	static float elapsedTime;
	static long finale = 0;
	
	public static void main(String[] args) {
		String s = 	Long.toString(code);
		Thread one = new Thread(()->{
			long c = Integer.parseInt(Character.toString(s.charAt(0)));
			finale += c*=100000000;
			System.out.println(finale);
			});
		Thread two = new Thread(()->{
			long c = Integer.parseInt(Character.toString(s.charAt(1)));
			finale += c*=10000000;
			System.out.println(finale);
			});
		Thread three = new Thread(()->{
			long c = Integer.parseInt(Character.toString(s.charAt(2)));
			finale += c*=1000000;
			System.out.println(finale);
			});
		Thread four = new Thread(()->{
			long c = Integer.parseInt(Character.toString(s.charAt(3)));
			finale += c*=100000;
			System.out.println(finale);
			});
		Thread five = new Thread(()->{
			long c = Integer.parseInt(Character.toString(s.charAt(4)));
			finale += c*=10000;
			System.out.println(finale);
			});
		Thread six = new Thread(()->{
			long c = Integer.parseInt(Character.toString(s.charAt(5)));
			finale += c*=1000;
			System.out.println(finale);
			});
		Thread seven = new Thread(()->{
			long c = Integer.parseInt(Character.toString(s.charAt(6)));
			finale += c*=100;
			System.out.println(finale);
			});
		Thread eight = new Thread(()->{
			long c = Integer.parseInt(Character.toString(s.charAt(7)));
			finale += c*=10;
			System.out.println(finale);
			});
		Thread nine = new Thread(()->{
			long c = Integer.parseInt(Character.toString(s.charAt(8)));
			finale += c*=1;
			System.out.println(finale);
			});
		
		System.out.println("Starting Brute Force Checker");
		System.out.println(code);
		startTime = System.currentTimeMillis();
		while(!checkCode(finale)) {
			one.run();
			two.run();
			three.run();
			four.run();
			five.run();
			six.run();
			seven.run();
			eight.run();
			nine.run();
		}
		endTime = System.currentTimeMillis();
		elapsedTime = (float)(endTime - startTime);
		elapsedTime /= 1000.f;
		System.out.println("Total time taken: " + elapsedTime + " seconds");
	}

	public static boolean checkCode(long p){
		if(p == code){
			return true;
		}else{
			return false;
		}
	}
}

