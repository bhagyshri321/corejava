package com.InputOutput;

import java.io.File;

public class OnlyFiles {
	public static void main(String[] args) {
		File d = new File("C:\\Users\\hp\\Documents");
		String[] list= d.list();
		
		for(String o:list)
		{System.out.println(o);}
		
		for(int i=0; i<list.length;i++) { 
			File f1=new File("C:\\Users\\hp\\Documents",list[i]); 
		if(f1.isFile()) {
		  System.out.println(list[i]);
		  
		  }}}}


 