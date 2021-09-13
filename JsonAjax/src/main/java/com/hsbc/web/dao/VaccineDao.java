package com.hsbc.web.dao;


import java.util.HashMap;

import java.util.Map;

import com.hsbc.web.entity.Vaccine;
import java.util.Map;



public class VaccineDao {

//	public static List<Vaccine>  empDb = new ArrayList<Vaccine>();
	public static Map<String, Vaccine>  vaccine = new HashMap<>();
	static {
		String[] symp={"fever", "headache"};
		String[] pre={"Paracetamol for fever","consult doctor"} ;
		vaccine.put("covaxin", new Vaccine( "Covaxin","28 days", symp,pre));
		vaccine.put("covidshield",new Vaccine("Covishield", "28 days",symp,pre ));

	}
	
	
}