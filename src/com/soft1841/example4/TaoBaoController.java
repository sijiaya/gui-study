package com.soft1841.example4;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;


public class TaoBaoController {
    @FXML
    private FlowPane taobaoPane;

    @FXML
    private HBox taoBox;

    public void showTaoOne() {
        ObservableList<Node> list = taobaoPane.getChildren();
        taobaoPane.getChildren().removeAll(list);
        taoBox.setVisible(false);
        taobaoPane.setVisible(true);
        TaoBao[] taoBaos = new TaoBao[]{
                //控制台上显示名称和图片
                new TaoBao("聚划算", "1.png"),
                new TaoBao("淘抢购", "2.png"),
                new TaoBao("淘宝嘉年华", "3.png"),
                new TaoBao("文娱会场", "4.png"),
                new TaoBao("学习会场", "5.png"),
                new TaoBao("天猫奢品", "6.png"),
                new TaoBao("智能生活家", "7.png"),
                new TaoBao("天猫精灵", "8.png"),
                new TaoBao("飞猪旅行", "9.png"),
                new TaoBao("无忧服务", "10.png")
        };
        for (TaoBao t : taoBaos) {
            //创建容器,用来存放名称和图片
            BorderPane borderPane = new BorderPane();
            //创建一个文本组件,同时将名称作为文本内容
            Label nameLabel = new Label(t.getName());
            //创建图片组件,把相关图片作为图片内容
            Image image = new Image("/photo/" + t.getAvatar());
            ImageView imageView = new ImageView(image);
            //把图片放在中间
            borderPane.setCenter(imageView);
            //把名称放在下面
            borderPane.setBottom(nameLabel);
            taobaoPane.getChildren().add(borderPane);
        }
    }


    public void showTaoTwo() {
        ObservableList<Node> list = taoBox.getChildren();
        taoBox.getChildren().removeAll(list);
        taobaoPane.setVisible(false);
        taoBox.setVisible(true);
        TaoBao[] taoBaos1 = new TaoBao[]{
                new TaoBao("精选", "a1.png"),
                new TaoBao("进口", "a2.png"),
                new TaoBao("名品", "a3.png"),
                new TaoBao("手机数码", "a4.png"),
        };
        for (TaoBao i : taoBaos1) {
            BorderPane borderPane = new BorderPane();
            Label nameLabel = new Label(i.getName());
            Image image = new Image("/photo/" + i.getAvatar());
            ImageView imageView = new ImageView(image);
            borderPane.setCenter(imageView);
            borderPane.setBottom(nameLabel);
            taoBox.getChildren().add(borderPane);
        }
    }
}

