package Exceptions;

/**
 * Created by DuyAnhPham on 29/09/15.
 */
public class GameFullException extends Exception {
    public GameFullException(){
        super("There can only be maximum 5 players in game!\nGame is full at the moment! Please try again later!");
    }
}
