package exceptions;

import java.time.LocalDate;

public class DifferentDayException extends Exception {

	private static final long serialVersionUID = 1;
	private int penultimate;
	private int day;
	
	public DifferentDayException(int penNum, int d) {
		super("No le corresponde el d�a de acuerdo con el n�mero de su c�dula y el d�a del mes.");
		penultimate = penNum;
		day = d;
	}

	public int getpenultimate() {
		return penultimate;
	}
	
	public int getDay() {
		day = LocalDate.now().getDayOfMonth();
		return day;
	}
}

