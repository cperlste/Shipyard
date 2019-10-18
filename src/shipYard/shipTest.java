package shipYard;
import java.util.*;
import java.time.*;
public class shipTest {
public static void main(String[]args) throws Exception{
	Scanner keyboard= new Scanner(System.in);
	ArrayList<CruiseShip>cruiseShip= new ArrayList<CruiseShip>(); 
	ArrayList<CargoShip>cargoShip= new ArrayList<CargoShip>();
	String repeat;
	String again;
	do{
	System.out.println("Type 1 to fill an array of Cruise Ships. Type 2 to fill an array of Cargo Ships.");
	int choice= keyboard.nextInt();
	switch(choice){
	case 1:
		do{
		keyboard.nextLine();
		CruiseShip ship= fillCruise(cruiseShip, keyboard);
		cruiseShip.add(ship);
		System.out.println("Type yes to add another cruise ship to the list.");
		again=keyboard.nextLine();
		}while (again.toUpperCase()=="YES");
		System.out.println(cruiseShip.toString());
		break;
	case 2:
		do{
			keyboard.nextLine();
			CargoShip ship= fillCargo(cargoShip, keyboard);
			cargoShip.add(ship);
			System.out.println("Type yes to add another cargo ship to the list.");
			again=keyboard.nextLine();
			}while (again.toUpperCase()=="YES");
		System.out.println(cargoShip.toString());
		break;
	default:
		System.out.println("That is not a valid option.");
	}
	System.out.println("Would you like to fill another array of ships?");
	repeat= keyboard.nextLine();
	}while(repeat.toUpperCase()==("YES"));
}
public static CruiseShip fillCruise(ArrayList<CruiseShip>cruiseShip, Scanner keyboard)throws Exception{
	System.out.println("Enter ship's name: ");
	String name= keyboard.nextLine();
	System.out.println("What year was "+name+" built?");
	String year= keyboard.nextLine();
	System.out.println("What is the max amount of passengers on "+name+"?");
	int maxPass= keyboard.nextInt();
	while(maxPass<=0){
		System.out.println("Please type an integer greater than 0. What is the max amount of passengers on "+name+"?");
		maxPass= keyboard.nextInt();
	}
	CruiseShip ship= new CruiseShip(name, year, maxPass);
	for(int x=0; x<maxPass; x++){
		keyboard.nextLine();
		System.out.println("What is Passenger "+(x+1)+"'s first name? ");
		String first= keyboard.nextLine();
		System.out.println("Last name? ");
		String last=keyboard.nextLine();
		System.out.println("Gender? Type M for male, F for female: ");
		Gender gender= Gender.valueOf(keyboard.nextLine().toUpperCase());
		while(gender!=Gender.valueOf("M") && gender!=Gender.valueOf("F")){
			System.out.println("Gender? Type M for male, F for female: ");
			gender= Gender.valueOf(keyboard.nextLine());
		}
		System.out.println("Enter "+first+" "+last+"'s street address: ");
		String street= keyboard.nextLine();
		System.out.println("City? ");
		String city=keyboard.nextLine();
		System.out.println("State? Please type the full name: ");
		String state1= keyboard.nextLine().toUpperCase();
		int space= state1.indexOf(" ");
		if(space>=0){
			state1= state1.substring(0, space)+state1.substring(space+1);
		}
		USState state2= USState.valueOf(state1);
		System.out.println("Zip? ");
		String zip= keyboard.nextLine();
		Address address= new Address(street, city, state2, zip);
		System.out.println("Birth Date? Please type in YYYY-MM-DD format.");
		String birthDate=keyboard.nextLine();
		System.out.println("Passenger ID? ");
		int passID= keyboard.nextInt();
		System.out.println("Luggage Pieces? ");
		int luggagePcs= keyboard.nextInt();
		Passenger pass= new Passenger(first, last, gender, address, birthDate, passID, luggagePcs);
		try{
			ship.addPassenger(pass);
		}catch(PassengerExistsException e){
			System.out.println(e);
			System.exit(1);
		}
	}
	return ship;
}
public static CargoShip fillCargo(ArrayList<CargoShip>cargoShip, Scanner keyboard){
	keyboard.nextLine();
	System.out.println("Enter ship's name: ");
	String name= keyboard.nextLine();
	System.out.println("What year was "+ name+" built in?");
	String year= keyboard.nextLine();
	System.out.println("What is " +name+"'s max capacity?");
	int capacity= keyboard.nextInt();
	while(capacity<=0){
		System.out.println("Please type an integer greater than 0. What is the max capacity of "+name+"?");
		capacity= keyboard.nextInt();
	}
	CargoShip ship= new CargoShip(name, year, capacity);
	return ship;
	
}
}
