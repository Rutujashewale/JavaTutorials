import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class CheckedExceptionDemo{
	public static void main(String agrs[]){
	try{
	File file=new File("Demo.txt");
	BufferedReader br = new BufferedReader(new FileReader(file));
	String content;
	
	while ((content=br.readLine())!=null){
		System.out.println(content);
	}
	br.close();
 
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}
}

