package shipYard;
import java.time.LocalDate;
public class Person{
private String firstName;
private String lastName;
private Gender gender;
private Address address;
private LocalDate birthDate;
public Person(String f, String l, Gender g, Address add, String birthDate){
	this(f, l, g, add, LocalDate.parse(birthDate));
}
public Person(String f, String l, Gender g, String street, String city, String state, String zip, String birthDate){
	this(f, l, g, new Address(street, city, state, zip), LocalDate.parse(birthDate));
}
public Person(String f, String l, Gender g, Address add, LocalDate birthDate){
	firstName=f;
	lastName=l;
	gender=g;
	address=add;
	this.birthDate=birthDate;
}
public Person(Person p){
	this(p.firstName, p.lastName, p.gender, p.address, p.birthDate);
}
public String getFirstName(){
	return firstName;
}
public String getLastName(){
	return lastName;
}
public Gender getGender(){
	return gender;
}
public LocalDate getbirthDate(){
	return birthDate;
}
public Address getAddress(){
	return address;
}
public void setLastName(String last){
	lastName=last;
}
public void setAddress(Address addr){
	address=addr;
}
@Override
public String toString(){
	StringBuilder sb= new StringBuilder();
	sb.append(lastName+", "+firstName+"("+gender+")"+" DOB: "+birthDate+"\nAddress: "+address.toString());
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
	Person other= (Person)obj;
	if(this.firstName.equals(other.firstName)){
		if(this.lastName.equals(other.lastName)){
			if(this.birthDate.equals(other.birthDate)){
				return true;
			}
		}
	}
	return false;
}
}
