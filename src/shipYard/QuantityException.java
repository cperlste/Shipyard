package shipYard;

public class QuantityException extends RuntimeException{
public QuantityException(){
	super("Error. Quantity must be a nonnegative number");
}
public QuantityException(String message){
	super(message);
}
}
