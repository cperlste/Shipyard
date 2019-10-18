package shipYard;

public class Ship {
private String name;
private String year;
public Ship(){
	this(null, null);
}
public Ship(String name){
	this(name, null);
}
public Ship(String name, String year){
	this.name=name;
	this.year=year;
}
public void setName(String name){
	this.name=name;
}
public void setYear(String year){
	this.year=year;
}
public String getName(){
	return name;
}
public String getYear(){
	return year;
}
@Override
public String toString(){
	StringBuilder sb= new StringBuilder();
	sb.append(name+"\n   Built In: "+year);
	return sb.toString();
	
}
}
