package Exceptions;

/**
 * Created by DuyAnhPham on 29/09/15.
 */
public class UsernameAlreadyInUseException extends Exception {
    public UsernameAlreadyInUseException(){
        super("Username has already been in use!\nPlease try again!");
    }
}
