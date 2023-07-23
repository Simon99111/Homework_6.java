import java.util.Scanner;

class View {

public void displayResult(double result) {
System.out.println("Результат: " + result);
}

public double getUserInput() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите число: ");
    double input = sc.nextInt();
    return input;
}

public char getOperation() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите операцию: ");
    char inputOp = sc.next().charAt(0);
    return inputOp;
}
}