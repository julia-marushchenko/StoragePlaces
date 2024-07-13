package com.storage.main;

import com.storage.add.Code;
import com.storage.entities.*;
import com.storage.interfaces.*;

// Entry point to the program to start it
public class Main {
	
	// Method main to start, check the program, and represent the functionality
	public static void main(String str []) {
		
		// Instance land of object with type Land for saving information about country Germany with
		//code DE
		LandImpl land = new LandImpl(Code.DE, "Germany");
		// Instance land1 for saving information about country United Kingdon with code UK
		LandImpl land1 = new LandImpl(Code.UK, "Great Britain");
		// Instance land2 for saving information about country USA with code USA
		LandImpl land2 = new LandImpl(Code.USA, "United States of America");
		
		// Instance stadt of object with type Stadt for saving information about city Stuttgart
		Stadt stadt = new StadtImpl(land, "Stuttgart");
		// Instance stadt1 of object with type Stadt for saving information about city Berlin
		Stadt stadt1 = new StadtImpl(land, "Berlin");
		// Instance stadt2 of object with type Stadt for saving information about city York
		Stadt stadt2 = new StadtImpl(land1, "York");
		// Instance stadt3 of object with type Stadt  for saving information about city London
		Stadt stadt3 = new StadtImpl(land1, "London");
		// Instance stadt4 of object with type Stadt  for saving information about city Wachington
		Stadt stadt4 = new StadtImpl(land2, "Wachington");
		
		// Readable representation information about city Wachington
		System.out.println(stadt4); // StadtImpl [land=LandImpl [code=USA, name=United States of America], name=Wachington]
		// Hashed information about stadt Wachington, how it is stored in programm StoragePlaces
		
		System.out.println(stadt4.hashCode()); // Hash code 1252015222 of instance stadt4 with land field United 
		// States of America and name Wachington
		
		land1.addItem(stadt1);
		land1.addItem(stadt);
		
		// Printing to console all cities from land DE
		System.out.println(land.showCities().toString());
		

	}

}
