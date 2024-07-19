package Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class MyFile {
	public static void main(String[] args) throws IOException {
		File file=new File("para.txt");
		
		FileWriter fw=new FileWriter(file);
		
		
		String str="Harsha Poojari Is the Boss\nHarsha Poojari joined the comany Graymatter\nHarsha POojari is ridiculous";
		for(char c:str.toCharArray())
			fw.write(c);
		fw.close();
		System.out.println(file);
		int count=0;
		
		FileReader fr=new FileReader(file);
		while(fr.read()!=-1)
			count++;
		
		
		int countWords=0;
		int ch;
		StringBuffer str1=new StringBuffer();
		while((ch=fr.read())!=-1)
		{
			str1.append((char)ch);
		}
		//System.out.println(str);
		StringTokenizer tokens=new StringTokenizer(str.toString());
		//System.out.println(tokens);
		while(tokens.hasMoreTokens())
		{
			tokens.nextToken();
			countWords++;
		}
		
		BufferedReader bf=new BufferedReader(fr);
	    System.out.println(bf.readLine());
		String line;
		int lineCount=0;
		while((line = bf.readLine()) != null)
		{
			System.out.println("Hey");
			System.out.println(line);
			lineCount++;
		}
		bf.close();
		fr.close();
		
		
		
		System.out.println("Chars="+count);
		System.out.println("Words="+countWords);
		System.out.println("Lines="+lineCount);
		System.out.println(line);
		
		
	}

}
