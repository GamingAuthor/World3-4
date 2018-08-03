package threads;
// Below is a completed program that uses brute force to crack a 9-digit password. 
// On average, the program takes about 0.125 seconds to find the password.
// Your goal is to re-write the algorithm using Threads. Try to shorten the time it takes 
// to find the code to be as little as possible.
// Let's see who can crack the code the fastest!

// Pro-tip: Do not include the creation of the threads as part of the time. 

import java.util.Random;

public class BruteForceCracker {
	static long code = (long)(new Random().nextDouble() * 1_000_000_000);
	static long startTime;
	static long endTime;
	static float elapsedTime;
	
	public static void main(String[] args) {
		int ctr = 0;
		Long.toString(code);
		code+=4;
		System.out.println(code);
		Thread brute = new Thread(()->{
			for(int i = 0; i <= 9; i++) {
				
			}
			});
		Thread force = new Thread(()->{
			for(int i = 0; i <= 9; i++) {

			}
			});
		Thread cracker = new Thread(()->{
			for(int i = 0; i <= 9; i++) {

			}
			});
		System.out.println("Starting Brute Force Checker");
		System.out.println(code);
		startTime = System.currentTimeMillis();
		while(!checkCode(ctr)) {
			for(int i = 0; i <=code; i++) {
				ctr=i;
			}
			System.out.println(checkCode(ctr));
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
	public static void variable(long ree) {
		if(ree == code) {
			
		} else {
		ree++; 
		}
	}
}
