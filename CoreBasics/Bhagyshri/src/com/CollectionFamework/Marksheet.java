package com.CollectionFamework;

public class Marksheet   {

	private String Fname;
	private String Lname;
	private String rollno;
	private int  phy;
	private int  chem;
	private int  maths;
	
	
	public Marksheet() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChem() {
		return chem;
	}
	public void setChem(int chem) {
		this.chem = chem;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}}
	
	
	


	/*@Override
	public int compareTo(Marksheet m) {
		
		return this.rollno.compareTo(m.getRollno());
	}
	}*/
	
	
	
	

