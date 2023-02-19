package Arraypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Array1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int a[];
		a = new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		//System.out.println(a[1]);
		
		
		int arr1[]=new int[3];
		int ctr=10;
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=ctr;
			ctr=ctr+10;
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		 
	}

}
