package com.soft1841.example2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

public class CardController {
    @FXML
    private BorderPane mainContainer;
    @FXML
    public void showCardOne() throws Exception{
        Parent cardOne = FXMLLoader.load(getClass().getResource("card1.fxml"));
        mainContainer.setCenter(cardOne);
        String[] poem = {
                "《独坐敬亭山》","唐-李白","众鸟高飞尽","孤云独去闲。","相看两不厌","只有敬亭山。"
        };
        ListView<String>listView = new ListView<>();
        for (int i = 0;i < poem.length;i++){
            listView.getItems().add(poem[i]);
            listView.setMaxWidth(510);
            listView.setMaxHeight(400);
            listView.setPadding(new Insets(50,200,200,50));
        }
        mainContainer.setLeft(listView);
    }
    public void showCardTwo() throws Exception{
        Parent cardTwo = FXMLLoader.load(getClass().getResource("card2.fxml"));
        mainContainer.setLeft(cardTwo);
        String[] Vhboxpoem={
                "《独坐敬亭山》的作者为唐朝诗人","李白创作的一首五绝，是诗人表现自己","精神世界的佳作。此诗表面是写独有敬",
                "亭山的情趣，而其深含之意是诗人的生命","历程中旷世的孤独感"
        };
        ListView<String>listView = new ListView<>();
        for (int i = 0;i < Vhboxpoem.length;i++){
            listView.getItems().add(Vhboxpoem[i]);
            listView.setMaxWidth(530);
            listView.setMaxHeight(400);
        }
        mainContainer.setLeft(listView);
    }
}
