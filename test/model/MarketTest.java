package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import exceptions.DifferentDayException;
import exceptions.UnderAgeException;

public class MarketTest {
	private Market market;

	public void setUpScenary1() {
		market = new Market();
	}

	public void setUpScenary2() {

	}


	//Correct register
	@Test
	public void testRegister1() throws UnderAgeException, DifferentDayException {
		setUpScenary1();
		
		IdType idType= IdType.CC;
		String idNumber = "1006171163";
		int day = 9;
		
		boolean added = market.register(idType, idNumber, day);
		
		assertTrue(added);
		
		List<Person> people = market.getPeople();
		assertEquals(1, people.size());
		
		Person p = people.get(0);
		assertEquals(idType,p.getIdType());
		assertEquals(idNumber,p.getIdNumber());
	}
	


	public void testRegister2() {
		
	}


	//Can´t register because of TI

	/*try {
		boolean added = market.register(idType, idNumber, day);
		fail();
	} catch (UnderAgeException uae) {
		System.out.println("Debe tener un tipo de documento que no sea TI, pues debe ser mayor de edad.");
		uae.printStackTrace();
	} catch (DifferentDayException dde) {
		System.out.println("No le corresponde salir de acuerdo con el número de su cédula: " +market.getPenultimateIdNum(idNumber) +" y el día del mes: " +market.getDay());
		dde.printStackTrace();
	}
	public void testRegister3() {
		setUpScenary1();
	}*/


	public void testRegister4() {
		
	}



	//Can´t register because of different day

	public void testRegister5() {
		setUpScenary1();
	}


	public void testRegister6() {
		
	}
	
	
}
