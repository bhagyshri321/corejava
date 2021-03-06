package com.CollectionFamework;

import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;

public class TestMarksheet {
	public static void main(String[] args) {

		Marksheet m1 = new Marksheet();
		m1.setRollno("5");
		m1.setFname("Neha");
		m1.setLname("Singh");
		m1.setChem(48);
		m1.setMaths(52);
		m1.setPhy(54);

		Marksheet m2 = new Marksheet();
		m2.setRollno("3");
		m2.setFname("Soha");
		m2.setLname("Son");
		m2.setChem(48);
		m2.setMaths(52);
		m2.setPhy(54);

		Marksheet m3 = new Marksheet();
		m3.setRollno("4");
		m3.setFname("Mira");
		m3.setLname("Wan");
		m3.setChem(48);
		m3.setMaths(52);
		m3.setPhy(54);

		Marksheet m4 = new Marksheet();
		m4.setRollno("1");
		m4.setFname("Chera");
		m4.setLname("Tau");
		m4.setChem(48);
		m4.setMaths(52);
		m4.setPhy(54);

		Marksheet m5 = new Marksheet();
		m5.setRollno("2");
		m5.setFname("Mira")
		;
		m5.setLname("Sen");
		m5.setChem(48);
		m5.setMaths(52);
		m5.setPhy(54);

		ArrayList a = new ArrayList();
		a.add(m1);
		a.add(m2);
		a.add(m3);
		a.add(m4);
		a.add(m5);

		Collections.sort(a, new  TestComparator());

		Iterator it = a.iterator();
		while (it.hasNext()) {
			Marksheet m = (Marksheet) it.next();

			System.out.println(m.getRollno() + " " + m.getFname() + " " + m.getLname() + " " + m.getMaths() + " "
					+ m.getChem() + " " + m.getPhy());

		}
	}
}
