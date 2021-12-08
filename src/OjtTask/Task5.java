package OjtTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.OutputStream;
import java.net.URL;
import java.util.Properties;
import java.util.Scanner;

import javax.swing.text.Document;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit.Parser;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Task5 {

	public static void main(String[] args) throws Exception {
		String text = "emp.html";
		StringBuilder contentBuilder = new StringBuilder();
		try {
		    BufferedReader in = new BufferedReader(new FileReader("E:\\sada\\OJTExample\\src\\OjtTask\\emp.html"));
		    String str;
		    while ((str = in.readLine()) != null) {
		        contentBuilder.append(str);
		       
		    }
		    in.close();
		} catch (IOException e) {
		}
		System.out.print(contentBuilder);
		System.out.println();
	}
	
}
