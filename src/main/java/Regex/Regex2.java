package Regex;

import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        "1234"   -->  true
//        "12345"  -->  false
//        "a234"   -->  false

        validatePin ("1234");
        validatePin ("12345");
        validatePin ("a234");

        System.out.println (  validatePin ("1234"));
        System.out.println ( validatePin ("12345"));
        System.out.println (validatePin ("a234") );

    }
    public static boolean validatePin(String pin){
        if(Pattern.matches ("[\\d]{4}",pin) || Pattern.matches ("[\\d]{6}",pin)){
            return true;
        }else {
            return false;
        }
    }
}
