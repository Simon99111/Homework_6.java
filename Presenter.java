public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void onAddButtonClicked() {
        double number1 = view.getUserInput();
        double number2 = view.getUserInput();
        char op = view.getOperation();

        InterfaceOperation operation;
        switch (op) {
            case '+':
                operation = new Summa();
                break;
            case '-':
                operation = new Difference();
                break;
            case '*':
                operation = new Multiplication();
                break;
            case '/':
                operation = new Division();
                break;
            default:
                System.out.println("Ошибка! Введена некорректная операция.");
                return;
        }

        model.setOperation(operation);
        double result = model.performOperation(number1, number2);
        view.displayResult(result);
    }
}
