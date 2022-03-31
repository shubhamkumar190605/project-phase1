package com.Mphasis.FileCreation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList; 

public class Project {
	public static void genaretFile(String fileName) throws IOException   {
		String path="P:\\project\\";
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<>();
		while(true) {
		System.out.println("enter the file name to create");
		String filename=sc.next();
		String finalname=path+filename;
		System.out.println(finalname);

		//create a file 

		File f=new File(finalname);
		boolean b=f.createNewFile();
		if(b!=true) {
			System.out.println("the file not created");
		}
		else {
			al.add(filename);
			System.out.println("file created");
		}

		System.out.println("the collection of files is "+ al);
		}
		}
		
//Delete Function 

public static void deleteFile(String fileName) {
		String path="P:\\project\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name to be deleted");
		String filname=sc.next();
		String finalfile=path+filname;
		File file=new File(finalfile);
		file.delete();
		System.out.println("file deleted");

		}		

//Display File List...
public  static void displayFile()  {
		String path="P:\\project\\";
		File f=new File(path);
		File filename[]=f.listFiles();
		for(File ff:filename) {
			System.out.println(ff.getName());
		}
		}
//Searching Function 
public static void serchFile(String serchingFileName) {
		String path="P:\\project\\";
		File f=new File(path);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name to search");
		String filsearchname=sc.next();
		File filename[]=f.listFiles();
		int flag=0;
		for(File ff:filename) {
			if(ff.getName().equals(filsearchname)) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}

		if(flag==1) {
			System.out.println("found the file");
		}
		else {
			System.out.println("file is not found");
		}
}
//Main Method Start
		public static void main(String[] args) throws IOException {
			Scanner scanner =new Scanner(System.in); 
					boolean c=true; 
			 		
					while(c) { 
		System.out.println("--******-------******--------Welcome in Mphasis LookMe.com-----******-------*******----"); 
		System.out.println("Hey user If you want Retrive File.. : Press 1"); 
		System.out.println("Hey user If you want Enter in Business LevelOp- : Press 2"); 
	System.out.println("Hey user If you want to cloase the System press 3"); 
	System.out.println(); 
	boolean b=true; 
	int x=scanner.nextInt(); 
switch (x) { 
case 1:{ 
       displayFile(); 
	 System.out.println(); 
	  break; 
	} 
	 case 2:  
		{	while(true)
		
		{ 
	System.out.println("Hey user What You Want?"); 
	System.out.println(); 
	System.out.println("Hey user If you want to Create File : Press 1"); 
	System.out.println("Hey user If you want to Delete File : Press 2"); 
	System.out.println("Hey user If you want to Search File : Press 3"); 
	System.out.println("Hey user If you want to go Main Menu Press 4"); 
	System.out.println(); 
	int i=scanner.nextInt(); 
		if(i<=0 || i>=6) {		 
		System.out.println("wow  you not enter valid number....  "); 
	     System.out.println(); 
			 			 }
		else{ 
			  if(i==1){ 
			  System.out.println("Enter the File Name for Create"); 
			 									 
			 String  FileForCreate=scanner.next(); 
			 genaretFile(FileForCreate); 
			 System.out.println(); 
			 									 
	} 
	  else if(i==2) { 
	 System.out.println("Enter the File Name for Delete"); 
	 String FileForDelete=scanner.next(); 
	   deleteFile(FileForDelete); 
	    System.out.println(); 
	} 
	  else if(i== 3) { 
	  System.out.println("Enter the File Name for Serching"); 
			 									 
	 String FileForSerching=scanner.next(); 
	  serchFile(FileForSerching); 
	   System.out.println(); 
	} 
	   else if(i==4) { 
	    System.out.println("Welcome in Main menu,.........."); 
	     System.out.println(); 
		  break; 
		} 
								 
		  } 
												 
				} 
			 		break; 
			            	} 
			 			 
		case 3:{ 
		System.out.println("System closse..."); 
		 c=false; 
		  break; 
		
		} 
			 			}  			 
			 		}
		}
}
