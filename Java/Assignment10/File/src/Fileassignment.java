import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Fileassignment {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("read.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          int ch;
        String line; 
        int countWord = 0;  
        int characterCount = 0; 
        while((line = reader.readLine()) != null) 
        { 
            if(line.equals("")) 
            { 
                
            } else { 
                characterCount += line.length(); 
                  
                // \\s+ is the space delimiter in java 
                String[] wordList = line.split("\\s+"); 
                 countWord += wordList.length; 
            
            } 
        } 
       
          
        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of characters = " + characterCount); 
       
	}



	}

