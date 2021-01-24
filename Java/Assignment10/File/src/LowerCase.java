import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class LowerCase{
public static void main(String[] args) throws Exception {
	  BufferedReader br = new BufferedReader(new FileReader(new File("read.txt")));
	    PrintWriter pw = new PrintWriter(new FileWriter(new File("lower")));
	    String line = null;
	    System.out.println("Converting to lowercase");
	    while((line = br.readLine()) != null){
	        pw.write(line.toLowerCase());
	    }
	    pw.close();
	    br.close();
}
}
