package com.hsbc.web.dao;


import java.util.HashMap;

import java.util.Map;

import com.hsbc.web.entity.Emp;
import java.util.Map;



public class EmpDao {

//	public static List<Vaccine>  empDb = new ArrayList<Vaccine>();
	public static Map<String, Emp>  vaccine = new HashMap<>();
	static {
		String[] symp={"fever", "headache"};
		String[] pre={"Paracetamol for fever","consult doctor"} ;
		vaccine.put("covaxin", new Emp( "Covaxin","28 days", symp,pre));
		vaccine.put("covidshield",new Emp("Covishield", "28 days",symp,pre ));

	}
	
	
}