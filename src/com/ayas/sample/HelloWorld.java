package com.ayas.sample;

/**
 * @author Ayaskant Swain
 * @since 27th-April-2015
 * <br><br>
 * My first GitHub java code
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World !!!. This is my first code in GitHub repo.");
		
		if(args.length > 0) {
			System.out.println("Printing program arguments");
			for(String str : args)
				System.out.println(str);
		
		System.out.println("Bye see you soon.");	
		}

	}
}
