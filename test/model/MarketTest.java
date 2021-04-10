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

	public void setUpScenary2() throws UnderAgeException, DifferentDayException {
		market = new Market();

		market.register(IdType.PP, "1006171189", 9);
		market.register(IdType.CC, "1005123161", 9);
		market.register(IdType.CE, "1056173129", 9);
	}


	//Correct register
	@Test
	public void testRegister1() {
		setUpScenary1();

		try {
			IdType idType= IdType.CC;
			String idNumber = "1006171163";
			int day = 9;
			
			boolean added = market.register(idType, idNumber, day);

			assertTrue(added);

			List<Person> people = market.getPeople();
			assertEquals(1, people.size());
			assertEquals(1,market.getPeopleWhoTryToEnter());

			Person p = people.get(0);
			assertEquals(idType,p.getIdType());
			assertEquals(idNumber,p.getIdNumber());

		} catch (UnderAgeException uae) {
			fail("Not UnderAgeException expected");

		} catch (DifferentDayException dde) {
			fail("Not DifferentDayException expected");
		}
	}

	@Test
	public void testRegister2() {
		try {
			setUpScenary2();

			IdType idType= IdType.PP;
			String idNumber = "1005181140";
			int day = 9;
			boolean added = market.register(idType, idNumber, day);

			assertTrue(added);

			List<Person> people = market.getPeople();
			assertEquals(4, people.size());
			assertEquals(4,market.getPeopleWhoTryToEnter());

			Person p = people.get(3);
			assertEquals(idType,p.getIdType());
			assertEquals(idNumber,p.getIdNumber());

		} catch (UnderAgeException uae) {
			fail("Not UnderAgeException expected");

		} catch (DifferentDayException dde) {
			fail("Not DifferentDayException expected");
		}
	}


	//Can´t register because of TI

	@Test
	public void testRegister3() {
		setUpScenary1();

		try {
			IdType idType= IdType.TI;
			String idNumber = "1006231159";
			int day = 2;

			market.register(idType, idNumber, day);

			fail("UnderAgeException expected");

		} catch (UnderAgeException uae) {
			assertEquals(uae.getIdType(),IdType.TI);
			uae.printStackTrace();
			
			List<Person> people = market.getPeople();
			assertEquals(0, people.size());
			assertEquals(1,market.getPeopleWhoTryToEnter());
			
		} catch (DifferentDayException dde) {
			fail("UnderAgeException expected, not DifferentDayException");
		}
	}


	@Test
	public void testRegister4() {

		try {
			setUpScenary2();

			IdType idType= IdType.TI;
			String idNumber = "1005181179";
			int day = 8;


			market.register(idType, idNumber, day);

			fail("UnderAgeException expected");

		} catch (UnderAgeException uae) {
			assertEquals(uae.getIdType(),IdType.TI);
			uae.printStackTrace();
			List<Person> people = market.getPeople();
			assertEquals(3, people.size());
			assertEquals(4,market.getPeopleWhoTryToEnter());
			
		} catch (DifferentDayException dde) {
			fail("UnderAgeException expected, not DifferentDayException");
		}
	}



	//Can´t register because of different day
	@Test
	public void testRegister5() {
		setUpScenary1();

		try {
			IdType idType= IdType.CC;
			String idNumber = "1006171190";
			int day = 19;

			market.register(idType, idNumber, day);

			fail("DifferentDayException expected");

		} catch (UnderAgeException uae) {
			fail("DifferentDayException expected, not UnderAgeException");
		} catch (DifferentDayException dde) {
			List<Person> people = market.getPeople();
			assertEquals(0, people.size());
			assertEquals(1,market.getPeopleWhoTryToEnter());
		}
	}

	@Test
	public void testRegister6() {
		try {
			setUpScenary2();

			IdType idType= IdType.CE;
			String idNumber = "1004123175";
			int day = 21;

			market.register(idType, idNumber, day);

			fail("DifferentDayException expected");

		} catch (UnderAgeException uae) {
			fail("DifferentDayException expected, not UnderAgeException");
		} catch (DifferentDayException dde) {
			List<Person> people = market.getPeople();
			assertEquals(3, people.size());
			assertEquals(4,market.getPeopleWhoTryToEnter());
		}
	}
}



