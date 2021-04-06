package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import exceptions.DifferentDayException;
import exceptions.UnderAgeException;

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

	
	public void register(IdType type, double num) throws UnderAgeException, DifferentDayException{
		//int count;
		
	}
}
