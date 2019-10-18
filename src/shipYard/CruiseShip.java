package shipYard;
import java.util.*;
public class CruiseShip extends Ship{
private int maxPpl;
private ArrayList<Passenger> passengers;
public CruiseShip(){
	this(null, null,0, new ArrayList<Passenger>());
}
public CruiseShip(String name){
	this(name, null, 0, new ArrayList<Passenger>());
}
public CruiseShip(String name, String year, int maxPpl){
	this(name, year, maxPpl, new ArrayList<Passenger>());
	}
public CruiseShip(String name, String year, ArrayList<Passenger>passengers){
	this(name, year, 0, passengers);
}
public CruiseShip(String name, String year, int maxPpl, ArrayList<Passenger>passengers){
	super(name, year);
	this.maxPpl=maxPpl;
	this.passengers=passengers;
}
//copy constructor
public CruiseShip(CruiseShip c){
	this(c.getName(), c.getYear(),c.maxPpl, c.passengers);
}
public void setMax(int maxPpl){
	this.maxPpl=maxPpl;
}
public int getMax(){
	return maxPpl;
}
//this method returns a deep copy of the passengers list
public ArrayList<Passenger> getPassengers(){
	ArrayList<Passenger>passNew=new ArrayList<Passenger>();
	for(Passenger p: passengers){
		passNew.add(p);
	}
	return passNew;
}
public void addPassenger(Passenger pass)throws Exception{
	if(passengers.contains(pass)){
		throw new PassengerExistsException();
	}
	passengers.add(pass);
}
@Override
public String toString(){
	StringBuilder sb= new StringBuilder();
	sb.append(super.getName()+" "+super.getYear()+"\n  Max Passengers: "+maxPpl+"\nPassengers: \n"+passengers.toString()+" ");
	return sb.toString();
}
}
