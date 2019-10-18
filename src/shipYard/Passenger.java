package shipYard;
import java.time.*;
public class Passenger extends Person {
private int passportID;
private int luggagePieces;
public Passenger(Passenger p){
	this(p.getFirstName(), p.getLastName(), p.getGender(), p.getAddress(), p.getbirthDate().toString(), p.passportID, p.luggagePieces);
}
public Passenger(String f, String l, Gender g, Address addr, String birthDate, int passportID, int luggage){
	super(f, l, g, addr, LocalDate.parse(birthDate));
	this.passportID= passportID;
	luggagePieces=luggage;
}
@Override 
public String toString(){
	StringBuilder sb= new StringBuilder();
	sb.append(super.toString()+"\n ID: "+passportID+"\n Luggage Pieces: "+luggagePieces);
	return sb.toString();
}
@Override 
public boolean equals(Object obj){
	if(this==obj){
		return true;
	}
	if(obj==null){
		return false;
	}
	if(this.getClass()!=obj.getClass()){
		return false;
	}
	Passenger other= (Passenger) obj;
	if(this.passportID!=other.passportID){
		return false;
	}
	return true;
}
}
