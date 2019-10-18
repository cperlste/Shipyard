package shipYard;

public class Address {
private String street;
private String city;
private USState state;
private String zipCode;
public Address(String street, String city, String state, String zipCode){
	this(street, city, USState.valueOf(state), zipCode);
}
public Address(String street, String city, USState state, String zipCode){
	this.street=street;
	this.city=city;
	this.state=state;
	this.zipCode=zipCode;
}
public String getStreet(){
	return street;
}
public String getCity(){
	return city;
}
public USState getState(){
	return state;
}
public String getZip(){
	return zipCode;
}
@Override
public String toString(){
	StringBuilder sb= new StringBuilder();
	sb.append(street+ "\n"+city+", "+state.getSymbol()+" "+zipCode);
	return sb.toString();
}
}
