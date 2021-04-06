package ui;
import model.*;
import java.util.Scanner;
//importar excepciones

public class Menu {

	private final static int TO_REGISTER = 1;
	private final static int PEOPLE_WHO_TRIED_TO_GET_IN = 2;
	private final static int EXIT = 3;

	Scanner sc = new Scanner(System.in);
	IdType idType;
	double idNumber;

	Market market;
	public Menu(){
		market = new Market();
	}

	public void showMenu(){
		System.out.println("Escoja una de las siguientes opciones:");
		System.out.println("1) Para registrar el ingreso de una nueva persona");
		System.out.println("2) Para consultar la cantidad de personas que han intentado ingresar al minimercado");
		System.out.println("3) Salir");

	}

	public int readOption(){
		int choice = sc.nextInt();
		sc.nextLine();
		return choice;
	}

	public int registerEntry() {
		System.out.println("Ingrese el numero que corresponda a su tipo de documento:\n"
				+ "1.Tarjeta de identidad \n"
				+ "2.Cedula de Ciudadania \n"
				+ "3.Pasaporte \n"
				+ "4.Cédula de Extranjería");
		int select = sc.nextInt();

		switch (select) {
		case 1:
			idType = IdType.TI;
			break;
		case 2:
			idType = IdType.CC;
			break;
		case 3:
			idType = IdType.PP;
			break;
		case 4:
			idType = IdType.CE;
			break;
		default:
			break;
		}
		
		System.out.println("Ingrese su numero de documento: ");
			idNumber = sc.nextInt();
			
		return select;

	}

	public void doOperation(int choice){
		switch (choice){
		case TO_REGISTER:
			//System.out.println(  ());
			break;
		case PEOPLE_WHO_TRIED_TO_GET_IN :
			//System.out.println( ());
			break;
		case EXIT:
			break;
		default: 
			System.out.println("Opcion invalida, ingrese nuevamente");

		}
	}

	public void startProgram(){
		int option;
		do{
			showMenu();
			option = readOption();
			doOperation(option);
		}while (option!=3);
	}
}
