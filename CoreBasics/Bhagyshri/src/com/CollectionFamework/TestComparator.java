package com.CollectionFamework;

import java.util.Comparator;

public class TestComparator implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o, Marksheet o1) {
		
           
	 if (o.getFname()==o1.getFname())
     {
			
			return o.getLname().compareTo(o1.getLname());}
		
		{return o.getFname().compareTo(o1.getFname());
	}}}
	
	
	
	
	
		
	
	


