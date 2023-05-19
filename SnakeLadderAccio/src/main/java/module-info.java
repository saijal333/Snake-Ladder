module com.example.snakeladderaccio {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.snakeladderaccio to javafx.fxml;
    exports com.example.snakeladderaccio;
}