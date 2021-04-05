package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Market {
	private List<Person> people;
	private int day;

	public Market (){
		people = new ArrayList<>();
	}

	public List<Person> getPeople() {
		return people;
	}

	public int getDay() {
		day = LocalDate.now().getDayOfMonth();
		return day;
	}

	
	
}
