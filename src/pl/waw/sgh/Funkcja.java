package pl.waw.sgh;

/**
 * Created by prubac on 19.03.2017.
 */
public class Funkcja {

    public static boolean sprawdzEmail(String email) {
        if (email.contains("@")) return true;
        else return false;
    }

    public static boolean sprawdzEmail2(String email) {
        return email.contains("@");
    }

    /*private */static void procedura(String email) {
        System.out.println(sprawdzEmail(email));
    }

    public static void main(String[] args) {
        String email = "abc@gmail.com";
        procedura(email);
    }

}
