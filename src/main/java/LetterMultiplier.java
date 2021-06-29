package hu.nive.ujratervezes.lettermultiplier;

public class LetterMultiplier {
   String multiply(String input, int number){
       if (input == null || number < 0) {
           throw IllegalArgumentException;
       }
       else {
           Stringbuilder resolve = new StringBuilder();
           for (char item : input) {
               for (i = 0; i < number; i++) resolve.append(item);
           }

       }
       return resolve;
   }

    public static void main(String[] args) {

        System.out.println(multiply(alma,3););
    }
}
