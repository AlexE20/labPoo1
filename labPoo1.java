import java.util.Scanner;

public class labPoo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        double num1, num2;
        boolean exit=true;

        do{
            System.out.println("¿Que operacion realizara?:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                num2 = scanner.nextDouble();
                
                System.out.println("El resultado de la suma es: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("Ingrese el primer número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo número:");
                    num2 = scanner.nextDouble();
                    System.out.println("El resultado de la resta es: " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("Ingrese el primer número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo número:");
                    num2 = scanner.nextDouble();
                    System.out.println("El resultado de la multiplicación es: " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("Ingrese el primer número:");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("El resultado de la multiplicación es: " + dividr(num1, num2));
                    break;
                    case 5:
                    exit=false;
                    break;
            }
        }while(exit);
    }
    public static double sumar( double a, double b){
        return a+b;
    }
    public static double restar( double a, double b){
        return a-b;
    }
    public static double multiplicar( double a, double b){
        return a*b;
    }
    public static double dividr( double a, double b){
        return a/b;
    }
}


    
        
                 