package com.soft1841.example6;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MailApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("通讯录");
        Scene scene = new Scene(root,1000,700);
        scene.getStylesheets().add(MailApp.class.getResource("style.css").toExternalForm());
        //设置窗体的logo
        primaryStage.getIcons().add(new Image("/img/logo.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
