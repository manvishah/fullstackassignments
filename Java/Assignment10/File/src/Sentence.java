import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Sentence {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		  BufferedReader br = new BufferedReader(new FileReader(new File("read.txt")));
		    PrintWriter pw = new PrintWriter(new FileWriter(new File("sentence")));
		    String line = null;
		    System.out.println("Converting first letter of sentence to Upper Case");
		    if((line = br.readLine()) != null){
		    	
			        pw.write(line.substring(0, 1).toUpperCase()+line.substring(1));
		    }
		    else{
		    	 pw.write(line.substring(0, 1).toUpperCase()+line.substring(1));
		    }
		    pw.close();
		    br.close();
		    
		    
		    
		
	}

}
