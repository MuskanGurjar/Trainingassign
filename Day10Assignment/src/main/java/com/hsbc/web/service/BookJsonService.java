package com.hsbc.web.service;

import org.json.JSONObject;

import com.hsbc.web.entity.BookDeatils;

public class BookJsonService {

	public String getJson(int id) {
		BookDeatils emp=new BookDeatils("raven cycle","magie stiefvater",800,id);
		
		JSONObject obj=new JSONObject(emp);
		return obj.toString();
	}
}
