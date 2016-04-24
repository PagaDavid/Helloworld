import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class TestIO implements Runnable{

	private final static String inputIO = "FILE_INPUT";
	
	private final static String outputIO = "FILE_OUTPUT";
		
	private final static String outputIOBest = "FILE_OUTPUT_BEST";
	
	public TestIO(){
		System.out.println("Starting test ...");
	}
	
	public void run(){
		rawByteIO();
	}
	
	/*private void rawByteIO(){ 
	
	try {
		FileInputStream fis = new FileInputStream(inputIO);
		FileOutputStream fos = new FileOutputStream(outputIO);
		
		int byte_read;
		while ((byte_read = fis.read()) != -1){

			//System.out.println("byte_read");
			
			fos.write(byte_read);
							
		}
					
		fis.close();
		fos.close();
	}
	catch(IOException e){
		e.printStackTrace();
	}
	
	
	
}*/

public void ByteIO(){ 	
	/*try{
		BufferedReader br = new BufferedReader(new FileReader(inputIO));
		FileWriter fw = new FileWriter(outputIOBest);
		
		/*String line;
		
		while ((line = br.readLine()) != null){
			//System.out.println(line);
			
			fw.write(line + "\n");
		}*/
		
		/*int byte_line;
		while ((byte_line = br.read()) != -1){
			//System.out.println(byte_line);
			
			fw.write(byte_line);
		}
		
		br.close();
		fw.close();
	}
	catch(IOException ex){
		ex.printStackTrace();
	}*/
	
	
	try {
		FileInputStream fis = new FileInputStream(inputIO);
		FileOutputStream fos = new FileOutputStream(outputIO);
		
		int byte_read;
		while ((byte_read = fis.read()) != -1){

			//System.out.println(byte_read);
			
			fos.write(byte_read);
							
		}
					
		fis.close();
		fos.close();
	}
	catch(IOException e){
		e.printStackTrace();
	}
	
}

public void rawByteIO(/*boolean raw_byte*/){ 

//if (raw_byte){

try {
	FileInputStream fis = new FileInputStream(inputIO);
	FileOutputStream fos = new FileOutputStream(outputIO);
	
	int byte_read;
	while ((byte_read = fis.read()) != -1){

		//System.out.println("1");
		
		fos.write(byte_read);
						
	}
				
	fis.close();
	fos.close();
}
catch(IOException e){
	e.printStackTrace();
}
///////////////////////////////////////////

/*try{
	BufferedReader br = new BufferedReader(new FileReader(inputIO));
	FileWriter fw = new FileWriter(outputIOBest);
	
	/*String line;
	
	while ((line = br.readLine()) != null){
		//System.out.println(line);
		
		fw.write(line + "\n");
	}*/
	
	/*int byte_line;
	while ((byte_line = br.read()) != -1){
		//System.out.println(byte_line);
		
		fw.write(byte_line);
	}
	
	br.close();
	fw.close();
}
catch(IOException ex){
	ex.printStackTrace();
}*/

//////////////////////////////////////////

/*}
else {
	try{
		BufferedReader br = new BufferedReader(new FileReader(inputIO));
		FileWriter fw = new FileWriter(outputIOBest);
		
		String line;
		
		while ((line = br.readLine()) != null){
			//System.out.println(line);
			
			fw.write(line + "\n");
		}
		
		/*int byte_line;
		while ((byte_line = br.read()) != -1){
			//System.out.println(byte_line);
			
			fw.write(byte_line);
		}*/
		
		/*br.close();
		fw.close();
	}
	catch(IOException ex){
		ex.printStackTrace();
	}
}*/
}

}


