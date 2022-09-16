package Calculator;

public class Substract {
    public void sub(float num1,float num2){
        System.out.println("Substracting two numbers:");
        if(num1>num2) {
            System.out.println(num1 - num2);
        }
        else {
            System.out.println(num2 - num1);
        }
    }
}
