package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import exceptions.DifferentDayException;
import exceptions.UnderAgeException;

public class Market {
	private List<Person> people;
	private int day;
	private int count;

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


	public boolean register(IdType type, String num, int day) throws UnderAgeException, DifferentDayException{
		boolean added = false;
		int penultimate = getPenultimateIdNum(num);
		count++;
		if(type == IdType.TI) {
			throw new UnderAgeException(type);
		}
		if (day%2==0 && penultimate%2==0) {
			throw new DifferentDayException(penultimate, day);
		}

		if (day%2!=0 && penultimate%2!=0) {
			throw new DifferentDayException(penultimate, day);
		}

		Person p = new Person(type, num);
		people.add(p);
		added = true;
		return added; 
	}

	public void getPeopleWhoTryToEnter() {
		System.out.println(count);
	}

	public int getPenultimateIdNum(String num){  
		return Character.getNumericValue(num.charAt(num.length()-2));
	}
}
