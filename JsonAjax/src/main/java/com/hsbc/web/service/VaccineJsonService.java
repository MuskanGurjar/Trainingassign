package com.hsbc.web.service;

import org.json.JSONObject;

import com.hsbc.web.dao.VaccineDao;


public class VaccineJsonService {

	public String getJson(String name) {
		if (VaccineDao.vaccine.containsKey(name)) {

			JSONObject obj = new JSONObject(VaccineDao.vaccine.get(name));
			return obj.toString();
		} else {
			JSONObject obj = new JSONObject("{\"status\":\"Not Found\"}");
			return obj.toString();
		}
	}
}
