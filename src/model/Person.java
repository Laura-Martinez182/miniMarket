package model;

public class Person {
	private IdType idType;
	private double idNumber;
	
	public Person(IdType idType, double idNumber) {
		this.idType = idType;
		this.idNumber = idNumber;
	}

	public IdType getIdType() {
		return idType;
	}

	public double getIdNumber() {
		return idNumber;
	}
	
}
