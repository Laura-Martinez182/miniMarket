package exceptions;

import java.time.LocalDate;

public class DifferentDayException extends Exception {

	private static final long serialVersionUID = 1;
	private double idNumber;
	private int day;
	
	public DifferentDayException(double num, int d) {
		super("No le corresponde el día de acuerdo con el número de su cédula y el día del mes.");
		idNumber = num;
		day = d;
	}

	public double getIdNumber() {
		return idNumber;
	}
	
	public int getDay() {
		day = LocalDate.now().getDayOfMonth();
		return day;
	}
}

