package day10_NestedIf;

public class CharacterIndentity {
    public static void main(String[] args) {
        char ch ='@';
        if(ch >= '0' && ch <= '9'){
            System.out.println("Digital");
        }else if ( (ch >= 'A'&& ch <= 'Z') || (ch >= 'a' && ch <= 'z') ){
            System.out.println("Alphabetic");
        }else{
            System.out.println("Special Character");
        }



    }
}
