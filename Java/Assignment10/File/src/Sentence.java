
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Sentence {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 PrintWriter pw = new PrintWriter(new FileWriter(new File("sentence")));
		    System.out.println("Converting first letter of words in sentence to Upper Case");
		    	try ( BufferedReader br = new BufferedReader(new FileReader(new File("read.txt")));) {
		        String line;
		        while ((line = br.readLine()) != null) {
		            char[] chars = line.toCharArray();
		            for (int i = 0; i < chars.length; i++) {
		                if (i == 0 || chars[i - 1] == ' ') {
		                    chars[i] = Character.toUpperCase(chars[i]);
		                }
		            }
		            System.out.println(new String(chars));
		            pw.write(chars);
		        }
		        }
		    pw.close();
		    
		    
	        }
	        
		    
		
	}


