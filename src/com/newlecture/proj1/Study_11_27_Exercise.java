package com.newlecture.proj1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Study_11_27_Exercise {
	public static void main(String[] args) throws IOException {
		char ch = 'H';
		FileOutputStream fout = new FileOutputStream("res/ex02.txt");
		fout.write(ch);
		fout.write('e');
		fout.write('l');
		fout.write('l');
		fout.write('o');
		fout.flush();
		fout.close();
		
		FileOutputStream fout2 = new FileOutputStream("res/ex03.txt");
		PrintStream ps = new PrintStream(fout2);
		ps.println("Hello Hi Hi"); /*070 8677 0348*/
	}
}
