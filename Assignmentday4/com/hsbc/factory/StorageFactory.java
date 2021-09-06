package com.hsbc.factory;

import com.hsbc.dao.Storage;
import com.hsbc.dao.StorageImpl;
import com.hsbc.dao.StorageListImpl;
import com.hsbc.dao.StorageMapImpl;
import com.hsbc.dao.StorageSortedImpl;
import com.hsbc.exceptions.InvalidStorageTypeException;

public class StorageFactory {
	public static Storage getStorage(int i) {
		if(i==1) {return new StorageImpl();}
		else if(i==2) {return new StorageListImpl();}
		else if(i==3) {return new StorageSortedImpl();}
		else if(i==4) {return new StorageMapImpl();}
		//else throw new InvalidStorageTypeException("Invalid Storage Type ");
		return null;
	}
}
