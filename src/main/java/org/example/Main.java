

package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox(10);

        Label label = new Label("Aquí aparecerá tu texto"); //CREO LOS BOTONES
        TextField textField = new TextField();
        Button button = new Button("Mostrar texto");

        button.setOnAction(event -> {
            label.setText("Texto introducido:" + textField.getText());
            textField.clear();
        });

        //asignamos el evento al boton, esta vez añadimos el textField.clear()

        vbox.getChildren().addAll(label, textField, button);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Eje 9 - Controles");
        primaryStage.setScene(scene);
        primaryStage.show();//se crea la escena, se pone titutlo se asigna a la ventana y se hace visible
    }

    public static void main(String[] args) {
        launch(args); //metodo de aplication para arrancar el programa
    }
}