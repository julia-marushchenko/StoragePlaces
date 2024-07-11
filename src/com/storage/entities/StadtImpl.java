package com.storage.entities;

import java.util.Objects;

import com.storage.interfaces.Land;
import com.storage.interfaces.Stadt;
//StadtImpl class to create entity with type Stadt
public class StadtImpl implements Stadt{
	
	// Field land of entity with type Stadt
	Land land;
	// Field name of entity with type Stadt
	String name;
	// Constructor for creating entities with type Stadt and StadtImpl
	public StadtImpl(Land land, String name) {
		super();
		this.land = land;
		this.name = name;
	}
	
	// Method getLand to get field land from instance Stadt 
	public Land getLand() {
		return land;
	}
	
	// Method setLand to set land code to object Stadt
	public void setLand(Land land) {
		this.land = land;
	}
	// Method getName to show Stadt instance field name
	public String getName() {
		return name;
	}
	
	// Method setName to settle name to instance with type Stadt
	public void setName(String name) {
		this.name = name;
	}
	
	// Method hash code of instance of type Stadt to hide the information
	@Override
	public int hashCode() {
		return Objects.hash(land, name);
	}
	
	// Method equals  to compare object with type Stadt
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StadtImpl other = (StadtImpl) obj;
		return Objects.equals(land, other.land) && Objects.equals(name, other.name);
	}
	
	// Method toString for representing instances Stadt and implemented objects in written form 
	// with latin alphabet
	@Override
	public String toString() {
		return "StadtImpl [land = " + land + ", name = " + name + "]";
	}
	
	

}
