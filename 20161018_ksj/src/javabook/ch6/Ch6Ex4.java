package javabook.ch6;

import java.util.Scanner;

public class Ch6Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("PATH :"+System.getenv("PATH"));
		System.setProperty("user", "hong");
		System.out.println("user : "+System.getProperty("user"));
		System.out.println("종료하려면 x를 누르세요");
		
		while(true){
			if(scanner.next().equals("x")){
				System.out.println("program exit");
				System.exit(0);
			}
			else
				System.out.println("again input");
		}

	}

}
