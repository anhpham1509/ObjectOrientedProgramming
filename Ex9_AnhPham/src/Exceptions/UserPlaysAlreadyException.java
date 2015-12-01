package Exceptions;

/**
 * Created by DuyAnhPham on 29/09/15.
 */
public class UserPlaysAlreadyException extends Exception{

    public UserPlaysAlreadyException(){
        super("User has already been in game!\nPlease take part another user!");
    }
}
