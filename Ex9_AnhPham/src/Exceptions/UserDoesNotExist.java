package Exceptions;

/**
 * Created by DuyAnhPham on 29/09/15.
 */
public class UserDoesNotExist extends Exception{
    public UserDoesNotExist(){
        super("Username does not exist!\nPlease try again!");
    }
}
