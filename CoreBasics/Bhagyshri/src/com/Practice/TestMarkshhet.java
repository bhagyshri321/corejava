package com.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarkshhet {
	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet();
		 m1.setFname("Meha");
		 m1.setLname("Singh");
		 m1.setRollno("1");
		 m1.setMath (45);
		 m1.setPhy(45);
		 
		 Marksheet m2 = new Marksheet();
		 m2.setFname("SNeha");
		 m2.setLname("Sin");
		 m2.setRollno("5");
		 m2.setMath (45);
		 m2.setPhy(45);
		 
		 Marksheet m3 = new Marksheet();
		 m3.setFname("Aary");
		 m3.setLname("Dev");
		 m3.setRollno("4");
		 m3.setMath (45);
		 m3.setPhy(45);
		 
		 Marksheet m4 = new Marksheet();
		 m4.setFname("Meha");
		 m4.setLname("Gupta");
		 m4.setRollno("3");
		 m4.setMath (45);
		 m4.setPhy(45);
		 
		 Marksheet m5 = new Marksheet();
		 m5.setFname("Fun");
		 m5.setLname("Jat");
		 m5.setRollno("2");
		 m5.setMath (45);
		 m5.setPhy(45);
		 
		 
		 ArrayList a = new ArrayList ();
		 a.add(m1);
		 a.add(m2);
		 a.add(m3);
		 a.add(m4);
		 a.add(m5);
		 
		Collections.sort(a , new TestComparator ());
		
		Iterator it = a.iterator();
		while (it.hasNext()) {
		Marksheet m = (Marksheet)it.next();
		
		System.out.println(  m.getRollno() + " " + m.getFname()+ " " + m.getLname() + " " +  
				m.getMath()+ " " + m.getPhy());
	}

}}
