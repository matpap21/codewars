package Regex;

public class Regex {
    public static void main(String[] args) {

        String tekst = "151551";

    }

    public static boolean validatePin(String pin) {
        for (int i = 0; i < pin.length ( ); i++) {
            if((pin.length() == 4 || pin.length() == 6)&&(pin.charAt(i) >= '0' && pin.charAt(i) <= '9')){
                try {
                    Integer.valueOf(pin);
                }catch (Exception e) {
                    break;
                }
                return true;
            }
            else{
                break;
            }
        }
        return false;
    }
}