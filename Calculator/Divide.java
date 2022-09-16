package Calculator;

public class Divide {
    public void div(float num1,float num2){
        System.out.println("Dividing two numbers:");
        if(num1>num2) {
            System.out.println(num1 / num2);
        }
        else {
            System.out.println(num2/num1);
        }
    }
}
