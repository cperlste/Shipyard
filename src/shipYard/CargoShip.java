package shipYard;

public class CargoShip extends Ship{
private int capacity;
public CargoShip(){
	this(null, null, 0);
}
public CargoShip(String name){
	this(name, null, 0);
}
public CargoShip(String name, String year){
	this(name, year, 0);
}
public CargoShip(String name, String year, int capacity){
	super(name, year);
	this.capacity=capacity;
}
public void setCapacity(int capacity){
	this.capacity=capacity;
}
public int getCapacity(){
	return capacity;
}
@Override
public String toString(){
	StringBuilder sb= new StringBuilder();
	sb.append(super.getName()+"\n  Cargo Capacity: "+capacity);
	return sb.toString();
}
}
