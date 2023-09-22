package Accenture;

public class Vallidate_password {
    public static int valid(String str){
        if (str.length()<4){
            return 0;
        }
        if (!str.matches(".*[0-9].*"))
        {
            return 0;
        }
        if (!str.matches(".*[A-Z].*")){
            return 0;
        }
        if (str.contains(" ") || str.contains("/")){
            return 0;
        }
        char firstchar=str.charAt(0);
        if (Character.isDigit(firstchar)){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        String str="aa12A_";
      ;
        System.out.println( valid(str));

        }

}
