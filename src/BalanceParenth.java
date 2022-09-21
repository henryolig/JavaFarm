import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class BalanceParenth {
    public static int counter = 0;

    public static void main(String[] args) {
        System.out.println(balanceParenthesesIterative("HI"));
    }

    public static boolean balanceParenthesesIterative(String input){

        int parenth = 0;
        for (int i = 0; i <= input.length(); i++) {

            if (parenth <= -1){
                return false;
            }
            else if(input.charAt(i) == 40){
                parenth++;
            }
            else if(input.charAt(i) == 41){
                parenth--;
            }
        }
        if(parenth == 0){
            return true;
        }
        else return false;


    }

    public static boolean balanceParenthesesRecursive(String input){
        if (counter < 0){ return false;}
        else if(input.length() == 1){
            if (input.charAt(0) == 40){
                counter++;
            }
            else if(input.charAt(0) == 41){
                counter--;}
            }
        else if (input.charAt(0) == 40){
            counter++;
            balanceParenthesesRecursive(input.substring(1));
        }
        else if(input.charAt(0) == 41){
            counter--;
            balanceParenthesesRecursive(input.substring(1));
        }
        else {balanceParenthesesRecursive(input.substring(1));}

        if(counter == 0){
            return true;
        }

        else {
            counter = 0;
            return false;
        }
    }
}
