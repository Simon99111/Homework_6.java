// class Model {
// private double result;

// public void add(double number1, double number2, char op) {
//     switch(op) {
//         case '+': result = Summa();
//            break;
//         case '-': result = Difference(number1, number2);
//            break;
//         case '*': result = Multiplication(number1, number2);
//            break;
//         case '/': result = Division(number1, number2);
//            break;
//         default:  System.out.printf("Error! Enter correct operator");
//            return;
//      }
// }


// public double getResult() {
//     return result;
// }
// }

class Model {
    private InterfaceOperation operation;

    public void setOperation(InterfaceOperation operation) {
        this.operation = operation;
    }

    public double performOperation(double number1, double number2) {
        return operation.in(number1, number2);
    }
}