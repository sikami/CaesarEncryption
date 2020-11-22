package Main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Caesar extends Application {


    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        Label title = new Label("Caesar Encryption");
        title.setFont(Font.font(16));

        Label text = new Label("Text:");
        Label encryptText = new Label("Encrypted Text:");
        TextArea words = new TextArea();
        Text result = new Text();
        Button button = new Button("Caesarized!");

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(20,20,20,20));
        vBox.setSpacing(20);
        vBox.getChildren().addAll(title, text, words, button, encryptText, result);
        layout.setTop(vBox);

        button.setOnMouseClicked(mouseEvent -> {
            String ex = words.getText();
            Encrypt encrypt = new Encrypt();
            encrypt.addWords(ex);
            String encryptedWords = encrypt.encryptNow();
            result.setText(encryptedWords);
        });


        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }
}
