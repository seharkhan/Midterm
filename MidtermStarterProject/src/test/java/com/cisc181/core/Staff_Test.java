package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	
	@Before
	public void setUp() throws Exception {
		
	}
	
	

	@Test
	public void testAvgSalary() {
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		Staff staff1 = new Staff();
		staff1.setSalary(50000.00);
		staffList.add(staff1);
		
		Staff staff2 = new Staff();
		staff2.setSalary(55000.00);
		staffList.add(staff2);
		
		Staff staff3 = new Staff();
		staffList.add(staff3);
		
		Staff staff4 = new Staff();
		staff4.setSalary(65000.00);
		staffList.add(staff4);
		
		Staff staff5 = new Staff();
		staff5.setSalary(70000.00);
		staffList.add(staff4);
		
		double expected = 50000.00;
		double actual = ((staff1.getSalary() + staff2.getSalary() + staff3.getSalary()+staff4.getSalary() 
														+ staff5.getSalary())/6);
		assertEquals(expected, actual, 0.00001);
	}
	
	@Test
	public void testPhoneNumber() throws PersonException{
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		Staff staff1 = new Staff();
		staff1.setPhone("508-332-0977");
		staffList.add(staff1);
		
		Staff staff2 = new Staff();
		staff2.setPhone("508-332-0954");
		staffList.add(staff2);
		
		Staff staff3 = new Staff();
		staff3.setPhone("617-345-8908");
		staffList.add(staff3);
		
		Staff staff4 = new Staff();
		staff4.setPhone("65423456");
		staffList.add(staff4);
		
		Staff staff5 = new Staff();
		staff5.setPhone("7654321");
		staffList.add(staff4);
		
		try{
		
		}
		
		catch(PersonException ex){
			System.out.println(ex);
			
		}

		
	}
	
	@Test
	public void testDOB() throws PersonException{
		Calendar cal = Calendar.getInstance();
		cal.set(1955, 3, 12);
		Date dob1 = (Date) cal.getTime();
		
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		Staff staff1 = new Staff();
		staff1.setDOB(dob1);
		staffList.add(staff1);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(1952, 3, 12);
		Date dob2 = (Date) cal2.getTime();
		
		Staff staff2 = new Staff();
		staff2.setDOB(dob2);
		staffList.add(staff2);
		
		Calendar cal3 = Calendar.getInstance();
		cal3.set(1960, 3, 12);
		Date dob3 = (Date) cal3.getTime();
		
		Staff staff3 = new Staff();
		staff3.setDOB(dob3);
		staffList.add(staff3);
		
		Calendar cal4 = Calendar.getInstance();
		cal4.set(1967, 3, 12);
		Date dob4 = (Date) cal4.getTime();
		
		Staff staff4 = new Staff();
		staff4.setDOB(dob4);
		staffList.add(staff4);
		
		Calendar cal5 = Calendar.getInstance();
		cal5.set(1991, 3, 12);
		Date dob5 = (Date) cal5.getTime();
		
		Staff staff5 = new Staff();
		staff5.setDOB(dob5);
		staffList.add(staff5);
		
		try{
			for (Staff s : staffList){
				Calendar today = null;
				Calendar dobDate = null;
				if(dobDate.compareTo(today) > 100){
					
					
				}
			}
			
		
		}
		
		catch(PersonException ex){
			System.out.println(ex);
			
		}

		
		
	}
	
	
	
	
	
	
}
