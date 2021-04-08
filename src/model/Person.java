package model;

public class Person {
	private IdType idType;
	private String idNumber;
	
	public Person(IdType idType, String idNumber) {
		this.idType = idType;
		this.idNumber = idNumber;
	}

	public IdType getIdType() {
		return idType;
	}

	public String getIdNumber() {
		return idNumber;
	}
	
}
