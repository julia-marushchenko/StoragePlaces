package com.storage.entities;
import java.util.LinkedHashSet;
import java.util.Objects;

import com.storage.add.*;

import com.storage.interfaces.Land;
import com.storage.interfaces.Stadt;

//LandImpl class to create entity with type Land
public class LandImpl implements Land{
	
	// Field code for  information for country code
	Code code;
	// Field name for holding information about country name
	String name;
	// Field storage to store all cities we have in program saved
	LinkedHashSet<StadtImpl> storage = null;
	
	// Constructor to create new instance of type Land
	public LandImpl(Code code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	
	// Method getCode to get field code from instance Land 
	public Code getCode() {
		return code;
	}
	
	// Method setCode to set field code to instance of Land
	public void setCode(Code code) {
		this.code = code;
	}
	
	// Method getName to get field name from instance Land
	public String getName() {
		return name;
	}
	
	// Method setName to set field name to instance of Land
	public void setName(String name) {
		this.name = name;
	}
	
	//Method  addItem to add newly created instance of Stadt to storage
	public LinkedHashSet addItem(Stadt stadt1){
		storage.add(stadt1);
		return storage;
	}
	
	//Method  removeItem to remove instance of Stadt from storage
	public LinkedHashSet removeItem(Stadt stadt){
		storage.remove(stadt);
		return storage;
	}
	
	public LinkedHashSet showCities(){
		return storage;
	}
	
	// Method hash code of instance of type LandImpl to hide the information
	@Override
	public int hashCode() {
		return Objects.hash(code, name);
	}
	
	// Method equals for instances type LandImpl to compare object with type Land
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LandImpl other = (LandImpl) obj;
		return code == other.code && Objects.equals(name, other.name);
	}
	
	// Method toString for representing instances Land and implemented objects in written form 
	// with latin alphabet
	@Override
	public String toString() {
		return "LandImpl [code = " + code + ", name = " + name + "]";
	}
	
	

}
