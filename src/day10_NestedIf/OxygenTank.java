package day10_NestedIf;

public class OxygenTank {
    public static void main(String[] args) {

        int level = 100;
        String message = "";

        if(level > 0 &&  level <= 100){
            if(level > 90){
                message = "Your tank is full";
            }else if(level > 80){
                message = "Still okay";
            }else if(level > 70){
                message = "Don't go too far";
            }else if(level > 60){
                message = "Start to head back";
            }else  if(level > 50){
                message = "Be careful now you at at 50%";
            }else{
                message = "Invalid level";
            }
            System.out.println(message);
        }
    }
}
