package assignment;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

class MatrixPro {
	ArrayList<Integer> row = new ArrayList<Integer>() ;

}

public class MatrixMultiplication2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedInputStream br = new BufferedInputStream(new FileInputStream("m3x4"));
				ByteArrayOutputStream out = new ByteArrayOutputStream();) {
			byte[] buf = new byte[24]; 
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
