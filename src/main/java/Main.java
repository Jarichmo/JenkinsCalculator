import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the calculator \nEnter a command:");
        while(true) {
            String next = scanner.next();
            Calculator calculator = new Calculator();
            if (next.equals("add")) {
                int int1 = scanner.nextInt();
                int int2 = scanner.nextInt();
                int result = calculator.add(int1, int2);
                System.out.println(result);
            } else if (next.equals("binary")) {
                int int1 = scanner.nextInt();
                String result = calculator.intToBinaryNumber(int1);
                System.out.println(result);
            }
            else if (next.equals("fibonacci")){
                int int1 = scanner.nextInt();
                String result = String.valueOf(calculator.fibonacciNumberFinder(int1));
                System.out.println(result);
            }
            else if (next.equals("divide")){
                int int1 = scanner.nextInt();
                int int2 = scanner.nextInt();
                int result = calculator.divide(int1, int2);
                System.out.println(result);
            }
            else if (next.equals("multiply")){
                int int1 = scanner.nextInt();
                int int2 = scanner.nextInt();
                int result = calculator.multiply(int1, int2);
                System.out.println(result);
            }
            else if (next.equals("subtract")){
                int int1 = scanner.nextInt();
                int int2 = scanner.nextInt();
                int result = calculator.subtract(int1, int2);
                System.out.println(result);
            }
            else if(next.equals("quit")){
                break;
            }
        }
    }
}
