package shipYard;

public class PassengerExistsException extends RuntimeException{
public PassengerExistsException(){
	super("PassengerExistsException");
}
public PassengerExistsException(String message){
	super(message);
}
}
