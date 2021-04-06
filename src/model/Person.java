package model;

public class Person {
	private IdType idType;
	private int idNumber;
	
	public Person(IdType idType, int idNumber) {
		this.idType = idType;
		this.idNumber = idNumber;
	}

	public IdType getIdType() {
		return idType;
	}

	public int getIdNumber() {
		return idNumber;
	}
	
}
