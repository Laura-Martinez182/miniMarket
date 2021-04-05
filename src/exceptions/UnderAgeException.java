package exceptions;

import model.IdType;

public class UnderAgeException extends Exception {
	
	private static final long serialVersionUID = 1;
	private IdType idType;

	public UnderAgeException(IdType type) {
		super("Debe tener un tipo de documento que no sea TI, pues debe ser mayor de edad.");
		idType =  type;
	}
	public IdType getIdType() {
		return idType;
	}
}


