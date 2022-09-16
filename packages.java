import Calculator.*;
import java.util.*;

public class packages {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Add obj1= new Add();
        Substract obj2= new Substract();
        Multiply obj3= new Multiply();
        Divide obj4= new Divide();

        int chs;
        float num1,num2;

        System.out.println("*****Main-Menu*****");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");

        System.out.println("Enter your choice: ");
        chs = sc.nextInt();

        do {
            System.out.println("Enter 2 number:");
            num1=sc.nextFloat();
            num2=sc.nextFloat();
            switch (chs){
                case 1:
                    obj1.add(num1,num2);
                    break;
                case 2:
                    obj2.sub(num1,num2);
                    break;
                case 3:
                    obj3.mul(num1,num2);
                    break;
                case 4:
                    obj4.div(num1,num2);
                    break;
                default:
                    System.out.println("Enter choice is wrong");
                    break;
            }
            System.out.println("Enter your choice: ");
            chs = sc.nextInt();
        }while(chs!=5);
        System.out.println("!!!Thanks for visiting!!!");
    }
}
