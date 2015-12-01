import Exceptions.GameFullException;
import Exceptions.UserDoesNotExist;
import Exceptions.UserPlaysAlreadyException;
import Exceptions.UsernameAlreadyInUseException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by DuyAnhPham on 28/09/15.
 */
public class Game implements TakePart{

    Scanner sc = new Scanner(System.in);

    private List<String> users = new ArrayList<>();
    boolean[] inGame = new boolean[10];

    private boolean checkFormInsert(String inputStr){
        if (inputStr.contains("-")){
            return true;
        }
        else{
            return false;
        }
    }

    private boolean checkDuplicateUser(String inputStr){
        for (String user:this.users){
            if (inputStr.contentEquals(user)){
                return false;
            }
        }
        return true;
    }

    private void saveUser(String inputStr) throws UsernameAlreadyInUseException, IllegalArgumentException{
        if (this.checkFormInsert(inputStr)) {
            if (this.checkDuplicateUser(inputStr)) {
                this.users.add(inputStr);
                System.out.printf("Inserted new user: %s\n", inputStr.split("-")[0]);
            } else {
                throw new UsernameAlreadyInUseException();
            }
        }
        else{
            throw new IllegalArgumentException("Username and password are given in the wrong form!\nPlease try again!");
        }
    }

    public void insertUsers(){
        boolean is_finished = false;

        do {
            System.out.print("Please enter new user you want to insert: ");
            String inputStr = this.sc.nextLine();

            try {
                try {
                    this.saveUser(inputStr);
                    is_finished = true;
                } catch (UsernameAlreadyInUseException e) {
                    System.out.println(e.getMessage());
                }
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        } while(! is_finished);
    }

    public boolean checkFormTakePart(String inputStr){
        if (inputStr.contains(":")){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkUserExistence(String inputStr){
        if (this.users.contains(inputStr)){
            return true;
        }
        else{
            return false;
        }
    }

    public void joinGame(String inputStr) throws IllegalArgumentException, UserDoesNotExist, UserPlaysAlreadyException{
        if (checkFormTakePart(inputStr)) {
            inputStr = inputStr.replaceAll(":", "-");

            if (this.checkUserExistence(inputStr)) {
                int userIndex = this.users.indexOf(inputStr);
                if (! this.inGame[userIndex]) {
                    this.inGame[userIndex] = true;
                    System.out.printf("User %s has just taken a part in game!\n", inputStr.split("-")[0]);
                }
                else{
                    throw new UserPlaysAlreadyException();
                }
            }
            else{
                throw new UserDoesNotExist();
            }
        }
        else{
            throw new IllegalArgumentException("Username and password are given in the wrong form!\nPlease try again!");
        }
    }


    public void takePart() throws GameFullException{
        boolean is_finished = false;
        int countUsers = 0;

        do{
            System.out.print("Please enter username and password to take a part: ");
            String inputStr = this.sc.nextLine();

            try{
                try {
                    if (countUsers < 5) {
                        try {
                            this.joinGame(inputStr);
                            countUsers++;
                        }
                        catch (UserPlaysAlreadyException e) {
                            System.out.println(e.getMessage());
                        }

                        if (countUsers == 5){
                            System.out.println("Game is full now!");
                        }
                    }
                    else {
                        throw new GameFullException();
                    }
                }
                catch(UserDoesNotExist e){
                    System.out.println(e.getMessage());
                }
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        } while (! is_finished);
    }
}
