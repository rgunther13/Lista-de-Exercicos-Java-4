import java.util.Scanner;

class exe1Aula3{

public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    double a = input.nextDouble();
    double b = input.nextDouble();
    
    System.out.printf("Soma %.2f \n", a + b);
    System.out.printf("Sub %.2f \n", a - b);
    System.out.printf("Div %.2f \n", a / b);
    System.out.printf("Resto %.2f \n", a % b);

    input.close();

    }

}
