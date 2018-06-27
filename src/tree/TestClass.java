package tree;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TestClass {
	  public static void main(String args[] ) throws Exception {  
		  System.setIn(new FileInputStream("C:\\Users\\ramshank1\\git\\PracticeByPractice\\src\\sample-input.txt"));
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  String name = br.readLine();           
		  
	  }
}
