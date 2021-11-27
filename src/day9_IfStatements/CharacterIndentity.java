package day9_IfStatements;

public class CharacterIndentity {
    public static void main(String[] args) {
        int ch = 33;
        String character;
        if(ch >= 30 && ch == 55){
            character = "Alphabetic Character";
        }else{
            character = "Special Character";
        }
        System.out.println(character);
    }
}
