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

	public Menu(){
		Market market = new Market();
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
	
	//metodos
	
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
