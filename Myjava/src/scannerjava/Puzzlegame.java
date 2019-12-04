package scannerjava;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Puzzlegame {
	

	public static void main(String[] args)
	{
	
	
	   

		  try {
			  FileReader file = new FileReader("D:\\questions.txt");
			    BufferedReader reader = new BufferedReader(file);
			  Scanner scanner = new Scanner(reader);
			  Random rand=new Random();
		   // Check if there is another line of input
		   while(scanner.hasNextLine())
		   { 
		    String str = scanner.nextLine();
		    parseLine(str);
		   }
		   file.close();
           reader.close();
           scanner.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
		  
	}	 
		
	
	Scanner keyboardInput= new Scanner(System.in);
    String answer1=keyboardInput.nextLine();

	private static void parseLine(String str) {

		
		 String ques=null,op1,op2,op3,op4,ans=null;
		  Scanner sc = new Scanner(str);
		  sc.useDelimiter(",");

		  // Check if there is another line of input
		  while(sc.hasNext()){
		  
		   ques= sc.next();	  
		   op1 = sc.next();
		   op2 = sc.next();
		   op3 = sc.next();
		   op4 = sc.next();
		   ans = sc.next();
		   System.out.println(ques+"\n1."+op1+"\t2."+op2+"\n3."+op3+"\t\t4."+op4);  
		  }
		  Scanner keyboardInput= new Scanner(System.in);
		    String answer1=keyboardInput.nextLine();
		    
		    if(answer1.equals(ans)){
		    	
		    	System.out.println("correct answer");
		    }
		    	else {
		    	System.out.println("Wrong Answer");
		    	System.exit(0);
		    	
		    }
		  sc.close();
	}
}
		  
	  
	

