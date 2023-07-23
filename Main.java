public class Main {
    public static void main(String[] args) {
        // Создание экземпляров модели, представления и презентера
        Model model = new Model();
        View view = new View();
        Presenter presenter = new Presenter(model, view);
        
            // Обработка действия пользователя (например, нажатие кнопки "Сложить")
            presenter.onAddButtonClicked();
    
}
}
