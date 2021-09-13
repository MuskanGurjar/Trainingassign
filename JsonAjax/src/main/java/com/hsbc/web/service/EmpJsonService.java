package com.hsbc.web.service;

import org.json.JSONObject;

import com.hsbc.web.dao.EmpDao;


public class EmpJsonService {

	public String getJson(String name) {
		if (EmpDao.vaccine.containsKey(name)) {

			JSONObject obj = new JSONObject(EmpDao.vaccine.get(name));
			return obj.toString();
		} else {
			JSONObject obj = new JSONObject("{\"status\":\"Not Found\"}");
			return obj.toString();
		}
	}
}
